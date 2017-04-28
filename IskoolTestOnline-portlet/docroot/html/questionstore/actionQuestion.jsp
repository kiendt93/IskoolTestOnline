<%@include file="/html/init.jsp"%>
<%
	String mvcPath = ParamUtil.getString(request, "mvcPath");
	ResultRow row = (ResultRow)request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
	QuestionEntry entry = (QuestionEntry)row.getObject(); 
%>
<liferay-ui:icon-menu message="Actions">
        <portlet:renderURL var="editURL">
            <portlet:param name="questionEntryId" value="<%= String.valueOf(entry.getQuestionEntryId())%>" />
            <portlet:param name="mvcPath" value="/html/questionstore/updateQuestion.jsp" />
        </portlet:renderURL>

        <liferay-ui:icon image="edit" message="Edit" url="<%= editURL.toString() %>" />
        <portlet:actionURL name="deleteQuestion" var="deleteURL">
            <portlet:param name="questionEntryId"
                value="<%= String.valueOf(entry.getQuestionEntryId()) %>" /> 
        </portlet:actionURL>

        <liferay-ui:icon-delete message="Delete" url="<%= deleteURL.toString() %>" />
</liferay-ui:icon-menu>  
