<%@include file="/html/init.jsp"%>
<%
	String mvcPath = ParamUtil.getString(request, "mvcPath");
	ResultRow row = (ResultRow)request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
	OnlinetestResultEntry entry = (OnlinetestResultEntry)row.getObject();
	String actionViewResult="VIEW_RESULT";
%>	
<liferay-ui:icon-menu message="Actions">
			<c:if test="<%=OnlinetestResultEntryPermission.contains(permissionChecker, entry.getOnlinetestResultEntryId(),actionViewResult)%>">
	        <portlet:renderURL var="viewURL">
	            <portlet:param name="onlinetestResultEntryId" value="<%= String.valueOf(entry.getOnlinetestResultEntryId())%>" />
	             <portlet:param name="onlinetestEntryId" value = "<%= String.valueOf(entry.getOnlineTestEntryId())%>" />
	            <portlet:param name="mvcPath" value="/html/examonline/detailResultTest.jsp" />
	        </portlet:renderURL>
	        <liferay-ui:icon image="preview" message="ViewResult" url="<%= viewURL.toString() %>" />	
	        </c:if>		
</liferay-ui:icon-menu>  