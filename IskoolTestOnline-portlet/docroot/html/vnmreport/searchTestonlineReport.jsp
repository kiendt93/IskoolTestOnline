<%@include file="/html/init.jsp"%>
<%
	SearchContainer searchContainer = (SearchContainer)request.getAttribute("liferay-ui:search:searchContainer");
	DisplayTerms displayTerms = searchContainer.getDisplayTerms();
	
	String title = ParamUtil.getString(request, "title");
	String userName = ParamUtil.getString(request,"userName");
	String fromDate = ParamUtil.getString(request,"fromDate");
	String toDate = ParamUtil.getString(request,"toDate");
%>
<liferay-ui:search-toggle buttonLabel='Search' displayTerms="<%= displayTerms %>" id="toggle_id_onlineresult_search">
	<aui:input label="Title" name="title" value="<%=title %>" />
	<aui:input label="UserName" name="userName" value="<%= userName %>" />
	<aui:input label="FromDate" name="fromDate" value="<%=fromDate%>" />
	<aui:input label="ToDate" name="toDate" value="<%=toDate%>" />
</liferay-ui:search-toggle>
