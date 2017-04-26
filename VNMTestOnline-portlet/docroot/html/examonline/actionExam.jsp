<%@page import="com.liferay.portal.kernel.util.DateUtil"%>
<%@page import="com.vietnamobile.service.permission.OnlinetestEntryPermission"%>
<%@include file="/html/init.jsp"%>
<%
	String mvcPath = ParamUtil.getString(request, "mvcPath");
	ResultRow row = (ResultRow)request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
	OnlinetestEntry entry = (OnlinetestEntry)row.getObject();
	String currentDate  = DateUtil.getCurrentDate("dd/MM/yyyy HH:mm:ss", locale, timeZone);
	long userId = Long.valueOf(request.getRemoteUser());
	
	List<OnlinetestResultEntry> listTestResult = OnlinetestResultEntryLocalServiceUtil.getUserExamed(userId,entry.getOnlinetestEntryId(),"", 0, null, null,TESTONLINE, true);
	boolean hadExamFinish = (listTestResult.size() > 0);
	DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	Date systemDate = df.parse(currentDate);
%>	
<liferay-ui:icon-menu message="Actions">
		<c:if test="<%=systemDate.after(entry.getTestStartTime()) && systemDate.before(entry.getTestEndTime()) && !hadExamFinish%>">
	        <portlet:renderURL var="editURL">
	        	<portlet:param name="examType" value="<%=TESTONLINE %>"/>
	            <portlet:param name="onlinetestEntryId" value="<%= String.valueOf(entry.getOnlinetestEntryId())%>" />
	            <portlet:param name="mvcPath" value="/html/examonline/executeTest.jsp" />
	        </portlet:renderURL>
	        <liferay-ui:icon image="edit" message="ExecuteExam" url="<%= editURL.toString() %>" />			
		</c:if>
		<c:if test="<%=!(systemDate.after(entry.getTestStartTime()) && systemDate.before(entry.getTestEndTime()) && !hadExamFinish)%>">
	        <liferay-ui:icon image="lock" message="Lock"/>			
		</c:if>
</liferay-ui:icon-menu>  
