<%-- <%@include file="/html/init.jsp"%> --%>

<c:if test="<%=themeDisplay.isSignedIn() %>">
		<%
			List<VnmArticleReportEntry> listOfArticleActions = new ArrayList<VnmArticleReportEntry>();
			String listOfActionIds = "";
			String title = ParamUtil.getString(request, "title");
			String userName = ParamUtil.getString(request,"userName");
			String action = ParamUtil.getString(request,"action");
			String status = ParamUtil.getString(request,"status","0");
			String fromDate = ParamUtil.getString(request,"fromDate","01/01/2015");
			String toDate = ParamUtil.getString(request,"toDate","01/01/2099");
			DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
			//Order By
			String orderByCol = ParamUtil.getString(request, "orderByCol"); 
			String orderByType = ParamUtil.getString(request, "orderByType");
			String sortingOrder = orderByType;
			if(orderByType.equals("desc"))
			{
			    orderByType = "asc";
			}
			else
			{
			    orderByType = "desc";
			} 
			if(Validator.isNull(orderByType))
			{
			    orderByType = "desc";
			}				
 		%>
	<liferay-portlet:renderURL varImpl="reportSearchArticleURL">
		<portlet:param name="curTab" value="Article"/>
		<portlet:param name="mvcPath"
			value="/html/vnmreport/view.jsp" />
	</liferay-portlet:renderURL>
	<aui:form action="<%=reportSearchArticleURL%>" name="fmReportSearch">
		<liferay-portlet:renderURLParams varImpl="reportSearchArticleURL" />
		<liferay-portlet:renderURL varImpl="iteratorURL">
			<portlet:param name="title" value="<%=title%>" />
			<portlet:param name="userName" value="<%=userName%>" />
			<portlet:param name="action" value="<%=action%>" />
			<portlet:param name="status" value="<%=status%>" />
			<portlet:param name="fromDate" value="<%=fromDate%>" />
			<portlet:param name="toDate" value="<%=toDate%>" />
			<portlet:param name="curTab" value="Article"/>
			<portlet:param name="mvcPath" value="/html/vnmreport/view.jsp" />
		</liferay-portlet:renderURL>
		<liferay-ui:search-container delta="10" orderByType="<%=orderByType %>"
			displayTerms="<%= new DisplayTerms(renderRequest)%>"
			iteratorURL="<%=iteratorURL%>" emptyResultsMessage="empty-actions">
			<liferay-ui:search-form page="/html/vnmreport/searchVnmArticle.jsp"
				servletContext="<%=application%>" />
			<liferay-ui:search-container-results>
				<%
					DisplayTerms displayTerms = searchContainer.getDisplayTerms();
									if (displayTerms.isAdvancedSearch()) {
										listOfArticleActions = VnmArticleReportEntryLocalServiceUtil.searchLogArticle(title,
												userName, action, Integer.valueOf(status), dateFormat.parse(fromDate),
												dateFormat.parse(toDate), true);
										List<VnmArticleReportEntry> sortableList = new ArrayList<VnmArticleReportEntry>(listOfArticleActions);
										if(Validator.isNotNull(orderByCol))
										{
											if (sortingOrder.equalsIgnoreCase("desc"))
											{
												Collections.sort(sortableList, new VnmComperatorArticleByColumns(orderByCol));
											}
											else
											{
												Collections.reverse(sortableList);
											}
										}				
										List<VnmArticleReportEntry> subLists = ListUtil.subList(sortableList,
												searchContainer.getStart(), searchContainer.getEnd());
										int sizeOf = listOfArticleActions.size();
										pageContext.setAttribute("results", subLists);
										pageContext.setAttribute("total", sizeOf);
									} else {
										String searchkeywords = displayTerms.getKeywords();
										listOfArticleActions = VnmArticleReportEntryLocalServiceUtil.searchLogArticle(
												searchkeywords, searchkeywords, searchkeywords, -1, null, null, false);
										List<VnmArticleReportEntry> sortableList = new ArrayList<VnmArticleReportEntry>(listOfArticleActions);
										if(Validator.isNotNull(orderByCol))
										{
											if (sortingOrder.equalsIgnoreCase("desc"))
											{
												Collections.sort(sortableList, new VnmComperatorArticleByColumns(orderByCol));
											}
											else
											{
												Collections.reverse(sortableList);
											}
										}								
										List<VnmArticleReportEntry> subLists = ListUtil.subList(sortableList,
												searchContainer.getStart(), searchContainer.getEnd());
										int sizeOf = listOfArticleActions.size();

										pageContext.setAttribute("results", subLists);
										pageContext.setAttribute("total", sizeOf);

									}
				%>
			</liferay-ui:search-container-results>
			<%
				DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
			%>
			<liferay-ui:search-container-row
				className="com.vietnamobile.model.VnmArticleReportEntry"
				keyProperty="vnmArticleReportEntryId" modelVar="vnmArticleAction">
				<liferay-ui:search-container-column-text name="ID"
					value="<%=String.valueOf(listOfArticleActions.indexOf(vnmArticleAction) + 1)%>" />
				<liferay-ui:search-container-column-text name="Action"
					value="<%=vnmArticleAction.getAction()%>" />
				<liferay-ui:search-container-column-text orderable="true" name="Updater"
					value="<%=vnmArticleAction.getUserName()%>" />
				<liferay-ui:search-container-column-text orderable="true" name="ModifiedDate"
					value="<%=df.format(vnmArticleAction.getModifiedDate())%>" />
				<liferay-ui:search-container-column-text orderable="true" name="Title"
					value="<%=vnmArticleAction.getTitle()%>" />
				<liferay-ui:search-container-column-text name="Status"
					value="<%=String.valueOf(vnmArticleAction.getStatus())%>" />
				<%
					listOfActionIds = listOfActionIds + vnmArticleAction.getVnmArticleReportEntryId() + ",";
				%>
			</liferay-ui:search-container-row>
			<liferay-ui:search-iterator searchContainer="<%=searchContainer%>" />
		</liferay-ui:search-container>   
		<liferay-portlet:actionURL name="ExportToExcel" var="exportToExcel">
			<portlet:param name="listOfActionIds" value="<%=listOfActionIds%>" />
			<portlet:param name="mvcPath" value="/html/vnmreport/articleReport.jsp" />
		</liferay-portlet:actionURL>
		<hr>
		<aui:button name="btnExport" value="ExportToExcel" onClick="<%=exportToExcel.toString()%>"></aui:button>
	</aui:form>
</c:if>