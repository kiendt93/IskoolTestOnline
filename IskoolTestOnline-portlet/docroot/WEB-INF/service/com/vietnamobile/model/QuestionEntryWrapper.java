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
 * This class is a wrapper for {@link QuestionEntry}.
 * </p>
 *
 * @author duymb
 * @see QuestionEntry
 * @generated
 */
public class QuestionEntryWrapper implements QuestionEntry,
	ModelWrapper<QuestionEntry> {
	public QuestionEntryWrapper(QuestionEntry questionEntry) {
		_questionEntry = questionEntry;
	}

	@Override
	public Class<?> getModelClass() {
		return QuestionEntry.class;
	}

	@Override
	public String getModelClassName() {
		return QuestionEntry.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("questionEntryId", getQuestionEntryId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("subject", getSubject());
		attributes.put("levelQuestion", getLevelQuestion());
		attributes.put("answer", getAnswer());
		attributes.put("score", getScore());
		attributes.put("questionContent", getQuestionContent());
		attributes.put("a", getA());
		attributes.put("b", getB());
		attributes.put("c", getC());
		attributes.put("d", getD());
		attributes.put("title", getTitle());
		attributes.put("selection1", getSelection1());
		attributes.put("selection2", getSelection2());
		attributes.put("selection3", getSelection3());
		attributes.put("selection4", getSelection4());
		attributes.put("status", getStatus());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long questionEntryId = (Long)attributes.get("questionEntryId");

		if (questionEntryId != null) {
			setQuestionEntryId(questionEntryId);
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

		String subject = (String)attributes.get("subject");

		if (subject != null) {
			setSubject(subject);
		}

		Double levelQuestion = (Double)attributes.get("levelQuestion");

		if (levelQuestion != null) {
			setLevelQuestion(levelQuestion);
		}

		String answer = (String)attributes.get("answer");

		if (answer != null) {
			setAnswer(answer);
		}

		Double score = (Double)attributes.get("score");

		if (score != null) {
			setScore(score);
		}

		String questionContent = (String)attributes.get("questionContent");

		if (questionContent != null) {
			setQuestionContent(questionContent);
		}

		String a = (String)attributes.get("a");

		if (a != null) {
			setA(a);
		}

		String b = (String)attributes.get("b");

		if (b != null) {
			setB(b);
		}

		String c = (String)attributes.get("c");

		if (c != null) {
			setC(c);
		}

		String d = (String)attributes.get("d");

		if (d != null) {
			setD(d);
		}

		String title = (String)attributes.get("title");

		if (title != null) {
			setTitle(title);
		}

		String selection1 = (String)attributes.get("selection1");

		if (selection1 != null) {
			setSelection1(selection1);
		}

		String selection2 = (String)attributes.get("selection2");

		if (selection2 != null) {
			setSelection2(selection2);
		}

		String selection3 = (String)attributes.get("selection3");

		if (selection3 != null) {
			setSelection3(selection3);
		}

		String selection4 = (String)attributes.get("selection4");

		if (selection4 != null) {
			setSelection4(selection4);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}
	}

	/**
	* Returns the primary key of this question entry.
	*
	* @return the primary key of this question entry
	*/
	@Override
	public long getPrimaryKey() {
		return _questionEntry.getPrimaryKey();
	}

	/**
	* Sets the primary key of this question entry.
	*
	* @param primaryKey the primary key of this question entry
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_questionEntry.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the question entry ID of this question entry.
	*
	* @return the question entry ID of this question entry
	*/
	@Override
	public long getQuestionEntryId() {
		return _questionEntry.getQuestionEntryId();
	}

	/**
	* Sets the question entry ID of this question entry.
	*
	* @param questionEntryId the question entry ID of this question entry
	*/
	@Override
	public void setQuestionEntryId(long questionEntryId) {
		_questionEntry.setQuestionEntryId(questionEntryId);
	}

	/**
	* Returns the group ID of this question entry.
	*
	* @return the group ID of this question entry
	*/
	@Override
	public long getGroupId() {
		return _questionEntry.getGroupId();
	}

	/**
	* Sets the group ID of this question entry.
	*
	* @param groupId the group ID of this question entry
	*/
	@Override
	public void setGroupId(long groupId) {
		_questionEntry.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this question entry.
	*
	* @return the company ID of this question entry
	*/
	@Override
	public long getCompanyId() {
		return _questionEntry.getCompanyId();
	}

	/**
	* Sets the company ID of this question entry.
	*
	* @param companyId the company ID of this question entry
	*/
	@Override
	public void setCompanyId(long companyId) {
		_questionEntry.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this question entry.
	*
	* @return the user ID of this question entry
	*/
	@Override
	public long getUserId() {
		return _questionEntry.getUserId();
	}

	/**
	* Sets the user ID of this question entry.
	*
	* @param userId the user ID of this question entry
	*/
	@Override
	public void setUserId(long userId) {
		_questionEntry.setUserId(userId);
	}

	/**
	* Returns the user uuid of this question entry.
	*
	* @return the user uuid of this question entry
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _questionEntry.getUserUuid();
	}

	/**
	* Sets the user uuid of this question entry.
	*
	* @param userUuid the user uuid of this question entry
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_questionEntry.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this question entry.
	*
	* @return the user name of this question entry
	*/
	@Override
	public java.lang.String getUserName() {
		return _questionEntry.getUserName();
	}

	/**
	* Sets the user name of this question entry.
	*
	* @param userName the user name of this question entry
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_questionEntry.setUserName(userName);
	}

	/**
	* Returns the create date of this question entry.
	*
	* @return the create date of this question entry
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _questionEntry.getCreateDate();
	}

	/**
	* Sets the create date of this question entry.
	*
	* @param createDate the create date of this question entry
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_questionEntry.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this question entry.
	*
	* @return the modified date of this question entry
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _questionEntry.getModifiedDate();
	}

	/**
	* Sets the modified date of this question entry.
	*
	* @param modifiedDate the modified date of this question entry
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_questionEntry.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the subject of this question entry.
	*
	* @return the subject of this question entry
	*/
	@Override
	public java.lang.String getSubject() {
		return _questionEntry.getSubject();
	}

	/**
	* Sets the subject of this question entry.
	*
	* @param subject the subject of this question entry
	*/
	@Override
	public void setSubject(java.lang.String subject) {
		_questionEntry.setSubject(subject);
	}

	/**
	* Returns the level question of this question entry.
	*
	* @return the level question of this question entry
	*/
	@Override
	public double getLevelQuestion() {
		return _questionEntry.getLevelQuestion();
	}

	/**
	* Sets the level question of this question entry.
	*
	* @param levelQuestion the level question of this question entry
	*/
	@Override
	public void setLevelQuestion(double levelQuestion) {
		_questionEntry.setLevelQuestion(levelQuestion);
	}

	/**
	* Returns the answer of this question entry.
	*
	* @return the answer of this question entry
	*/
	@Override
	public java.lang.String getAnswer() {
		return _questionEntry.getAnswer();
	}

	/**
	* Sets the answer of this question entry.
	*
	* @param answer the answer of this question entry
	*/
	@Override
	public void setAnswer(java.lang.String answer) {
		_questionEntry.setAnswer(answer);
	}

	/**
	* Returns the score of this question entry.
	*
	* @return the score of this question entry
	*/
	@Override
	public double getScore() {
		return _questionEntry.getScore();
	}

	/**
	* Sets the score of this question entry.
	*
	* @param score the score of this question entry
	*/
	@Override
	public void setScore(double score) {
		_questionEntry.setScore(score);
	}

	/**
	* Returns the question content of this question entry.
	*
	* @return the question content of this question entry
	*/
	@Override
	public java.lang.String getQuestionContent() {
		return _questionEntry.getQuestionContent();
	}

	/**
	* Sets the question content of this question entry.
	*
	* @param questionContent the question content of this question entry
	*/
	@Override
	public void setQuestionContent(java.lang.String questionContent) {
		_questionEntry.setQuestionContent(questionContent);
	}

	/**
	* Returns the a of this question entry.
	*
	* @return the a of this question entry
	*/
	@Override
	public java.lang.String getA() {
		return _questionEntry.getA();
	}

	/**
	* Sets the a of this question entry.
	*
	* @param a the a of this question entry
	*/
	@Override
	public void setA(java.lang.String a) {
		_questionEntry.setA(a);
	}

	/**
	* Returns the b of this question entry.
	*
	* @return the b of this question entry
	*/
	@Override
	public java.lang.String getB() {
		return _questionEntry.getB();
	}

	/**
	* Sets the b of this question entry.
	*
	* @param b the b of this question entry
	*/
	@Override
	public void setB(java.lang.String b) {
		_questionEntry.setB(b);
	}

	/**
	* Returns the c of this question entry.
	*
	* @return the c of this question entry
	*/
	@Override
	public java.lang.String getC() {
		return _questionEntry.getC();
	}

	/**
	* Sets the c of this question entry.
	*
	* @param c the c of this question entry
	*/
	@Override
	public void setC(java.lang.String c) {
		_questionEntry.setC(c);
	}

	/**
	* Returns the d of this question entry.
	*
	* @return the d of this question entry
	*/
	@Override
	public java.lang.String getD() {
		return _questionEntry.getD();
	}

	/**
	* Sets the d of this question entry.
	*
	* @param d the d of this question entry
	*/
	@Override
	public void setD(java.lang.String d) {
		_questionEntry.setD(d);
	}

	/**
	* Returns the title of this question entry.
	*
	* @return the title of this question entry
	*/
	@Override
	public java.lang.String getTitle() {
		return _questionEntry.getTitle();
	}

	/**
	* Sets the title of this question entry.
	*
	* @param title the title of this question entry
	*/
	@Override
	public void setTitle(java.lang.String title) {
		_questionEntry.setTitle(title);
	}

	/**
	* Returns the selection1 of this question entry.
	*
	* @return the selection1 of this question entry
	*/
	@Override
	public java.lang.String getSelection1() {
		return _questionEntry.getSelection1();
	}

	/**
	* Sets the selection1 of this question entry.
	*
	* @param selection1 the selection1 of this question entry
	*/
	@Override
	public void setSelection1(java.lang.String selection1) {
		_questionEntry.setSelection1(selection1);
	}

	/**
	* Returns the selection2 of this question entry.
	*
	* @return the selection2 of this question entry
	*/
	@Override
	public java.lang.String getSelection2() {
		return _questionEntry.getSelection2();
	}

	/**
	* Sets the selection2 of this question entry.
	*
	* @param selection2 the selection2 of this question entry
	*/
	@Override
	public void setSelection2(java.lang.String selection2) {
		_questionEntry.setSelection2(selection2);
	}

	/**
	* Returns the selection3 of this question entry.
	*
	* @return the selection3 of this question entry
	*/
	@Override
	public java.lang.String getSelection3() {
		return _questionEntry.getSelection3();
	}

	/**
	* Sets the selection3 of this question entry.
	*
	* @param selection3 the selection3 of this question entry
	*/
	@Override
	public void setSelection3(java.lang.String selection3) {
		_questionEntry.setSelection3(selection3);
	}

	/**
	* Returns the selection4 of this question entry.
	*
	* @return the selection4 of this question entry
	*/
	@Override
	public java.lang.String getSelection4() {
		return _questionEntry.getSelection4();
	}

	/**
	* Sets the selection4 of this question entry.
	*
	* @param selection4 the selection4 of this question entry
	*/
	@Override
	public void setSelection4(java.lang.String selection4) {
		_questionEntry.setSelection4(selection4);
	}

	/**
	* Returns the status of this question entry.
	*
	* @return the status of this question entry
	*/
	@Override
	public int getStatus() {
		return _questionEntry.getStatus();
	}

	/**
	* Sets the status of this question entry.
	*
	* @param status the status of this question entry
	*/
	@Override
	public void setStatus(int status) {
		_questionEntry.setStatus(status);
	}

	@Override
	public boolean isNew() {
		return _questionEntry.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_questionEntry.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _questionEntry.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_questionEntry.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _questionEntry.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _questionEntry.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_questionEntry.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _questionEntry.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_questionEntry.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_questionEntry.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_questionEntry.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new QuestionEntryWrapper((QuestionEntry)_questionEntry.clone());
	}

	@Override
	public int compareTo(com.vietnamobile.model.QuestionEntry questionEntry) {
		return _questionEntry.compareTo(questionEntry);
	}

	@Override
	public int hashCode() {
		return _questionEntry.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.vietnamobile.model.QuestionEntry> toCacheModel() {
		return _questionEntry.toCacheModel();
	}

	@Override
	public com.vietnamobile.model.QuestionEntry toEscapedModel() {
		return new QuestionEntryWrapper(_questionEntry.toEscapedModel());
	}

	@Override
	public com.vietnamobile.model.QuestionEntry toUnescapedModel() {
		return new QuestionEntryWrapper(_questionEntry.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _questionEntry.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _questionEntry.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_questionEntry.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof QuestionEntryWrapper)) {
			return false;
		}

		QuestionEntryWrapper questionEntryWrapper = (QuestionEntryWrapper)obj;

		if (Validator.equals(_questionEntry, questionEntryWrapper._questionEntry)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public QuestionEntry getWrappedQuestionEntry() {
		return _questionEntry;
	}

	@Override
	public QuestionEntry getWrappedModel() {
		return _questionEntry;
	}

	@Override
	public void resetOriginalValues() {
		_questionEntry.resetOriginalValues();
	}

	private QuestionEntry _questionEntry;
}