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
import com.vietnamobile.service.SubjectEntryLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author duymb
 */
public class SubjectEntryClp extends BaseModelImpl<SubjectEntry>
	implements SubjectEntry {
	public SubjectEntryClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return SubjectEntry.class;
	}

	@Override
	public String getModelClassName() {
		return SubjectEntry.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _subjectEntryId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setSubjectEntryId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _subjectEntryId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("subjectEntryId", getSubjectEntryId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("course", getCourse());
		attributes.put("subject", getSubject());
		attributes.put("description", getDescription());
		attributes.put("examType", getExamType());
		attributes.put("totalQuestion", getTotalQuestion());
		attributes.put("status", getStatus());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long subjectEntryId = (Long)attributes.get("subjectEntryId");

		if (subjectEntryId != null) {
			setSubjectEntryId(subjectEntryId);
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

		String course = (String)attributes.get("course");

		if (course != null) {
			setCourse(course);
		}

		String subject = (String)attributes.get("subject");

		if (subject != null) {
			setSubject(subject);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		String examType = (String)attributes.get("examType");

		if (examType != null) {
			setExamType(examType);
		}

		Integer totalQuestion = (Integer)attributes.get("totalQuestion");

		if (totalQuestion != null) {
			setTotalQuestion(totalQuestion);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}
	}

	@Override
	public long getSubjectEntryId() {
		return _subjectEntryId;
	}

	@Override
	public void setSubjectEntryId(long subjectEntryId) {
		_subjectEntryId = subjectEntryId;

		if (_subjectEntryRemoteModel != null) {
			try {
				Class<?> clazz = _subjectEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setSubjectEntryId", long.class);

				method.invoke(_subjectEntryRemoteModel, subjectEntryId);
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

		if (_subjectEntryRemoteModel != null) {
			try {
				Class<?> clazz = _subjectEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_subjectEntryRemoteModel, groupId);
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

		if (_subjectEntryRemoteModel != null) {
			try {
				Class<?> clazz = _subjectEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_subjectEntryRemoteModel, companyId);
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

		if (_subjectEntryRemoteModel != null) {
			try {
				Class<?> clazz = _subjectEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_subjectEntryRemoteModel, userId);
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

		if (_subjectEntryRemoteModel != null) {
			try {
				Class<?> clazz = _subjectEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setUserName", String.class);

				method.invoke(_subjectEntryRemoteModel, userName);
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

		if (_subjectEntryRemoteModel != null) {
			try {
				Class<?> clazz = _subjectEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_subjectEntryRemoteModel, createDate);
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

		if (_subjectEntryRemoteModel != null) {
			try {
				Class<?> clazz = _subjectEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_subjectEntryRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCourse() {
		return _course;
	}

	@Override
	public void setCourse(String course) {
		_course = course;

		if (_subjectEntryRemoteModel != null) {
			try {
				Class<?> clazz = _subjectEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setCourse", String.class);

				method.invoke(_subjectEntryRemoteModel, course);
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

		if (_subjectEntryRemoteModel != null) {
			try {
				Class<?> clazz = _subjectEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setSubject", String.class);

				method.invoke(_subjectEntryRemoteModel, subject);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDescription() {
		return _description;
	}

	@Override
	public void setDescription(String description) {
		_description = description;

		if (_subjectEntryRemoteModel != null) {
			try {
				Class<?> clazz = _subjectEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setDescription", String.class);

				method.invoke(_subjectEntryRemoteModel, description);
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

		if (_subjectEntryRemoteModel != null) {
			try {
				Class<?> clazz = _subjectEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setExamType", String.class);

				method.invoke(_subjectEntryRemoteModel, examType);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getTotalQuestion() {
		return _totalQuestion;
	}

	@Override
	public void setTotalQuestion(int totalQuestion) {
		_totalQuestion = totalQuestion;

		if (_subjectEntryRemoteModel != null) {
			try {
				Class<?> clazz = _subjectEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setTotalQuestion", int.class);

				method.invoke(_subjectEntryRemoteModel, totalQuestion);
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

		if (_subjectEntryRemoteModel != null) {
			try {
				Class<?> clazz = _subjectEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setStatus", int.class);

				method.invoke(_subjectEntryRemoteModel, status);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getSubjectEntryRemoteModel() {
		return _subjectEntryRemoteModel;
	}

	public void setSubjectEntryRemoteModel(BaseModel<?> subjectEntryRemoteModel) {
		_subjectEntryRemoteModel = subjectEntryRemoteModel;
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

		Class<?> remoteModelClass = _subjectEntryRemoteModel.getClass();

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

		Object returnValue = method.invoke(_subjectEntryRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			SubjectEntryLocalServiceUtil.addSubjectEntry(this);
		}
		else {
			SubjectEntryLocalServiceUtil.updateSubjectEntry(this);
		}
	}

	@Override
	public SubjectEntry toEscapedModel() {
		return (SubjectEntry)ProxyUtil.newProxyInstance(SubjectEntry.class.getClassLoader(),
			new Class[] { SubjectEntry.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		SubjectEntryClp clone = new SubjectEntryClp();

		clone.setSubjectEntryId(getSubjectEntryId());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setUserName(getUserName());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setCourse(getCourse());
		clone.setSubject(getSubject());
		clone.setDescription(getDescription());
		clone.setExamType(getExamType());
		clone.setTotalQuestion(getTotalQuestion());
		clone.setStatus(getStatus());

		return clone;
	}

	@Override
	public int compareTo(SubjectEntry subjectEntry) {
		long primaryKey = subjectEntry.getPrimaryKey();

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

		if (!(obj instanceof SubjectEntryClp)) {
			return false;
		}

		SubjectEntryClp subjectEntry = (SubjectEntryClp)obj;

		long primaryKey = subjectEntry.getPrimaryKey();

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
		StringBundler sb = new StringBundler(27);

		sb.append("{subjectEntryId=");
		sb.append(getSubjectEntryId());
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
		sb.append(", course=");
		sb.append(getCourse());
		sb.append(", subject=");
		sb.append(getSubject());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append(", examType=");
		sb.append(getExamType());
		sb.append(", totalQuestion=");
		sb.append(getTotalQuestion());
		sb.append(", status=");
		sb.append(getStatus());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(43);

		sb.append("<model><model-name>");
		sb.append("com.vietnamobile.model.SubjectEntry");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>subjectEntryId</column-name><column-value><![CDATA[");
		sb.append(getSubjectEntryId());
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
			"<column><column-name>course</column-name><column-value><![CDATA[");
		sb.append(getCourse());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>subject</column-name><column-value><![CDATA[");
		sb.append(getSubject());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>examType</column-name><column-value><![CDATA[");
		sb.append(getExamType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>totalQuestion</column-name><column-value><![CDATA[");
		sb.append(getTotalQuestion());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>status</column-name><column-value><![CDATA[");
		sb.append(getStatus());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _subjectEntryId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _course;
	private String _subject;
	private String _description;
	private String _examType;
	private int _totalQuestion;
	private int _status;
	private BaseModel<?> _subjectEntryRemoteModel;
	private Class<?> _clpSerializerClass = com.vietnamobile.service.ClpSerializer.class;
}