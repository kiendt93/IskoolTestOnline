<%@include file="/html/init.jsp"%>
<%
	String examType = GetterUtil.getString(portletPreferences.getValue("examType", StringPool.BLANK));
%>
<liferay-portlet:actionURL portletConfiguration="true" var="configurationURL" />
<aui:form action="<%= configurationURL %>" method="post" name="fm">
	<aui:select autofocus="true" name="preferences--examType--" label="ClassFor">
		<aui:option value="empty" label="PleaseSelectExamType"
			selected="true" />
		<aui:option value="<%=PRACTICE %>" label="<%=PRACTICE %>"
			selected="<%=examType.equals(PRACTICE)%>"/>
		<aui:option value="<%=TESTONLINE %>" label="<%=TESTONLINE %>"
			selected="<%=examType.equals(TESTONLINE)%>"/>
		<aui:option value="<%=VIEW_HISTORY %>" label="<%=VIEW_HISTORY %>"
			selected="<%=examType.equals(VIEW_HISTORY)%>"/>			
	</aui:select>
	<!-- Preference control goes here -->

    <aui:button-row>
        <aui:button type="submit" Value="Save"/>
    </aui:button-row>
</aui:form>