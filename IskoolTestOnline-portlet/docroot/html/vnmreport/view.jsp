<%@include file="/html/init.jsp"%>
<c:if test="<%=themeDisplay.isSignedIn() %>">
	<%
   		String curTab = ParamUtil.getString(request, "curTab" , "Article");  //set the default tab
		request.setAttribute("curTab", curTab);	
	%>
	<liferay-ui:tabs names="Article,ExamOnline" refresh="false"
		tabsValues="Article,ExamOnline" param="Tab" value = "${curTab }">
		<liferay-ui:section>  
        	<%@ include file="articleReport.jsp"%>
    	</liferay-ui:section>
		<liferay-ui:section>
			<%@ include file="testonlineReport.jsp"%>	
    	</liferay-ui:section>
	</liferay-ui:tabs>
</c:if>