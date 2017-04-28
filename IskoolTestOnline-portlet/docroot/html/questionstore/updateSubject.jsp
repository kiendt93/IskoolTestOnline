<%@include file="/html/init.jsp"%>
<%
	themeDisplay = (ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);
%>
<c:if test="<%= themeDisplay.isSignedIn() %>">
	<%
	    long userId = Long.valueOf(request.getRemoteUser());
		String subject = ParamUtil.getString(request, "subject");
		long subjectEntryId = ParamUtil.getLong(request, "subjectEntryId");
		String course = "";
		String description = "";
		String examType = "";
		SubjectEntry subjectEntry = null;
		if (Validator.isNotNull(subjectEntryId) && subjectEntryId > 0)
		{
			subjectEntry = SubjectEntryLocalServiceUtil.getSubjectEntry(subjectEntryId);
			description = subjectEntry.getDescription();
			subject = subjectEntry.getSubject();
			examType = subjectEntry.getExamType();
			course = subjectEntry.getCourse();
		}
	%>
	<liferay-portlet:renderURL varImpl="viewUrl">
		<portlet:param name="mvcPath" value="/html/questionstore/view.jsp" />
	</liferay-portlet:renderURL>
	<aui:form method="post" name="fmUpdateSpecialSubject">
		<aui:input type="hidden" name ="subjectEntryId" value="<%=subjectEntryId %>"/>
		<div class="lfr-form-row lfr-form-row-inline">
			<div class="row-fields" style="display: block;">
				<aui:select fieldParam='examType' id='examType' name="examType"
					label="Purpose">
					<aui:option value="empty" label="PleaseSelectOneSubject"
						selected='<%=examType.equals("empty") %>'></aui:option>
					<aui:option value="<%=TESTONLINE%>" label="<%=TESTONLINE%>" selected='<%=examType.equals(TESTONLINE) %>'></aui:option>
					<aui:option value="<%=PRACTICE%>" label="<%=PRACTICE%>" selected='<%=examType.equals(PRACTICE) %>'></aui:option>
				</aui:select>
				<aui:select fieldParam='course' id='course' name="course" label="Course">
					<aui:option value="empty" label="PleaseSelectOneSubject" selected='<%=course.equals("empty") %>'></aui:option>
					<aui:option value="<%=MATH %>" label="<%=MATH %>" selected='<%=course.equals(MATH) %>'></aui:option>
					<aui:option value="<%=LITERATURE %>" label="<%=LITERATURE %>" selected='<%=course.equals(LITERATURE) %>'></aui:option>
					<aui:option value="<%=BIOLOGICAL %>" label="<%=BIOLOGICAL %>" selected='<%=course.equals(BIOLOGICAL) %>'></aui:option>
					<aui:option value="<%=PHYSICAL %>" label="<%=PHYSICAL %>" selected='<%=course.equals(PHYSICAL) %>'></aui:option>
					<aui:option value="<%=CHEMISTRY %>" label="<%=CHEMISTRY %>" selected='<%=course.equals(CHEMISTRY) %>'></aui:option>
					<aui:option value="<%=HISTORY %>" label="<%=HISTORY %>" selected='<%=course.equals(HISTORY) %>'></aui:option>
					<aui:option value="<%=GEOGRAPHY %>" label="<%=GEOGRAPHY %>" selected='<%=course.equals(GEOGRAPHY) %>'></aui:option>
					<aui:option value="<%=FOREIGN_LANGUAGE %>" label="<%=FOREIGN_LANGUAGE %>" selected='<%=course.equals(FOREIGN_LANGUAGE) %>'></aui:option>
				</aui:select>
				<aui:input fieldParam='subject' id='subject' name="subject"
					label="Subject" value="<%=subject %>" />
				<aui:input fieldParam='description' id='description'
					name="description" label="Description" value="<%=description %>" />
			</div>
		</div>
		<aui:button type="button" name="btnSubmit" value="Update" onClick='<%= renderResponse.getNamespace() + "updateSubject();"%>'/>
		<aui:button type="button" name="btnCancel" value="Cancel" onClick="<%=viewUrl.toString()%>"/>
	</aui:form>

	<aui:script>
	
	Liferay.provide(
		window,
		'<portlet:namespace />updateSubject',
		function() 
		{
		    submitForm(document.<portlet:namespace />fmUpdateSpecialSubject,'<portlet:actionURL name="updateSubject"></portlet:actionURL>');
	});
	</aui:script>	
</c:if>
<c:if test ="<%=!themeDisplay.isSignedIn()%>">
	<liferay-ui:message key="user_not_login"></liferay-ui:message>
</c:if>
