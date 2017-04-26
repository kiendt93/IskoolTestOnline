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
import com.vietnamobile.service.OnlinetestResultEntryLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author duymb
 */
public class OnlinetestResultEntryClp extends BaseModelImpl<OnlinetestResultEntry>
	implements OnlinetestResultEntry {
	public OnlinetestResultEntryClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return OnlinetestResultEntry.class;
	}

	@Override
	public String getModelClassName() {
		return OnlinetestResultEntry.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _onlinetestResultEntryId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setOnlinetestResultEntryId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _onlinetestResultEntryId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("onlinetestResultEntryId", getOnlinetestResultEntryId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("onlineTestEntryId", getOnlineTestEntryId());
		attributes.put("score", getScore());
		attributes.put("answerSelected", getAnswerSelected());
		attributes.put("numberOfWrongAnswer", getNumberOfWrongAnswer());
		attributes.put("timeRemaining", getTimeRemaining());
		attributes.put("examType", getExamType());
		attributes.put("questionIds", getQuestionIds());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long onlinetestResultEntryId = (Long)attributes.get(
				"onlinetestResultEntryId");

		if (onlinetestResultEntryId != null) {
			setOnlinetestResultEntryId(onlinetestResultEntryId);
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

		Long onlineTestEntryId = (Long)attributes.get("onlineTestEntryId");

		if (onlineTestEntryId != null) {
			setOnlineTestEntryId(onlineTestEntryId);
		}

		Double score = (Double)attributes.get("score");

		if (score != null) {
			setScore(score);
		}

		String answerSelected = (String)attributes.get("answerSelected");

		if (answerSelected != null) {
			setAnswerSelected(answerSelected);
		}

		Integer numberOfWrongAnswer = (Integer)attributes.get(
				"numberOfWrongAnswer");

		if (numberOfWrongAnswer != null) {
			setNumberOfWrongAnswer(numberOfWrongAnswer);
		}

		Integer timeRemaining = (Integer)attributes.get("timeRemaining");

		if (timeRemaining != null) {
			setTimeRemaining(timeRemaining);
		}

		String examType = (String)attributes.get("examType");

		if (examType != null) {
			setExamType(examType);
		}

		String questionIds = (String)attributes.get("questionIds");

		if (questionIds != null) {
			setQuestionIds(questionIds);
		}
	}

	@Override
	public long getOnlinetestResultEntryId() {
		return _onlinetestResultEntryId;
	}

	@Override
	public void setOnlinetestResultEntryId(long onlinetestResultEntryId) {
		_onlinetestResultEntryId = onlinetestResultEntryId;

		if (_onlinetestResultEntryRemoteModel != null) {
			try {
				Class<?> clazz = _onlinetestResultEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setOnlinetestResultEntryId",
						long.class);

				method.invoke(_onlinetestResultEntryRemoteModel,
					onlinetestResultEntryId);
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

		if (_onlinetestResultEntryRemoteModel != null) {
			try {
				Class<?> clazz = _onlinetestResultEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_onlinetestResultEntryRemoteModel, groupId);
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

		if (_onlinetestResultEntryRemoteModel != null) {
			try {
				Class<?> clazz = _onlinetestResultEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_onlinetestResultEntryRemoteModel, companyId);
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

		if (_onlinetestResultEntryRemoteModel != null) {
			try {
				Class<?> clazz = _onlinetestResultEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_onlinetestResultEntryRemoteModel, userId);
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

		if (_onlinetestResultEntryRemoteModel != null) {
			try {
				Class<?> clazz = _onlinetestResultEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setUserName", String.class);

				method.invoke(_onlinetestResultEntryRemoteModel, userName);
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

		if (_onlinetestResultEntryRemoteModel != null) {
			try {
				Class<?> clazz = _onlinetestResultEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_onlinetestResultEntryRemoteModel, createDate);
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

		if (_onlinetestResultEntryRemoteModel != null) {
			try {
				Class<?> clazz = _onlinetestResultEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_onlinetestResultEntryRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getOnlineTestEntryId() {
		return _onlineTestEntryId;
	}

	@Override
	public void setOnlineTestEntryId(long onlineTestEntryId) {
		_onlineTestEntryId = onlineTestEntryId;

		if (_onlinetestResultEntryRemoteModel != null) {
			try {
				Class<?> clazz = _onlinetestResultEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setOnlineTestEntryId",
						long.class);

				method.invoke(_onlinetestResultEntryRemoteModel,
					onlineTestEntryId);
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

		if (_onlinetestResultEntryRemoteModel != null) {
			try {
				Class<?> clazz = _onlinetestResultEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setScore", double.class);

				method.invoke(_onlinetestResultEntryRemoteModel, score);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAnswerSelected() {
		return _answerSelected;
	}

	@Override
	public void setAnswerSelected(String answerSelected) {
		_answerSelected = answerSelected;

		if (_onlinetestResultEntryRemoteModel != null) {
			try {
				Class<?> clazz = _onlinetestResultEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setAnswerSelected",
						String.class);

				method.invoke(_onlinetestResultEntryRemoteModel, answerSelected);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getNumberOfWrongAnswer() {
		return _numberOfWrongAnswer;
	}

	@Override
	public void setNumberOfWrongAnswer(int numberOfWrongAnswer) {
		_numberOfWrongAnswer = numberOfWrongAnswer;

		if (_onlinetestResultEntryRemoteModel != null) {
			try {
				Class<?> clazz = _onlinetestResultEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setNumberOfWrongAnswer",
						int.class);

				method.invoke(_onlinetestResultEntryRemoteModel,
					numberOfWrongAnswer);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getTimeRemaining() {
		return _timeRemaining;
	}

	@Override
	public void setTimeRemaining(int timeRemaining) {
		_timeRemaining = timeRemaining;

		if (_onlinetestResultEntryRemoteModel != null) {
			try {
				Class<?> clazz = _onlinetestResultEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setTimeRemaining", int.class);

				method.invoke(_onlinetestResultEntryRemoteModel, timeRemaining);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getExamType() {
		return _examType;
	}

	@Override
	public void setExamType(String examType) {
		_examType = examType;

		if (_onlinetestResultEntryRemoteModel != null) {
			try {
				Class<?> clazz = _onlinetestResultEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setExamType", String.class);

				method.invoke(_onlinetestResultEntryRemoteModel, examType);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getQuestionIds() {
		return _questionIds;
	}

	@Override
	public void setQuestionIds(String questionIds) {
		_questionIds = questionIds;

		if (_onlinetestResultEntryRemoteModel != null) {
			try {
				Class<?> clazz = _onlinetestResultEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setQuestionIds", String.class);

				method.invoke(_onlinetestResultEntryRemoteModel, questionIds);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getOnlinetestResultEntryRemoteModel() {
		return _onlinetestResultEntryRemoteModel;
	}

	public void setOnlinetestResultEntryRemoteModel(
		BaseModel<?> onlinetestResultEntryRemoteModel) {
		_onlinetestResultEntryRemoteModel = onlinetestResultEntryRemoteModel;
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

		Class<?> remoteModelClass = _onlinetestResultEntryRemoteModel.getClass();

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

		Object returnValue = method.invoke(_onlinetestResultEntryRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			OnlinetestResultEntryLocalServiceUtil.addOnlinetestResultEntry(this);
		}
		else {
			OnlinetestResultEntryLocalServiceUtil.updateOnlinetestResultEntry(this);
		}
	}

	@Override
	public OnlinetestResultEntry toEscapedModel() {
		return (OnlinetestResultEntry)ProxyUtil.newProxyInstance(OnlinetestResultEntry.class.getClassLoader(),
			new Class[] { OnlinetestResultEntry.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		OnlinetestResultEntryClp clone = new OnlinetestResultEntryClp();

		clone.setOnlinetestResultEntryId(getOnlinetestResultEntryId());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setUserName(getUserName());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setOnlineTestEntryId(getOnlineTestEntryId());
		clone.setScore(getScore());
		clone.setAnswerSelected(getAnswerSelected());
		clone.setNumberOfWrongAnswer(getNumberOfWrongAnswer());
		clone.setTimeRemaining(getTimeRemaining());
		clone.setExamType(getExamType());
		clone.setQuestionIds(getQuestionIds());

		return clone;
	}

	@Override
	public int compareTo(OnlinetestResultEntry onlinetestResultEntry) {
		long primaryKey = onlinetestResultEntry.getPrimaryKey();

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

		if (!(obj instanceof OnlinetestResultEntryClp)) {
			return false;
		}

		OnlinetestResultEntryClp onlinetestResultEntry = (OnlinetestResultEntryClp)obj;

		long primaryKey = onlinetestResultEntry.getPrimaryKey();

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
		StringBundler sb = new StringBundler(29);

		sb.append("{onlinetestResultEntryId=");
		sb.append(getOnlinetestResultEntryId());
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
		sb.append(", onlineTestEntryId=");
		sb.append(getOnlineTestEntryId());
		sb.append(", score=");
		sb.append(getScore());
		sb.append(", answerSelected=");
		sb.append(getAnswerSelected());
		sb.append(", numberOfWrongAnswer=");
		sb.append(getNumberOfWrongAnswer());
		sb.append(", timeRemaining=");
		sb.append(getTimeRemaining());
		sb.append(", examType=");
		sb.append(getExamType());
		sb.append(", questionIds=");
		sb.append(getQuestionIds());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(46);

		sb.append("<model><model-name>");
		sb.append("com.vietnamobile.model.OnlinetestResultEntry");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>onlinetestResultEntryId</column-name><column-value><![CDATA[");
		sb.append(getOnlinetestResultEntryId());
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
			"<column><column-name>onlineTestEntryId</column-name><column-value><![CDATA[");
		sb.append(getOnlineTestEntryId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>score</column-name><column-value><![CDATA[");
		sb.append(getScore());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>answerSelected</column-name><column-value><![CDATA[");
		sb.append(getAnswerSelected());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>numberOfWrongAnswer</column-name><column-value><![CDATA[");
		sb.append(getNumberOfWrongAnswer());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>timeRemaining</column-name><column-value><![CDATA[");
		sb.append(getTimeRemaining());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>examType</column-name><column-value><![CDATA[");
		sb.append(getExamType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>questionIds</column-name><column-value><![CDATA[");
		sb.append(getQuestionIds());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _onlinetestResultEntryId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private long _onlineTestEntryId;
	private double _score;
	private String _answerSelected;
	private int _numberOfWrongAnswer;
	private int _timeRemaining;
	private String _examType;
	private String _questionIds;
	private BaseModel<?> _onlinetestResultEntryRemoteModel;
	private Class<?> _clpSerializerClass = com.vietnamobile.service.ClpSerializer.class;
}