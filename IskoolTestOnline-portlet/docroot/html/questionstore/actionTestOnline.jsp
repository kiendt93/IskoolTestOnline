<%@include file="/html/init.jsp"%> 
<%
	String mvcPath = ParamUtil.getString(request, "mvcPath");
	ResultRow row = (ResultRow)request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
	OnlinetestEntry entry = (OnlinetestEntry)row.getObject(); 
%>
<liferay-ui:icon-menu message="Actions">
        <portlet:renderURL var="previewURL">
            <portlet:param name="onlinetestEntryId" value="<%= String.valueOf(entry.getOnlinetestEntryId())%>" />
            <portlet:param name="mvcPath" value="/html/questionstore/previewTestOnline.jsp" />
        </portlet:renderURL>

        <liferay-ui:icon image="preview" message="Preview" url="<%= previewURL.toString() %>" />
        
        <portlet:renderURL var="editURL">
            <portlet:param name="onlinetestEntryId" value="<%= String.valueOf(entry.getOnlinetestEntryId())%>" />
            <portlet:param name="mvcPath" value="/html/questionstore/editTestOnline.jsp" />
        </portlet:renderURL>

        <liferay-ui:icon image="edit" message="EditTestQuestions" url="<%= editURL.toString() %>" />
       
        <portlet:renderURL var="editTestInforURL">
            <portlet:param name="onlinetestEntryId" value="<%= String.valueOf(entry.getOnlinetestEntryId())%>" />
            <portlet:param name="mvcPath" value="/html/questionstore/editTestOnlineInfor.jsp" />
        </portlet:renderURL>

        <liferay-ui:icon image="edit" message="EditTestInfor" url="<%= editTestInforURL.toString() %>" />                
        
        <portlet:actionURL name="deleteOnlineTest" var="deleteURL">
            <portlet:param name="onlinetestEntryId"
                value="<%= String.valueOf(entry.getOnlinetestEntryId()) %>" /> 
        </portlet:actionURL>

        <liferay-ui:icon-delete message="Delete" url="<%= deleteURL.toString() %>" />
</liferay-ui:icon-menu>  
