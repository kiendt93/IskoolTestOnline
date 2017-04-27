<%@include file="/html/init.jsp"%>

<%
	themeDisplay = (ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);
	String actionViewQuestion = "VIEW";
	String actionMakeQuestion = "QUESTION_MAKE";
	String actionReviewQuestion = "QUESTION_MAKE";
%>
<c:if test="<%= themeDisplay.isSignedIn() %>"> 
<%
	long userId = ParamUtil.getLong(request, "userId");
	/* String subject = ParamUtil.getString(request, "subject"); */
	String level = ParamUtil.getString(request, "level");
	String questionContent = ParamUtil.getString(request,"questionContent");
	String score = ParamUtil.getString(request,"score");
	List<QuestionEntry> listOfQuestions = new ArrayList<QuestionEntry>();
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
	
	String keywords = ParamUtil.getString(request, "keywords");
%>
<liferay-portlet:renderURL varImpl="userSearchURL">
	<portlet:param name="mvcPath" value="/html/questionstore/view.jsp" />
</liferay-portlet:renderURL>
<liferay-portlet:renderURL varImpl="addQuestionEntry">
	<portlet:param name="mvcPath" value="/html/questionstore/createQuestion.jsp" />
</liferay-portlet:renderURL>
<liferay-portlet:renderURL varImpl="makeExam">
	<portlet:param name="mvcPath" value="/html/questionstore/createTestOnline.jsp" />
</liferay-portlet:renderURL>
<%-- <liferay-portlet:renderURL varImpl="editSpecialSubject">
	<portlet:param name="mvcPath" value="/html/questionstore/editSubject.jsp" />
</liferay-portlet:renderURL> --%>

<liferay-portlet:renderURL varImpl="searchURL">
        <portlet:param name="mvcPath" value="/html/questionstore/view.jsp" />
</liferay-portlet:renderURL>


<%-- <aui:form action="<%=userSearchURL%>" method="post" name="fmQuestion">
		<liferay-portlet:renderURLParams varImpl="userSearchURL" /> --%>
		
	<aui:form action="<%=searchURL%>" method="post" name="fmQuestion">
		<liferay-portlet:renderURLParams varImpl="searchURL" />
		
		<liferay-portlet:renderURL varImpl="iteratorURL">
			<%-- <portlet:param name="subject" value="<%= subject %>" /> --%>
			<portlet:param name="questionContent" value="<%= questionContent %>" />			
			<portlet:param name="mvcPath" value="/html/questionstore/view.jsp" />
		</liferay-portlet:renderURL>

		
		<liferay-ui:search-container delta="10" orderByType="<%=orderByType%>" displayTerms="<%= new DisplayTerms(renderRequest)%>" iteratorURL="<%= iteratorURL %>" rowChecker="<%= new RowChecker(renderResponse) %>">
			<liferay-ui:search-form page="/html/questionstore/searchQuestion.jsp" servletContext="<%= application %>"/>
			<aui:button value="AddQuestion" onClick="<%=addQuestionEntry.toString()%>"/>
			<aui:button value="MakeExam" onClick="<%=makeExam.toString()%>"/> 
			<%-- <aui:button value="CreateSubject" onClick="<%=editSpecialSubject.toString()%>"/> --%>
			<liferay-ui:search-container-results>
				<%
					DisplayTerms displayTerms = searchContainer.getDisplayTerms(); 
					
					
				
					if (displayTerms.isAdvancedSearch())
					{
						listOfQuestions =  QuestionEntryLocalServiceUtil.searchQuestioEntry(userId, questionContent, Double.valueOf(level), true);
						List<QuestionEntry> subLists = ListUtil.subList(listOfQuestions,searchContainer.getStart(),searchContainer.getEnd());
						int sizeOf = listOfQuestions.size();
						List<QuestionEntry> sortableList = new ArrayList<QuestionEntry>(subLists);
						
						
						if(Validator.isNotNull(orderByCol))
						{
							if (sortingOrder.equalsIgnoreCase("desc"))
							{
								Collections.sort(sortableList, new VnmComperatorQuestionByColumns(orderByCol));
							}
							else
							{
								Collections.reverse(sortableList);
							}
						}
						pageContext.setAttribute("results", sortableList);
						pageContext.setAttribute("total", sizeOf);					
					}
					else
					{
						String searchkeywords = displayTerms.getKeywords();
						
						keywords = searchkeywords;
						
						SearchContext searchContext = SearchContextFactory.getInstance(request);

						//String[] tagNames = {keywords};
						//searchContext.setAssetTagNames(tagNames);
						searchContext.setKeywords(keywords);
				        searchContext.setAttribute("paginationType", "more");
				        
				        searchContext.setStart(0);
				        searchContext.setEnd(10);

				        Indexer indexer = IndexerRegistryUtil.getIndexer(QuestionEntry.class);

				        Hits hits = indexer.search(searchContext);

				        List<QuestionEntry> entries = new ArrayList<QuestionEntry>();

				        for (int i = 0; i < hits.getDocs().length; i++) {
				                Document doc = hits.doc(i);

				                long questionEntryId = GetterUtil.getLong(doc.get(Field.ENTRY_CLASS_PK));

				                QuestionEntry questionEntry = null;

				                try {
				                	questionEntry = QuestionEntryLocalServiceUtil.getQuestionEntry(questionEntryId);
				                } catch (PortalException pe) {
				                        _log.error(pe.getLocalizedMessage());
				                } catch (SystemException se) {
				                        _log.error(se.getLocalizedMessage());
				                }

				                entries.add(questionEntry);
				        }
						
						//listOfQuestions = QuestionEntryLocalServiceUtil.searchQuestioEntry(userId, searchkeywords, searchkeywords, Double.valueOf(0) , false);
						//List<QuestionEntry> subLists = ListUtil.subList(listOfQuestions,searchContainer.getStart(),searchContainer.getEnd());
						
						//int sizeOf = listOfQuestions.size();
						List<QuestionEntry> subLists = new ArrayList<QuestionEntry>();
						int sizeOf = 0;
						if(searchkeywords.equals("")){
							listOfQuestions = QuestionEntryLocalServiceUtil.searchQuestioEntry(userId, searchkeywords, searchkeywords, Double.valueOf(0) , false);
							subLists = ListUtil.subList(listOfQuestions,searchContainer.getStart(),searchContainer.getEnd());
							sizeOf = listOfQuestions.size();
						}else{
							subLists = ListUtil.subList(entries,searchContainer.getStart(),searchContainer.getEnd());
							sizeOf = entries.size();
						}
						
						List<QuestionEntry> sortableList = new ArrayList<QuestionEntry>(subLists);

						if(Validator.isNotNull(orderByCol))
						{
							if (sortingOrder.equalsIgnoreCase("desc"))
							{
								Collections.sort(sortableList, new VnmComperatorQuestionByColumns(orderByCol));
							}
							else
							{
								Collections.reverse(sortableList);
							}
						}						
						pageContext.setAttribute("results", sortableList);
						pageContext.setAttribute("total", sizeOf);					
						
					}
	
				%>
			</liferay-ui:search-container-results>
				<% DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
				%>
			<liferay-ui:search-container-row
				className="com.vietnamobile.model.QuestionEntry"
				keyProperty="questionEntryId" modelVar="questionEntry">			
				<liferay-ui:search-container-column-text name="QuestionId" value="<%=String.valueOf(listOfQuestions.indexOf(questionEntry) + 1)%>" />
				<liferay-ui:search-container-column-text orderable="true" name="Title" value="<%=questionEntry.getTitle()%>"/>
				<liferay-ui:search-container-column-text name="Content" value="<%=questionEntry.getQuestionContent()%>"/>							
				<liferay-ui:search-container-column-text orderable="true" name="CreateDate" value="<%=df.format(questionEntry.getCreateDate())%>" />			
				<liferay-ui:search-container-column-text orderable="true" name="ModifiedDate" value="<%=df.format(questionEntry.getModifiedDate())%>" />
				<liferay-ui:search-container-column-jsp path="/html/questionstore/actionQuestion.jsp" align="center"/>
			</liferay-ui:search-container-row>
			<liferay-ui:search-iterator searchContainer="<%=searchContainer %>" />
	</liferay-ui:search-container>
			<aui:button name="delButton" value="DeleteAll" onClick='<%= renderResponse.getNamespace() +  "deleteAllQuestion();"%>'></aui:button>
			<aui:button name="exportButton" value="ExportToExcel" onClick='<%= renderResponse.getNamespace() +  "exportToExcel();"%>'></aui:button>
			
			<aui:input name="selectedRows" type="hidden"></aui:input>
			
