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
 * This class is a wrapper for {@link OnlinetestEntry}.
 * </p>
 *
 * @author duymb
 * @see OnlinetestEntry
 * @generated
 */
public class OnlinetestEntryWrapper implements OnlinetestEntry,
	ModelWrapper<OnlinetestEntry> {
	public OnlinetestEntryWrapper(OnlinetestEntry onlinetestEntry) {
		_onlinetestEntry = onlinetestEntry;
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

	/**
	* Returns the primary key of this onlinetest entry.
	*
	* @return the primary key of this onlinetest entry
	*/
	@Override
	public long getPrimaryKey() {
		return _onlinetestEntry.getPrimaryKey();
	}

	/**
	* Sets the primary key of this onlinetest entry.
	*
	* @param primaryKey the primary key of this onlinetest entry
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_onlinetestEntry.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the onlinetest entry ID of this onlinetest entry.
	*
	* @return the onlinetest entry ID of this onlinetest entry
	*/
	@Override
	public long getOnlinetestEntryId() {
		return _onlinetestEntry.getOnlinetestEntryId();
	}

	/**
	* Sets the onlinetest entry ID of this onlinetest entry.
	*
	* @param onlinetestEntryId the onlinetest entry ID of this onlinetest entry
	*/
	@Override
	public void setOnlinetestEntryId(long onlinetestEntryId) {
		_onlinetestEntry.setOnlinetestEntryId(onlinetestEntryId);
	}

	/**
	* Returns the group ID of this onlinetest entry.
	*
	* @return the group ID of this onlinetest entry
	*/
	@Override
	public long getGroupId() {
		return _onlinetestEntry.getGroupId();
	}

	/**
	* Sets the group ID of this onlinetest entry.
	*
	* @param groupId the group ID of this onlinetest entry
	*/
	@Override
	public void setGroupId(long groupId) {
		_onlinetestEntry.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this onlinetest entry.
	*
	* @return the company ID of this onlinetest entry
	*/
	@Override
	public long getCompanyId() {
		return _onlinetestEntry.getCompanyId();
	}

	/**
	* Sets the company ID of this onlinetest entry.
	*
	* @param companyId the company ID of this onlinetest entry
	*/
	@Override
	public void setCompanyId(long companyId) {
		_onlinetestEntry.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this onlinetest entry.
	*
	* @return the user ID of this onlinetest entry
	*/
	@Override
	public long getUserId() {
		return _onlinetestEntry.getUserId();
	}

	/**
	* Sets the user ID of this onlinetest entry.
	*
	* @param userId the user ID of this onlinetest entry
	*/
	@Override
	public void setUserId(long userId) {
		_onlinetestEntry.setUserId(userId);
	}

	/**
	* Returns the user uuid of this onlinetest entry.
	*
	* @return the user uuid of this onlinetest entry
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _onlinetestEntry.getUserUuid();
	}

	/**
	* Sets the user uuid of this onlinetest entry.
	*
	* @param userUuid the user uuid of this onlinetest entry
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_onlinetestEntry.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this onlinetest entry.
	*
	* @return the user name of this onlinetest entry
	*/
	@Override
	public java.lang.String getUserName() {
		return _onlinetestEntry.getUserName();
	}

	/**
	* Sets the user name of this onlinetest entry.
	*
	* @param userName the user name of this onlinetest entry
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_onlinetestEntry.setUserName(userName);
	}

	/**
	* Returns the create date of this onlinetest entry.
	*
	* @return the create date of this onlinetest entry
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _onlinetestEntry.getCreateDate();
	}

	/**
	* Sets the create date of this onlinetest entry.
	*
	* @param createDate the create date of this onlinetest entry
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_onlinetestEntry.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this onlinetest entry.
	*
	* @return the modified date of this onlinetest entry
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _onlinetestEntry.getModifiedDate();
	}

	/**
	* Sets the modified date of this onlinetest entry.
	*
	* @param modifiedDate the modified date of this onlinetest entry
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_onlinetestEntry.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the question ID of this onlinetest entry.
	*
	* @return the question ID of this onlinetest entry
	*/
	@Override
	public java.lang.String getQuestionId() {
		return _onlinetestEntry.getQuestionId();
	}

	/**
	* Sets the question ID of this onlinetest entry.
	*
	* @param questionId the question ID of this onlinetest entry
	*/
	@Override
	public void setQuestionId(java.lang.String questionId) {
		_onlinetestEntry.setQuestionId(questionId);
	}

	/**
	* Returns the test start time of this onlinetest entry.
	*
	* @return the test start time of this onlinetest entry
	*/
	@Override
	public java.util.Date getTestStartTime() {
		return _onlinetestEntry.getTestStartTime();
	}

	/**
	* Sets the test start time of this onlinetest entry.
	*
	* @param testStartTime the test start time of this onlinetest entry
	*/
	@Override
	public void setTestStartTime(java.util.Date testStartTime) {
		_onlinetestEntry.setTestStartTime(testStartTime);
	}

	/**
	* Returns the test end time of this onlinetest entry.
	*
	* @return the test end time of this onlinetest entry
	*/
	@Override
	public java.util.Date getTestEndTime() {
		return _onlinetestEntry.getTestEndTime();
	}

	/**
	* Sets the test end time of this onlinetest entry.
	*
	* @param testEndTime the test end time of this onlinetest entry
	*/
	@Override
	public void setTestEndTime(java.util.Date testEndTime) {
		_onlinetestEntry.setTestEndTime(testEndTime);
	}

	/**
	* Returns the duration of this onlinetest entry.
	*
	* @return the duration of this onlinetest entry
	*/
	@Override
	public int getDuration() {
		return _onlinetestEntry.getDuration();
	}

	/**
	* Sets the duration of this onlinetest entry.
	*
	* @param duration the duration of this onlinetest entry
	*/
	@Override
	public void setDuration(int duration) {
		_onlinetestEntry.setDuration(duration);
	}

	/**
	* Returns the number of questions of this onlinetest entry.
	*
	* @return the number of questions of this onlinetest entry
	*/
	@Override
	public int getNumberOfQuestions() {
		return _onlinetestEntry.getNumberOfQuestions();
	}

	/**
	* Sets the number of questions of this onlinetest entry.
	*
	* @param numberOfQuestions the number of questions of this onlinetest entry
	*/
	@Override
	public void setNumberOfQuestions(int numberOfQuestions) {
		_onlinetestEntry.setNumberOfQuestions(numberOfQuestions);
	}

	/**
	* Returns the title of this onlinetest entry.
	*
	* @return the title of this onlinetest entry
	*/
	@Override
	public java.lang.String getTitle() {
		return _onlinetestEntry.getTitle();
	}

	/**
	* Sets the title of this onlinetest entry.
	*
	* @param title the title of this onlinetest entry
	*/
	@Override
	public void setTitle(java.lang.String title) {
		_onlinetestEntry.setTitle(title);
	}

	/**
	* Returns the point of this onlinetest entry.
	*
	* @return the point of this onlinetest entry
	*/
	@Override
	public int getPoint() {
		return _onlinetestEntry.getPoint();
	}

	/**
	* Sets the point of this onlinetest entry.
	*
	* @param point the point of this onlinetest entry
	*/
	@Override
	public void setPoint(int point) {
		_onlinetestEntry.setPoint(point);
	}

	/**
	* Returns the status of this onlinetest entry.
	*
	* @return the status of this onlinetest entry
	*/
	@Override
	public int getStatus() {
		return _onlinetestEntry.getStatus();
	}

	/**
	* Sets the status of this onlinetest entry.
	*
	* @param status the status of this onlinetest entry
	*/
	@Override
	public void setStatus(int status) {
		_onlinetestEntry.setStatus(status);
	}

	@Override
	public boolean isNew() {
		return _onlinetestEntry.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_onlinetestEntry.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _onlinetestEntry.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_onlinetestEntry.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _onlinetestEntry.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _onlinetestEntry.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_onlinetestEntry.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _onlinetestEntry.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_onlinetestEntry.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_onlinetestEntry.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_onlinetestEntry.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new OnlinetestEntryWrapper((OnlinetestEntry)_onlinetestEntry.clone());
	}

	@Override
	public int compareTo(com.vietnamobile.model.OnlinetestEntry onlinetestEntry) {
		return _onlinetestEntry.compareTo(onlinetestEntry);
	}

	@Override
	public int hashCode() {
		return _onlinetestEntry.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.vietnamobile.model.OnlinetestEntry> toCacheModel() {
		return _onlinetestEntry.toCacheModel();
	}

	@Override
	public com.vietnamobile.model.OnlinetestEntry toEscapedModel() {
		return new OnlinetestEntryWrapper(_onlinetestEntry.toEscapedModel());
	}

	@Override
	public com.vietnamobile.model.OnlinetestEntry toUnescapedModel() {
		return new OnlinetestEntryWrapper(_onlinetestEntry.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _onlinetestEntry.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _onlinetestEntry.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_onlinetestEntry.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof OnlinetestEntryWrapper)) {
			return false;
		}

		OnlinetestEntryWrapper onlinetestEntryWrapper = (OnlinetestEntryWrapper)obj;

		if (Validator.equals(_onlinetestEntry,
					onlinetestEntryWrapper._onlinetestEntry)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public OnlinetestEntry getWrappedOnlinetestEntry() {
		return _onlinetestEntry;
	}

	@Override
	public OnlinetestEntry getWrappedModel() {
		return _onlinetestEntry;
	}

	@Override
	public void resetOriginalValues() {
		_onlinetestEntry.resetOriginalValues();
	}

	private OnlinetestEntry _onlinetestEntry;
}