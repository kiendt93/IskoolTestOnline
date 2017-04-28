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
import com.vietnamobile.service.OnlinetestEntryLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author duymb
 */
public class OnlinetestEntryClp extends BaseModelImpl<OnlinetestEntry>
	implements OnlinetestEntry {
	public OnlinetestEntryClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return OnlinetestEntry.class;
	}

	@Override
	public String getModelClassName() {
		return OnlinetestEntry.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _onlinetestEntryId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setOnlinetestEntryId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _onlinetestEntryId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("onlinetestEntryId", getOnlinetestEntryId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("questionId", getQuestionId());
		attributes.put("testStartTime", getTestStartTime());
		attributes.put("testEndTime", getTestEndTime());
		attributes.put("duration", getDuration());
		attributes.put("numberOfQuestions", getNumberOfQuestions());
		attributes.put("title", getTitle());
		attributes.put("point", getPoint());
		attributes.put("status", getStatus());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long onlinetestEntryId = (Long)attributes.get("onlinetestEntryId");

		if (onlinetestEntryId != null) {
			setOnlinetestEntryId(onlinetestEntryId);
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

		String questionId = (String)attributes.get("questionId");

		if (questionId != null) {
			setQuestionId(questionId);
		}

		Date testStartTime = (Date)attributes.get("testStartTime");

		if (testStartTime != null) {
			setTestStartTime(testStartTime);
		}

		Date testEndTime = (Date)attributes.get("testEndTime");

		if (testEndTime != null) {
			setTestEndTime(testEndTime);
		}

		Integer duration = (Integer)attributes.get("duration");

		if (duration != null) {
			setDuration(duration);
		}

		Integer numberOfQuestions = (Integer)attributes.get("numberOfQuestions");

		if (numberOfQuestions != null) {
			setNumberOfQuestions(numberOfQuestions);
		}

		String title = (String)attributes.get("title");

		if (title != null) {
			setTitle(title);
		}

		Integer point = (Integer)attributes.get("point");

		if (point != null) {
			setPoint(point);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}
	}

	@Override
	public long getOnlinetestEntryId() {
		return _onlinetestEntryId;
	}

	@Override
	public void setOnlinetestEntryId(long onlinetestEntryId) {
		_onlinetestEntryId = onlinetestEntryId;

		if (_onlinetestEntryRemoteModel != null) {
			try {
				Class<?> clazz = _onlinetestEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setOnlinetestEntryId",
						long.class);

				method.invoke(_onlinetestEntryRemoteModel, onlinetestEntryId);
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

		if (_onlinetestEntryRemoteModel != null) {
			try {
				Class<?> clazz = _onlinetestEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_onlinetestEntryRemoteModel, groupId);
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

		if (_onlinetestEntryRemoteModel != null) {
			try {
				Class<?> clazz = _onlinetestEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_onlinetestEntryRemoteModel, companyId);
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

		if (_onlinetestEntryRemoteModel != null) {
			try {
				Class<?> clazz = _onlinetestEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_onlinetestEntryRemoteModel, userId);
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

		if (_onlinetestEntryRemoteModel != null) {
			try {
				Class<?> clazz = _onlinetestEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setUserName", String.class);

				method.invoke(_onlinetestEntryRemoteModel, userName);
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

		if (_onlinetestEntryRemoteModel != null) {
			try {
				Class<?> clazz = _onlinetestEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_onlinetestEntryRemoteModel, createDate);
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

		if (_onlinetestEntryRemoteModel != null) {
			try {
				Class<?> clazz = _onlinetestEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_onlinetestEntryRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getQuestionId() {
		return _questionId;
	}

	@Override
	public void setQuestionId(String questionId) {
		_questionId = questionId;

		if (_onlinetestEntryRemoteModel != null) {
			try {
				Class<?> clazz = _onlinetestEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setQuestionId", String.class);

				method.invoke(_onlinetestEntryRemoteModel, questionId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getTestStartTime() {
		return _testStartTime;
	}

	@Override
	public void setTestStartTime(Date testStartTime) {
		_testStartTime = testStartTime;

		if (_onlinetestEntryRemoteModel != null) {
			try {
				Class<?> clazz = _onlinetestEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setTestStartTime", Date.class);

				method.invoke(_onlinetestEntryRemoteModel, testStartTime);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getTestEndTime() {
		return _testEndTime;
	}

	@Override
	public void setTestEndTime(Date testEndTime) {
		_testEndTime = testEndTime;

		if (_onlinetestEntryRemoteModel != null) {
			try {
				Class<?> clazz = _onlinetestEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setTestEndTime", Date.class);

				method.invoke(_onlinetestEntryRemoteModel, testEndTime);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getDuration() {
		return _duration;
	}

	@Override
	public void setDuration(int duration) {
		_duration = duration;

		if (_onlinetestEntryRemoteModel != null) {
			try {
				Class<?> clazz = _onlinetestEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setDuration", int.class);

				method.invoke(_onlinetestEntryRemoteModel, duration);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getNumberOfQuestions() {
		return _numberOfQuestions;
	}

	@Override
	public void setNumberOfQuestions(int numberOfQuestions) {
		_numberOfQuestions = numberOfQuestions;

		if (_onlinetestEntryRemoteModel != null) {
			try {
				Class<?> clazz = _onlinetestEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setNumberOfQuestions",
						int.class);

				method.invoke(_onlinetestEntryRemoteModel, numberOfQuestions);
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

		if (_onlinetestEntryRemoteModel != null) {
			try {
				Class<?> clazz = _onlinetestEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setTitle", String.class);

				method.invoke(_onlinetestEntryRemoteModel, title);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getPoint() {
		return _point;
	}

	@Override
	public void setPoint(int point) {
		_point = point;

		if (_onlinetestEntryRemoteModel != null) {
			try {
				Class<?> clazz = _onlinetestEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setPoint", int.class);

				method.invoke(_onlinetestEntryRemoteModel, point);
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

		if (_onlinetestEntryRemoteModel != null) {
			try {
				Class<?> clazz = _onlinetestEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setStatus", int.class);

				method.invoke(_onlinetestEntryRemoteModel, status);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getOnlinetestEntryRemoteModel() {
		return _onlinetestEntryRemoteModel;
	}

	public void setOnlinetestEntryRemoteModel(
		BaseModel<?> onlinetestEntryRemoteModel) {
		_onlinetestEntryRemoteModel = onlinetestEntryRemoteModel;
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

		Class<?> remoteModelClass = _onlinetestEntryRemoteModel.getClass();

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

		Object returnValue = method.invoke(_onlinetestEntryRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			OnlinetestEntryLocalServiceUtil.addOnlinetestEntry(this);
		}
		else {
			OnlinetestEntryLocalServiceUtil.updateOnlinetestEntry(this);
		}
	}

	@Override
	public OnlinetestEntry toEscapedModel() {
		return (OnlinetestEntry)ProxyUtil.newProxyInstance(OnlinetestEntry.class.getClassLoader(),
			new Class[] { OnlinetestEntry.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		OnlinetestEntryClp clone = new OnlinetestEntryClp();

		clone.setOnlinetestEntryId(getOnlinetestEntryId());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setUserName(getUserName());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setQuestionId(getQuestionId());
		clone.setTestStartTime(getTestStartTime());
		clone.setTestEndTime(getTestEndTime());
		clone.setDuration(getDuration());
		clone.setNumberOfQuestions(getNumberOfQuestions());
		clone.setTitle(getTitle());
		clone.setPoint(getPoint());
		clone.setStatus(getStatus());

		return clone;
	}

	@Override
	public int compareTo(OnlinetestEntry onlinetestEntry) {
		long primaryKey = onlinetestEntry.getPrimaryKey();

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

		if (!(obj instanceof OnlinetestEntryClp)) {
			return false;
		}

		OnlinetestEntryClp onlinetestEntry = (OnlinetestEntryClp)obj;

		long primaryKey = onlinetestEntry.getPrimaryKey();

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
		StringBundler sb = new StringBundler(31);

		sb.append("{onlinetestEntryId=");
		sb.append(getOnlinetestEntryId());
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
		sb.append(", questionId=");
		sb.append(getQuestionId());
		sb.append(", testStartTime=");
		sb.append(getTestStartTime());
		sb.append(", testEndTime=");
		sb.append(getTestEndTime());
		sb.append(", duration=");
		sb.append(getDuration());
		sb.append(", numberOfQuestions=");
		sb.append(getNumberOfQuestions());
		sb.append(", title=");
		sb.append(getTitle());
		sb.append(", point=");
		sb.append(getPoint());
		sb.append(", status=");
		sb.append(getStatus());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(49);

		sb.append("<model><model-name>");
		sb.append("com.vietnamobile.model.OnlinetestEntry");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>onlinetestEntryId</column-name><column-value><![CDATA[");
		sb.append(getOnlinetestEntryId());
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
			"<column><column-name>questionId</column-name><column-value><![CDATA[");
		sb.append(getQuestionId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>testStartTime</column-name><column-value><![CDATA[");
		sb.append(getTestStartTime());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>testEndTime</column-name><column-value><![CDATA[");
		sb.append(getTestEndTime());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>duration</column-name><column-value><![CDATA[");
		sb.append(getDuration());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>numberOfQuestions</column-name><column-value><![CDATA[");
		sb.append(getNumberOfQuestions());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>title</column-name><column-value><![CDATA[");
		sb.append(getTitle());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>point</column-name><column-value><![CDATA[");
		sb.append(getPoint());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>status</column-name><column-value><![CDATA[");
		sb.append(getStatus());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _onlinetestEntryId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _questionId;
	private Date _testStartTime;
	private Date _testEndTime;
	private int _duration;
	private int _numberOfQuestions;
	private String _title;
	private int _point;
	private int _status;
	private BaseModel<?> _onlinetestEntryRemoteModel;
	private Class<?> _clpSerializerClass = com.vietnamobile.service.ClpSerializer.class;
}