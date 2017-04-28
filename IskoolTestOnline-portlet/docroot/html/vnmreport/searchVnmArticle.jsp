<%@include file="/html/init.jsp"%>
<%
	SearchContainer searchContainer = (SearchContainer)request.getAttribute("liferay-ui:search:searchContainer");
	DisplayTerms displayTerms = searchContainer.getDisplayTerms();
	
	String title = ParamUtil.getString(request, "title");
	String userName = ParamUtil.getString(request,"userName");
	String action = ParamUtil.getString(request,"action");
	String status = ParamUtil.getString(request,"status");
	String fromDate = ParamUtil.getString(request,"fromDate");
	String toDate = ParamUtil.getString(request,"toDate");
%>
<liferay-ui:search-toggle buttonLabel='Search' displayTerms="<%= displayTerms %>" id="toggle_id_article_search">
	<aui:input label="Title" name="title" value="<%=title %>" />
	<aui:input label="UserName" name="userName" value="<%= userName %>" />
	<aui:input label="Action" name="action" value="<%= action %>" />
	<aui:input label="Status" name="status" value="<%=status%>" />
	<aui:input label="FromDate" name="fromDate" value="<%=fromDate%>" />
	<aui:input label="ToDate" name="toDate" value="<%=toDate%>" />
</liferay-ui:search-toggle>
