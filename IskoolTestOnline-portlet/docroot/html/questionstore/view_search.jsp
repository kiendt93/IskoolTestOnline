<%@include file="/html/init.jsp"%>

<%
    String keywords = ParamUtil.getString(request, "keywords");
%>

<liferay-portlet:renderURL varImpl="searchURL">
        <portlet:param name="mvcPath" value="/html/questionstore/view_search.jsp" />
</liferay-portlet:renderURL>

<liferay-portlet:renderURL varImpl="viewURL">
        <portlet:param name="mvcPath" value="/html/questionstore/view.jsp" />
</liferay-portlet:renderURL>

<aui:form action="<%= searchURL %>" method="get" name="fm">
    <liferay-portlet:renderURLParams varImpl="searchURL" />

    <liferay-ui:header
        backURL="<%= viewURL.toString() %>"
        title="search"
    />

    <div class="search-form">
        <span class="aui-search-bar">
            <aui:input inlineField="<%= true %>" label="" name="keywords" size="30" title="search-entries" type="text" />

            <aui:button type="submit" value="search" />
        </span>
    </div>
</aui:form>

<%
        SearchContext searchContext = SearchContextFactory
        .getInstance(request);

        searchContext.setKeywords(keywords);
        searchContext.setAttribute("paginationType", "more");
        searchContext.setStart(0);
        searchContext.setEnd(10);

        Indexer indexer = IndexerRegistryUtil.getIndexer(QuestionEntry.class);

        Hits hits = indexer.search(searchContext);

        List<QuestionEntry> entries = new ArrayList<QuestionEntry>();

        for (int i = 0; i < hits.getDocs().length; i++) {
                Document doc = hits.doc(i);

                long questionEntryId = GetterUtil.getLong(doc.get(Field.ENTRY_CLASS_PK));

                QuestionEntry questionEntry = null;

                try {
                	questionEntry = QuestionEntryLocalServiceUtil.getQuestionEntry(questionEntryId);
                } catch (PortalException pe) {
                        _log.error(pe.getLocalizedMessage());
                } catch (SystemException se) {
                        _log.error(se.getLocalizedMessage());
                }

                entries.add(questionEntry);
        }

        
%>

<liferay-ui:search-container delta="10" emptyResultsMessage="no-entries-were-found">
        <liferay-ui:search-container-results
                results="<%= entries %>"
                total="<%= entries.size() %>"
        />
        <% DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
				%>
        
        <liferay-ui:search-container-row
				className="com.vietnamobile.model.QuestionEntry"
				keyProperty="questionEntryId" modelVar="questionEntry">			
				<liferay-ui:search-container-column-text name="QuestionId" value="<%=String.valueOf(questionEntry.getQuestionEntryId()) %>"/>
				<liferay-ui:search-container-column-text orderable="true" name="Title" value="<%=questionEntry.getTitle()%>"/>
				<liferay-ui:search-container-column-text name="Content" value="<%=questionEntry.getQuestionContent()%>"/>							
				<liferay-ui:search-container-column-text orderable="true" name="CreateDate" value="<%=df.format(questionEntry.getCreateDate())%>" />			
				<liferay-ui:search-container-column-text orderable="true" name="ModifiedDate" value="<%=df.format(questionEntry.getModifiedDate())%>" />
				<liferay-ui:search-container-column-text orderable="true" name="Subject" value="<%=questionEntry.getSubject()%>" />
				<liferay-ui:search-container-column-jsp path="/html/questionstore/actionQuestion.jsp" align="center"/>
			</liferay-ui:search-container-row>

        <liferay-ui:search-iterator />
</liferay-ui:search-container>

<%
        if (Validator.isNotNull(keywords)) {
                String currentURL = PortalUtil.getCurrentURL(request);
                PortalUtil.addPortletBreadcrumbEntry(request, LanguageUtil.get(
                                pageContext, "search") + ": " + keywords, currentURL);
        }
%>

<%!
        private static Log _log = LogFactoryUtil.getLog("docroot.html.guestbook.view_search_jsp");
%>