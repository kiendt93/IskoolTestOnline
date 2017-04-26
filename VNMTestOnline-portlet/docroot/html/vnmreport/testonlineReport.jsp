<%-- <%@include file="/html/init.jsp"%> --%>
<c:if test="<%=themeDisplay.isSignedIn() %>">
		<%
			List<OnlinetestEntry> listOfOnlineTestEntry = new ArrayList<OnlinetestEntry>();
			listOfOnlineTestEntry = OnlinetestEntryLocalServiceUtil.getAllOnlinetests();
			DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
			String title = ParamUtil.getString(request,"title");
			String fromDate = ParamUtil.getString(request,"fromDate");
			String toDate = ParamUtil.getString(request,"toDate");
			String userName = ParamUtil.getString(request,"userName");
			//Order By
			String orderByColTest = ParamUtil.getString(request, "orderByCol"); 
			String orderByTypeTest = ParamUtil.getString(request, "orderByType");
			String sortingOrderTest = orderByTypeTest;
			if(orderByTypeTest.equals("desc"))
			{
			    orderByTypeTest = "asc";
			}
			else
			{
			    orderByTypeTest = "desc";
			} 
			if(Validator.isNull(orderByTypeTest))
			{
			    orderByTypeTest = "desc";
			}				
 		%>
	<liferay-portlet:renderURL varImpl="reportSearchURL">
		<portlet:param name="curTab" value="ExamOnline"/>
		<portlet:param name="mvcPath"
			value="/html/vnmreport/view.jsp" />
	</liferay-portlet:renderURL>
	<aui:form action="<%=reportSearchURL%>" name="fmReportTestResultSearch">
		<liferay-portlet:renderURLParams varImpl="reportSearchURL" />
		<liferay-portlet:renderURL varImpl="iteratorURL">
			<portlet:param name="title" value="<%=title%>" />
			<portlet:param name="userName" value="<%=userName%>"/>
			<portlet:param name="fromDate" value="<%=fromDate%>" />
			<portlet:param name="toDate" value="<%=toDate%>" />
			<portlet:param name="curTab" value="ExamOnline"/>
			<portlet:param name="mvcPath" value="/html/vnmreport/view.jsp" />
		</liferay-portlet:renderURL>
		<liferay-ui:search-container delta="10" orderByType="<%=orderByTypeTest %>"
			displayTerms="<%= new DisplayTerms(renderRequest)%>"
			iteratorURL="<%=iteratorURL%>" emptyResultsMessage="empty-actions">
			<liferay-ui:search-form page="/html/vnmreport/searchTestonlineReport.jsp"
				servletContext="<%=application%>" />
			<liferay-ui:search-container-results>
				<%
					DisplayTerms displayTerms = searchContainer.getDisplayTerms();
									if (displayTerms.isAdvancedSearch()) {
										listOfOnlineTestEntry = OnlinetestEntryLocalServiceUtil.searchOnlinetestEntry(title, userName, dateFormat.parse(fromDate), dateFormat.parse(toDate), true);
										List<OnlinetestEntry> sortableList = new ArrayList<OnlinetestEntry>(listOfOnlineTestEntry);
										if(Validator.isNotNull(orderByColTest))
										{
											if (sortingOrderTest.equalsIgnoreCase("desc"))
											{
												Collections.sort(sortableList, new VnmComperatorOnlinetestEntryByColumns(orderByColTest));
											}
											else
											{
												Collections.reverse(sortableList);
											}
										}
										List<OnlinetestEntry> subLists = ListUtil.subList(sortableList,
												searchContainer.getStart(), searchContainer.getEnd());
										int sizeOf = listOfOnlineTestEntry.size();
										pageContext.setAttribute("results", subLists);
										pageContext.setAttribute("total", sizeOf);
									} else {
										String searchkeywords = displayTerms.getKeywords();
										listOfOnlineTestEntry = OnlinetestEntryLocalServiceUtil.searchOnlinetestEntry(searchkeywords, searchkeywords, null, null, false);
										List<OnlinetestEntry> sortableList = new ArrayList<OnlinetestEntry>(listOfOnlineTestEntry);
										if(Validator.isNotNull(orderByColTest))
										{
											if (sortingOrderTest.equalsIgnoreCase("desc"))
											{
												Collections.sort(sortableList, new VnmComperatorOnlinetestEntryByColumns(orderByColTest));
											}
											else
											{
												Collections.reverse(sortableList);
											}
										}
										List<OnlinetestEntry> subLists = ListUtil.subList(sortableList,
												searchContainer.getStart(), searchContainer.getEnd());
										int sizeOf = listOfOnlineTestEntry.size();

										pageContext.setAttribute("results", subLists);
										pageContext.setAttribute("total", sizeOf);

									}
				%>
			</liferay-ui:search-container-results>
			<%
				DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
			%>
			<liferay-ui:search-container-row
				className="com.vietnamobile.model.OnlinetestEntry"
				keyProperty="onlinetestEntryId" modelVar="onlinetestEntry">
				<liferay-ui:search-container-column-text name="ID"
					value="<%=String.valueOf(listOfOnlineTestEntry.indexOf(onlinetestEntry) + 1)%>" />
				<liferay-ui:search-container-column-text orderable="true" name="Title"
					value="<%=onlinetestEntry.getTitle()%>" />
				<liferay-ui:search-container-column-text orderable="true" name="StartExam"
					value="<%=df.format(onlinetestEntry.getTestStartTime())%>" />
				<liferay-ui:search-container-column-text orderable="true" name="EndExam"
					value="<%=df.format(onlinetestEntry.getTestEndTime())%>" />
				<liferay-portlet:renderURL var="detailReportURL">
					<portlet:param name="onlinetestEntryId" value="<%=String.valueOf(onlinetestEntry.getOnlinetestEntryId())%>"/>
					<portlet:param name="mvcPath" value="/html/vnmreport/detailTestonlineReport.jsp"/>
				</liferay-portlet:renderURL>
				<%	String fixDetailReportURL = "location.href='"
						+ detailReportURL.toString() + "'";%>
				<liferay-ui:search-container-column-button href="<%=fixDetailReportURL %>" name="DetailReport"></liferay-ui:search-container-column-button>
			</liferay-ui:search-container-row>
			<liferay-ui:search-iterator searchContainer="<%=searchContainer%>" />
		</liferay-ui:search-container>   
	</aui:form>
</c:if>