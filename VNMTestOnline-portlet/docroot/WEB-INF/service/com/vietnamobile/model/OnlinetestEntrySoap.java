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
 * This class is used by SOAP remote services, specifically {@link com.vietnamobile.service.http.OnlinetestEntryServiceSoap}.
 *
 * @author duymb
 * @see com.vietnamobile.service.http.OnlinetestEntryServiceSoap
 * @generated
 */
public class OnlinetestEntrySoap implements Serializable {
	public static OnlinetestEntrySoap toSoapModel(OnlinetestEntry model) {
		OnlinetestEntrySoap soapModel = new OnlinetestEntrySoap();

		soapModel.setOnlinetestEntryId(model.getOnlinetestEntryId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setQuestionId(model.getQuestionId());
		soapModel.setTestStartTime(model.getTestStartTime());
		soapModel.setTestEndTime(model.getTestEndTime());
		soapModel.setDuration(model.getDuration());
		soapModel.setNumberOfQuestions(model.getNumberOfQuestions());
		soapModel.setTitle(model.getTitle());
		soapModel.setPoint(model.getPoint());
		soapModel.setStatus(model.getStatus());

		return soapModel;
	}

	public static OnlinetestEntrySoap[] toSoapModels(OnlinetestEntry[] models) {
		OnlinetestEntrySoap[] soapModels = new OnlinetestEntrySoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static OnlinetestEntrySoap[][] toSoapModels(
		OnlinetestEntry[][] models) {
		OnlinetestEntrySoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new OnlinetestEntrySoap[models.length][models[0].length];
		}
		else {
			soapModels = new OnlinetestEntrySoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static OnlinetestEntrySoap[] toSoapModels(
		List<OnlinetestEntry> models) {
		List<OnlinetestEntrySoap> soapModels = new ArrayList<OnlinetestEntrySoap>(models.size());

		for (OnlinetestEntry model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new OnlinetestEntrySoap[soapModels.size()]);
	}

	public OnlinetestEntrySoap() {
	}

	public long getPrimaryKey() {
		return _onlinetestEntryId;
	}

	public void setPrimaryKey(long pk) {
		setOnlinetestEntryId(pk);
	}

	public long getOnlinetestEntryId() {
		return _onlinetestEntryId;
	}

	public void setOnlinetestEntryId(long onlinetestEntryId) {
		_onlinetestEntryId = onlinetestEntryId;
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

	public String getQuestionId() {
		return _questionId;
	}

	public void setQuestionId(String questionId) {
		_questionId = questionId;
	}

	public Date getTestStartTime() {
		return _testStartTime;
	}

	public void setTestStartTime(Date testStartTime) {
		_testStartTime = testStartTime;
	}

	public Date getTestEndTime() {
		return _testEndTime;
	}

	public void setTestEndTime(Date testEndTime) {
		_testEndTime = testEndTime;
	}

	public int getDuration() {
		return _duration;
	}

	public void setDuration(int duration) {
		_duration = duration;
	}

	public int getNumberOfQuestions() {
		return _numberOfQuestions;
	}

	public void setNumberOfQuestions(int numberOfQuestions) {
		_numberOfQuestions = numberOfQuestions;
	}

	public String getTitle() {
		return _title;
	}

	public void setTitle(String title) {
		_title = title;
	}

	public int getPoint() {
		return _point;
	}

	public void setPoint(int point) {
		_point = point;
	}

	public int getStatus() {
		return _status;
	}

	public void setStatus(int status) {
		_status = status;
	}

	private long _onlinetestEntryId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _questionId;
	private Date _testStartTime;
	private Date _testEndTime;
	private int _duration;
	private int _numberOfQuestions;
	private String _title;
	private int _point;
	private int _status;
}