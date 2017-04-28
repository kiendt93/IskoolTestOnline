<%@include file="/html/init.jsp"%>
<%
	themeDisplay = (ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY); 
	String actionViewQuestion = "VIEW";
	String actionMakeQuestion = "QUESTION_MAKE";
	String actionReviewQuestion = "QUESTION_MAKE";
	String[] arrAnser = {"A","B","C","D"};%>
<c:if test="<%= themeDisplay.isSignedIn() %>">
	<%
		List<QuestionEntry> listOfQuestions = new ArrayList<QuestionEntry>();
		String questionIds = ParamUtil.getString(request, "questionIds");
		System.out.println("questionIds:" + questionIds);
		String[] questionIdsList = ParamUtil.getString(request, "questionIds").split(",");
		String time = ParamUtil.getString(request,"timeLitmit");
		String examType = ParamUtil.getString(request,"examType");		
		int numOfQuestion = 0;
		int duration = 0;
		if (Validator.isNotNull(time))
		{
			duration = Integer.valueOf(time);
		}
		if (questionIdsList.length > 0)
		{ 
			numOfQuestion = questionIdsList.length;
		    for(int i=0; i < questionIdsList.length ; i ++)
		    {
		        listOfQuestions.add(QuestionEntryLocalServiceUtil.getQuestionEntry(Long.valueOf(questionIdsList[i])));
		    }
		}
	%>
	<aui:form method="post" name="fmTestonline">
		<aui:input type="hidden" name ="numbOfQuestion" value="<%=numOfQuestion %>"/>
		<aui:input type="hidden" name ="questionListSelected" value ="<%=questionIds%>" />
		<aui:input type="hidden" name="timeRemaining" value="0"/>
		<aui:input type="hidden" name="examType" value ="<%=examType %>"/>
		<aui:input type="hidden" name="timeLimit" value="<%=duration %>"/>
		<table border="1" width="100%">
			<%
				for(int i =0; i < listOfQuestions.size(); i ++) 
				{
				    String question= String.valueOf(i+1) + ".";
			%>
				<tr>
					<td>
				<h4><liferay-ui:message key="<%=question%>"></liferay-ui:message></h4>
				<liferay-ui:message key="<%=listOfQuestions.get(i).getQuestionContent()%>"></liferay-ui:message>
					</td>
					<td>
						<%
							for (int j=0; j < arrAnser.length; j ++)
							{
							    String answer = listOfQuestions.get(i).getQuestionEntryId() + arrAnser[j];
						%>
							  <aui:input inlineField="true" name="<%=answer%>" type="checkbox" value="" label="<%=arrAnser[j]%>" checked="false" onChange='<%="changeSelectedQuestion(" + i + "," + j + ");" %>'/>    
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
		<aui:button type="button" name="btnFinish" value="Finish" onClick='<%= renderResponse.getNamespace() +  "finishPractice();"%>'/>
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
		function changeSelectedQuestion(questionId,valueId)
		{
			var questionIdList = '<%=questionIds%>';
			var arrQuestionId = questionIdList.split(",");
			var selectedbox1 = document.getElementById("<portlet:namespace/>" + arrQuestionId[questionId] + "ACheckbox");
			var selectedbox2 = document.getElementById("<portlet:namespace/>" + arrQuestionId[questionId] + "BCheckbox");
			var selectedbox3 = document.getElementById("<portlet:namespace/>" + arrQuestionId[questionId] + "CCheckbox");
			var selectedbox4 = document.getElementById("<portlet:namespace/>" + arrQuestionId[questionId] + "DCheckbox");

			var countSelected = 0;
			if (selectedbox1.checked)
			{
				countSelected = countSelected + 1 ;
			}
			if (selectedbox2.checked)
			{
				countSelected = countSelected + 1 ;
			}
			if (selectedbox3.checked)
			{
				countSelected = countSelected + 1 ;
			}
			if (selectedbox4.checked)
			{
				countSelected = countSelected + 1 ;
			}
			var row = Math.floor(questionId / 10);
			var json = dataTable[row];
			questionId = questionId + 1;
			if (json['q' + questionId +'selected'] == 'true')
			{
				if (countSelected < 1) 
				{
					json['q' + questionId +'selected'] = 'false';
				}
			}
			else if (json['q' + questionId +'selected'] == 'false')
			{
				if (countSelected >= 1)
				{
					json['q' + questionId +'selected'] = 'true';
				}
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
				'<portlet:namespace />finishPractice',
				function() 
				{
					document.<portlet:namespace />fmTestonline.<portlet:namespace />timeRemaining.value = document.querySelector('#countdownTimer').textContent;
					submitForm(document.<portlet:namespace />fmTestonline,'<portlet:actionURL name="finishPractice"></portlet:actionURL>');
				});
	</aui:script>
</c:if>
<c:if test ="<%=!themeDisplay.isSignedIn()%>">
	<liferay-ui:message key="user_not_login"></liferay-ui:message>
</c:if>