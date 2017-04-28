create table iskools_OnlinetestEntry (
	onlinetestEntryId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	questionId VARCHAR(75) null,
	testStartTime DATE null,
	testEndTime DATE null,
	duration INTEGER,
	numberOfQuestions INTEGER,
	title VARCHAR(75) null,
	point INTEGER,
	status INTEGER
);

create table iskools_OnlinetestResultEntry (
	onlinetestResultEntryId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	onlineTestEntryId LONG,
	score DOUBLE,
	answerSelected VARCHAR(75) null,
	numberOfWrongAnswer INTEGER,
	timeRemaining INTEGER,
	examType VARCHAR(75) null,
	questionIds VARCHAR(75) null
);

create table iskools_QuestionEntry (
	questionEntryId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	subject VARCHAR(75) null,
	levelQuestion DOUBLE,
	answer VARCHAR(75) null,
	score DOUBLE,
	questionContent STRING null,
	a STRING null,
	b STRING null,
	c STRING null,
	d STRING null,
	title VARCHAR(75) null,
	selection1 VARCHAR(75) null,
	selection2 VARCHAR(75) null,
	selection3 VARCHAR(75) null,
	selection4 VARCHAR(75) null,
	status INTEGER
);

create table iskools_SubjectEntry (
	subjectEntryId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	course VARCHAR(75) null,
	subject VARCHAR(75) null,
	description VARCHAR(75) null,
	examType VARCHAR(75) null,
	totalQuestion INTEGER,
	status INTEGER
);

create table iskools_VnmArticleReportEntry (
	vnmArticleReportEntryId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	articleId VARCHAR(75) null,
	version DOUBLE,
	title VARCHAR(75) null,
	action VARCHAR(75) null,
	status INTEGER
);

create table iskools_VnmOnlintestReportEntry (
	vnmOnlintestReportEntryId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	onlinetestEntryId LONG,
	questionEntryId LONG,
	correctTime INTEGER,
	wrongTime INTEGER
);

create table vnm_OnlinetestEntry (
	onlinetestEntryId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	questionId VARCHAR(75) null,
	testStartTime DATE null,
	testEndTime DATE null,
	duration INTEGER,
	numberOfQuestions INTEGER,
	title VARCHAR(75) null,
	point INTEGER
);

create table vnm_OnlinetestResultEntry (
	onlinetestResultEntryId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	onlineTestEntryId LONG,
	score DOUBLE,
	answerSelected VARCHAR(75) null,
	numberOfWrongAnswer INTEGER,
	timeRemaining INTEGER,
	examType VARCHAR(75) null,
	questionIds VARCHAR(75) null
);

create table vnm_QuestionEntry (
	questionEntryId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	subject VARCHAR(75) null,
	levelQuestion DOUBLE,
	answer VARCHAR(75) null,
	score DOUBLE,
	questionContent VARCHAR(75) null,
	title VARCHAR(75) null,
	selection1 VARCHAR(75) null,
	selection2 VARCHAR(75) null,
	selection3 VARCHAR(75) null,
	selection4 VARCHAR(75) null
);

create table vnm_SubjectEntry (
	subjectEntryId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	subject VARCHAR(75) null,
	description VARCHAR(75) null,
	examType VARCHAR(75) null,
	totalQuestion INTEGER
);

create table vnm_VnmArticleReportEntry (
	vnmArticleReportEntryId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	articleId VARCHAR(75) null,
	version DOUBLE,
	title VARCHAR(75) null,
	action VARCHAR(75) null,
	status INTEGER
);

create table vnm_VnmOnlintestReportEntry (
	vnmOnlintestReportEntryId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	onlinetestEntryId LONG,
	questionEntryId LONG,
	correctTime INTEGER,
	wrongTime INTEGER
);