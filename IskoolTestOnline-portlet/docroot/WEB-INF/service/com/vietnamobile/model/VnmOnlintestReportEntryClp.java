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

import com.vietnamobile.service.ClpSerializer;
import com.vietnamobile.service.VnmOnlintestReportEntryLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author duymb
 */
public class VnmOnlintestReportEntryClp extends BaseModelImpl<VnmOnlintestReportEntry>
	implements VnmOnlintestReportEntry {
	public VnmOnlintestReportEntryClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return VnmOnlintestReportEntry.class;
	}

	@Override
	public String getModelClassName() {
		return VnmOnlintestReportEntry.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _vnmOnlintestReportEntryId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setVnmOnlintestReportEntryId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vnmOnlintestReportEntryId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("vnmOnlintestReportEntryId",
			getVnmOnlintestReportEntryId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("onlinetestEntryId", getOnlinetestEntryId());
		attributes.put("questionEntryId", getQuestionEntryId());
		attributes.put("correctTime", getCorrectTime());
		attributes.put("wrongTime", getWrongTime());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long vnmOnlintestReportEntryId = (Long)attributes.get(
				"vnmOnlintestReportEntryId");

		if (vnmOnlintestReportEntryId != null) {
			setVnmOnlintestReportEntryId(vnmOnlintestReportEntryId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Long onlinetestEntryId = (Long)attributes.get("onlinetestEntryId");

		if (onlinetestEntryId != null) {
			setOnlinetestEntryId(onlinetestEntryId);
		}

		Long questionEntryId = (Long)attributes.get("questionEntryId");

		if (questionEntryId != null) {
			setQuestionEntryId(questionEntryId);
		}

		Integer correctTime = (Integer)attributes.get("correctTime");

		if (correctTime != null) {
			setCorrectTime(correctTime);
		}

		Integer wrongTime = (Integer)attributes.get("wrongTime");

		if (wrongTime != null) {
			setWrongTime(wrongTime);
		}
	}

	@Override
	public long getVnmOnlintestReportEntryId() {
		return _vnmOnlintestReportEntryId;
	}

	@Override
	public void setVnmOnlintestReportEntryId(long vnmOnlintestReportEntryId) {
		_vnmOnlintestReportEntryId = vnmOnlintestReportEntryId;

		if (_vnmOnlintestReportEntryRemoteModel != null) {
			try {
				Class<?> clazz = _vnmOnlintestReportEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setVnmOnlintestReportEntryId",
						long.class);

				method.invoke(_vnmOnlintestReportEntryRemoteModel,
					vnmOnlintestReportEntryId);
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

		if (_vnmOnlintestReportEntryRemoteModel != null) {
			try {
				Class<?> clazz = _vnmOnlintestReportEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_vnmOnlintestReportEntryRemoteModel, groupId);
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

		if (_vnmOnlintestReportEntryRemoteModel != null) {
			try {
				Class<?> clazz = _vnmOnlintestReportEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_vnmOnlintestReportEntryRemoteModel, companyId);
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

		if (_vnmOnlintestReportEntryRemoteModel != null) {
			try {
				Class<?> clazz = _vnmOnlintestReportEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_vnmOnlintestReportEntryRemoteModel, createDate);
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

		if (_vnmOnlintestReportEntryRemoteModel != null) {
			try {
				Class<?> clazz = _vnmOnlintestReportEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_vnmOnlintestReportEntryRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getOnlinetestEntryId() {
		return _onlinetestEntryId;
	}

	@Override
	public void setOnlinetestEntryId(long onlinetestEntryId) {
		_onlinetestEntryId = onlinetestEntryId;

		if (_vnmOnlintestReportEntryRemoteModel != null) {
			try {
				Class<?> clazz = _vnmOnlintestReportEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setOnlinetestEntryId",
						long.class);

				method.invoke(_vnmOnlintestReportEntryRemoteModel,
					onlinetestEntryId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getQuestionEntryId() {
		return _questionEntryId;
	}

	@Override
	public void setQuestionEntryId(long questionEntryId) {
		_questionEntryId = questionEntryId;

		if (_vnmOnlintestReportEntryRemoteModel != null) {
			try {
				Class<?> clazz = _vnmOnlintestReportEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setQuestionEntryId", long.class);

				method.invoke(_vnmOnlintestReportEntryRemoteModel,
					questionEntryId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getCorrectTime() {
		return _correctTime;
	}

	@Override
	public void setCorrectTime(int correctTime) {
		_correctTime = correctTime;

		if (_vnmOnlintestReportEntryRemoteModel != null) {
			try {
				Class<?> clazz = _vnmOnlintestReportEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setCorrectTime", int.class);

				method.invoke(_vnmOnlintestReportEntryRemoteModel, correctTime);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getWrongTime() {
		return _wrongTime;
	}

	@Override
	public void setWrongTime(int wrongTime) {
		_wrongTime = wrongTime;

		if (_vnmOnlintestReportEntryRemoteModel != null) {
			try {
				Class<?> clazz = _vnmOnlintestReportEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setWrongTime", int.class);

				method.invoke(_vnmOnlintestReportEntryRemoteModel, wrongTime);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getVnmOnlintestReportEntryRemoteModel() {
		return _vnmOnlintestReportEntryRemoteModel;
	}

	public void setVnmOnlintestReportEntryRemoteModel(
		BaseModel<?> vnmOnlintestReportEntryRemoteModel) {
		_vnmOnlintestReportEntryRemoteModel = vnmOnlintestReportEntryRemoteModel;
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

		Class<?> remoteModelClass = _vnmOnlintestReportEntryRemoteModel.getClass();

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

		Object returnValue = method.invoke(_vnmOnlintestReportEntryRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			VnmOnlintestReportEntryLocalServiceUtil.addVnmOnlintestReportEntry(this);
		}
		else {
			VnmOnlintestReportEntryLocalServiceUtil.updateVnmOnlintestReportEntry(this);
		}
	}

	@Override
	public VnmOnlintestReportEntry toEscapedModel() {
		return (VnmOnlintestReportEntry)ProxyUtil.newProxyInstance(VnmOnlintestReportEntry.class.getClassLoader(),
			new Class[] { VnmOnlintestReportEntry.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		VnmOnlintestReportEntryClp clone = new VnmOnlintestReportEntryClp();

		clone.setVnmOnlintestReportEntryId(getVnmOnlintestReportEntryId());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setOnlinetestEntryId(getOnlinetestEntryId());
		clone.setQuestionEntryId(getQuestionEntryId());
		clone.setCorrectTime(getCorrectTime());
		clone.setWrongTime(getWrongTime());

		return clone;
	}

	@Override
	public int compareTo(VnmOnlintestReportEntry vnmOnlintestReportEntry) {
		long primaryKey = vnmOnlintestReportEntry.getPrimaryKey();

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

		if (!(obj instanceof VnmOnlintestReportEntryClp)) {
			return false;
		}

		VnmOnlintestReportEntryClp vnmOnlintestReportEntry = (VnmOnlintestReportEntryClp)obj;

		long primaryKey = vnmOnlintestReportEntry.getPrimaryKey();

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
		StringBundler sb = new StringBundler(19);

		sb.append("{vnmOnlintestReportEntryId=");
		sb.append(getVnmOnlintestReportEntryId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", onlinetestEntryId=");
		sb.append(getOnlinetestEntryId());
		sb.append(", questionEntryId=");
		sb.append(getQuestionEntryId());
		sb.append(", correctTime=");
		sb.append(getCorrectTime());
		sb.append(", wrongTime=");
		sb.append(getWrongTime());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(31);

		sb.append("<model><model-name>");
		sb.append("com.vietnamobile.model.VnmOnlintestReportEntry");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>vnmOnlintestReportEntryId</column-name><column-value><![CDATA[");
		sb.append(getVnmOnlintestReportEntryId());
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
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>onlinetestEntryId</column-name><column-value><![CDATA[");
		sb.append(getOnlinetestEntryId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>questionEntryId</column-name><column-value><![CDATA[");
		sb.append(getQuestionEntryId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>correctTime</column-name><column-value><![CDATA[");
		sb.append(getCorrectTime());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>wrongTime</column-name><column-value><![CDATA[");
		sb.append(getWrongTime());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _vnmOnlintestReportEntryId;
	private long _groupId;
	private long _companyId;
	private Date _createDate;
	private Date _modifiedDate;
	private long _onlinetestEntryId;
	private long _questionEntryId;
	private int _correctTime;
	private int _wrongTime;
	private BaseModel<?> _vnmOnlintestReportEntryRemoteModel;
	private Class<?> _clpSerializerClass = com.vietnamobile.service.ClpSerializer.class;
}