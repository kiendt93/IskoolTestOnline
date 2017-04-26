<%@include file="/html/init.jsp"%>
<%
	themeDisplay =  (ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);
%>
<c:if test="<%=themeDisplay.isSignedIn()%>">
	<%
		long onlinetestEntryId  = ParamUtil.getLong(request, "onlinetestEntryId");
		if (onlinetestEntryId <=0)
		{
			onlinetestEntryId = Long.valueOf(renderRequest.getParameter("onlinetestEntryId"));
		}
		List<QuestionEntry> listOfQuestionEntries = new ArrayList<QuestionEntry>();
		if (onlinetestEntryId > 0)
		{
			String[] questionIds = OnlinetestEntryLocalServiceUtil.getOnlinetestEntry(onlinetestEntryId).getQuestionId().split(",");
			for (int i = 0; i < questionIds.length; i ++)
			{
				listOfQuestionEntries.add(QuestionEntryLocalServiceUtil.getQuestionEntry(Long.valueOf(questionIds[i])));
			}
		}
	%>
	<portlet:renderURL var="questionSelectionAddURL">
		    <portlet:param name="onlinetestEntryId" value="<%=String.valueOf(onlinetestEntryId)%>" />
		    <portlet:param name="actionType" value="<%=actionAddQuestion %>" />		    
            <portlet:param name="mvcPath" value="/html/questionstore/questionSelection.jsp"/>
	</portlet:renderURL>
	<portlet:renderURL var="questionBackURL">	    
            <portlet:param name="mvcPath" value="/html/questionstore/createTestOnline.jsp"/>
	</portlet:renderURL>
	<div class="taglib-header">
		<h3 class="header-title">
			<liferay-ui:message key="AddQuestion"></liferay-ui:message>
		</h3>
		<aui:button icon="icon-add" iconAlign="left" value="addQuestion" name="btnAddQuestion" onClick="<%=questionSelectionAddURL.toString()%>"></aui:button>
		<aui:button value="Back" name="btnBack" onClick="<%=questionBackURL.toString()%>"></aui:button>
	</div>
	<liferay-portlet:renderURL varImpl="iteratorURL">
		<portlet:param name="onlinetestEntryId"
			value="<%=String.valueOf(onlinetestEntryId)%>" />
		<portlet:param name="mvcPath"
			value="/html/questionstore/editTestOnline.jsp" />
	</liferay-portlet:renderURL>
	<liferay-ui:search-container delta="10" orderByType="desc"
		displayTerms="<%=new DisplayTerms(renderRequest)%>" iteratorURL="<%=iteratorURL %>">
		<liferay-ui:search-container-results>
			<%
				List<QuestionEntry> subLists = ListUtil.subList(listOfQuestionEntries, searchContainer.getStart(),
									searchContainer.getEnd());
				int sizeOf = listOfQuestionEntries.size();
				pageContext.setAttribute("results", subLists);
				pageContext.setAttribute("total", sizeOf);
			%>
		</liferay-ui:search-container-results>
		<%
			DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		%>
		<liferay-ui:search-container-row
			className="com.vietnamobile.model.QuestionEntry"
			keyProperty="questionEntryId" modelVar="questionEntry">
			<liferay-ui:search-container-column-text name="QuestionId" 
				value="<%=String.valueOf(listOfQuestionEntries.indexOf(questionEntry) + 1) %>"/>
			<liferay-ui:search-container-column-text name="CreatedBy"
				value="<%=UserLocalServiceUtil.getUserById(questionEntry.getUserId()).getFullName()%>" />
			<liferay-ui:search-container-column-text name="Title" value="<%=questionEntry.getTitle()%>"/>
			<liferay-ui:search-container-column-text name="QuestionContent"
				value="<%=questionEntry.getQuestionContent()%>" />
			<liferay-ui:search-container-column-text name="Subject"
				value="<%=questionEntry.getSubject()%>" />
			<!-- For Replace question -->
			<portlet:renderURL var="questionSelectionReplaceURL">
				<portlet:param name="onlinetestEntryId"
					value="<%=String.valueOf(onlinetestEntryId)%>" />
				<portlet:param name="actionType" value="<%=actionReplaceQuestion%>" />
				<portlet:param name="questionReplaceId" value="<%=String.valueOf(questionEntry.getQuestionEntryId())%>"/>
				<portlet:param name="mvcPath"
					value="/html/questionstore/questionSelection.jsp" />
			</portlet:renderURL>
			<%
				String fixQuestionSelectionReplaceURL = "location.href='"
									+ questionSelectionReplaceURL.toString() + "'";
			%>

			<liferay-ui:search-container-column-button href="<%=fixQuestionSelectionReplaceURL %>" name="Replace"></liferay-ui:search-container-column-button>
			<liferay-portlet:actionURL name="removeOneRow" var="removeOneRow">
				<portlet:param name="onlinetestEntryId"
					value="<%=String.valueOf(onlinetestEntryId)%>" />
				<portlet:param name="questionRemoveId" value="<%=String.valueOf(questionEntry.getQuestionEntryId())%>"/>
			</liferay-portlet:actionURL>
			<%
				String fixRemoveOneRow = "location.href='" + removeOneRow.toString() + "'";
			%>
			<liferay-ui:search-container-column-button href="<%=fixRemoveOneRow%>" name="Remove"></liferay-ui:search-container-column-button>
		</liferay-ui:search-container-row>
		<liferay-ui:search-iterator searchContainer="<%=searchContainer%>" />
	</liferay-ui:search-container>
</c:if>
