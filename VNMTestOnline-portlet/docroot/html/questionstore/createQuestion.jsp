<%@include file="/html/init.jsp"%>
<%
	themeDisplay = (ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);
	String actionViewQuestion = "VIEW";
	String actionMakeQuestion = "QUESTION_MAKE";
	String actionReviewQuestion = "QUESTION_MAKE";
	String subject = renderRequest.getParameter("Subject");
	String questionContent = renderRequest.getParameter("questionContent");
	String a = renderRequest.getParameter("a");
	String b = renderRequest.getParameter("b");
	String c = renderRequest.getParameter("c");
	String d = renderRequest.getParameter("d");
	double level = 0;
	if (Validator.isNotNull(renderRequest.getParameter("level")))
	{
		level = Double.valueOf(renderRequest.getParameter("level"));
	}
	String answer = renderRequest.getParameter("answer");
	String score = renderRequest.getParameter("score");
%>
<c:if test="<%= themeDisplay.isSignedIn() %>">
	<%
	    	long userId = Long.valueOf(request.getRemoteUser());
			List<SubjectEntry> listOfSubject = SubjectEntryLocalServiceUtil.getAllSubjects();
			int sizeOfListSubject = listOfSubject.size();
			
			JSONArray subjectJsonArr = JSONFactoryUtil.createJSONArray();
			for(SubjectEntry item: listOfSubject)
			{
				JSONObject json =  JSONFactoryUtil.createJSONObject();
				json.put("course", item.getCourse());
				json.put("title", item.getSubject());
				json.put("totalQuestion",item.getTotalQuestion());
				json.put("description",item.getDescription());
				json.put("subjectEntryId",item.getSubjectEntryId());
				subjectJsonArr.put(json);
			}
			String subjectJsonList = subjectJsonArr.toString();
	%>
	<liferay-portlet:renderURL varImpl="questionContentURL">
		<portlet:param name="mvcPath" value="/html/questionstore/view.jsp" />
	</liferay-portlet:renderURL>
	<liferay-portlet:renderURL varImpl="createQuestion">
		<portlet:param name="mvcPath" value="/html/questionstore/createQuestion.jsp" />
	</liferay-portlet:renderURL>
	
	<portlet:actionURL var="uploaddURL" name="uploadFileQuestion"></portlet:actionURL> 
	<portlet:actionURL var="addQuestionURL" name="addQuestion"></portlet:actionURL>
	
	<div id ="mainPageQuestion">
		<h4>
			<liferay-ui:message key="function-create-question"></liferay-ui:message>
		</h4>
		<hr>
		<div id ="question_main_from" class="question_main_from">
			<aui:form method="post" name="fmLoadFile" action ="<%=uploaddURL %>" enctype="multipart/form-data">
				<aui:field-wrapper label="UploadFile">
					<input type="file" name="uploadedFile" multiple="multiple">
					<input type="Submit" name="Upload" value="Upload">
				</aui:field-wrapper>		
			</aui:form>
			
			<form method="post" name="<portlet:namespace/>fmContent" action="<%= addQuestionURL%>">
				<aui:input type="hidden" name="userId" value="<%=userId%>"/>
				<liferay-portlet:renderURLParams varImpl="createQuestion" />	
				<aui:input name="title" value="" required="true" label="Title"></aui:input>	
				<aui:row>
					<div id="course" style="display: inline-block;">
						<aui:select autofocus="true" id="course" inlineField="true" name="course" label= "Course" onChange='fillDetailDate();'>
							<aui:option value="empty" label="PleaseSelectOneSubject" selected="true"></aui:option>
							<aui:option value="<%=MATH %>" label="<%=MATH %>"></aui:option>
							<aui:option value="<%=LITERATURE %>" label="<%=LITERATURE %>"></aui:option>
							<aui:option value="<%=BIOLOGICAL %>" label="<%=BIOLOGICAL %>"></aui:option>
							<aui:option value="<%=PHYSICAL %>" label="<%=PHYSICAL %>"></aui:option>
							<aui:option value="<%=CHEMISTRY %>" label="<%=CHEMISTRY %>"></aui:option>
							<aui:option value="<%=HISTORY %>" label="<%=HISTORY %>"></aui:option>
							<aui:option value="<%=GEOGRAPHY %>" label="<%=GEOGRAPHY %>"></aui:option>
							<aui:option value="<%=FOREIGN_LANGUAGE %>" label="<%=FOREIGN_LANGUAGE %>"></aui:option>
						</aui:select>
					</div>
					<div id="subject" style="display: inline-block;">
						<aui:select autofocus= "true" inlineField="true" name="subject" label= "Subject">
							<aui:option value="empty" label="PleaseSelectOneSubject" selected="true"/>
							<%-- <% for (int i =0;i < sizeOfListSubject; i ++ ) 
								{
							%>				
							<aui:option value="<%=listOfSubject.get(i).getSubject() %>" label="<%=listOfSubject.get(i).getSubject() %>" selected="<%=listOfSubject.get(i).getSubject().equals(subject) %>"/>
							<%
								}
							%> --%>
						</aui:select>
					</div>
					
					
				</aui:row>
				<aui:field-wrapper label="content">
				<liferay-ui:input-editor name="editorContent" toolbarSet="liferay-article" editorImpl=" <%= EDITOR_WYSIWYG_IMPL_KEY %>"/>
				</aui:field-wrapper>
				<aui:field-wrapper label="SolutionA">
					<liferay-ui:input-editor name="solutionA" toolbarSet="liferay-article" editorImpl=" <%= EDITOR_WYSIWYG_IMPL_KEY %>"/>			
				</aui:field-wrapper>
				<aui:field-wrapper label="SolutionB">
					<liferay-ui:input-editor name="solutionB" toolbarSet="liferay-article" editorImpl=" <%= EDITOR_WYSIWYG_IMPL_KEY %>"/>			
				</aui:field-wrapper>
				<aui:field-wrapper label="SolutionC">
					<liferay-ui:input-editor name="solutionC" toolbarSet="liferay-article" editorImpl=" <%= EDITOR_WYSIWYG_IMPL_KEY %>"/>			
				</aui:field-wrapper>
				<aui:field-wrapper label="SolutionD">
					<liferay-ui:input-editor name="solutionD" toolbarSet="liferay-article" editorImpl=" <%= EDITOR_WYSIWYG_IMPL_KEY %>"/>			
				</aui:field-wrapper>
				<aui:row>
					<aui:input inlineField="true" name="answer"
						value="<%=answer%>" label="Solution">
						<aui:validator name="required" errorMessage="field_is_required" />
					</aui:input>				
				</aui:row>
				<aui:row>
					<aui:input inlineField="true" name="score" value="<%= score %>" label="QuestionPoint">
						<%-- <aui:validator name="required" errorMessage="field_is_required" /> --%>
					</aui:input>
				</aui:row>
				
				<liferay-ui:asset-tags-error />
				<liferay-ui:panel defaultState="closed" extended="<%= false %>" id="insultsCategorizationPanel" persistState="<%= true %>" title="tags">
				    <aui:fieldset>
				         <liferay-ui:asset-tags-selector  > </liferay-ui:asset-tags-selector>
				     </aui:fieldset>
				</liferay-ui:panel>
				
				<aui:button type="button" name="btnAddContent" value ="AddContent" onClick='<%= renderResponse.getNamespace() +  "addQuestionContent();"%>'/>
				<%-- <aui:button type="submit" name="btnAddContent" value ="AddContent"/> --%>
				<%-- <aui:button type="button" name="btnShowImage" value ="ShowImage" onClick='<%= renderResponse.getNamespace() +  "showImage();"%>'/> --%>
				<aui:button type="button" name="btnCancel" value ="Cancel" onClick='<%=questionContentURL.toString()%>'/>
				<aui:input name="questionContent" type="hidden" />
			</form>
		</div>
	</div>
	
	<aui:script>
	
	function fillDetailDate()
	{
		var subjectJson =JSON.parse('<%=subjectJsonList%>');
		
		AUI().use('liferay-auto-fields',
				function(A) 
				{
					var course = A.one('#course');
					var subject = A.one('#subject');
					if(course.one('select')){
						var titleKey = course.one('select').get("value");
						getListSubject(subjectJson, titleKey, subject);
					}
				});
	}
	function getListSubject(subjectJson,titleKey, subjectSelect)
	{
		var message = "<liferay-ui:message key='PleaseSelectOneSubject'/>";
		subjectSelect.one('select').setHTML('<option value="empty" selected>'+message+'</option>');
		if (titleKey == "empty")
		{
			return 0;
		}
		
		for( i in subjectJson )
		{
			if (subjectJson[i].course == titleKey)
			{
				subjectSelect.one('select').append('<option value="'+ subjectJson[i].title +'">' + subjectJson[i].title + "</option>");
			}
		}
	}
	</aui:script>
	
</c:if>
<c:if test ="<%=!themeDisplay.isSignedIn()%>"> 
	<liferay-ui:message key="user_not_login"></liferay-ui:message>
</c:if>
<aui:script>
function <portlet:namespace />initEditor() 
{
    return "<%= UnicodeFormatter.toString(questionContent)%>"; 
}
function importImg()
{
    alert('I\'m still loving you');
}

Liferay.provide(
	window,
	'<portlet:namespace />addQuestionContent',
	function() 
	{
	    var content = window['<portlet:namespace />editorContent'].getHTML();
		if (content)
		{
		    document.<portlet:namespace />fmContent.<portlet:namespace />questionContent.value = content;
		    /* submitForm(document.<portlet:namespace />fmContent); */
		    document.<portlet:namespace />fmContent.submit();
		}
});
</aui:script>
<%!
	public static final String EDITOR_WYSIWYG_IMPL_KEY = "editor.wysiwyg.portal-web.docroot.html.portlet.blogs.edit_entry.jsp";
%>