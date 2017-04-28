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
import com.vietnamobile.service.VnmArticleReportEntryLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author duymb
 */
public class VnmArticleReportEntryClp extends BaseModelImpl<VnmArticleReportEntry>
	implements VnmArticleReportEntry {
	public VnmArticleReportEntryClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return VnmArticleReportEntry.class;
	}

	@Override
	public String getModelClassName() {
		return VnmArticleReportEntry.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _vnmArticleReportEntryId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setVnmArticleReportEntryId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vnmArticleReportEntryId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("vnmArticleReportEntryId", getVnmArticleReportEntryId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("articleId", getArticleId());
		attributes.put("version", getVersion());
		attributes.put("title", getTitle());
		attributes.put("action", getAction());
		attributes.put("status", getStatus());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long vnmArticleReportEntryId = (Long)attributes.get(
				"vnmArticleReportEntryId");

		if (vnmArticleReportEntryId != null) {
			setVnmArticleReportEntryId(vnmArticleReportEntryId);
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

		String articleId = (String)attributes.get("articleId");

		if (articleId != null) {
			setArticleId(articleId);
		}

		Double version = (Double)attributes.get("version");

		if (version != null) {
			setVersion(version);
		}

		String title = (String)attributes.get("title");

		if (title != null) {
			setTitle(title);
		}

		String action = (String)attributes.get("action");

		if (action != null) {
			setAction(action);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}
	}

	@Override
	public long getVnmArticleReportEntryId() {
		return _vnmArticleReportEntryId;
	}

	@Override
	public void setVnmArticleReportEntryId(long vnmArticleReportEntryId) {
		_vnmArticleReportEntryId = vnmArticleReportEntryId;

		if (_vnmArticleReportEntryRemoteModel != null) {
			try {
				Class<?> clazz = _vnmArticleReportEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setVnmArticleReportEntryId",
						long.class);

				method.invoke(_vnmArticleReportEntryRemoteModel,
					vnmArticleReportEntryId);
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

		if (_vnmArticleReportEntryRemoteModel != null) {
			try {
				Class<?> clazz = _vnmArticleReportEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_vnmArticleReportEntryRemoteModel, groupId);
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

		if (_vnmArticleReportEntryRemoteModel != null) {
			try {
				Class<?> clazz = _vnmArticleReportEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_vnmArticleReportEntryRemoteModel, companyId);
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

		if (_vnmArticleReportEntryRemoteModel != null) {
			try {
				Class<?> clazz = _vnmArticleReportEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_vnmArticleReportEntryRemoteModel, userId);
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

		if (_vnmArticleReportEntryRemoteModel != null) {
			try {
				Class<?> clazz = _vnmArticleReportEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setUserName", String.class);

				method.invoke(_vnmArticleReportEntryRemoteModel, userName);
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

		if (_vnmArticleReportEntryRemoteModel != null) {
			try {
				Class<?> clazz = _vnmArticleReportEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_vnmArticleReportEntryRemoteModel, createDate);
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

		if (_vnmArticleReportEntryRemoteModel != null) {
			try {
				Class<?> clazz = _vnmArticleReportEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_vnmArticleReportEntryRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getArticleId() {
		return _articleId;
	}

	@Override
	public void setArticleId(String articleId) {
		_articleId = articleId;

		if (_vnmArticleReportEntryRemoteModel != null) {
			try {
				Class<?> clazz = _vnmArticleReportEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setArticleId", String.class);

				method.invoke(_vnmArticleReportEntryRemoteModel, articleId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getVersion() {
		return _version;
	}

	@Override
	public void setVersion(double version) {
		_version = version;

		if (_vnmArticleReportEntryRemoteModel != null) {
			try {
				Class<?> clazz = _vnmArticleReportEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setVersion", double.class);

				method.invoke(_vnmArticleReportEntryRemoteModel, version);
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

		if (_vnmArticleReportEntryRemoteModel != null) {
			try {
				Class<?> clazz = _vnmArticleReportEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setTitle", String.class);

				method.invoke(_vnmArticleReportEntryRemoteModel, title);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAction() {
		return _action;
	}

	@Override
	public void setAction(String action) {
		_action = action;

		if (_vnmArticleReportEntryRemoteModel != null) {
			try {
				Class<?> clazz = _vnmArticleReportEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setAction", String.class);

				method.invoke(_vnmArticleReportEntryRemoteModel, action);
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

		if (_vnmArticleReportEntryRemoteModel != null) {
			try {
				Class<?> clazz = _vnmArticleReportEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setStatus", int.class);

				method.invoke(_vnmArticleReportEntryRemoteModel, status);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getVnmArticleReportEntryRemoteModel() {
		return _vnmArticleReportEntryRemoteModel;
	}

	public void setVnmArticleReportEntryRemoteModel(
		BaseModel<?> vnmArticleReportEntryRemoteModel) {
		_vnmArticleReportEntryRemoteModel = vnmArticleReportEntryRemoteModel;
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

		Class<?> remoteModelClass = _vnmArticleReportEntryRemoteModel.getClass();

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

		Object returnValue = method.invoke(_vnmArticleReportEntryRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			VnmArticleReportEntryLocalServiceUtil.addVnmArticleReportEntry(this);
		}
		else {
			VnmArticleReportEntryLocalServiceUtil.updateVnmArticleReportEntry(this);
		}
	}

	@Override
	public VnmArticleReportEntry toEscapedModel() {
		return (VnmArticleReportEntry)ProxyUtil.newProxyInstance(VnmArticleReportEntry.class.getClassLoader(),
			new Class[] { VnmArticleReportEntry.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		VnmArticleReportEntryClp clone = new VnmArticleReportEntryClp();

		clone.setVnmArticleReportEntryId(getVnmArticleReportEntryId());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setUserName(getUserName());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setArticleId(getArticleId());
		clone.setVersion(getVersion());
		clone.setTitle(getTitle());
		clone.setAction(getAction());
		clone.setStatus(getStatus());

		return clone;
	}

	@Override
	public int compareTo(VnmArticleReportEntry vnmArticleReportEntry) {
		long primaryKey = vnmArticleReportEntry.getPrimaryKey();

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

		if (!(obj instanceof VnmArticleReportEntryClp)) {
			return false;
		}

		VnmArticleReportEntryClp vnmArticleReportEntry = (VnmArticleReportEntryClp)obj;

		long primaryKey = vnmArticleReportEntry.getPrimaryKey();

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
		StringBundler sb = new StringBundler(25);

		sb.append("{vnmArticleReportEntryId=");
		sb.append(getVnmArticleReportEntryId());
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
		sb.append(", articleId=");
		sb.append(getArticleId());
		sb.append(", version=");
		sb.append(getVersion());
		sb.append(", title=");
		sb.append(getTitle());
		sb.append(", action=");
		sb.append(getAction());
		sb.append(", status=");
		sb.append(getStatus());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(40);

		sb.append("<model><model-name>");
		sb.append("com.vietnamobile.model.VnmArticleReportEntry");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>vnmArticleReportEntryId</column-name><column-value><![CDATA[");
		sb.append(getVnmArticleReportEntryId());
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
			"<column><column-name>articleId</column-name><column-value><![CDATA[");
		sb.append(getArticleId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>version</column-name><column-value><![CDATA[");
		sb.append(getVersion());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>title</column-name><column-value><![CDATA[");
		sb.append(getTitle());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>action</column-name><column-value><![CDATA[");
		sb.append(getAction());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>status</column-name><column-value><![CDATA[");
		sb.append(getStatus());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _vnmArticleReportEntryId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _articleId;
	private double _version;
	private String _title;
	private String _action;
	private int _status;
	private BaseModel<?> _vnmArticleReportEntryRemoteModel;
	private Class<?> _clpSerializerClass = com.vietnamobile.service.ClpSerializer.class;
}