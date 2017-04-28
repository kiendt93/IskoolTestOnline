<%@include file="/html/init.jsp"%>
<%
	themeDisplay = (ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);
%>
<c:if test="<%= themeDisplay.isSignedIn() %>">
	<%
	    long userId = Long.valueOf(request.getRemoteUser());
		String subject = ParamUtil.getString(request, "subject");
        List<SubjectEntry> listOfSubject = SubjectEntryLocalServiceUtil.getAllSubjects(); 
	%>
	<liferay-portlet:renderURL varImpl="viewUrl">
		<portlet:param name="mvcPath" value="/html/questionstore/view.jsp" />
	</liferay-portlet:renderURL>
	<aui:form method="post" name="fmEditSpecialSubject">
		<h4>
		<liferay-ui:message key="function-create-subject"></liferay-ui:message> 
		</h4>
		<hr>
		<div id="specialSubject-fields">
			<div class="lfr-form-row lfr-form-row-inline">
				<div class="row-fields" style="display: flex;">
					<aui:select fieldParam='examType1' id='examType1' name="examType1" label="Purpose">
						<aui:option value="empty" label="PleaseSelectOneSubject" selected="true"></aui:option>
						<aui:option value="<%=TESTONLINE %>" label="<%=TESTONLINE %>"></aui:option>						
						<aui:option value="<%=PRACTICE %>" label="<%=PRACTICE %>"></aui:option>
					</aui:select>
					
					<aui:select fieldParam='course1' id='course1' name="course1" label="Course">
						<aui:option value="empty" label="PleaseSelectOneSubject" selected="true"></aui:option>
						<aui:option value="<%=MATH %>" label="<%=MATH %>"></aui:option>
						<aui:option value="<%=LITERATURE %>" label="<%=LITERATURE %>"></aui:option>
						<aui:option value="<%=BIOLOGICAL %>" label="<%=BIOLOGICAL %>"></aui:option>
						<aui:option value="<%=PHYSICAL %>" label="<%=PHYSICAL %>"></aui:option>
						<aui:option value="<%=CHEMISTRY %>" label="<%=CHEMISTRY %>"></aui:option>
						<aui:option value="<%=HISTORY %>" label="<%=HISTORY %>"></aui:option>
						<aui:option value="<%=GEOGRAPHY %>" label="<%=GEOGRAPHY %>"></aui:option>
						<aui:option value="<%=FOREIGN_LANGUAGE %>" label="<%=FOREIGN_LANGUAGE %>"></aui:option>
					</aui:select>
					<aui:input fieldParam='subject1' id='subject1' name="subject1" label="Subject" value=""/>
					<aui:input fieldParam='description1' id='description1' name="description1" label="Description" value=""/>					
				</div>
			</div>
		</div>
		<aui:button type="button" name="btnSubmit" value="Save" onClick='<%= renderResponse.getNamespace() + "editSubject();"%>'/>
		<aui:button type="button" name="btnCancel" value="Cancel" onClick="<%=viewUrl.toString()%>"/>
	</aui:form>
	<liferay-ui:search-container delta="10" orderByType="desc">
		<liferay-ui:search-container-results>
			<%
			    List<SubjectEntry> subLists = ListUtil.subList(
			    		listOfSubject, searchContainer.getStart(),
			                        searchContainer.getEnd());
			                int sizeOf = listOfSubject.size();

			                pageContext.setAttribute("results", subLists);
			                pageContext.setAttribute("total", sizeOf);
			%>
		</liferay-ui:search-container-results>
		<%
		    DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		%>
		<liferay-ui:search-container-row
			className="com.vietnamobile.model.SubjectEntry"
			keyProperty="subjectEntryId" modelVar="subjectEntry">
			<liferay-ui:search-container-column-text name="SubjectEntryId"
				value="<%=String.valueOf(subjectEntry.getSubjectEntryId())%>" />
			<liferay-ui:search-container-column-text name="CreatedBy"
				value="<%=UserLocalServiceUtil.getUserById(
						subjectEntry.getUserId()).getFullName()%>" />
			<liferay-ui:search-container-column-text name="CreateDate"
				value="<%=df.format(subjectEntry.getCreateDate())%>" />
			<liferay-ui:search-container-column-text name="ModifiedDate"
				value="<%=df.format(subjectEntry.getModifiedDate())%>" />
			<liferay-ui:search-container-column-text name="Course">
				<liferay-ui:message key="<%=subjectEntry.getCourse()%>"></liferay-ui:message> 
			</liferay-ui:search-container-column-text>
			<liferay-ui:search-container-column-text name="Subject"
				value="<%=subjectEntry.getSubject()%>" />				
			<liferay-ui:search-container-column-text name="Description"
				value="<%=subjectEntry.getDescription()%>" />
			<liferay-ui:search-container-column-text name="Purpose">
				<liferay-ui:message key="<%=subjectEntry.getExamType()%>"></liferay-ui:message> 
			</liferay-ui:search-container-column-text>
			<liferay-ui:search-container-column-jsp
				path="/html/questionstore/actionSubject.jsp"
				align="center" />
		</liferay-ui:search-container-row>
		<liferay-ui:search-iterator searchContainer="<%=searchContainer%>" /> 
	</liferay-ui:search-container>
<aui:script>

Liferay.provide(
	window,
	'<portlet:namespace />editSubject',
	function() 
	{
	    submitForm(document.<portlet:namespace />fmEditSpecialSubject,'<portlet:actionURL name="addSubject"></portlet:actionURL>');
});
AUI().use('liferay-auto-fields',
	function(A) {
	    new Liferay.AutoFields(
	          {
	              contentBox: '#specialSubject-fields',
	              fieldIndexes: '<portlet:namespace />rowIndexes'
	          }
	      ).render();
    }
);
</aui:script>	
</c:if>
<c:if test ="<%=!themeDisplay.isSignedIn()%>">
	<liferay-ui:message key="user_not_login"></liferay-ui:message>
</c:if>