<%
        if (Validator.isNotNull(keywords)) {
                String currentURL = PortalUtil.getCurrentURL(request);
                PortalUtil.addPortletBreadcrumbEntry(request, LanguageUtil.get(
                                pageContext, "search") + ": " + keywords, currentURL);
        }
%>

<%!
        private static Log _log = LogFactoryUtil.getLog("docroot.html.guestbook.view_search_jsp");
%>
</aui:form>
<aui:script>
Liferay.provide(
		window,
		'<portlet:namespace />deleteAllQuestion',
		function() 
		{
			var selectRowIds = Liferay.Util.listCheckedExcept(document.<portlet:namespace />fmQuestion, "<portlet:namespace />allRowIds");
			
			var message="<liferay-ui:message key='delete-all-question-confirm'/>";
			var notSelectedMessage = "<liferay-ui:message key='there-are-no-question-is-selected'/>";
			if (!(selectRowIds =="" || selectRowIds == null))
			{
				if(confirm(message))
				{
					document.<portlet:namespace />fmQuestion.<portlet:namespace />selectedRows.value =selectRowIds;
					submitForm(document.<portlet:namespace />fmQuestion,'<portlet:actionURL name="deleteAllQuestion"></portlet:actionURL>');
				}
			}
			else	
			{
				alert(notSelectedMessage);
			}

	},
	['liferay-util-list-fields']);
Liferay.provide(
		window,
		'<portlet:namespace />exportToExcel',
		function() 
		{
			var selectRowIds = Liferay.Util.listCheckedExcept(document.<portlet:namespace />fmQuestion, "<portlet:namespace />allRowIds");

			document.<portlet:namespace />fmQuestion.<portlet:namespace />selectedRows.value =selectRowIds;
			var message="<liferay-ui:message key='export-all-question-confirm'/>";
			var notSelectedMessage = "<liferay-ui:message key='there-are-no-question-is-selected'/>";
			if (!(selectRowIds =="" || selectRowIds == null))
			{			
				if(confirm(message))
				{
					submitForm(document.<portlet:namespace />fmQuestion,'<portlet:actionURL name="exportToExcel"></portlet:actionURL>');
				}
			}
			else
			{
				alert(notSelectedMessage);
			}
	},
	['liferay-util-list-fields']);		
</aui:script>
</c:if>
<c:if test ="<%=!themeDisplay.isSignedIn()%>">
	<liferay-ui:message key="user_not_login"></liferay-ui:message>
</c:if>