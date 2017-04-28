<%@page import="com.vietnamobile.tools.VnmComperatorOnlinetestResultByColumns"%>
<%@page import="com.vietnamobile.service.VnmOnlintestReportEntryLocalServiceUtil"%>
<%@page import="com.vietnamobile.tools.VnmComperatorByWrongCount"%>
<%@page import="java.util.Collections"%>
<%@page import="com.vietnamobile.service.VnmOnlintestReportEntryServiceUtil"%>
<%@page import="com.vietnamobile.model.VnmOnlintestReportEntry"%>
<%@page import="java.text.DecimalFormat"%>
<%@include file="/html/init.jsp"%>
<c:if test="<%=themeDisplay.isSignedIn() %>">
		<%
			long onlinetestEntryId = ParamUtil.getLong(request, "onlinetestEntryId");
			List<OnlinetestResultEntry> listOfOnlinetestResult = new ArrayList<OnlinetestResultEntry>();
			int numberOfQuestion = OnlinetestEntryLocalServiceUtil.getOnlinetestEntry(onlinetestEntryId).getNumberOfQuestions();
			int examTime  = OnlinetestEntryLocalServiceUtil.getOnlinetestEntry(onlinetestEntryId).getDuration() * 60;
			String userName = ParamUtil.getString(request,"userName");
			String vnmCompany = ParamUtil.getString(request,"vnmcompany");
			DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
			String listOfResultIds= "";
			//Detail wrong/correct for each question.
			List<VnmOnlintestReportEntry> tempList = VnmOnlintestReportEntryLocalServiceUtil.getReportFillterBy(onlinetestEntryId, 0, true);
			List<VnmOnlintestReportEntry> reportList = new ArrayList<VnmOnlintestReportEntry>();	
			for(VnmOnlintestReportEntry item :  tempList)
			{
				reportList.add(item);
			}
			Collections.sort(reportList, new VnmComperatorByWrongCount());
			JSONArray reportJsonArr = JSONFactoryUtil.createJSONArray(); 
			for(VnmOnlintestReportEntry item: reportList)
			{
				QuestionEntry questionEntry = QuestionEntryLocalServiceUtil.getQuestionEntry(item.getQuestionEntryId());
				JSONObject json =  JSONFactoryUtil.createJSONObject();
				json.put("category", questionEntry.getTitle());
				json.put("wrong",item.getWrongTime());
				json.put("correct",item.getCorrectTime());
				reportJsonArr.put(json);
			}
			String reportData = reportJsonArr.toString();
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
	<liferay-portlet:renderURL varImpl="reportDetailSearchURL">
		<portlet:param name="mvcPath"
			value="/html/vnmreport/detailTestonlineReport.jsp" />
	</liferay-portlet:renderURL>
	<liferay-ui:message key="Summary"></liferay-ui:message>
	<div id="reportCharts"></div>
	<aui:form action="<%=reportDetailSearchURL%>" name="fmFuckingSearch">
		<liferay-portlet:renderURLParams varImpl="reportDetailSearchURL" />
		<liferay-portlet:renderURL varImpl="iteratorURL">
			<portlet:param name="onlinetestEntryId" value="<%=String.valueOf(onlinetestEntryId)%>" />
			<portlet:param name="vnmCompany" value ="<%=vnmCompany %>"/>
			<portlet:param name="mvcPath" value="/html/vnmreport/detailTestonlineReport.jsp" />
		</liferay-portlet:renderURL>
		<liferay-ui:search-container delta="10" orderByType="<%=orderByType %>"
			displayTerms="<%= new DisplayTerms(renderRequest)%>"
			iteratorURL="<%=iteratorURL%>" emptyResultsMessage="empty-actions">
			<liferay-ui:search-form page="/html/vnmreport/searchDetailTestonlineReport.jsp"
				servletContext="<%=application%>" />
			<liferay-ui:search-container-results>
				<%
					DisplayTerms displayTerms = searchContainer.getDisplayTerms();
									if (displayTerms.isAdvancedSearch()) {
										
										listOfOnlinetestResult = OnlinetestResultEntryLocalServiceUtil.getUserExamed(0, onlinetestEntryId, vnmCompany, -1, null, null, TESTONLINE, true);
										List<OnlinetestResultEntry> sortableList = new ArrayList<OnlinetestResultEntry>(listOfOnlinetestResult);
										if(Validator.isNotNull(orderByCol))
										{
											if (sortingOrder.equalsIgnoreCase("desc"))
											{
												Collections.sort(sortableList, new VnmComperatorOnlinetestResultByColumns(orderByCol));
											}
											else
											{
												Collections.reverse(sortableList);
											}
										}
										List<OnlinetestResultEntry> subLists = ListUtil.subList(sortableList,
												searchContainer.getStart(), searchContainer.getEnd());
										int sizeOf = listOfOnlinetestResult.size();
										pageContext.setAttribute("results", subLists);
										pageContext.setAttribute("total", sizeOf);
									} else {
										String searchkeywords = displayTerms.getKeywords();
										listOfOnlinetestResult = OnlinetestResultEntryLocalServiceUtil.getUserExamed(0, onlinetestEntryId, searchkeywords, -1, null, null, TESTONLINE, true);
										List<OnlinetestResultEntry> sortableList = new ArrayList<OnlinetestResultEntry>(listOfOnlinetestResult);
										if(Validator.isNotNull(orderByCol))
										{
											if (sortingOrder.equalsIgnoreCase("desc"))
											{
												Collections.sort(sortableList, new VnmComperatorOnlinetestResultByColumns(orderByCol));
											}
											else
											{
												Collections.reverse(sortableList);
											}
										}
										List<OnlinetestResultEntry> subLists = ListUtil.subList(sortableList,
												searchContainer.getStart(), searchContainer.getEnd());
										int sizeOf = listOfOnlinetestResult.size();

										pageContext.setAttribute("results", subLists);
										pageContext.setAttribute("total", sizeOf);

									}
				%>
			</liferay-ui:search-container-results>
			<%
				DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
				DecimalFormat numberFormat = new DecimalFormat("###.##"); 
			%>
			<liferay-ui:search-container-row
				className="com.vietnamobile.model.OnlinetestResultEntry"
				keyProperty="onlinetestResultEntryId" modelVar="onlinetestResult">
				<liferay-ui:search-container-column-text name="ID"
					value="<%=String.valueOf(listOfOnlinetestResult.indexOf(onlinetestResult) + 1)%>" />
				<liferay-ui:search-container-column-text name="UserName"
					value="<%=onlinetestResult.getUserName() %>" />
				<liferay-ui:search-container-column-text name="CorrectRate"
					value="<%=numberFormat.format(100 *(double)(numberOfQuestion - onlinetestResult.getNumberOfWrongAnswer()) / (double)numberOfQuestion) + StringPool.PERCENT%>" />
				<liferay-ui:search-container-column-text name="WrongRate"
					value="<%=numberFormat.format(100 *(double)onlinetestResult.getNumberOfWrongAnswer()/(double)numberOfQuestion) + StringPool.PERCENT%>" />
				<liferay-ui:search-container-column-text name="ExecutedTime"
					value="<%=String.valueOf(examTime - onlinetestResult.getTimeRemaining()) %>" />
				<%
				listOfResultIds = listOfResultIds + onlinetestResult.getOnlinetestResultEntryId()+ ",";
				%>
			</liferay-ui:search-container-row>
			<liferay-ui:search-iterator searchContainer="<%=searchContainer%>" />
		</liferay-ui:search-container>   
		<liferay-portlet:actionURL name="ExportExamResultToExcel" var="exportExamResultToExcel">
			<portlet:param name="onlinetestEntryId" value="<%=String.valueOf(onlinetestEntryId) %>"/>
			<portlet:param name="listOfResultIds" value="<%=listOfResultIds%>" />
			<portlet:param name="mvcPath" value="/html/vnmreport/detailTestonlineReport.jsp" />
		</liferay-portlet:actionURL>
		<hr>
		<liferay-portlet:renderURL varImpl="reportSearchURL">
			<portlet:param name="curTab" value="ExamOnline"/>
			<portlet:param name="mvcPath"
				value="/html/vnmreport/view.jsp" />
		</liferay-portlet:renderURL>		
		<aui:button name="btnExport" value="ExportToExcel" onClick="<%=exportExamResultToExcel.toString()%>"></aui:button>
		<aui:button name="btnBack" value="Back" onClick="<%=reportSearchURL.toString()%>"></aui:button>
	</aui:form>
	<aui:script>
		AUI().use('charts',function(A)
				{
					var reportData =JSON.parse('<%=reportData%>');
					var styleDef = {
							 axes:{
						            values:{
						                label:{
						                    color:"#000000"
						                }
						            },
						            category:{
						                label:{
						                    color: "#000000"
						                }
						            }
						        },
						       series:{
						    	   wrong:{
						    		   fill:{
						    			   color:"#AA0000"
						    		   }
						    	   },
						    	   correct:{
						    		   fill:{
						    			   color:"#0B610B"
						    		   }
						    	   }
						       }
					};
					var resultChart = new A.Chart(
							{
							    dataProvider: reportData,
							    title:"Report",
							    render: "#reportCharts",
							    styles:styleDef,
							    type:"bar",
							    stacked:true
							});
					
				});
	</aui:script>
</c:if>