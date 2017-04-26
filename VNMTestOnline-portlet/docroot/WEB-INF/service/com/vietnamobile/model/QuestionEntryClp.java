/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.vietnamobile.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import com.vietnamobile.service.ClpSerializer;
import com.vietnamobile.service.QuestionEntryLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author duymb
 */
public class QuestionEntryClp extends BaseModelImpl<QuestionEntry>
	implements QuestionEntry {
	public QuestionEntryClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return QuestionEntry.class;
	}

	@Override
	public String getModelClassName() {
		return QuestionEntry.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _questionEntryId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setQuestionEntryId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _questionEntryId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("questionEntryId", getQuestionEntryId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("subject", getSubject());
		attributes.put("levelQuestion", getLevelQuestion());
		attributes.put("answer", getAnswer());
		attributes.put("score", getScore());
		attributes.put("questionContent", getQuestionContent());
		attributes.put("a", getA());
		attributes.put("b", getB());
		attributes.put("c", getC());
		attributes.put("d", getD());
		attributes.put("title", getTitle());
		attributes.put("selection1", getSelection1());
		attributes.put("selection2", getSelection2());
		attributes.put("selection3", getSelection3());
		attributes.put("selection4", getSelection4());
		attributes.put("status", getStatus());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long questionEntryId = (Long)attributes.get("questionEntryId");

		if (questionEntryId != null) {
			setQuestionEntryId(questionEntryId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String subject = (String)attributes.get("subject");

		if (subject != null) {
			setSubject(subject);
		}

		Double levelQuestion = (Double)attributes.get("levelQuestion");

		if (levelQuestion != null) {
			setLevelQuestion(levelQuestion);
		}

		String answer = (String)attributes.get("answer");

		if (answer != null) {
			setAnswer(answer);
		}

		Double score = (Double)attributes.get("score");

		if (score != null) {
			setScore(score);
		}

		String questionContent = (String)attributes.get("questionContent");

		if (questionContent != null) {
			setQuestionContent(questionContent);
		}

		String a = (String)attributes.get("a");

		if (a != null) {
			setA(a);
		}

		String b = (String)attributes.get("b");

		if (b != null) {
			setB(b);
		}

		String c = (String)attributes.get("c");

		if (c != null) {
			setC(c);
		}

		String d = (String)attributes.get("d");

		if (d != null) {
			setD(d);
		}

		String title = (String)attributes.get("title");

		if (title != null) {
			setTitle(title);
		}

		String selection1 = (String)attributes.get("selection1");

		if (selection1 != null) {
			setSelection1(selection1);
		}

		String selection2 = (String)attributes.get("selection2");

		if (selection2 != null) {
			setSelection2(selection2);
		}

		String selection3 = (String)attributes.get("selection3");

		if (selection3 != null) {
			setSelection3(selection3);
		}

		String selection4 = (String)attributes.get("selection4");

		if (selection4 != null) {
			setSelection4(selection4);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}
	}

	@Override
	public long getQuestionEntryId() {
		return _questionEntryId;
	}

	@Override
	public void setQuestionEntryId(long questionEntryId) {
		_questionEntryId = questionEntryId;

		if (_questionEntryRemoteModel != null) {
			try {
				Class<?> clazz = _questionEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setQuestionEntryId", long.class);

				method.invoke(_questionEntryRemoteModel, questionEntryId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_groupId = groupId;

		if (_questionEntryRemoteModel != null) {
			try {
				Class<?> clazz = _questionEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_questionEntryRemoteModel, groupId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;

		if (_questionEntryRemoteModel != null) {
			try {
				Class<?> clazz = _questionEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_questionEntryRemoteModel, companyId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;

		if (_questionEntryRemoteModel != null) {
			try {
				Class<?> clazz = _questionEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_questionEntryRemoteModel, userId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@Override
	public String getUserName() {
		return _userName;
	}

	@Override
	public void setUserName(String userName) {
		_userName = userName;

		if (_questionEntryRemoteModel != null) {
			try {
				Class<?> clazz = _questionEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setUserName", String.class);

				method.invoke(_questionEntryRemoteModel, userName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;

		if (_questionEntryRemoteModel != null) {
			try {
				Class<?> clazz = _questionEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_questionEntryRemoteModel, createDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;

		if (_questionEntryRemoteModel != null) {
			try {
				Class<?> clazz = _questionEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_questionEntryRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSubject() {
		return _subject;
	}

	@Override
	public void setSubject(String subject) {
		_subject = subject;

		if (_questionEntryRemoteModel != null) {
			try {
				Class<?> clazz = _questionEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setSubject", String.class);

				method.invoke(_questionEntryRemoteModel, subject);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getLevelQuestion() {
		return _levelQuestion;
	}

	@Override
	public void setLevelQuestion(double levelQuestion) {
		_levelQuestion = levelQuestion;

		if (_questionEntryRemoteModel != null) {
			try {
				Class<?> clazz = _questionEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setLevelQuestion", double.class);

				method.invoke(_questionEntryRemoteModel, levelQuestion);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAnswer() {
		return _answer;
	}

	@Override
	public void setAnswer(String answer) {
		_answer = answer;

		if (_questionEntryRemoteModel != null) {
			try {
				Class<?> clazz = _questionEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setAnswer", String.class);

				method.invoke(_questionEntryRemoteModel, answer);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getScore() {
		return _score;
	}

	@Override
	public void setScore(double score) {
		_score = score;

		if (_questionEntryRemoteModel != null) {
			try {
				Class<?> clazz = _questionEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setScore", double.class);

				method.invoke(_questionEntryRemoteModel, score);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getQuestionContent() {
		return _questionContent;
	}

	@Override
	public void setQuestionContent(String questionContent) {
		_questionContent = questionContent;

		if (_questionEntryRemoteModel != null) {
			try {
				Class<?> clazz = _questionEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setQuestionContent",
						String.class);

				method.invoke(_questionEntryRemoteModel, questionContent);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getA() {
		return _a;
	}

	@Override
	public void setA(String a) {
		_a = a;

		if (_questionEntryRemoteModel != null) {
			try {
				Class<?> clazz = _questionEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setA", String.class);

				method.invoke(_questionEntryRemoteModel, a);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getB() {
		return _b;
	}

	@Override
	public void setB(String b) {
		_b = b;

		if (_questionEntryRemoteModel != null) {
			try {
				Class<?> clazz = _questionEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setB", String.class);

				method.invoke(_questionEntryRemoteModel, b);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getC() {
		return _c;
	}

	@Override
	public void setC(String c) {
		_c = c;

		if (_questionEntryRemoteModel != null) {
			try {
				Class<?> clazz = _questionEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setC", String.class);

				method.invoke(_questionEntryRemoteModel, c);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getD() {
		return _d;
	}

	@Override
	public void setD(String d) {
		_d = d;

		if (_questionEntryRemoteModel != null) {
			try {
				Class<?> clazz = _questionEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setD", String.class);

				method.invoke(_questionEntryRemoteModel, d);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTitle() {
		return _title;
	}

	@Override
	public void setTitle(String title) {
		_title = title;

		if (_questionEntryRemoteModel != null) {
			try {
				Class<?> clazz = _questionEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setTitle", String.class);

				method.invoke(_questionEntryRemoteModel, title);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSelection1() {
		return _selection1;
	}

	@Override
	public void setSelection1(String selection1) {
		_selection1 = selection1;

		if (_questionEntryRemoteModel != null) {
			try {
				Class<?> clazz = _questionEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setSelection1", String.class);

				method.invoke(_questionEntryRemoteModel, selection1);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSelection2() {
		return _selection2;
	}

	@Override
	public void setSelection2(String selection2) {
		_selection2 = selection2;

		if (_questionEntryRemoteModel != null) {
			try {
				Class<?> clazz = _questionEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setSelection2", String.class);

				method.invoke(_questionEntryRemoteModel, selection2);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSelection3() {
		return _selection3;
	}

	@Override
	public void setSelection3(String selection3) {
		_selection3 = selection3;

		if (_questionEntryRemoteModel != null) {
			try {
				Class<?> clazz = _questionEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setSelection3", String.class);

				method.invoke(_questionEntryRemoteModel, selection3);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSelection4() {
		return _selection4;
	}

	@Override
	public void setSelection4(String selection4) {
		_selection4 = selection4;

		if (_questionEntryRemoteModel != null) {
			try {
				Class<?> clazz = _questionEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setSelection4", String.class);

				method.invoke(_questionEntryRemoteModel, selection4);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getStatus() {
		return _status;
	}

	@Override
	public void setStatus(int status) {
		_status = status;

		if (_questionEntryRemoteModel != null) {
			try {
				Class<?> clazz = _questionEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setStatus", int.class);

				method.invoke(_questionEntryRemoteModel, status);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getQuestionEntryRemoteModel() {
		return _questionEntryRemoteModel;
	}

	public void setQuestionEntryRemoteModel(
		BaseModel<?> questionEntryRemoteModel) {
		_questionEntryRemoteModel = questionEntryRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _questionEntryRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_questionEntryRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			QuestionEntryLocalServiceUtil.addQuestionEntry(this);
		}
		else {
			QuestionEntryLocalServiceUtil.updateQuestionEntry(this);
		}
	}

	@Override
	public QuestionEntry toEscapedModel() {
		return (QuestionEntry)ProxyUtil.newProxyInstance(QuestionEntry.class.getClassLoader(),
			new Class[] { QuestionEntry.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		QuestionEntryClp clone = new QuestionEntryClp();

		clone.setQuestionEntryId(getQuestionEntryId());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setUserName(getUserName());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setSubject(getSubject());
		clone.setLevelQuestion(getLevelQuestion());
		clone.setAnswer(getAnswer());
		clone.setScore(getScore());
		clone.setQuestionContent(getQuestionContent());
		clone.setA(getA());
		clone.setB(getB());
		clone.setC(getC());
		clone.setD(getD());
		clone.setTitle(getTitle());
		clone.setSelection1(getSelection1());
		clone.setSelection2(getSelection2());
		clone.setSelection3(getSelection3());
		clone.setSelection4(getSelection4());
		clone.setStatus(getStatus());

		return clone;
	}

	@Override
	public int compareTo(QuestionEntry questionEntry) {
		long primaryKey = questionEntry.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof QuestionEntryClp)) {
			return false;
		}

		QuestionEntryClp questionEntry = (QuestionEntryClp)obj;

		long primaryKey = questionEntry.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	public Class<?> getClpSerializerClass() {
		return _clpSerializerClass;
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(45);

		sb.append("{questionEntryId=");
		sb.append(getQuestionEntryId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", subject=");
		sb.append(getSubject());
		sb.append(", levelQuestion=");
		sb.append(getLevelQuestion());
		sb.append(", answer=");
		sb.append(getAnswer());
		sb.append(", score=");
		sb.append(getScore());
		sb.append(", questionContent=");
		sb.append(getQuestionContent());
		sb.append(", a=");
		sb.append(getA());
		sb.append(", b=");
		sb.append(getB());
		sb.append(", c=");
		sb.append(getC());
		sb.append(", d=");
		sb.append(getD());
		sb.append(", title=");
		sb.append(getTitle());
		sb.append(", selection1=");
		sb.append(getSelection1());
		sb.append(", selection2=");
		sb.append(getSelection2());
		sb.append(", selection3=");
		sb.append(getSelection3());
		sb.append(", selection4=");
		sb.append(getSelection4());
		sb.append(", status=");
		sb.append(getStatus());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(70);

		sb.append("<model><model-name>");
		sb.append("com.vietnamobile.model.QuestionEntry");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>questionEntryId</column-name><column-value><![CDATA[");
		sb.append(getQuestionEntryId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>subject</column-name><column-value><![CDATA[");
		sb.append(getSubject());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>levelQuestion</column-name><column-value><![CDATA[");
		sb.append(getLevelQuestion());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>answer</column-name><column-value><![CDATA[");
		sb.append(getAnswer());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>score</column-name><column-value><![CDATA[");
		sb.append(getScore());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>questionContent</column-name><column-value><![CDATA[");
		sb.append(getQuestionContent());
		sb.append("]]></column-value></column>");
		sb.append("<column><column-name>a</column-name><column-value><![CDATA[");
		sb.append(getA());
		sb.append("]]></column-value></column>");
		sb.append("<column><column-name>b</column-name><column-value><![CDATA[");
		sb.append(getB());
		sb.append("]]></column-value></column>");
		sb.append("<column><column-name>c</column-name><column-value><![CDATA[");
		sb.append(getC());
		sb.append("]]></column-value></column>");
		sb.append("<column><column-name>d</column-name><column-value><![CDATA[");
		sb.append(getD());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>title</column-name><column-value><![CDATA[");
		sb.append(getTitle());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>selection1</column-name><column-value><![CDATA[");
		sb.append(getSelection1());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>selection2</column-name><column-value><![CDATA[");
		sb.append(getSelection2());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>selection3</column-name><column-value><![CDATA[");
		sb.append(getSelection3());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>selection4</column-name><column-value><![CDATA[");
		sb.append(getSelection4());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>status</column-name><column-value><![CDATA[");
		sb.append(getStatus());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _questionEntryId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _subject;
	private double _levelQuestion;
	private String _answer;
	private double _score;
	private String _questionContent;
	private String _a;
	private String _b;
	private String _c;
	private String _d;
	private String _title;
	private String _selection1;
	private String _selection2;
	private String _selection3;
	private String _selection4;
	private int _status;
	private BaseModel<?> _questionEntryRemoteModel;
	private Class<?> _clpSerializerClass = com.vietnamobile.service.ClpSerializer.class;
}