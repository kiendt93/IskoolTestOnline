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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.vietnamobile.service.http.OnlinetestResultEntryServiceSoap}.
 *
 * @author duymb
 * @see com.vietnamobile.service.http.OnlinetestResultEntryServiceSoap
 * @generated
 */
public class OnlinetestResultEntrySoap implements Serializable {
	public static OnlinetestResultEntrySoap toSoapModel(
		OnlinetestResultEntry model) {
		OnlinetestResultEntrySoap soapModel = new OnlinetestResultEntrySoap();

		soapModel.setOnlinetestResultEntryId(model.getOnlinetestResultEntryId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setOnlineTestEntryId(model.getOnlineTestEntryId());
		soapModel.setScore(model.getScore());
		soapModel.setAnswerSelected(model.getAnswerSelected());
		soapModel.setNumberOfWrongAnswer(model.getNumberOfWrongAnswer());
		soapModel.setTimeRemaining(model.getTimeRemaining());
		soapModel.setExamType(model.getExamType());
		soapModel.setQuestionIds(model.getQuestionIds());

		return soapModel;
	}

	public static OnlinetestResultEntrySoap[] toSoapModels(
		OnlinetestResultEntry[] models) {
		OnlinetestResultEntrySoap[] soapModels = new OnlinetestResultEntrySoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static OnlinetestResultEntrySoap[][] toSoapModels(
		OnlinetestResultEntry[][] models) {
		OnlinetestResultEntrySoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new OnlinetestResultEntrySoap[models.length][models[0].length];
		}
		else {
			soapModels = new OnlinetestResultEntrySoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static OnlinetestResultEntrySoap[] toSoapModels(
		List<OnlinetestResultEntry> models) {
		List<OnlinetestResultEntrySoap> soapModels = new ArrayList<OnlinetestResultEntrySoap>(models.size());

		for (OnlinetestResultEntry model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new OnlinetestResultEntrySoap[soapModels.size()]);
	}

	public OnlinetestResultEntrySoap() {
	}

	public long getPrimaryKey() {
		return _onlinetestResultEntryId;
	}

	public void setPrimaryKey(long pk) {
		setOnlinetestResultEntryId(pk);
	}

	public long getOnlinetestResultEntryId() {
		return _onlinetestResultEntryId;
	}

	public void setOnlinetestResultEntryId(long onlinetestResultEntryId) {
		_onlinetestResultEntryId = onlinetestResultEntryId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public long getOnlineTestEntryId() {
		return _onlineTestEntryId;
	}

	public void setOnlineTestEntryId(long onlineTestEntryId) {
		_onlineTestEntryId = onlineTestEntryId;
	}

	public double getScore() {
		return _score;
	}

	public void setScore(double score) {
		_score = score;
	}

	public String getAnswerSelected() {
		return _answerSelected;
	}

	public void setAnswerSelected(String answerSelected) {
		_answerSelected = answerSelected;
	}

	public int getNumberOfWrongAnswer() {
		return _numberOfWrongAnswer;
	}

	public void setNumberOfWrongAnswer(int numberOfWrongAnswer) {
		_numberOfWrongAnswer = numberOfWrongAnswer;
	}

	public int getTimeRemaining() {
		return _timeRemaining;
	}

	public void setTimeRemaining(int timeRemaining) {
		_timeRemaining = timeRemaining;
	}

	public String getExamType() {
		return _examType;
	}

	public void setExamType(String examType) {
		_examType = examType;
	}

	public String getQuestionIds() {
		return _questionIds;
	}

	public void setQuestionIds(String questionIds) {
		_questionIds = questionIds;
	}

	private long _onlinetestResultEntryId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private long _onlineTestEntryId;
	private double _score;
	private String _answerSelected;
	private int _numberOfWrongAnswer;
	private int _timeRemaining;
	private String _examType;
	private String _questionIds;
}