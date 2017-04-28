<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui" %> 
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://liferay.com/tld/security" prefix="liferay-security" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://liferay.com/tld/util" prefix="liferay-util" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>


<%@ page import="com.liferay.portal.model.User" %>
<%@ page import="com.liferay.portal.service.UserLocalServiceUtil"%>
<%@ page import="com.liferay.portal.kernel.util.WebKeys" %>
<%@ page import="com.liferay.portal.theme.ThemeDisplay" %>
<%@ page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ page import="com.liferay.portal.kernel.util.UnicodeFormatter"%>
<%@ page import="com.liferay.portal.model.User" %>
<%@ page import="com.liferay.portal.kernel.util.WebKeys" %>
<%@ page import="com.liferay.portal.kernel.dao.search.DisplayTerms"%>
<%@ page import="com.liferay.portal.kernel.dao.search.SearchEntry" %>
<%@ page import="com.liferay.portal.kernel.dao.search.ResultRow" %>
<%@ page import="com.liferay.portal.kernel.util.Validator" %>
<%@ page import="com.liferay.portal.kernel.util.ListUtil"%>
<%@page import="com.liferay.portal.kernel.util.GetterUtil" %>
<%@page import="com.liferay.portal.kernel.util.StringPool" %>
<%@page import="com.liferay.portal.kernel.json.JSONObject"%>
<%@page import="com.liferay.portal.kernel.json.JSONArray"%>
<%@page import="com.liferay.portal.kernel.json.JSONFactoryUtil"%>
<%@page import="com.vietnamobile.tools.VnmComperatorQuestionByColumns"%>
<%@page import="com.vietnamobile.tools.VnmComperatorArticleByColumns"%>
<%@page import="com.vietnamobile.tools.VnmComperatorByWrongCount"%>
<%@page import="com.vietnamobile.tools.VnmComperatorOnlinetestEntryByColumns"%>
<%@page import="com.vietnamobile.tools.VnmComperatorOnlinetestResultByColumns"%>


<%@page import="java.util.Collections"%>
<%@page import="com.liferay.portal.kernel.dao.search.RowChecker"%>

<%@ page import="com.vietnamobile.service.QuestionEntryLocalServiceUtil"%>
<%@ page import="com.vietnamobile.model.QuestionEntry"%>
<%@ page import="com.vietnamobile.model.SubjectEntry"%>
<%@page import="com.vietnamobile.service.SubjectEntryLocalServiceUtil"%>
<%@page import="com.vietnamobile.model.OnlinetestEntry"%>
<%@page import="com.vietnamobile.service.OnlinetestEntryLocalServiceUtil"%>

<%@page import="com.vietnamobile.service.permission.OnlinetestResultEntryPermission"%>
<%@page import="com.vietnamobile.service.permission.OnlinetestResultEntryModelPermission"%>
<%@page import="com.vietnamobile.service.VnmArticleReportEntryLocalServiceUtil"%>
<%@page import="com.vietnamobile.model.VnmArticleReportEntry"%>

<%@page import="com.vietnamobile.service.OnlinetestResultEntryLocalServiceUtil"%>
<%@page import="com.vietnamobile.model.OnlinetestResultEntry"%>
<%@page import="com.liferay.portal.security.permission.ActionKeys"%>
<%@page import="com.vietnamobile.service.permission.SubjectEntryPermission"%> 
<%@ page import="com.liferay.portal.kernel.dao.search.SearchContainer"%> 
<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>

<%@page import="java.util.ArrayList"%>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat"%>
<%@ page import="java.text.DateFormat"%>
<%@ page import="java.util.Random"%>

<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %>

<%@ page import="com.liferay.portlet.asset.service.AssetEntryLocalServiceUtil" %>
<%@ page import="com.liferay.portlet.asset.service.AssetTagLocalServiceUtil" %>
<%@ page import="com.liferay.portlet.asset.service.AssetCategoryLocalServiceUtil" %>

<%@ page import="com.liferay.portlet.asset.model.AssetEntry" %>
<%@ page import="com.liferay.portlet.asset.model.AssetTag" %>
<%@ page import="com.liferay.portlet.asset.model.AssetCategory" %>

<%@ page import="com.liferay.portal.kernel.util.ListUtil" %>

<%@ page import="com.liferay.portal.kernel.exception.PortalException" %>
<%@ page import="com.liferay.portal.kernel.exception.SystemException" %>
<%@ page import="com.liferay.portal.kernel.log.Log" %>
<%@ page import="com.liferay.portal.kernel.log.LogFactoryUtil" %>
<%@ page import="com.liferay.portal.kernel.search.Indexer" %>
<%@ page import="com.liferay.portal.kernel.search.IndexerRegistryUtil" %>
<%@ page import="com.liferay.portal.kernel.search.SearchContext" %>
<%@ page import="com.liferay.portal.kernel.search.SearchContextFactory" %>
<%@ page import="com.liferay.portal.kernel.search.Hits" %>
<%@ page import="com.liferay.portal.kernel.search.Document" %>
<%@ page import="com.liferay.portal.kernel.search.Field" %>
<%@ page import="com.liferay.portal.kernel.util.StringPool" %>
<%@ page import="com.liferay.portal.kernel.util.GetterUtil" %>
<%@ page import="com.liferay.portal.kernel.util.Validator" %>
<%@ page import="com.liferay.portal.util.PortalUtil" %>
<%@ page import="com.liferay.portal.kernel.search.facet.MultiValueFacet" %>


<%@ page import="javax.portlet.PortletURL" %>

<portlet:defineObjects />
<liferay-theme:defineObjects />
<%
	// Define constant
	double QUESTION_LEVEL_HIGH = 3;
	double QUESTION_LEVEL_NORMAL = 2;
	double QUESTION_LEVEL_EASY = 1;
	
	String PRACTICE = "Practice";
	String TESTONLINE = "Exam";	
	String VIEW_HISTORY = "History";
	// Define action permission
	String actionCreateQuestion="CREATE_QUESTION";
	String actionCreateSubject="CREATE_SUBJECT";
	String actionCreateTestOnline="CREATE_TESTONLINE";
	String actionViewTestResult="VIEW_RESULT";
	String actionExportResult = "EXPORT_RESULT";
	String actionAddQuestion = "AddNew";
	String actionReplaceQuestion = "Replace";
	
	String MATH = "Math";
	String LITERATURE = "Literature";
	String BIOLOGICAL = "Biological";
	String PHYSICAL = "Physical";
	String CHEMISTRY = "Chemistry";
	String HISTORY = "History";
	String GEOGRAPHY = "Geography";
	String FOREIGN_LANGUAGE = "ForeignLanguage";
%>




