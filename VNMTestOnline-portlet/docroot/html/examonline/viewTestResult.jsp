<%@page import="com.vietnamobile.service.permission.OnlinetestResultEntryModelPermission"%>
<%@include file="/html/init.jsp"%>
<%
	themeDisplay = (ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);
%>
<c:if test="<%=themeDisplay.isSignedIn() %>">
	<% 
		long onlinetestResultEntryId = ParamUtil.getLong(request, "onlinetestResultEntryId");
		long onlinetestEntryId = 0;
		int remainingTime = 0;
		int duration = 0;
		String title = "";
		int numberOfQuestions = 0;
		int numberOfWrongQuestions = 0;
		OnlinetestResultEntry resultEntry = null;
		OnlinetestEntry onlinetestEntry = null;
		if (onlinetestResultEntryId > 0)
		{
			resultEntry = OnlinetestResultEntryLocalServiceUtil.getOnlinetestResultEntry(onlinetestResultEntryId);
			numberOfWrongQuestions = resultEntry.getNumberOfWrongAnswer();
			remainingTime = resultEntry.getTimeRemaining();
			if(resultEntry.getExamType().equals(TESTONLINE))
			{
				onlinetestEntry = OnlinetestEntryLocalServiceUtil.getOnlinetestEntry(resultEntry.getOnlineTestEntryId());
				title = onlinetestEntry.getTitle();
				duration = onlinetestEntry.getDuration();
				numberOfQuestions = onlinetestEntry.getNumberOfQuestions();
				onlinetestEntryId = onlinetestEntry.getOnlinetestEntryId();
			}
			else if (resultEntry.getExamType().equals(PRACTICE))
			{
				numberOfQuestions = resultEntry.getQuestionIds().split(",").length;
				duration = ParamUtil.getInteger(request, "timeLimit");
			}
		}
		
	%>
	<liferay-portlet:renderURL varImpl="examonlineHome">
		<portlet:param name="mvcPath" value="/html/examonline/view.jsp" />
	</liferay-portlet:renderURL>
	<liferay-portlet:renderURL varImpl="examDetailResult">
		<portlet:param name="onlinetestResultEntryId" value="<%=String.valueOf(onlinetestResultEntryId) %>"/>
		<portlet:param name="onlinetestEntryId" value="<%=String.valueOf(onlinetestEntryId) %>"/>
		<portlet:param name="mvcPath" value="/html/examonline/detailResultTest.jsp" />
	</liferay-portlet:renderURL>
	<aui:field-wrapper label="TestResult">
		<aui:row class="lfr-form-row lfr-form-row-inline">
			<aui:col span="3" >
				<p><liferay-ui:message key="Title"> </liferay-ui:message></p>
				<p><%=title%></p>
			</aui:col>
			<aui:col span="2">
				<p><liferay-ui:message key="TotalNumberOfQuestion"> </liferay-ui:message></p>
				<p><%=numberOfQuestions%></p>				
			</aui:col>
			<aui:col span="2">
				<p><liferay-ui:message key="WorngAnswer"> </liferay-ui:message></p>
				<p><%=numberOfWrongQuestions %></p>
			</aui:col>
			<aui:col span="2">
				<p><liferay-ui:message key="CorrectAnswer"> </liferay-ui:message></p>
				<p><%=numberOfQuestions - numberOfWrongQuestions %></p>
			</aui:col>
			<aui:col span="3">
				<p><liferay-ui:message key="Time"> </liferay-ui:message></p>
				<p><%=duration * 60 - remainingTime%> <liferay-ui:message key="Seconds"> </liferay-ui:message></p>
				
			</aui:col>						
		</aui:row>
		<aui:button-row> 
			<aui:button name="btnFinish" value="Finish" onClick="<%=examonlineHome.toString() %>"></aui:button>
			<c:if test='<%= OnlinetestResultEntryPermission.contains(permissionChecker, onlinetestResultEntryId, actionViewTestResult) %>'>
				<aui:button name="btnViewResult" value ="ViewResult" onClick="<%=examDetailResult.toString() %>"></aui:button>
			</c:if>
		</aui:button-row>
	</aui:field-wrapper>
</c:if>