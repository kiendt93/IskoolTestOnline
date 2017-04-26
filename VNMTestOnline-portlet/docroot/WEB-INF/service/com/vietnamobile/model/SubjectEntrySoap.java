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
 * This class is used by SOAP remote services, specifically {@link com.vietnamobile.service.http.SubjectEntryServiceSoap}.
 *
 * @author duymb
 * @see com.vietnamobile.service.http.SubjectEntryServiceSoap
 * @generated
 */
public class SubjectEntrySoap implements Serializable {
	public static SubjectEntrySoap toSoapModel(SubjectEntry model) {
		SubjectEntrySoap soapModel = new SubjectEntrySoap();

		soapModel.setSubjectEntryId(model.getSubjectEntryId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setCourse(model.getCourse());
		soapModel.setSubject(model.getSubject());
		soapModel.setDescription(model.getDescription());
		soapModel.setExamType(model.getExamType());
		soapModel.setTotalQuestion(model.getTotalQuestion());
		soapModel.setStatus(model.getStatus());

		return soapModel;
	}

	public static SubjectEntrySoap[] toSoapModels(SubjectEntry[] models) {
		SubjectEntrySoap[] soapModels = new SubjectEntrySoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static SubjectEntrySoap[][] toSoapModels(SubjectEntry[][] models) {
		SubjectEntrySoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new SubjectEntrySoap[models.length][models[0].length];
		}
		else {
			soapModels = new SubjectEntrySoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static SubjectEntrySoap[] toSoapModels(List<SubjectEntry> models) {
		List<SubjectEntrySoap> soapModels = new ArrayList<SubjectEntrySoap>(models.size());

		for (SubjectEntry model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new SubjectEntrySoap[soapModels.size()]);
	}

	public SubjectEntrySoap() {
	}

	public long getPrimaryKey() {
		return _subjectEntryId;
	}

	public void setPrimaryKey(long pk) {
		setSubjectEntryId(pk);
	}

	public long getSubjectEntryId() {
		return _subjectEntryId;
	}

	public void setSubjectEntryId(long subjectEntryId) {
		_subjectEntryId = subjectEntryId;
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

	public String getCourse() {
		return _course;
	}

	public void setCourse(String course) {
		_course = course;
	}

	public String getSubject() {
		return _subject;
	}

	public void setSubject(String subject) {
		_subject = subject;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	public String getExamType() {
		return _examType;
	}

	public void setExamType(String examType) {
		_examType = examType;
	}

	public int getTotalQuestion() {
		return _totalQuestion;
	}

	public void setTotalQuestion(int totalQuestion) {
		_totalQuestion = totalQuestion;
	}

	public int getStatus() {
		return _status;
	}

	public void setStatus(int status) {
		_status = status;
	}

	private long _subjectEntryId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _course;
	private String _subject;
	private String _description;
	private String _examType;
	private int _totalQuestion;
	private int _status;
}