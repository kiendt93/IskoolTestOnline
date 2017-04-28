<%@include file="/html/init.jsp"%>
<%
	themeDisplay = (ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);
	String actionViewResult = "VIEW_RESULT";
	String examType = GetterUtil.getString(portletPreferences.getValue("examType", StringPool.BLANK));
%>
<c:if test="<%=themeDisplay.isSignedIn() %>">
	<%
		List<SubjectEntry> subjectList = new ArrayList<SubjectEntry>();
		//subjectList = SubjectEntryLocalServiceUtil.getAllSubjects();
		subjectList = SubjectEntryLocalServiceUtil.findBySubjectKey(0, "", PRACTICE, "", true);
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
		String subjectJsonList = subjectJsonArr.toString();	
	%>
	<c:if test="<%=examType.equals(TESTONLINE) %>"> 
		<aui:field-wrapper label="TestOnline">
			<liferay-ui:search-container delta="10"  orderByType="desc" displayTerms="<%= new DisplayTerms(renderRequest)%>">
				<liferay-ui:search-container-results>
					<%
						List<OnlinetestEntry> userList = OnlinetestEntryLocalServiceUtil.getAllOnlinetests();
						List<OnlinetestEntry> subLists = ListUtil.subList(userList, searchContainer.getStart(),
								searchContainer.getEnd());
						int sizeOf = userList.size();
						pageContext.setAttribute("results", subLists);
						pageContext.setAttribute("total", sizeOf);
					%>
				</liferay-ui:search-container-results>
					<% DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
					%>
				<liferay-ui:search-container-row
					className="com.vietnamobile.model.OnlinetestEntry"
					keyProperty="onlinetestEntryId" modelVar="onlinetestEntry">			
					<liferay-ui:search-container-column-text name="onlinetestEntryId" value="<%=String.valueOf(onlinetestEntry.getOnlinetestEntryId())%>" />
					<liferay-ui:search-container-column-text name="Title" value="<%=onlinetestEntry.getTitle()%>" />			
					<liferay-ui:search-container-column-text name="StartDate" value="<%=df.format(onlinetestEntry.getTestStartTime())%>" />
					<liferay-ui:search-container-column-text name="EndDate" value="<%=df.format(onlinetestEntry.getTestEndTime())%>" />
					<liferay-ui:search-container-column-jsp path="/html/examonline/actionExam.jsp" align="center" name="Status"/>
				</liferay-ui:search-container-row>
				<liferay-ui:search-iterator searchContainer="<%=searchContainer %>" />
			</liferay-ui:search-container>
		</aui:field-wrapper>
		<aui:field-wrapper label="TestResult">
			<liferay-ui:search-container delta="10"  orderByType="desc" displayTerms="<%= new DisplayTerms(renderRequest)%>">
				<liferay-ui:search-container-results>
				<%
					long userId = Long.valueOf(request.getRemoteUser());
					List<OnlinetestResultEntry> listOfResultTest = OnlinetestResultEntryLocalServiceUtil.getUserExamed(userId, 0, "", 0, null, null,null, true);
					List<OnlinetestResultEntry> subLists = ListUtil.subList(listOfResultTest, searchContainer.getStart(),searchContainer.getEnd());
					int sizeOf = listOfResultTest.size();
					pageContext.setAttribute("results", subLists);
					pageContext.setAttribute("total", sizeOf); 
				%>
				</liferay-ui:search-container-results>
					<% DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
					%>
				<liferay-ui:search-container-row
					className="com.vietnamobile.model.OnlinetestResultEntry"
					keyProperty="onlinetestResultEntryId" modelVar="onlinetestResultEntry">			
					<liferay-ui:search-container-column-text name="onlinetestResultEntryId" value="<%=String.valueOf(onlinetestResultEntry.getOnlinetestResultEntryId())%>" />
					<liferay-ui:search-container-column-text name="Title" value="<%=(onlinetestResultEntry.getOnlineTestEntryId() > 0)? OnlinetestEntryLocalServiceUtil.getOnlinetestEntry(onlinetestResultEntry.getOnlineTestEntryId()).getTitle():PRACTICE%>" />			
					<liferay-ui:search-container-column-text name="ExamStartDate" value="<%=df.format(onlinetestResultEntry.getCreateDate())%>" />
					<liferay-ui:search-container-column-text name="ExamEndDate" value="<%=df.format(onlinetestResultEntry.getCreateDate())%>" />
					<liferay-ui:search-container-column-text name="ExamType">
						<liferay-ui:message key="<%=onlinetestResultEntry.getExamType()%>"></liferay-ui:message>
					</liferay-ui:search-container-column-text>					
					<liferay-ui:search-container-column-text name="Score" value="<%=String.valueOf(onlinetestResultEntry.getScore())%>" />
					<liferay-ui:search-container-column-jsp path="/html/examonline/actionViewResult.jsp" align="center" name="Status"/>
				</liferay-ui:search-container-row>
				<liferay-ui:search-iterator searchContainer="<%=searchContainer %>" />				
			</liferay-ui:search-container>	
		</aui:field-wrapper>
	</c:if>
	<c:if test="<%=examType.equals(PRACTICE) %>">	
		<liferay-portlet:renderURL varImpl="viewPage">
			<portlet:param name="mvcPath" value="/html/questionstore/view.jsp" />
		</liferay-portlet:renderURL>
		<aui:form method="post" name="fmPractice">
			<aui:input type="hidden" name="examType" value="<%=examType%>"/>
			<aui:input type="number" name="timeLimit" label = "TimeLimit" required="true"/>
			<aui:row>
				<div id="practice-fields">
					<div class="lfr-form-row lfr-form-row-inline">
						<div class="row-fields" style="display: block;">
							<aui:select inlineField="true" name="subject1" label="Subject" required="true" onChange='fillDetailDate();'>
								<aui:option value="empty" label="PleaseSelectOneSubject" selected="true"> </aui:option>	
								<% for (int i = 0; i < numberOfSubjects; i++)
								   {
								%>		
								<aui:option value="<%=subjectList.get(i).getSubject() %>" label="<%=subjectList.get(i).getSubject() %>"/>
								<%
								   }
								%>
							</aui:select>
							<aui:input inlineField = "true" style="width:20px" fieldParam='numberQuestionEachSubject1' id='numberQuestionEachSubject1' name="numberQuestionEachSubject1" label="numberQuestionEachSubject" value="0"/>
							<div id="detailSubject1" class="control-group control-group-inline"></div>
						</div>
					</div>
				</div>
			</aui:row>
			<aui:button type="button" name="btnPractice" value="Practice" onClick='<%= renderResponse.getNamespace() + "createPracticeOnline();"%>'/>
		</aui:form>
		<aui:script>
		Liferay.provide(
				window,
				'<portlet:namespace />createPracticeOnline',
				function() 
				{
					submitForm(document.<portlet:namespace />fmPractice,'<portlet:actionURL name="executePractice"></portlet:actionURL>');
				});
		var autoField;
		AUI().use('liferay-auto-fields',
			function(A) 
			{
				autoField = new Liferay.AutoFields(
			          {
			              contentBox: '#practice-fields',
			              fieldIndexes: '<portlet:namespace />rowIndexes'
			          }
			      );
				autoField.on("clone",function(newField)
						{
							// Look up clone
							AUI().one('#practice-fields').all('.lfr-form-row-inline').each(function(node,index)
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
							AUI().one('#practice-fields').all('.lfr-form-row-inline').each(function(node,index)
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
		
		function fillDetailDate()
		{
			var subjectJson =JSON.parse('<%=subjectJsonList%>');
			AUI().use('liferay-auto-fields',
					function(A) 
					{
						
						A.one('#practice-fields').all('.lfr-form-row-inline').each(function (node) {
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
		}	
		</aui:script>
	</c:if>
</c:if>