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
 * This class is used by SOAP remote services, specifically {@link com.vietnamobile.service.http.VnmArticleReportEntryServiceSoap}.
 *
 * @author duymb
 * @see com.vietnamobile.service.http.VnmArticleReportEntryServiceSoap
 * @generated
 */
public class VnmArticleReportEntrySoap implements Serializable {
	public static VnmArticleReportEntrySoap toSoapModel(
		VnmArticleReportEntry model) {
		VnmArticleReportEntrySoap soapModel = new VnmArticleReportEntrySoap();

		soapModel.setVnmArticleReportEntryId(model.getVnmArticleReportEntryId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setArticleId(model.getArticleId());
		soapModel.setVersion(model.getVersion());
		soapModel.setTitle(model.getTitle());
		soapModel.setAction(model.getAction());
		soapModel.setStatus(model.getStatus());

		return soapModel;
	}

	public static VnmArticleReportEntrySoap[] toSoapModels(
		VnmArticleReportEntry[] models) {
		VnmArticleReportEntrySoap[] soapModels = new VnmArticleReportEntrySoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static VnmArticleReportEntrySoap[][] toSoapModels(
		VnmArticleReportEntry[][] models) {
		VnmArticleReportEntrySoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new VnmArticleReportEntrySoap[models.length][models[0].length];
		}
		else {
			soapModels = new VnmArticleReportEntrySoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static VnmArticleReportEntrySoap[] toSoapModels(
		List<VnmArticleReportEntry> models) {
		List<VnmArticleReportEntrySoap> soapModels = new ArrayList<VnmArticleReportEntrySoap>(models.size());

		for (VnmArticleReportEntry model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new VnmArticleReportEntrySoap[soapModels.size()]);
	}

	public VnmArticleReportEntrySoap() {
	}

	public long getPrimaryKey() {
		return _vnmArticleReportEntryId;
	}

	public void setPrimaryKey(long pk) {
		setVnmArticleReportEntryId(pk);
	}

	public long getVnmArticleReportEntryId() {
		return _vnmArticleReportEntryId;
	}

	public void setVnmArticleReportEntryId(long vnmArticleReportEntryId) {
		_vnmArticleReportEntryId = vnmArticleReportEntryId;
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

	public String getArticleId() {
		return _articleId;
	}

	public void setArticleId(String articleId) {
		_articleId = articleId;
	}

	public double getVersion() {
		return _version;
	}

	public void setVersion(double version) {
		_version = version;
	}

	public String getTitle() {
		return _title;
	}

	public void setTitle(String title) {
		_title = title;
	}

	public String getAction() {
		return _action;
	}

	public void setAction(String action) {
		_action = action;
	}

	public int getStatus() {
		return _status;
	}

	public void setStatus(int status) {
		_status = status;
	}

	private long _vnmArticleReportEntryId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _articleId;
	private double _version;
	private String _title;
	private String _action;
	private int _status;
}