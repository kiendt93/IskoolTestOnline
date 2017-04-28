<%@include file="/html/init.jsp"%>
<%
	String mvcPath = ParamUtil.getString(request, "mvcPath");
	ResultRow row = (ResultRow)request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
	SubjectEntry entry = (SubjectEntry)row.getObject(); 
%>
<liferay-ui:icon-menu message="Actions">
		<c:if test="<%=SubjectEntryPermission.contains(permissionChecker, entry.getSubjectEntryId(), ActionKeys.UPDATE) %>">
	        <portlet:renderURL var="editURL">
	            <portlet:param name="subjectEntryId" value="<%= String.valueOf(entry.getSubjectEntryId())%>" />
	            <portlet:param name="mvcPath" value="/html/questionstore/updateSubject.jsp" />
	        </portlet:renderURL>
	
	        <liferay-ui:icon image="edit" message="Edit" url="<%= editURL.toString() %>" />
        </c:if>
        <c:if test="<%=SubjectEntryPermission.contains(permissionChecker, entry.getSubjectEntryId(), ActionKeys.DELETE) %>">
        <portlet:actionURL name="deleteSubject" var="deleteURL">
	        <portlet:param name="subjectEntryId"
	                value="<%= String.valueOf(entry.getSubjectEntryId()) %>" /> 
	        </portlet:actionURL>
	
	        <liferay-ui:icon-delete message="Delete" url="<%= deleteURL.toString() %>" />
        </c:if>
</liferay-ui:icon-menu>  
