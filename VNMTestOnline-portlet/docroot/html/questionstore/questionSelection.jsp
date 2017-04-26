<%@include file="/html/init.jsp"%>
<%

%>
<c:if test="<%=themeDisplay.isSignedIn()%>">
	<%
		long onlinetestEntryId = ParamUtil.getLong(request, "onlinetestEntryId");
		String subject = ParamUtil.getString(request,"subject");
		String title = ParamUtil.getString(request,"title");
		String contentQuestion = ParamUtil.getString(request,"questionContent");
		QuestionEntry entry = null;
		long questionReplaceId  = ParamUtil.getLong(request,"questionReplaceId");;
		String actionType = ParamUtil.getString(request, "actionType");
		
		if (actionType.equals(actionReplaceQuestion))
		{
			String mvcPath = ParamUtil.getString(request, "mvcPath");
			ResultRow row = (ResultRow)request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
			if(Validator.isNotNull(row))
			{
				entry = (QuestionEntry)row.getObject();
				subject = entry.getSubject();
				questionReplaceId = entry.getQuestionEntryId();
			}
		}
		List<SubjectEntry> subjectList = new ArrayList<SubjectEntry>();

		subjectList = SubjectEntryLocalServiceUtil.findBySubjectKey(0, "", TESTONLINE, "", true);
		int numberOfSubjects = subjectList.size();
		List<QuestionEntry> listOfQuestionEntries = new ArrayList<QuestionEntry>();
		System.out.println("sss:" + onlinetestEntryId + "|" + questionReplaceId);
	%>
	<portlet:renderURL var="backURL">
		<portlet:param name="onlinetestEntryId" value="<%=String.valueOf(onlinetestEntryId)%>"/>
		<portlet:param name="mvcPath" value="/html/questionstore/editTestOnline.jsp"/>
	</portlet:renderURL>

	<div class="taglib-header">
			<c:if test="<%=actionType.equals(actionAddQuestion) %>">
				<aui:field-wrapper>
					<aui:form name="fmGetQuestionList" method="post">
						<aui:row>
							<aui:select inlineField="true" name="subject" label="Subject"
								required="true"
								onChange='<%= renderResponse.getNamespace() + "selectSubject();"%>'>
								<aui:option value="empty" label="PleaseSelectOneSubject"
									selected="true">
								</aui:option>
								<% for (int i = 0; i < numberOfSubjects; i++)
								{
								%>
								<aui:option value="<%=subjectList.get(i).getSubject() %>"
									label="<%=subjectList.get(i).getSubject() %>" />
								<%
								}
								%>
							</aui:select>
							<aui:input type="hidden" name="actionType" value="<%=actionType%>"></aui:input>
							<aui:input type="hidden" name="onlinetestEntryId" value="<%=String.valueOf(onlinetestEntryId)%>"></aui:input>
							<aui:button inlineField="true" name="btnSubmit" value="Submit" onClick='<%= renderResponse.getNamespace() +  "getQuestionList();"%>'></aui:button>
						</aui:row>
					</aui:form>			
				</aui:field-wrapper>
			</c:if>
			<aui:button name="btnBack" value="Back" onClick="<%=backURL.toString()%>"></aui:button>
		</div>

	<aui:field-wrapper label="QuestionList">
		<liferay-portlet:renderURL varImpl="iteratorURL">
			<portlet:param name="actionType" value="<%=actionType%>"/>
			<portlet:param name="subject" value="<%=subject%>"/>
			<portlet:param name="onlinetestEntryId" value="<%=String.valueOf(onlinetestEntryId)%>"/>
			<portlet:param name="questionReplaceId" value="<%=String.valueOf(questionReplaceId)%>"/>
			<portlet:param name="mvcPath" value="/html/questionstore/questionSelection.jsp" />
		</liferay-portlet:renderURL>
		<liferay-portlet:renderURL varImpl="userSearchURL">
			<portlet:param name="mvcPath" value="/html/questionstore/questionSelection.jsp" />
		</liferay-portlet:renderURL>		
		<aui:form action="<%=userSearchURL%>" method="post" name="fmQuestion">
			<liferay-ui:search-container delta="10" orderByType="desc" displayTerms="<%=new DisplayTerms(renderRequest)%>" iteratorURL="<%= iteratorURL %>">
				<liferay-ui:search-form page="/html/questionstore/searchQuestion.jsp" servletContext="<%= application %>"/> 
				<liferay-ui:search-container-results>
					<%
						DisplayTerms displayTerms =searchContainer.getDisplayTerms();
						if (displayTerms.isAdvancedSearch())
						{
							listOfQuestionEntries = QuestionEntryLocalServiceUtil.searchQuestioEntry(0, title, subject, contentQuestion, 0, true);
						}
						else
						{
							String searchkeywords = displayTerms.getKeywords();
							
							listOfQuestionEntries = QuestionEntryLocalServiceUtil.searchQuestioEntry(0, searchkeywords, searchkeywords, searchkeywords, 0, false);						
						}
						List<QuestionEntry> subLists = ListUtil.subList(listOfQuestionEntries, searchContainer.getStart(),
											searchContainer.getEnd());
						int sizeOf = listOfQuestionEntries.size();
						pageContext.setAttribute("results", subLists);
						pageContext.setAttribute("total", sizeOf);
					%>
				</liferay-ui:search-container-results>
				<liferay-ui:search-container-row
					className="com.vietnamobile.model.QuestionEntry"
					keyProperty="questionEntryId" modelVar="questionEntry">
					<liferay-ui:search-container-column-text name="QuestionId" 
						value="<%=String.valueOf(listOfQuestionEntries.indexOf(questionEntry) + 1) %>"/>
					<liferay-ui:search-container-column-text name="CreatedBy"
						value="<%=UserLocalServiceUtil.getUserById(questionEntry.getUserId()).getFullName()%>" />
					<liferay-ui:search-container-column-text name="QuestionContent"
						value="<%=questionEntry.getQuestionContent()%>" />
					<liferay-ui:search-container-column-text name="Subject"
						value="<%=questionEntry.getSubject()%>" />
					<!-- For select each question in search container result -->
					<liferay-portlet:actionURL name="choosenQuestion"
						var="choosenQuestionURL">
						<portlet:param name="subject" value="<%=subject%>" />
						<portlet:param name="questionReplaceId" value="<%=String.valueOf(questionReplaceId)%>"/>
						<portlet:param name="questionSelectedId" value="<%=String.valueOf(questionEntry.getQuestionEntryId())%>"/>
						<portlet:param name="onlinetestEntryId"
							value="<%=String.valueOf(onlinetestEntryId)%>" />
					</liferay-portlet:actionURL>
					<%String fixHref = "location.href='" + choosenQuestionURL.toString() + "'"; %>					
					<liferay-ui:search-container-column-button href="<%=fixHref%>" name="Choose">
					</liferay-ui:search-container-column-button>
				</liferay-ui:search-container-row> 
				<liferay-ui:search-iterator searchContainer="<%=searchContainer%>" />
			</liferay-ui:search-container>
		</aui:form>
	</aui:field-wrapper>
<aui:script>
Liferay.provide(
		window,
		'<portlet:namespace />getQuestionList',
		function() 
		{
			submitForm(document.<portlet:namespace />fmGetQuestionList,'<portlet:actionURL name="getQuestionList"></portlet:actionURL>');
	});
</aui:script>
</c:if>