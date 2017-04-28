<%@include file="/html/init.jsp"%>
<%
	SearchContainer searchContainer = (SearchContainer)request.getAttribute("liferay-ui:search:searchContainer");
	DisplayTerms displayTerms = searchContainer.getDisplayTerms();
	String title = ParamUtil.getString(request,"title");
	String subject = ParamUtil.getString(request,"subject");
	String questionContent = ParamUtil.getString(request,"questionContent");
	String onlinetestEntryId = ParamUtil.getString(request,"onlinetestEntryId");
	String questionReplaceId = ParamUtil.getString(request,"questionReplaceId");
	//System.out.println(onlinetestEntryId + "|" + questionReplaceId);
%>
<liferay-ui:search-toggle buttonLabel='Search' displayTerms="<%= displayTerms %>" id="toggle_id_user_search">
	<aui:input label="Title" name="title" value="<%= title %>" />	
	<aui:input label="Subject" name="subject" value="<%= subject %>" />
	<aui:input label="Content" name="questionContent" value="<%= questionContent %>" />
	<aui:input name="onlinetestEntryId" value="<%= onlinetestEntryId %>" type="hidden" />
	<aui:input name="questionReplaceId" value="<%= questionReplaceId %>" type="hidden"/>
</liferay-ui:search-toggle>

<%-- <div class="search-form">
    <span class="aui-search-bar">
        <aui:input inlineField="<%= true %>" label="" name="keywords" size="30" title="search-entries" type="text" />

        <aui:button type="submit" value="search" />
    </span>
</div> --%>