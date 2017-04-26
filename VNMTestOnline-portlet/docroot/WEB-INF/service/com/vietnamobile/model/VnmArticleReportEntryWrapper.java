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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link VnmArticleReportEntry}.
 * </p>
 *
 * @author duymb
 * @see VnmArticleReportEntry
 * @generated
 */
public class VnmArticleReportEntryWrapper implements VnmArticleReportEntry,
	ModelWrapper<VnmArticleReportEntry> {
	public VnmArticleReportEntryWrapper(
		VnmArticleReportEntry vnmArticleReportEntry) {
		_vnmArticleReportEntry = vnmArticleReportEntry;
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

	/**
	* Returns the primary key of this vnm article report entry.
	*
	* @return the primary key of this vnm article report entry
	*/
	@Override
	public long getPrimaryKey() {
		return _vnmArticleReportEntry.getPrimaryKey();
	}

	/**
	* Sets the primary key of this vnm article report entry.
	*
	* @param primaryKey the primary key of this vnm article report entry
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_vnmArticleReportEntry.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the vnm article report entry ID of this vnm article report entry.
	*
	* @return the vnm article report entry ID of this vnm article report entry
	*/
	@Override
	public long getVnmArticleReportEntryId() {
		return _vnmArticleReportEntry.getVnmArticleReportEntryId();
	}

	/**
	* Sets the vnm article report entry ID of this vnm article report entry.
	*
	* @param vnmArticleReportEntryId the vnm article report entry ID of this vnm article report entry
	*/
	@Override
	public void setVnmArticleReportEntryId(long vnmArticleReportEntryId) {
		_vnmArticleReportEntry.setVnmArticleReportEntryId(vnmArticleReportEntryId);
	}

	/**
	* Returns the group ID of this vnm article report entry.
	*
	* @return the group ID of this vnm article report entry
	*/
	@Override
	public long getGroupId() {
		return _vnmArticleReportEntry.getGroupId();
	}

	/**
	* Sets the group ID of this vnm article report entry.
	*
	* @param groupId the group ID of this vnm article report entry
	*/
	@Override
	public void setGroupId(long groupId) {
		_vnmArticleReportEntry.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this vnm article report entry.
	*
	* @return the company ID of this vnm article report entry
	*/
	@Override
	public long getCompanyId() {
		return _vnmArticleReportEntry.getCompanyId();
	}

	/**
	* Sets the company ID of this vnm article report entry.
	*
	* @param companyId the company ID of this vnm article report entry
	*/
	@Override
	public void setCompanyId(long companyId) {
		_vnmArticleReportEntry.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this vnm article report entry.
	*
	* @return the user ID of this vnm article report entry
	*/
	@Override
	public long getUserId() {
		return _vnmArticleReportEntry.getUserId();
	}

	/**
	* Sets the user ID of this vnm article report entry.
	*
	* @param userId the user ID of this vnm article report entry
	*/
	@Override
	public void setUserId(long userId) {
		_vnmArticleReportEntry.setUserId(userId);
	}

	/**
	* Returns the user uuid of this vnm article report entry.
	*
	* @return the user uuid of this vnm article report entry
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vnmArticleReportEntry.getUserUuid();
	}

	/**
	* Sets the user uuid of this vnm article report entry.
	*
	* @param userUuid the user uuid of this vnm article report entry
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_vnmArticleReportEntry.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this vnm article report entry.
	*
	* @return the user name of this vnm article report entry
	*/
	@Override
	public java.lang.String getUserName() {
		return _vnmArticleReportEntry.getUserName();
	}

	/**
	* Sets the user name of this vnm article report entry.
	*
	* @param userName the user name of this vnm article report entry
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_vnmArticleReportEntry.setUserName(userName);
	}

	/**
	* Returns the create date of this vnm article report entry.
	*
	* @return the create date of this vnm article report entry
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _vnmArticleReportEntry.getCreateDate();
	}

	/**
	* Sets the create date of this vnm article report entry.
	*
	* @param createDate the create date of this vnm article report entry
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_vnmArticleReportEntry.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this vnm article report entry.
	*
	* @return the modified date of this vnm article report entry
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _vnmArticleReportEntry.getModifiedDate();
	}

	/**
	* Sets the modified date of this vnm article report entry.
	*
	* @param modifiedDate the modified date of this vnm article report entry
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_vnmArticleReportEntry.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the article ID of this vnm article report entry.
	*
	* @return the article ID of this vnm article report entry
	*/
	@Override
	public java.lang.String getArticleId() {
		return _vnmArticleReportEntry.getArticleId();
	}

	/**
	* Sets the article ID of this vnm article report entry.
	*
	* @param articleId the article ID of this vnm article report entry
	*/
	@Override
	public void setArticleId(java.lang.String articleId) {
		_vnmArticleReportEntry.setArticleId(articleId);
	}

	/**
	* Returns the version of this vnm article report entry.
	*
	* @return the version of this vnm article report entry
	*/
	@Override
	public double getVersion() {
		return _vnmArticleReportEntry.getVersion();
	}

	/**
	* Sets the version of this vnm article report entry.
	*
	* @param version the version of this vnm article report entry
	*/
	@Override
	public void setVersion(double version) {
		_vnmArticleReportEntry.setVersion(version);
	}

	/**
	* Returns the title of this vnm article report entry.
	*
	* @return the title of this vnm article report entry
	*/
	@Override
	public java.lang.String getTitle() {
		return _vnmArticleReportEntry.getTitle();
	}

	/**
	* Sets the title of this vnm article report entry.
	*
	* @param title the title of this vnm article report entry
	*/
	@Override
	public void setTitle(java.lang.String title) {
		_vnmArticleReportEntry.setTitle(title);
	}

	/**
	* Returns the action of this vnm article report entry.
	*
	* @return the action of this vnm article report entry
	*/
	@Override
	public java.lang.String getAction() {
		return _vnmArticleReportEntry.getAction();
	}

	/**
	* Sets the action of this vnm article report entry.
	*
	* @param action the action of this vnm article report entry
	*/
	@Override
	public void setAction(java.lang.String action) {
		_vnmArticleReportEntry.setAction(action);
	}

	/**
	* Returns the status of this vnm article report entry.
	*
	* @return the status of this vnm article report entry
	*/
	@Override
	public int getStatus() {
		return _vnmArticleReportEntry.getStatus();
	}

	/**
	* Sets the status of this vnm article report entry.
	*
	* @param status the status of this vnm article report entry
	*/
	@Override
	public void setStatus(int status) {
		_vnmArticleReportEntry.setStatus(status);
	}

	@Override
	public boolean isNew() {
		return _vnmArticleReportEntry.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_vnmArticleReportEntry.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _vnmArticleReportEntry.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vnmArticleReportEntry.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _vnmArticleReportEntry.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _vnmArticleReportEntry.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_vnmArticleReportEntry.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _vnmArticleReportEntry.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_vnmArticleReportEntry.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_vnmArticleReportEntry.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_vnmArticleReportEntry.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new VnmArticleReportEntryWrapper((VnmArticleReportEntry)_vnmArticleReportEntry.clone());
	}

	@Override
	public int compareTo(
		com.vietnamobile.model.VnmArticleReportEntry vnmArticleReportEntry) {
		return _vnmArticleReportEntry.compareTo(vnmArticleReportEntry);
	}

	@Override
	public int hashCode() {
		return _vnmArticleReportEntry.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.vietnamobile.model.VnmArticleReportEntry> toCacheModel() {
		return _vnmArticleReportEntry.toCacheModel();
	}

	@Override
	public com.vietnamobile.model.VnmArticleReportEntry toEscapedModel() {
		return new VnmArticleReportEntryWrapper(_vnmArticleReportEntry.toEscapedModel());
	}

	@Override
	public com.vietnamobile.model.VnmArticleReportEntry toUnescapedModel() {
		return new VnmArticleReportEntryWrapper(_vnmArticleReportEntry.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _vnmArticleReportEntry.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vnmArticleReportEntry.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_vnmArticleReportEntry.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VnmArticleReportEntryWrapper)) {
			return false;
		}

		VnmArticleReportEntryWrapper vnmArticleReportEntryWrapper = (VnmArticleReportEntryWrapper)obj;

		if (Validator.equals(_vnmArticleReportEntry,
					vnmArticleReportEntryWrapper._vnmArticleReportEntry)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public VnmArticleReportEntry getWrappedVnmArticleReportEntry() {
		return _vnmArticleReportEntry;
	}

	@Override
	public VnmArticleReportEntry getWrappedModel() {
		return _vnmArticleReportEntry;
	}

	@Override
	public void resetOriginalValues() {
		_vnmArticleReportEntry.resetOriginalValues();
	}

	private VnmArticleReportEntry _vnmArticleReportEntry;
}