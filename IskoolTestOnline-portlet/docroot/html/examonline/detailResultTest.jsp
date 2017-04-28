<%@include file="/html/init.jsp"%>
<%
	themeDisplay = (ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);
%>
<c:if test="<%=themeDisplay.isSignedIn() %>">
	<%
			List<QuestionEntry> listOfQuestions = new ArrayList<QuestionEntry>();
			long onlinetestEntryId = ParamUtil.getLong(request, "onlinetestEntryId");
			int numOfQuestion = 0;
			String questionIds = "";
			OnlinetestEntry onlinetestEntry = null;
			long onlinetestResultEntryId = ParamUtil.getLong(request, "onlinetestResultEntryId");
			OnlinetestResultEntry resultEntry = null;
			if (onlinetestResultEntryId > 0) {
				resultEntry = OnlinetestResultEntryLocalServiceUtil
						.getOnlinetestResultEntry(onlinetestResultEntryId);
				questionIds = resultEntry.getQuestionIds();

			}
			
			if (onlinetestEntryId > 0) 
			{
				onlinetestEntry = OnlinetestEntryLocalServiceUtil.getOnlinetestEntry(onlinetestEntryId);
				int duration = onlinetestEntry.getDuration();				
			}
			else
			{
				questionIds = resultEntry.getQuestionIds();
			}
			// Build list of question
			String[] questionsIdList = questionIds.split(",");
			numOfQuestion = questionsIdList.length;
			for (int i = 0; i < questionsIdList.length; i++) {
				listOfQuestions
						.add(QuestionEntryLocalServiceUtil.getQuestionEntry(Long.valueOf(questionsIdList[i])));
			}

			String[] listOfAnswerSelected = {};
			if (Validator.isNotNull(resultEntry)) {
				listOfAnswerSelected = resultEntry.getAnswerSelected().split(";");
			}
	%>
	<liferay-portlet:renderURL varImpl="examonlineHome">
		<portlet:param name="mvcPath" value="/html/examonline/view.jsp" />
	</liferay-portlet:renderURL>
		<table border="1" width="100%">
			<tr>
				<td><liferay-ui:message key="Question"></liferay-ui:message></td>
				<td><liferay-ui:message key="Answer"></liferay-ui:message></td>
				<td><liferay-ui:message key="Solution"></liferay-ui:message></td>
			</tr>
			<%
				for(int i =0; i < listOfQuestions.size(); i ++) 
				{
				    String question= String.valueOf(i+1) + ".";
			%>
				<tr>
					<td>
						<h4><liferay-ui:message key="<%=question + listOfQuestions.get(i).getTitle()%>"></liferay-ui:message></h4>
						<liferay-ui:message key="<%=listOfQuestions.get(i).getQuestionContent()%>"></liferay-ui:message>
					</td>
					<td>
						<%=listOfAnswerSelected[i]%>
					</td>
					<td>
						<%=listOfQuestions.get(i).getAnswer()%>
					</td>
				</tr>
			<%}
			%> 
		</table>
		<aui:button name="btnFinish" value="Finish" onClick="<%=examonlineHome.toString()%>"></aui:button>	
</c:if>