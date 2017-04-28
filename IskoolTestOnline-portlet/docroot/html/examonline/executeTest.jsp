<%@include file="/html/init.jsp"%>
<%
	themeDisplay = (ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY); 
	String actionViewQuestion = "VIEW";
	String actionMakeQuestion = "QUESTION_MAKE";
	String actionReviewQuestion = "QUESTION_MAKE";
	String[] arrAnser = {"A","B","C","D"};
	String examType = ParamUtil.getString(request,"examType");
%>
<c:if test="<%= themeDisplay.isSignedIn() %>">
	<%
		long onlinetestEntryId = ParamUtil.getLong(request, "onlinetestEntryId");
		long userId = Long.valueOf(request.getRemoteUser());
		
		List<OnlinetestResultEntry> resultList = OnlinetestResultEntryLocalServiceUtil.getUserExamed(userId, onlinetestEntryId, "", 0, null, null, TESTONLINE, true);
		boolean hadExamFinish = (resultList.size() > 0);
	%>
	<c:if test="<%=!hadExamFinish %>">
	<%	
		List<QuestionEntry> listOfQuestions = new ArrayList<QuestionEntry>();
		String listOfQuestionsIds = "";
		int numOfQuestion = 0;
		OnlinetestEntry onlinetestEntry = OnlinetestEntryLocalServiceUtil.getOnlinetestEntry(onlinetestEntryId);
		int duration = onlinetestEntry.getDuration();
		if (Validator.isNotNull(onlinetestEntry))
		{ 
		    // Build list of question
		    String[] questionsIdList = onlinetestEntry.getQuestionId().split(",");
		    // Revert list by radom 
		    Random randomGenerator = new Random(); 
		    List<String> randommedList =  new ArrayList<String>();
			List<String> originalList = new ArrayList<String>();
			for (int j = 0; j < questionsIdList.length; j++)
			{
				originalList.add(questionsIdList[j]);
			}
		    numOfQuestion = questionsIdList.length;
			while (originalList.size() > 0)
			{
	            int randomIndex = randomGenerator.nextInt(originalList.size());
	            randommedList.add(originalList.get(randomIndex));
	            originalList.remove(randomIndex);
		    }
		    	
		    for(int i=0; i < randommedList.size(); i ++)
		    {
		        listOfQuestions.add(QuestionEntryLocalServiceUtil.getQuestionEntry(Long.valueOf(randommedList.get(i))));
		        if (i == 0)
		        {
		        	listOfQuestionsIds = listOfQuestionsIds + randommedList.get(i);	
		        } else
		        {
			        listOfQuestionsIds = listOfQuestionsIds + "," + randommedList.get(i);		        	
		        }
		    }
		}
	%>
	<aui:form method="post" name="fmTestonline">
		<aui:input type="hidden" name ="numbOfQuestion" value="<%=numOfQuestion %>"/>
		<aui:input type="hidden" name ="onlinetestEntryId" value="<%=onlinetestEntryId %>"/>
		<aui:input type="hidden" name ="questionListSelected" value ="<%=listOfQuestionsIds%>" />
		<aui:input type="hidden" name="timeRemaining" value="0"/>
		<aui:input type="hidden" name="examType" value ="<%=examType %>"/>
		<table border="1" width="100%">
			<%
				for(int i =0; i < listOfQuestions.size(); i ++) 
				{
				    String question= String.valueOf(i+1) + ".";
			%>
				<tr>
					<td>
			 	<h4><liferay-ui:message key="<%=question + listOfQuestions.get(i).getTitle() %>"></liferay-ui:message></h4>
				<liferay-ui:message key="<%=listOfQuestions.get(i).getQuestionContent()%>"></liferay-ui:message>
					</td>
					<td>
						<%
							String answer = String.valueOf(listOfQuestions.get(i).getQuestionEntryId());
							for (int j=0; j < arrAnser.length; j ++)
							{
							    //String answer = listOfQuestions.get(i).getQuestionEntryId() + arrAnser[j];
						%>
							  <aui:input inlineField="true" id="<%=answer%>" name="<%=answer%>" type="radio" value="<%=arrAnser[j]%>" label="<%=arrAnser[j]%>" checked="false" onChange='<%="changeSelectedQuestion(" + i + "," + j + ");" %>'/>    
						<%  }
						%>
					</td>
				</tr>
			<%}
			%> 
		</table>
		<div id="questionAnswered" style="margin-top:40px"></div>
		<liferay-portlet:renderURL varImpl="createTestOnlineURL">
			<portlet:param name="mvcPath" value="/html/questionstore/createTestOnline.jsp" />
		</liferay-portlet:renderURL>
		<aui:button type="button" name="btnFinish" value="Finish" onClick='<%= renderResponse.getNamespace() +  "finishTestonline();"%>'/>
	</aui:form>
	<div id="countdownTimer" style="padding: 10px;position: fixed; z-index: 3000000; bottom: 10px;left: 1px;width: auto;background-color: rgb(94, 172, 26);color: white;
	"> </div>
	<aui:script>
		var dataTable = [];
		var tblQuestionAnswered;
		AUI().use('aui-datatable', 'aui-datatype','datatable-sort', function(Y) {
			var columnsDisplay = [{
					label:' ',
					key:'q1',
					allowHTML:true,
					formatter: function(o)
					{
						var question = o.value;
						var selected  = o.data[question+'selected'];
						if(selected == 'true')
						{
							return '<div style="background-color: #6666ff">'+ question.toUpperCase() + '</div';
						}
					}
				},
				{
					label:' ',
					key:'q2',
					allowHTML:true,
					formatter: function(o)
					{
						var question = o.value;
						var selected  = o.data[question+'selected'];
						if(selected == 'true')
						{
							return '<div style="background-color: #6666ff">'+ question.toUpperCase() + '</div';
						}
					}					
				},
				{
					label:' ',
					key:'q3',
					allowHTML:true,
					formatter: function(o)
					{
						var question = o.value;
						var selected  = o.data[question+'selected'];
						if(selected == 'true')
						{
							return '<div style="background-color: #6666ff">'+ question.toUpperCase() + '</div';
						}
					}					
				},
				{
					label:' ',
					key:'q4',
					allowHTML:true,
					formatter: function(o)
					{
						var question = o.value;
						var selected  = o.data[question+'selected'];
						if(selected == 'true')
						{
							return '<div style="background-color: #6666ff">'+ question.toUpperCase() + '</div';
						}
					}					
				},
				{
					label:' ',
					key:'q5',
					allowHTML:true,
					formatter: function(o)
					{
						var question = o.value;
						var selected  = o.data[question+'selected'];
						if(selected == 'true')
						{
							return '<div style="background-color: #6666ff">'+ question.toUpperCase() + '</div';
						}
					}					
				},
				{
					label:' ',
					key:'q6',
					allowHTML:true,
					formatter: function(o)
					{
						var question = o.value;
						var selected  = o.data[question+'selected'];
						if(selected == 'true')
						{
							return '<div style="background-color: #6666ff">'+ question.toUpperCase() + '</div';
						}
					}					
				},
				{
					label:' ',
					key:'q7',
					allowHTML:true,
					formatter: function(o)
					{
						var question = o.value;
						var selected  = o.data[question+'selected'];
						if(selected == 'true')
						{
							return '<div style="background-color: #6666ff">'+ question.toUpperCase() + '</div';
						}
					}					
				},
				{
					label:' ',
					key:'q8',
					allowHTML:true,
					formatter: function(o)
					{
						var question = o.value;
						var selected  = o.data[question+'selected'];
						if(selected == 'true')
						{
							return '<div style="background-color: #6666ff">'+ question.toUpperCase() + '</div';
						}
					}					
				},
				{
					label:' ',
					key:'q9',
					allowHTML:true,
					formatter: function(o)
					{
						var question = o.value;
						var selected  = o.data[question+'selected'];
						if(selected == 'true')
						{
							return '<div style="background-color: #6666ff">'+ question.toUpperCase() + '</div';
						}
					}					
				},
				{
					label:' ',
					key:'q10',
					allowHTML:true,
					formatter: function(o)
					{
						var question = o.value;
						var selected  = o.data[question+'selected'];
						if(selected == 'true')
						{
							return '<div style="background-color: #6666ff">'+ question.toUpperCase() + '</div';
						}
					}					
				}
			];
			var numOfQuestion = '<%= numOfQuestion%>';
			var json = {q1:'',q2:'',q3:'',q4:'',q5:'',q6:'',q7:'',q8:'',q9:'',q10:''};
			var i =1;
			var remain = numOfQuestion;
			while( i <= numOfQuestion)
			{
				if (i % 10 == 0)
				{
					json['q10'] = "q" +i;
					json['q' + i + 'selected'] = "false";
	
					dataTable.push(json); 
					remain = remain -10;
					json = {q1:'',q2:'',q3:'',q4:'',q5:'',q6:'',q7:'',q8:'',q9:'',q10:''};
				}
				else
				{
					json['q' + i % 10] = "q" +i;
					json['q' + i + 'selected'] = "false";
				}
				i++;
			}
			if (remain > 0)
			{
				dataTable.push(json);
			}
		    tblQuestionAnswered = new Y.DataTable(
		    	{
		    	        columns: columnsDisplay,
		    	        data: dataTable,
		    	        caption: 'Summary',
		    	        plugins: [
		    	          {
		    	            cfg: {
		    	              highlightRange: false
		    	            },
		    	            fn: Y.Plugin.DataTableHighlight
		    	          }
		    	        ]
		    	      }
		    ).render('#questionAnswered');			
		});
		var numOfSelectedQuestion = 0;
		function changeSelectedQuestion(questionId,valueId)
		{
			var questionIdList = '<%=listOfQuestionsIds%>';
			var arrQuestionId = questionIdList.split(",");
			//var selectedbox1 = document.getElementById("<portlet:namespace/>" + arrQuestionId[questionId]);
			//var selectedbox2 = document.getElementById("<portlet:namespace/>" + arrQuestionId[questionId] + "BCheckbox");
			//var selectedbox3 = document.getElementById("<portlet:namespace/>" + arrQuestionId[questionId] + "CCheckbox");
			//var selectedbox4 = document.getElementById("<portlet:namespace/>" + arrQuestionId[questionId] + "DCheckbox");

			//var countSelected = 0;
			//if (selectedbox1.checked)
			//{
			//	countSelected = countSelected + 1 ;
			//}
			//if (selectedbox2.checked)
			//{
			//	countSelected = countSelected + 1 ;
			//}
			//if (selectedbox3.checked)
			//{
			//	countSelected = countSelected + 1 ;
			//}
			//if (selectedbox4.checked)
			//{
			//	countSelected = countSelected + 1 ;
			//}
			var row = Math.floor(questionId / 10);
			var json = dataTable[row];
			questionId = questionId + 1;
			//if (json['q' + questionId +'selected'] == 'true')
			//{
			//	if (countSelected < 1) 
			//	{
			//		json['q' + questionId +'selected'] = 'false';
			//		numOfSelectedQuestion = numOfSelectedQuestion -1;
			//	}
			//}
			//else 
			if (json['q' + questionId +'selected'] == 'false')
			{
					json['q' + questionId +'selected'] = 'true';
					numOfSelectedQuestion = numOfSelectedQuestion + 1;
			}
			dataTable[row] = json;
			tblQuestionAnswered.set('data',eval(dataTable));
		}
		
		window.onload = function()
		{
			var durationTime = '<%=duration%>';
			var timerDisplay = document.querySelector('#countdownTimer'),
	        	timer = new CountDownTimer(durationTime * 60),
	     		timeObj = CountDownTimer.parse(durationTime * 60);
	        format(timeObj.minutes, timeObj.seconds);
	        timer.onTick(format);
	        function format(minutes, seconds)
	        {
	            minutes = minutes < 10 ? "0" + minutes : minutes;
	            seconds = seconds < 10 ? "0" + seconds : seconds;
	            timerDisplay.textContent = minutes + ':' + seconds;
	            if (minutes == 0 && seconds == 0)
	            {
	            	submitForm(document.<portlet:namespace />fmTestonline,'<portlet:actionURL name="finishTestonline"></portlet:actionURL>');
	            }
	        }
	        timer.start();
		}
			
		Liferay.provide(
				window,
				'<portlet:namespace />finishTestonline',
				function() 
				{
					var totalQuestion = '<%=numOfQuestion%>';
					var cont = true;
					document.<portlet:namespace />fmTestonline.<portlet:namespace />timeRemaining.value = document.querySelector('#countdownTimer').textContent;
					if (numOfSelectedQuestion < totalQuestion)
					{
						var message = "<liferay-ui:message key='exam-not-finish-yet'/>";
						cont = confirm(message);
					}
					else
					{
						var message = "<liferay-ui:message key='exam-will-finish'/>";
						cont = confirm(message);						
					}
					if(cont)
					{
						submitForm(document.<portlet:namespace />fmTestonline,'<portlet:actionURL name="finishTestonline"></portlet:actionURL>');
					}
				});
	</aui:script>
	</c:if>
	<c:if test="<%=hadExamFinish %>">
		<liferay-ui:message key="user_examed"></liferay-ui:message>
	</c:if>
</c:if>
<c:if test ="<%=!themeDisplay.isSignedIn()%>">
	<liferay-ui:message key="user_not_login"></liferay-ui:message>
</c:if>
