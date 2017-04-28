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
 * This class is used by SOAP remote services, specifically {@link com.vietnamobile.service.http.VnmOnlintestReportEntryServiceSoap}.
 *
 * @author duymb
 * @see com.vietnamobile.service.http.VnmOnlintestReportEntryServiceSoap
 * @generated
 */
public class VnmOnlintestReportEntrySoap implements Serializable {
	public static VnmOnlintestReportEntrySoap toSoapModel(
		VnmOnlintestReportEntry model) {
		VnmOnlintestReportEntrySoap soapModel = new VnmOnlintestReportEntrySoap();

		soapModel.setVnmOnlintestReportEntryId(model.getVnmOnlintestReportEntryId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setOnlinetestEntryId(model.getOnlinetestEntryId());
		soapModel.setQuestionEntryId(model.getQuestionEntryId());
		soapModel.setCorrectTime(model.getCorrectTime());
		soapModel.setWrongTime(model.getWrongTime());

		return soapModel;
	}

	public static VnmOnlintestReportEntrySoap[] toSoapModels(
		VnmOnlintestReportEntry[] models) {
		VnmOnlintestReportEntrySoap[] soapModels = new VnmOnlintestReportEntrySoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static VnmOnlintestReportEntrySoap[][] toSoapModels(
		VnmOnlintestReportEntry[][] models) {
		VnmOnlintestReportEntrySoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new VnmOnlintestReportEntrySoap[models.length][models[0].length];
		}
		else {
			soapModels = new VnmOnlintestReportEntrySoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static VnmOnlintestReportEntrySoap[] toSoapModels(
		List<VnmOnlintestReportEntry> models) {
		List<VnmOnlintestReportEntrySoap> soapModels = new ArrayList<VnmOnlintestReportEntrySoap>(models.size());

		for (VnmOnlintestReportEntry model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new VnmOnlintestReportEntrySoap[soapModels.size()]);
	}

	public VnmOnlintestReportEntrySoap() {
	}

	public long getPrimaryKey() {
		return _vnmOnlintestReportEntryId;
	}

	public void setPrimaryKey(long pk) {
		setVnmOnlintestReportEntryId(pk);
	}

	public long getVnmOnlintestReportEntryId() {
		return _vnmOnlintestReportEntryId;
	}

	public void setVnmOnlintestReportEntryId(long vnmOnlintestReportEntryId) {
		_vnmOnlintestReportEntryId = vnmOnlintestReportEntryId;
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

	public long getOnlinetestEntryId() {
		return _onlinetestEntryId;
	}

	public void setOnlinetestEntryId(long onlinetestEntryId) {
		_onlinetestEntryId = onlinetestEntryId;
	}

	public long getQuestionEntryId() {
		return _questionEntryId;
	}

	public void setQuestionEntryId(long questionEntryId) {
		_questionEntryId = questionEntryId;
	}

	public int getCorrectTime() {
		return _correctTime;
	}

	public void setCorrectTime(int correctTime) {
		_correctTime = correctTime;
	}

	public int getWrongTime() {
		return _wrongTime;
	}

	public void setWrongTime(int wrongTime) {
		_wrongTime = wrongTime;
	}

	private long _vnmOnlintestReportEntryId;
	private long _groupId;
	private long _companyId;
	private Date _createDate;
	private Date _modifiedDate;
	private long _onlinetestEntryId;
	private long _questionEntryId;
	private int _correctTime;
	private int _wrongTime;
}