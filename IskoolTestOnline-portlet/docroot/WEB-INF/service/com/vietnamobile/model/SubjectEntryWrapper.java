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
 * This class is a wrapper for {@link SubjectEntry}.
 * </p>
 *
 * @author duymb
 * @see SubjectEntry
 * @generated
 */
public class SubjectEntryWrapper implements SubjectEntry,
	ModelWrapper<SubjectEntry> {
	public SubjectEntryWrapper(SubjectEntry subjectEntry) {
		_subjectEntry = subjectEntry;
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

	/**
	* Returns the primary key of this subject entry.
	*
	* @return the primary key of this subject entry
	*/
	@Override
	public long getPrimaryKey() {
		return _subjectEntry.getPrimaryKey();
	}

	/**
	* Sets the primary key of this subject entry.
	*
	* @param primaryKey the primary key of this subject entry
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_subjectEntry.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the subject entry ID of this subject entry.
	*
	* @return the subject entry ID of this subject entry
	*/
	@Override
	public long getSubjectEntryId() {
		return _subjectEntry.getSubjectEntryId();
	}

	/**
	* Sets the subject entry ID of this subject entry.
	*
	* @param subjectEntryId the subject entry ID of this subject entry
	*/
	@Override
	public void setSubjectEntryId(long subjectEntryId) {
		_subjectEntry.setSubjectEntryId(subjectEntryId);
	}

	/**
	* Returns the group ID of this subject entry.
	*
	* @return the group ID of this subject entry
	*/
	@Override
	public long getGroupId() {
		return _subjectEntry.getGroupId();
	}

	/**
	* Sets the group ID of this subject entry.
	*
	* @param groupId the group ID of this subject entry
	*/
	@Override
	public void setGroupId(long groupId) {
		_subjectEntry.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this subject entry.
	*
	* @return the company ID of this subject entry
	*/
	@Override
	public long getCompanyId() {
		return _subjectEntry.getCompanyId();
	}

	/**
	* Sets the company ID of this subject entry.
	*
	* @param companyId the company ID of this subject entry
	*/
	@Override
	public void setCompanyId(long companyId) {
		_subjectEntry.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this subject entry.
	*
	* @return the user ID of this subject entry
	*/
	@Override
	public long getUserId() {
		return _subjectEntry.getUserId();
	}

	/**
	* Sets the user ID of this subject entry.
	*
	* @param userId the user ID of this subject entry
	*/
	@Override
	public void setUserId(long userId) {
		_subjectEntry.setUserId(userId);
	}

	/**
	* Returns the user uuid of this subject entry.
	*
	* @return the user uuid of this subject entry
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _subjectEntry.getUserUuid();
	}

	/**
	* Sets the user uuid of this subject entry.
	*
	* @param userUuid the user uuid of this subject entry
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_subjectEntry.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this subject entry.
	*
	* @return the user name of this subject entry
	*/
	@Override
	public java.lang.String getUserName() {
		return _subjectEntry.getUserName();
	}

	/**
	* Sets the user name of this subject entry.
	*
	* @param userName the user name of this subject entry
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_subjectEntry.setUserName(userName);
	}

	/**
	* Returns the create date of this subject entry.
	*
	* @return the create date of this subject entry
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _subjectEntry.getCreateDate();
	}

	/**
	* Sets the create date of this subject entry.
	*
	* @param createDate the create date of this subject entry
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_subjectEntry.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this subject entry.
	*
	* @return the modified date of this subject entry
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _subjectEntry.getModifiedDate();
	}

	/**
	* Sets the modified date of this subject entry.
	*
	* @param modifiedDate the modified date of this subject entry
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_subjectEntry.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the course of this subject entry.
	*
	* @return the course of this subject entry
	*/
	@Override
	public java.lang.String getCourse() {
		return _subjectEntry.getCourse();
	}

	/**
	* Sets the course of this subject entry.
	*
	* @param course the course of this subject entry
	*/
	@Override
	public void setCourse(java.lang.String course) {
		_subjectEntry.setCourse(course);
	}

	/**
	* Returns the subject of this subject entry.
	*
	* @return the subject of this subject entry
	*/
	@Override
	public java.lang.String getSubject() {
		return _subjectEntry.getSubject();
	}

	/**
	* Sets the subject of this subject entry.
	*
	* @param subject the subject of this subject entry
	*/
	@Override
	public void setSubject(java.lang.String subject) {
		_subjectEntry.setSubject(subject);
	}

	/**
	* Returns the description of this subject entry.
	*
	* @return the description of this subject entry
	*/
	@Override
	public java.lang.String getDescription() {
		return _subjectEntry.getDescription();
	}

	/**
	* Sets the description of this subject entry.
	*
	* @param description the description of this subject entry
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_subjectEntry.setDescription(description);
	}

	/**
	* Returns the exam type of this subject entry.
	*
	* @return the exam type of this subject entry
	*/
	@Override
	public java.lang.String getExamType() {
		return _subjectEntry.getExamType();
	}

	/**
	* Sets the exam type of this subject entry.
	*
	* @param examType the exam type of this subject entry
	*/
	@Override
	public void setExamType(java.lang.String examType) {
		_subjectEntry.setExamType(examType);
	}

	/**
	* Returns the total question of this subject entry.
	*
	* @return the total question of this subject entry
	*/
	@Override
	public int getTotalQuestion() {
		return _subjectEntry.getTotalQuestion();
	}

	/**
	* Sets the total question of this subject entry.
	*
	* @param totalQuestion the total question of this subject entry
	*/
	@Override
	public void setTotalQuestion(int totalQuestion) {
		_subjectEntry.setTotalQuestion(totalQuestion);
	}

	/**
	* Returns the status of this subject entry.
	*
	* @return the status of this subject entry
	*/
	@Override
	public int getStatus() {
		return _subjectEntry.getStatus();
	}

	/**
	* Sets the status of this subject entry.
	*
	* @param status the status of this subject entry
	*/
	@Override
	public void setStatus(int status) {
		_subjectEntry.setStatus(status);
	}

	@Override
	public boolean isNew() {
		return _subjectEntry.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_subjectEntry.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _subjectEntry.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_subjectEntry.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _subjectEntry.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _subjectEntry.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_subjectEntry.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _subjectEntry.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_subjectEntry.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_subjectEntry.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_subjectEntry.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new SubjectEntryWrapper((SubjectEntry)_subjectEntry.clone());
	}

	@Override
	public int compareTo(com.vietnamobile.model.SubjectEntry subjectEntry) {
		return _subjectEntry.compareTo(subjectEntry);
	}

	@Override
	public int hashCode() {
		return _subjectEntry.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.vietnamobile.model.SubjectEntry> toCacheModel() {
		return _subjectEntry.toCacheModel();
	}

	@Override
	public com.vietnamobile.model.SubjectEntry toEscapedModel() {
		return new SubjectEntryWrapper(_subjectEntry.toEscapedModel());
	}

	@Override
	public com.vietnamobile.model.SubjectEntry toUnescapedModel() {
		return new SubjectEntryWrapper(_subjectEntry.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _subjectEntry.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _subjectEntry.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_subjectEntry.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof SubjectEntryWrapper)) {
			return false;
		}

		SubjectEntryWrapper subjectEntryWrapper = (SubjectEntryWrapper)obj;

		if (Validator.equals(_subjectEntry, subjectEntryWrapper._subjectEntry)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public SubjectEntry getWrappedSubjectEntry() {
		return _subjectEntry;
	}

	@Override
	public SubjectEntry getWrappedModel() {
		return _subjectEntry;
	}

	@Override
	public void resetOriginalValues() {
		_subjectEntry.resetOriginalValues();
	}

	private SubjectEntry _subjectEntry;
}