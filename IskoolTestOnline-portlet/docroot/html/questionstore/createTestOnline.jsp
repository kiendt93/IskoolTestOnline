<%@include file="/html/init.jsp"%>
<%
	themeDisplay =  (ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);
%>
<c:if test="<%=themeDisplay.isSignedIn()%>">
	<%
			String title = renderRequest.getParameter("title");
			int pointOfExam = 100;
			
			String parentCategoryID = GetterUtil.getString(portletPreferences.getValue("parentCategoryID", StringPool.BLANK));
			List<AssetCategory> assetCategoryListCourse = new ArrayList<AssetCategory>();
			assetCategoryListCourse = AssetCategoryLocalServiceUtil.getChildCategories(Integer.parseInt(parentCategoryID));
			
			List<AssetCategory> assetCategoryListSubject = AssetCategoryLocalServiceUtil.getCategories();
			int sizeOfListSubject = assetCategoryListSubject.size();
			
			JSONArray subjectJsonArr = JSONFactoryUtil.createJSONArray();
			for(AssetCategory item: assetCategoryListSubject)
			{
				JSONObject json =  JSONFactoryUtil.createJSONObject();
				json.put("courseID", item.getParentCategoryId());
				json.put("name", item.getName());
				json.put("subjectEntryId",item.getCategoryId());
				subjectJsonArr.put(json);
			}
			String subjectJsonList = subjectJsonArr.toString();
			
			/* List<SubjectEntry> subjectList = new ArrayList<SubjectEntry>();
			subjectList = SubjectEntryLocalServiceUtil.findBySubjectKey(0, "", TESTONLINE, "", true);
			int numberOfSubjects = subjectList.size();
			JSONArray subjectJsonArr = JSONFactoryUtil.createJSONArray();
			for(SubjectEntry item: subjectList)
			{
				JSONObject json =  JSONFactoryUtil.createJSONObject();
				json.put("title", item.getSubject());
				json.put("totalQuestion",item.getTotalQuestion());
				json.put("description",item.getDescription());
				json.put("subjectEntryId",item.getSubjectEntryId());
				subjectJsonArr.put(json);
			}
			String subjectJsonList = subjectJsonArr.toString(); */
			
			//Order By
			String orderByCol = ParamUtil.getString(request, "orderByCol"); 
			String orderByType = ParamUtil.getString(request, "orderByType");
			String sortingOrder = orderByType;
			if(orderByType.equals("desc"))
			{
			    orderByType = "asc";
			}
			else
			{
			    orderByType = "desc";
			} 
			if(Validator.isNull(orderByType))
			{
			    orderByType = "desc";
			}				
	%>
	<div><%= parentCategoryID %></div>
	<liferay-portlet:renderURL varImpl="makeExam">
		<portlet:param name="mvcPath" value="/html/questionstore/createTestOnline.jsp" />
	</liferay-portlet:renderURL>
	<liferay-portlet:renderURL varImpl="viewPage">
		<portlet:param name="mvcPath" value="/html/questionstore/view.jsp" />
	</liferay-portlet:renderURL>
	<aui:form action="<%=makeExam%>" method="post" name="fmMakeExam">
		<h4><liferay-ui:message key="function-create-onlinetest"></liferay-ui:message></h4>
		<hr>	
		<aui:row>
			<aui:input inlineField = "true" name="title" label="Title" required="true"></aui:input>	
			<aui:input inlineField="true" type="number" name="pointOfExamHidden" label="pointOfExam" disabled="true" required="true" value = "<%=pointOfExam%>"/>
			<aui:input name="pointOfExam" type="hidden" value = "<%=pointOfExam%>"/>
			
		</aui:row>
		<hr style="border-width: 2px;">
		<aui:row>
			<div id="specialSubject-fields">
				<div class="lfr-form-row lfr-form-row-inline">
					<div class="row-fields" style="display: block;">
						
						<div id="course" style="display: inline-block;">
							<aui:select autofocus="true" id="course1" inlineField="true" name="course1" label= "Course" onChange='fillDetailDate();'>
								<aui:option value="empty" label="PleaseSelectOneSubject" selected="true"></aui:option>	
								<% for (int i = 0; i < assetCategoryListCourse.size(); i++)
								   {
								%>		
								<aui:option value="<%=assetCategoryListCourse.get(i).getCategoryId()%>" label="<%= assetCategoryListCourse.get(i).getName() %>"/>
								<%
								   }
								%>
							</aui:select>
						</div>
						<div id="subject" style="display: inline-block;">
							
							<aui:select inlineField="true" name="subject1" id="subject1" label="Subject" required="true" onChange='getNumberQuestion();'>
								<aui:option value="empty" label="PleaseSelectOneSubject" selected="true"/>
							</aui:select>
						</div>
						
						<%-- <aui:select inlineField="true" name="subject1" id="subject1" label="Subject" required="true" onChange='fillDetailDate();'>
							<aui:option value="empty" label="PleaseSelectOneSubject" selected="true"> </aui:option>	
							<% for (int i = 0; i < assetCategoryListCourse.size(); i++)
							   {
							%>		
							<aui:option value="<%=assetCategoryListCourse.get(i).getCategoryId()%>" label="<%= assetCategoryListCourse.get(i).getName() %>"/>
							<%
							   }
							%>
						</aui:select> --%>
						<aui:input inlineField="true"
							fieldParam='numberQuestionEachSubject1'
							id='numberQuestionEachSubject1' name="numberQuestionEachSubject1"
							label="numberQuestionEachSubject" value="0" onChange='validateNumberQuestion();'/>
						<div id="detailSubject1" class="control-group control-group-inline"></div>
					</div>
				</div>
			</div>
			<div id="mainShowDetail" class="showDetailSubject">
			</div>
		</aui:row>
		<aui:row>
			<aui:input inlineField="true" name="startDatepicker" id ="startDatepicker" type="text" cssClass="input-small" label="StartDate"/>
			<aui:input inlineField="true" name="startTimepicker" id ="startTimepicker" type="text" placeholder="hh:mm" cssClass="input-mini" label=""/>
			<aui:input inlineField="true" name="endDatepicker" id ="endDatepicker" type="text" cssClass="input-small" label="EndDate"/>
			<aui:input inlineField="true" name="endTimepicker" id ="endTimepicker" type="text" placeholder="hh:mm" cssClass="input-mini" label=""/>
			<aui:input inlineField="true" name="duration" label="Duration" placeholder="Seconds" cssClass="input-mini" value="60"/>
		</aui:row>
		<aui:button type="button" name="btnMakeExam" value="MakeExam" onClick='<%= renderResponse.getNamespace() + "createTestOnline();"%>'/>
		<aui:button type="button" name="btnClose" value="Close" onClick="<%=viewPage.toString()%>"/>		
	</aui:form>
	<hr>
	<liferay-portlet:renderURL varImpl="iteratorURL">
		<portlet:param name="mvcPath" value="/html/questionstore/createTestOnline.jsp" />
	</liferay-portlet:renderURL>
	<liferay-ui:search-container delta="10"  orderByType="<%=orderByType%>" displayTerms="<%= new DisplayTerms(renderRequest)%>" iteratorURL="<%=iteratorURL %>">	
		<liferay-ui:search-container-results>
			<%
			    DisplayTerms displayTerms = searchContainer
			                        .getDisplayTerms();
			                    List<OnlinetestEntry> userList = OnlinetestEntryLocalServiceUtil.getAllOnlinetests();
								List<OnlinetestEntry> sortableList = new ArrayList<OnlinetestEntry>(userList);
								if(Validator.isNotNull(orderByCol))
								{
									if (sortingOrder.equalsIgnoreCase("desc")) 
									{
										Collections.sort(sortableList, new VnmComperatorOnlinetestEntryByColumns(orderByCol));
									}
									else
									{
										Collections.reverse(sortableList);
									}
								}			                    
			                    List<OnlinetestEntry> subLists = ListUtil.subList(
			                    		sortableList, searchContainer.getStart(),
			                            searchContainer.getEnd());
			                    int sizeOf = userList.size();

			                    pageContext.setAttribute("results", subLists);
			                    pageContext.setAttribute("total", sizeOf);
			%>
		</liferay-ui:search-container-results>
		<%
		    DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
		%>
		<liferay-ui:search-container-row
			className="com.vietnamobile.model.OnlinetestEntry"
			keyProperty="onlinetestEntryId" modelVar="onlinetestEntry">
			<liferay-ui:search-container-column-text name="onlinetestEntryId"
				value="<%=String.valueOf(onlinetestEntry.getOnlinetestEntryId())%>" />
			<liferay-ui:search-container-column-text orderable="true" name="Title"
				value="<%=onlinetestEntry.getTitle()%>" />			
			<liferay-ui:search-container-column-text name="CreatedBy"
				value="<%=UserLocalServiceUtil.getUserById(onlinetestEntry.getUserId()).getFullName()%>" />
			<liferay-ui:search-container-column-text orderable="true" name="CreateDate"
				value="<%=df.format(onlinetestEntry.getCreateDate())%>" /> 
			<liferay-ui:search-container-column-text orderable="true" name="ModifiedDate"
				value="<%=df.format(onlinetestEntry.getModifiedDate())%>" />
			<liferay-ui:search-container-column-text orderable="true" name="StartExam"
				value="<%=df.format(onlinetestEntry.getTestStartTime())%>" />
			<liferay-ui:search-container-column-text orderable="true" name="EndExam"
				value="<%=df.format(onlinetestEntry.getTestEndTime())%>" />								
			<liferay-ui:search-container-column-jsp
				path="/html/questionstore/actionTestOnline.jsp"
				align="center" />
		</liferay-ui:search-container-row>
		<liferay-ui:search-iterator searchContainer="<%=searchContainer%>" />
	</liferay-ui:search-container>
	<aui:script>
	Liferay.provide(
		window,
		'<portlet:namespace />createTestOnline',
		function() 
		{
				if (validateNumberQuestion())
				{
				    submitForm(document.<portlet:namespace />fmMakeExam,'<portlet:actionURL name="createTestOnline"></portlet:actionURL>');
				}
		});
	Liferay.provide(
			window,
			'<portlet:namespace />selectSubject',
			function() 
			{
				  AUI().use('aui-node',function(A)
					{
					  	var totalQuestionInfor = A.one('#subjectTotalQuestion');
					});  
			});
	var autoField;
	AUI().use('liferay-auto-fields',
		function(A) 
		{
			autoField = new Liferay.AutoFields(
		          {
		              contentBox: '#specialSubject-fields',
		              fieldIndexes: '<portlet:namespace />rowIndexes'
		          }
		      );
			autoField.on("clone",function(newField)
					{
						// Look up clone
						AUI().one('#specialSubject-fields').all('.lfr-form-row-inline').each(function(node,index)
								{
									if (newField.row.contains(node))
										{
											//console.log(newField);
											//console.log(node);
											var hasDivTag = node.one('[id^="detailSubject"]');
											var nameOfElement = node.one('select').get("name");
											var position = nameOfElement.substr(nameOfElement.length -1);											
											if (hasDivTag)
											{
												node.one('[id^="detailSubject"]').setAttribute("id", "detailSubject" + position);
												node.one('[id^="detailSubject"]').setHTML("");
											}
											else
											{
												var detailDisplayDivTag = document.createElement("div");
												
												detailDisplayDivTag.setAttribute("id", "detailSubject" + position);
												detailDisplayDivTag.setAttribute("class", "control-group control-group-inline");
												node._node.childNodes[1].appendChild(detailDisplayDivTag);
											}
										}
								});
								
					});
			autoField.on("delete",function(deleteField)
					{
						AUI().one('#specialSubject-fields').all('.lfr-form-row-inline').each(function(node,index)
								{
									if (deleteField.deletedRow.contains(node))
										{
						                	console.log(deleteField);
										}
								});				
					});
			
			autoField.render();
	    }
	);
	
	/* function fillDetailDate()
	{
		var subjectJson =JSON.parse('<%=subjectJsonList%>');
		AUI().use('liferay-auto-fields',
				function(A) 
				{
					
					A.one('#specialSubject-fields').all('.lfr-form-row-inline').each(function (node) {
						if (node.one('select'))
							{
								var nameOfElement = node.one('select').get("name");
								var titleKey =  node.one('select').get("value");
								var position = nameOfElement.substr(nameOfElement.length -1);
								var showDiv  = A.one('#detailSubject' + position);
								var message = "<liferay-ui:message key='subject-total-infor'/>";
								showDiv.setHTML(message + getSubjectDetail(subjectJson, titleKey));
						}
					});
				});
	}
	function getSubjectDetail(subjectJson,titleKey)
	{
		if (titleKey == "empty")
		{
			return 0;
		}
		for( i in subjectJson )
		{
			if (subjectJson[i].title == titleKey)
			{
				return subjectJson[i].totalQuestion;
				break;
			}
		}
	} */
	function fillDetailDate()
	{
		var subjectJson =JSON.parse('<%=subjectJsonList%>');
		
		AUI().use('liferay-auto-fields',
				function(A) 
				{
					var course = A.one('#course');
					var subject = A.one('#subject');
					if(course.one('select')){
						var titleKey = course.one('select').get("value");
						getListSubject(subjectJson, titleKey, subject);
					}
				});
	}
	function getListSubject(subjectJson,titleKey, subjectSelect)
	{
		var message = "<liferay-ui:message key='PleaseSelectOneSubject'/>";
		subjectSelect.one('select').setHTML('<option value="empty" selected>'+message+'</option>');
		if (titleKey == "empty")
		{
			return 0;
		}
		
		for( i in subjectJson )
		{
			if (subjectJson[i].courseID == titleKey)
			{
				subjectSelect.one('select').append('<option value="'+ subjectJson[i].subjectEntryId +'">' + subjectJson[i].name + "</option>");
			}
		}
	}
	function validateNumberQuestion()
	{
		var validNumberQuestion = true;
		AUI().use('liferay-auto-fields',
				function(A) 
				{
					var numberOfQuestion = 0;
					var point = 100;
					A.one('#specialSubject-fields').all('.lfr-form-row-inline').each(function (node) {
						if (node.one('input'))
						{
							numberOfQuestion = numberOfQuestion + parseInt(node.one('input').get("value"));
							console.log(node.one('input').get("name") + ":" + node.one('input').get("value"));
						}
					});
					var isWrong = point % numberOfQuestion;
					console.log("numberOfQuestion:" +numberOfQuestion +  "|point:" + point);
					if (isWrong > 0)
					{
						validNumberQuestion = false;
						var message = "<liferay-ui:message key='exam-alert-message-number-question-invalid'/>";
						alert(message);
					}
				});
		return validNumberQuestion;
	}
	AUI().use('aui-datepicker',function(A)
			{
				new A.DatePicker(
					{
						trigger: '#<portlet:namespace/>startDatepicker',
						mask: '%d/%m/%Y',
						popover: {zIndex:1}
					}
				);
			}
	);
	AUI().use('aui-datepicker',function(A)
			{
				new A.DatePicker(
					{
						trigger: '#<portlet:namespace/>endDatepicker',
						mask: '%d/%m/%Y',
						popover: {zIndex:1}
					}
				);
			}
	);
	AUI().use('aui-timepicker',function(A)
			{
				new A.TimePicker(
					{
						trigger: '#<portlet:namespace/>startTimepicker',
						mask: '%H:%M',
						popover: {zIndex:1}
					}
				);		
			}
	);
	AUI().use('aui-timepicker',function(A)
			{
				new A.TimePicker(
					{
						trigger: '#<portlet:namespace/>endTimepicker',
						mask: '%H:%M',
						popover: {zIndex:1}
					}
				);		
			}
	);
	</aui:script>
</c:if>
