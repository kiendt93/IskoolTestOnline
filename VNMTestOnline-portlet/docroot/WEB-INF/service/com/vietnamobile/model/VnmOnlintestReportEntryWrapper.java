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
 * This class is a wrapper for {@link VnmOnlintestReportEntry}.
 * </p>
 *
 * @author duymb
 * @see VnmOnlintestReportEntry
 * @generated
 */
public class VnmOnlintestReportEntryWrapper implements VnmOnlintestReportEntry,
	ModelWrapper<VnmOnlintestReportEntry> {
	public VnmOnlintestReportEntryWrapper(
		VnmOnlintestReportEntry vnmOnlintestReportEntry) {
		_vnmOnlintestReportEntry = vnmOnlintestReportEntry;
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

	/**
	* Returns the primary key of this vnm onlintest report entry.
	*
	* @return the primary key of this vnm onlintest report entry
	*/
	@Override
	public long getPrimaryKey() {
		return _vnmOnlintestReportEntry.getPrimaryKey();
	}

	/**
	* Sets the primary key of this vnm onlintest report entry.
	*
	* @param primaryKey the primary key of this vnm onlintest report entry
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_vnmOnlintestReportEntry.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the vnm onlintest report entry ID of this vnm onlintest report entry.
	*
	* @return the vnm onlintest report entry ID of this vnm onlintest report entry
	*/
	@Override
	public long getVnmOnlintestReportEntryId() {
		return _vnmOnlintestReportEntry.getVnmOnlintestReportEntryId();
	}

	/**
	* Sets the vnm onlintest report entry ID of this vnm onlintest report entry.
	*
	* @param vnmOnlintestReportEntryId the vnm onlintest report entry ID of this vnm onlintest report entry
	*/
	@Override
	public void setVnmOnlintestReportEntryId(long vnmOnlintestReportEntryId) {
		_vnmOnlintestReportEntry.setVnmOnlintestReportEntryId(vnmOnlintestReportEntryId);
	}

	/**
	* Returns the group ID of this vnm onlintest report entry.
	*
	* @return the group ID of this vnm onlintest report entry
	*/
	@Override
	public long getGroupId() {
		return _vnmOnlintestReportEntry.getGroupId();
	}

	/**
	* Sets the group ID of this vnm onlintest report entry.
	*
	* @param groupId the group ID of this vnm onlintest report entry
	*/
	@Override
	public void setGroupId(long groupId) {
		_vnmOnlintestReportEntry.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this vnm onlintest report entry.
	*
	* @return the company ID of this vnm onlintest report entry
	*/
	@Override
	public long getCompanyId() {
		return _vnmOnlintestReportEntry.getCompanyId();
	}

	/**
	* Sets the company ID of this vnm onlintest report entry.
	*
	* @param companyId the company ID of this vnm onlintest report entry
	*/
	@Override
	public void setCompanyId(long companyId) {
		_vnmOnlintestReportEntry.setCompanyId(companyId);
	}

	/**
	* Returns the create date of this vnm onlintest report entry.
	*
	* @return the create date of this vnm onlintest report entry
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _vnmOnlintestReportEntry.getCreateDate();
	}

	/**
	* Sets the create date of this vnm onlintest report entry.
	*
	* @param createDate the create date of this vnm onlintest report entry
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_vnmOnlintestReportEntry.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this vnm onlintest report entry.
	*
	* @return the modified date of this vnm onlintest report entry
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _vnmOnlintestReportEntry.getModifiedDate();
	}

	/**
	* Sets the modified date of this vnm onlintest report entry.
	*
	* @param modifiedDate the modified date of this vnm onlintest report entry
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_vnmOnlintestReportEntry.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the onlinetest entry ID of this vnm onlintest report entry.
	*
	* @return the onlinetest entry ID of this vnm onlintest report entry
	*/
	@Override
	public long getOnlinetestEntryId() {
		return _vnmOnlintestReportEntry.getOnlinetestEntryId();
	}

	/**
	* Sets the onlinetest entry ID of this vnm onlintest report entry.
	*
	* @param onlinetestEntryId the onlinetest entry ID of this vnm onlintest report entry
	*/
	@Override
	public void setOnlinetestEntryId(long onlinetestEntryId) {
		_vnmOnlintestReportEntry.setOnlinetestEntryId(onlinetestEntryId);
	}

	/**
	* Returns the question entry ID of this vnm onlintest report entry.
	*
	* @return the question entry ID of this vnm onlintest report entry
	*/
	@Override
	public long getQuestionEntryId() {
		return _vnmOnlintestReportEntry.getQuestionEntryId();
	}

	/**
	* Sets the question entry ID of this vnm onlintest report entry.
	*
	* @param questionEntryId the question entry ID of this vnm onlintest report entry
	*/
	@Override
	public void setQuestionEntryId(long questionEntryId) {
		_vnmOnlintestReportEntry.setQuestionEntryId(questionEntryId);
	}

	/**
	* Returns the correct time of this vnm onlintest report entry.
	*
	* @return the correct time of this vnm onlintest report entry
	*/
	@Override
	public int getCorrectTime() {
		return _vnmOnlintestReportEntry.getCorrectTime();
	}

	/**
	* Sets the correct time of this vnm onlintest report entry.
	*
	* @param correctTime the correct time of this vnm onlintest report entry
	*/
	@Override
	public void setCorrectTime(int correctTime) {
		_vnmOnlintestReportEntry.setCorrectTime(correctTime);
	}

	/**
	* Returns the wrong time of this vnm onlintest report entry.
	*
	* @return the wrong time of this vnm onlintest report entry
	*/
	@Override
	public int getWrongTime() {
		return _vnmOnlintestReportEntry.getWrongTime();
	}

	/**
	* Sets the wrong time of this vnm onlintest report entry.
	*
	* @param wrongTime the wrong time of this vnm onlintest report entry
	*/
	@Override
	public void setWrongTime(int wrongTime) {
		_vnmOnlintestReportEntry.setWrongTime(wrongTime);
	}

	@Override
	public boolean isNew() {
		return _vnmOnlintestReportEntry.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_vnmOnlintestReportEntry.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _vnmOnlintestReportEntry.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vnmOnlintestReportEntry.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _vnmOnlintestReportEntry.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _vnmOnlintestReportEntry.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_vnmOnlintestReportEntry.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _vnmOnlintestReportEntry.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_vnmOnlintestReportEntry.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_vnmOnlintestReportEntry.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_vnmOnlintestReportEntry.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new VnmOnlintestReportEntryWrapper((VnmOnlintestReportEntry)_vnmOnlintestReportEntry.clone());
	}

	@Override
	public int compareTo(
		com.vietnamobile.model.VnmOnlintestReportEntry vnmOnlintestReportEntry) {
		return _vnmOnlintestReportEntry.compareTo(vnmOnlintestReportEntry);
	}

	@Override
	public int hashCode() {
		return _vnmOnlintestReportEntry.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.vietnamobile.model.VnmOnlintestReportEntry> toCacheModel() {
		return _vnmOnlintestReportEntry.toCacheModel();
	}

	@Override
	public com.vietnamobile.model.VnmOnlintestReportEntry toEscapedModel() {
		return new VnmOnlintestReportEntryWrapper(_vnmOnlintestReportEntry.toEscapedModel());
	}

	@Override
	public com.vietnamobile.model.VnmOnlintestReportEntry toUnescapedModel() {
		return new VnmOnlintestReportEntryWrapper(_vnmOnlintestReportEntry.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _vnmOnlintestReportEntry.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vnmOnlintestReportEntry.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_vnmOnlintestReportEntry.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VnmOnlintestReportEntryWrapper)) {
			return false;
		}

		VnmOnlintestReportEntryWrapper vnmOnlintestReportEntryWrapper = (VnmOnlintestReportEntryWrapper)obj;

		if (Validator.equals(_vnmOnlintestReportEntry,
					vnmOnlintestReportEntryWrapper._vnmOnlintestReportEntry)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public VnmOnlintestReportEntry getWrappedVnmOnlintestReportEntry() {
		return _vnmOnlintestReportEntry;
	}

	@Override
	public VnmOnlintestReportEntry getWrappedModel() {
		return _vnmOnlintestReportEntry;
	}

	@Override
	public void resetOriginalValues() {
		_vnmOnlintestReportEntry.resetOriginalValues();
	}

	private VnmOnlintestReportEntry _vnmOnlintestReportEntry;
}