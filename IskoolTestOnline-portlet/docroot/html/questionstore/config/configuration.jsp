<%@include file="/html/init.jsp"%>
<%
	String parentCategoryID = GetterUtil.getString(portletPreferences.getValue("parentCategoryID", StringPool.BLANK));
	List<AssetCategory> assetCategoryList = new ArrayList<AssetCategory>();
	assetCategoryList = AssetCategoryLocalServiceUtil.getCategories();
%>
<liferay-portlet:actionURL portletConfiguration="true" var="configurationURL" />
<aui:form action="<%= configurationURL %>" method="post" name="fm">

	<aui:select autofocus="true" name="preferences--parentCategoryID--" label="ClassFor">
		
		<aui:option value="empty" label="PleaseSelectOneCategory" selected="true"> </aui:option>	
		<% for (int i = 0; i < assetCategoryList.size(); i++)
		   {
		%>		
		<aui:option value="<%=assetCategoryList.get(i).getCategoryId()%>" label="<%= assetCategoryList.get(i).getName() %>"
			selected="<%=parentCategoryID.equals(String.valueOf(assetCategoryList.get(i).getCategoryId())) %>"
		/>
		<%
		   }
		%>
	</aui:select>
	<!-- Preference control goes here -->

    <aui:button-row>
        <aui:button type="submit" Value="Save"/>
    </aui:button-row>
</aui:form>