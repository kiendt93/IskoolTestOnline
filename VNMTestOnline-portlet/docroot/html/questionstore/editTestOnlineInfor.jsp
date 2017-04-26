<%@include file="/html/init.jsp"%>
<%
	themeDisplay =  (ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);
%>
<c:if test="<%=themeDisplay.isSignedIn()%>">
	<%
		long onlinetestEntryId  = ParamUtil.getLong(request, "onlinetestEntryId");
		OnlinetestEntry onlineTestEntry = OnlinetestEntryLocalServiceUtil.getOnlinetestEntry(onlinetestEntryId);
		String title = onlineTestEntry.getTitle();
		int pointOfExam = onlineTestEntry.getPoint();
		int duration = onlineTestEntry.getDuration();
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		String startDate = df.format(onlineTestEntry.getTestStartTime());
		String endDate = df.format(onlineTestEntry.getTestEndTime());
		df = new SimpleDateFormat("HH:mm");
		String startTime  = df.format(onlineTestEntry.getTestStartTime());
		String endTime = df.format(onlineTestEntry.getTestEndTime());	
		
	%>
	<portlet:renderURL var="questionBackURL">	    
            <portlet:param name="mvcPath" value="/html/questionstore/createTestOnline.jsp"/>
	</portlet:renderURL>
	<aui:form method="post" name="fmUpdateExam">
		<aui:input type="hidden" name="onlineTestEntryId" value="<%=String.valueOf(onlinetestEntryId) %>"/>
		<aui:row>
			<aui:input inlineField = "true" name="title" label="Title" required="true" value="<%=title%>"></aui:input>		
			<aui:input inlineField="true" type="number" name="pointOfExam" label="pointOfExam" required="true" value = "<%=pointOfExam%>"/>
		</aui:row>
		<aui:row>
			<aui:input inlineField="true" name="startDatepicker" id ="startDatepicker" value="<%=startDate %>" type="text" cssClass="input-small" label="StartDate"/>
			<aui:input inlineField="true" name="startTimepicker" id ="startTimepicker" value="<%=startTime%>" type="text" placeholder="hh:mm" cssClass="input-mini" label=""/>
			<aui:input inlineField="true" name="endDatepicker" id ="endDatepicker" value="<%=endDate%>" type="text" cssClass="input-small" label="EndDate"/>
			<aui:input inlineField="true" name="endTimepicker" id ="endTimepicker" value="<%=endTime%>" type="text" placeholder="hh:mm" cssClass="input-mini" label=""/>
			<aui:input inlineField="true" name="duration" label="Duration" placeholder="Seconds" cssClass="input-mini" value="<%=duration%>"/>
		</aui:row>
		<aui:button type="button" name="btnMakeExam" value="MakeExam" onClick='<%= renderResponse.getNamespace() + "updateTestOnlineInfor();"%>'/>
		<aui:button type="button" name="btnClose" value="Close" onClick="<%=questionBackURL.toString()%>"/>			
	</aui:form>
	<aui:script>
		Liferay.provide(
				window,
				'<portlet:namespace />updateTestOnlineInfor',
				function() 
				{
					submitForm(document.<portlet:namespace />fmUpdateExam,'<portlet:actionURL name="updateTestOnlineInfor"></portlet:actionURL>');
				});	
	</aui:script>
</c:if>

