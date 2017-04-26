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
 * This class is a wrapper for {@link OnlinetestResultEntry}.
 * </p>
 *
 * @author duymb
 * @see OnlinetestResultEntry
 * @generated
 */
public class OnlinetestResultEntryWrapper implements OnlinetestResultEntry,
	ModelWrapper<OnlinetestResultEntry> {
	public OnlinetestResultEntryWrapper(
		OnlinetestResultEntry onlinetestResultEntry) {
		_onlinetestResultEntry = onlinetestResultEntry;
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

	/**
	* Returns the primary key of this onlinetest result entry.
	*
	* @return the primary key of this onlinetest result entry
	*/
	@Override
	public long getPrimaryKey() {
		return _onlinetestResultEntry.getPrimaryKey();
	}

	/**
	* Sets the primary key of this onlinetest result entry.
	*
	* @param primaryKey the primary key of this onlinetest result entry
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_onlinetestResultEntry.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the onlinetest result entry ID of this onlinetest result entry.
	*
	* @return the onlinetest result entry ID of this onlinetest result entry
	*/
	@Override
	public long getOnlinetestResultEntryId() {
		return _onlinetestResultEntry.getOnlinetestResultEntryId();
	}

	/**
	* Sets the onlinetest result entry ID of this onlinetest result entry.
	*
	* @param onlinetestResultEntryId the onlinetest result entry ID of this onlinetest result entry
	*/
	@Override
	public void setOnlinetestResultEntryId(long onlinetestResultEntryId) {
		_onlinetestResultEntry.setOnlinetestResultEntryId(onlinetestResultEntryId);
	}

	/**
	* Returns the group ID of this onlinetest result entry.
	*
	* @return the group ID of this onlinetest result entry
	*/
	@Override
	public long getGroupId() {
		return _onlinetestResultEntry.getGroupId();
	}

	/**
	* Sets the group ID of this onlinetest result entry.
	*
	* @param groupId the group ID of this onlinetest result entry
	*/
	@Override
	public void setGroupId(long groupId) {
		_onlinetestResultEntry.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this onlinetest result entry.
	*
	* @return the company ID of this onlinetest result entry
	*/
	@Override
	public long getCompanyId() {
		return _onlinetestResultEntry.getCompanyId();
	}

	/**
	* Sets the company ID of this onlinetest result entry.
	*
	* @param companyId the company ID of this onlinetest result entry
	*/
	@Override
	public void setCompanyId(long companyId) {
		_onlinetestResultEntry.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this onlinetest result entry.
	*
	* @return the user ID of this onlinetest result entry
	*/
	@Override
	public long getUserId() {
		return _onlinetestResultEntry.getUserId();
	}

	/**
	* Sets the user ID of this onlinetest result entry.
	*
	* @param userId the user ID of this onlinetest result entry
	*/
	@Override
	public void setUserId(long userId) {
		_onlinetestResultEntry.setUserId(userId);
	}

	/**
	* Returns the user uuid of this onlinetest result entry.
	*
	* @return the user uuid of this onlinetest result entry
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _onlinetestResultEntry.getUserUuid();
	}

	/**
	* Sets the user uuid of this onlinetest result entry.
	*
	* @param userUuid the user uuid of this onlinetest result entry
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_onlinetestResultEntry.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this onlinetest result entry.
	*
	* @return the user name of this onlinetest result entry
	*/
	@Override
	public java.lang.String getUserName() {
		return _onlinetestResultEntry.getUserName();
	}

	/**
	* Sets the user name of this onlinetest result entry.
	*
	* @param userName the user name of this onlinetest result entry
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_onlinetestResultEntry.setUserName(userName);
	}

	/**
	* Returns the create date of this onlinetest result entry.
	*
	* @return the create date of this onlinetest result entry
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _onlinetestResultEntry.getCreateDate();
	}

	/**
	* Sets the create date of this onlinetest result entry.
	*
	* @param createDate the create date of this onlinetest result entry
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_onlinetestResultEntry.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this onlinetest result entry.
	*
	* @return the modified date of this onlinetest result entry
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _onlinetestResultEntry.getModifiedDate();
	}

	/**
	* Sets the modified date of this onlinetest result entry.
	*
	* @param modifiedDate the modified date of this onlinetest result entry
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_onlinetestResultEntry.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the online test entry ID of this onlinetest result entry.
	*
	* @return the online test entry ID of this onlinetest result entry
	*/
	@Override
	public long getOnlineTestEntryId() {
		return _onlinetestResultEntry.getOnlineTestEntryId();
	}

	/**
	* Sets the online test entry ID of this onlinetest result entry.
	*
	* @param onlineTestEntryId the online test entry ID of this onlinetest result entry
	*/
	@Override
	public void setOnlineTestEntryId(long onlineTestEntryId) {
		_onlinetestResultEntry.setOnlineTestEntryId(onlineTestEntryId);
	}

	/**
	* Returns the score of this onlinetest result entry.
	*
	* @return the score of this onlinetest result entry
	*/
	@Override
	public double getScore() {
		return _onlinetestResultEntry.getScore();
	}

	/**
	* Sets the score of this onlinetest result entry.
	*
	* @param score the score of this onlinetest result entry
	*/
	@Override
	public void setScore(double score) {
		_onlinetestResultEntry.setScore(score);
	}

	/**
	* Returns the answer selected of this onlinetest result entry.
	*
	* @return the answer selected of this onlinetest result entry
	*/
	@Override
	public java.lang.String getAnswerSelected() {
		return _onlinetestResultEntry.getAnswerSelected();
	}

	/**
	* Sets the answer selected of this onlinetest result entry.
	*
	* @param answerSelected the answer selected of this onlinetest result entry
	*/
	@Override
	public void setAnswerSelected(java.lang.String answerSelected) {
		_onlinetestResultEntry.setAnswerSelected(answerSelected);
	}

	/**
	* Returns the number of wrong answer of this onlinetest result entry.
	*
	* @return the number of wrong answer of this onlinetest result entry
	*/
	@Override
	public int getNumberOfWrongAnswer() {
		return _onlinetestResultEntry.getNumberOfWrongAnswer();
	}

	/**
	* Sets the number of wrong answer of this onlinetest result entry.
	*
	* @param numberOfWrongAnswer the number of wrong answer of this onlinetest result entry
	*/
	@Override
	public void setNumberOfWrongAnswer(int numberOfWrongAnswer) {
		_onlinetestResultEntry.setNumberOfWrongAnswer(numberOfWrongAnswer);
	}

	/**
	* Returns the time remaining of this onlinetest result entry.
	*
	* @return the time remaining of this onlinetest result entry
	*/
	@Override
	public int getTimeRemaining() {
		return _onlinetestResultEntry.getTimeRemaining();
	}

	/**
	* Sets the time remaining of this onlinetest result entry.
	*
	* @param timeRemaining the time remaining of this onlinetest result entry
	*/
	@Override
	public void setTimeRemaining(int timeRemaining) {
		_onlinetestResultEntry.setTimeRemaining(timeRemaining);
	}

	/**
	* Returns the exam type of this onlinetest result entry.
	*
	* @return the exam type of this onlinetest result entry
	*/
	@Override
	public java.lang.String getExamType() {
		return _onlinetestResultEntry.getExamType();
	}

	/**
	* Sets the exam type of this onlinetest result entry.
	*
	* @param examType the exam type of this onlinetest result entry
	*/
	@Override
	public void setExamType(java.lang.String examType) {
		_onlinetestResultEntry.setExamType(examType);
	}

	/**
	* Returns the question IDs of this onlinetest result entry.
	*
	* @return the question IDs of this onlinetest result entry
	*/
	@Override
	public java.lang.String getQuestionIds() {
		return _onlinetestResultEntry.getQuestionIds();
	}

	/**
	* Sets the question IDs of this onlinetest result entry.
	*
	* @param questionIds the question IDs of this onlinetest result entry
	*/
	@Override
	public void setQuestionIds(java.lang.String questionIds) {
		_onlinetestResultEntry.setQuestionIds(questionIds);
	}

	@Override
	public boolean isNew() {
		return _onlinetestResultEntry.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_onlinetestResultEntry.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _onlinetestResultEntry.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_onlinetestResultEntry.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _onlinetestResultEntry.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _onlinetestResultEntry.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_onlinetestResultEntry.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _onlinetestResultEntry.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_onlinetestResultEntry.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_onlinetestResultEntry.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_onlinetestResultEntry.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new OnlinetestResultEntryWrapper((OnlinetestResultEntry)_onlinetestResultEntry.clone());
	}

	@Override
	public int compareTo(
		com.vietnamobile.model.OnlinetestResultEntry onlinetestResultEntry) {
		return _onlinetestResultEntry.compareTo(onlinetestResultEntry);
	}

	@Override
	public int hashCode() {
		return _onlinetestResultEntry.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.vietnamobile.model.OnlinetestResultEntry> toCacheModel() {
		return _onlinetestResultEntry.toCacheModel();
	}

	@Override
	public com.vietnamobile.model.OnlinetestResultEntry toEscapedModel() {
		return new OnlinetestResultEntryWrapper(_onlinetestResultEntry.toEscapedModel());
	}

	@Override
	public com.vietnamobile.model.OnlinetestResultEntry toUnescapedModel() {
		return new OnlinetestResultEntryWrapper(_onlinetestResultEntry.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _onlinetestResultEntry.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _onlinetestResultEntry.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_onlinetestResultEntry.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof OnlinetestResultEntryWrapper)) {
			return false;
		}

		OnlinetestResultEntryWrapper onlinetestResultEntryWrapper = (OnlinetestResultEntryWrapper)obj;

		if (Validator.equals(_onlinetestResultEntry,
					onlinetestResultEntryWrapper._onlinetestResultEntry)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public OnlinetestResultEntry getWrappedOnlinetestResultEntry() {
		return _onlinetestResultEntry;
	}

	@Override
	public OnlinetestResultEntry getWrappedModel() {
		return _onlinetestResultEntry;
	}

	@Override
	public void resetOriginalValues() {
		_onlinetestResultEntry.resetOriginalValues();
	}

	private OnlinetestResultEntry _onlinetestResultEntry;
}