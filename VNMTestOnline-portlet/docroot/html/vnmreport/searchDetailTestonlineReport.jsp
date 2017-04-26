<%@include file="/html/init.jsp"%>
<%
	SearchContainer searchContainer = (SearchContainer)request.getAttribute("liferay-ui:search:searchContainer");
	DisplayTerms displayTerms = searchContainer.getDisplayTerms();
	
	String userName = ParamUtil.getString(request,"userName");
	String vnmcompany = ParamUtil.getString(request,"company");
	String onlinetestEntryId  = ParamUtil.getString(request,"onlinetestEntryId");
%>
<liferay-ui:search-toggle buttonLabel='Search' displayTerms="<%= displayTerms %>" id="toggle_id_duy_search">
	<aui:input label="UserName" name="userName" value="<%= userName %>" />
	<aui:input label="Company" name="vnmcompany" value="<%=vnmcompany%>" />
	<aui:input name="onlinetestEntryId" value="<%=onlinetestEntryId%>" type="hidden"/>
</liferay-ui:search-toggle>
