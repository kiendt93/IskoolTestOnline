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
 * This class is used by SOAP remote services, specifically {@link com.vietnamobile.service.http.QuestionEntryServiceSoap}.
 *
 * @author duymb
 * @see com.vietnamobile.service.http.QuestionEntryServiceSoap
 * @generated
 */
public class QuestionEntrySoap implements Serializable {
	public static QuestionEntrySoap toSoapModel(QuestionEntry model) {
		QuestionEntrySoap soapModel = new QuestionEntrySoap();

		soapModel.setQuestionEntryId(model.getQuestionEntryId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setSubject(model.getSubject());
		soapModel.setLevelQuestion(model.getLevelQuestion());
		soapModel.setAnswer(model.getAnswer());
		soapModel.setScore(model.getScore());
		soapModel.setQuestionContent(model.getQuestionContent());
		soapModel.setA(model.getA());
		soapModel.setB(model.getB());
		soapModel.setC(model.getC());
		soapModel.setD(model.getD());
		soapModel.setTitle(model.getTitle());
		soapModel.setSelection1(model.getSelection1());
		soapModel.setSelection2(model.getSelection2());
		soapModel.setSelection3(model.getSelection3());
		soapModel.setSelection4(model.getSelection4());
		soapModel.setStatus(model.getStatus());

		return soapModel;
	}

	public static QuestionEntrySoap[] toSoapModels(QuestionEntry[] models) {
		QuestionEntrySoap[] soapModels = new QuestionEntrySoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static QuestionEntrySoap[][] toSoapModels(QuestionEntry[][] models) {
		QuestionEntrySoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new QuestionEntrySoap[models.length][models[0].length];
		}
		else {
			soapModels = new QuestionEntrySoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static QuestionEntrySoap[] toSoapModels(List<QuestionEntry> models) {
		List<QuestionEntrySoap> soapModels = new ArrayList<QuestionEntrySoap>(models.size());

		for (QuestionEntry model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new QuestionEntrySoap[soapModels.size()]);
	}

	public QuestionEntrySoap() {
	}

	public long getPrimaryKey() {
		return _questionEntryId;
	}

	public void setPrimaryKey(long pk) {
		setQuestionEntryId(pk);
	}

	public long getQuestionEntryId() {
		return _questionEntryId;
	}

	public void setQuestionEntryId(long questionEntryId) {
		_questionEntryId = questionEntryId;
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

	public String getSubject() {
		return _subject;
	}

	public void setSubject(String subject) {
		_subject = subject;
	}

	public double getLevelQuestion() {
		return _levelQuestion;
	}

	public void setLevelQuestion(double levelQuestion) {
		_levelQuestion = levelQuestion;
	}

	public String getAnswer() {
		return _answer;
	}

	public void setAnswer(String answer) {
		_answer = answer;
	}

	public double getScore() {
		return _score;
	}

	public void setScore(double score) {
		_score = score;
	}

	public String getQuestionContent() {
		return _questionContent;
	}

	public void setQuestionContent(String questionContent) {
		_questionContent = questionContent;
	}

	public String getA() {
		return _a;
	}

	public void setA(String a) {
		_a = a;
	}

	public String getB() {
		return _b;
	}

	public void setB(String b) {
		_b = b;
	}

	public String getC() {
		return _c;
	}

	public void setC(String c) {
		_c = c;
	}

	public String getD() {
		return _d;
	}

	public void setD(String d) {
		_d = d;
	}

	public String getTitle() {
		return _title;
	}

	public void setTitle(String title) {
		_title = title;
	}

	public String getSelection1() {
		return _selection1;
	}

	public void setSelection1(String selection1) {
		_selection1 = selection1;
	}

	public String getSelection2() {
		return _selection2;
	}

	public void setSelection2(String selection2) {
		_selection2 = selection2;
	}

	public String getSelection3() {
		return _selection3;
	}

	public void setSelection3(String selection3) {
		_selection3 = selection3;
	}

	public String getSelection4() {
		return _selection4;
	}

	public void setSelection4(String selection4) {
		_selection4 = selection4;
	}

	public int getStatus() {
		return _status;
	}

	public void setStatus(int status) {
		_status = status;
	}

	private long _questionEntryId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _subject;
	private double _levelQuestion;
	private String _answer;
	private double _score;
	private String _questionContent;
	private String _a;
	private String _b;
	private String _c;
	private String _d;
	private String _title;
	private String _selection1;
	private String _selection2;
	private String _selection3;
	private String _selection4;
	private int _status;
}