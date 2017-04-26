<%@include file="/html/init.jsp"%>
<%
	themeDisplay = (ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);
	String actionViewQuestion = "VIEW";
	String actionMakeQuestion = "QUESTION_MAKE";
	String actionReviewQuestion = "QUESTION_MAKE";
	String[] arrAnser = {"A","B","C","D"};
%>
<c:if test="<%= themeDisplay.isSignedIn() %>">
	<%
		List<QuestionEntry> listOfQuestions = new ArrayList<QuestionEntry>();
		long onlinetestEntryId = ParamUtil.getLong(request, "onlinetestEntryId");
		OnlinetestEntry onlinetestEntry = OnlinetestEntryLocalServiceUtil.getOnlinetestEntry(onlinetestEntryId);
		if (Validator.isNotNull(onlinetestEntry))
		{ 
		    // Build list of question
		    String[] questionsIdList = onlinetestEntry.getQuestionId().split(",");
		    for(int i=0; i < questionsIdList.length; i ++)
		    {
		        listOfQuestions.add(QuestionEntryLocalServiceUtil.getQuestionEntry(Long.valueOf(questionsIdList[i])));
		    }
		}
	%>
	<table border="1" width="100%">
		<%
			for(int i =0; i < listOfQuestions.size(); i ++)
			{
			    String question="Câu " + String.valueOf(i+1) + ":";
		%>
			<tr>
				<td>
			<h4><liferay-ui:message key="<%=question%>"></liferay-ui:message></h4>
			<liferay-ui:message key="<%=listOfQuestions.get(i).getQuestionContent()%>"></liferay-ui:message>
				</td>
				<td>
					<%
						for (int j=0; j < arrAnser.length; j ++)
						{
						    String answer = listOfQuestions.get(i).getQuestionEntryId() +"_" + i +  "_" + arrAnser[j]; 
					%>
						  <aui:input inlineField="true" name="<%=answer%>" type="checkbox" value="0" label="<%=arrAnser[j]%>" />    
					<%  }
					%>
				</td>
			</tr>
		<%}
		%> 
		
	</table>
	<liferay-portlet:renderURL varImpl="createTestOnlineURL">
		<portlet:param name="mvcPath" value="/html/questionstore/createTestOnline.jsp" />
	</liferay-portlet:renderURL>
	<aui:button type="button" name="btnFinish" value="Finish" onClick="<%=createTestOnlineURL.toString()%>"/>
</c:if>
<c:if test ="<%=!themeDisplay.isSignedIn()%>">
	<liferay-ui:message key="user_not_login"></liferay-ui:message>
</c:if>