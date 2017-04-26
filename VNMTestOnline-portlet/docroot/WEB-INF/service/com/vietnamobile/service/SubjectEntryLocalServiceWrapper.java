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

package com.vietnamobile.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SubjectEntryLocalService}.
 *
 * @author duymb
 * @see SubjectEntryLocalService
 * @generated
 */
public class SubjectEntryLocalServiceWrapper implements SubjectEntryLocalService,
	ServiceWrapper<SubjectEntryLocalService> {
	public SubjectEntryLocalServiceWrapper(
		SubjectEntryLocalService subjectEntryLocalService) {
		_subjectEntryLocalService = subjectEntryLocalService;
	}

	/**
	* Adds the subject entry to the database. Also notifies the appropriate model listeners.
	*
	* @param subjectEntry the subject entry
	* @return the subject entry that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.vietnamobile.model.SubjectEntry addSubjectEntry(
		com.vietnamobile.model.SubjectEntry subjectEntry)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _subjectEntryLocalService.addSubjectEntry(subjectEntry);
	}

	/**
	* Creates a new subject entry with the primary key. Does not add the subject entry to the database.
	*
	* @param subjectEntryId the primary key for the new subject entry
	* @return the new subject entry
	*/
	@Override
	public com.vietnamobile.model.SubjectEntry createSubjectEntry(
		long subjectEntryId) {
		return _subjectEntryLocalService.createSubjectEntry(subjectEntryId);
	}

	/**
	* Deletes the subject entry with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param subjectEntryId the primary key of the subject entry
	* @return the subject entry that was removed
	* @throws PortalException if a subject entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.vietnamobile.model.SubjectEntry deleteSubjectEntry(
		long subjectEntryId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _subjectEntryLocalService.deleteSubjectEntry(subjectEntryId);
	}

	/**
	* Deletes the subject entry from the database. Also notifies the appropriate model listeners.
	*
	* @param subjectEntry the subject entry
	* @return the subject entry that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.vietnamobile.model.SubjectEntry deleteSubjectEntry(
		com.vietnamobile.model.SubjectEntry subjectEntry)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _subjectEntryLocalService.deleteSubjectEntry(subjectEntry);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _subjectEntryLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _subjectEntryLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vietnamobile.model.impl.SubjectEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _subjectEntryLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vietnamobile.model.impl.SubjectEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _subjectEntryLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _subjectEntryLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _subjectEntryLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.vietnamobile.model.SubjectEntry fetchSubjectEntry(
		long subjectEntryId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _subjectEntryLocalService.fetchSubjectEntry(subjectEntryId);
	}

	/**
	* Returns the subject entry with the primary key.
	*
	* @param subjectEntryId the primary key of the subject entry
	* @return the subject entry
	* @throws PortalException if a subject entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.vietnamobile.model.SubjectEntry getSubjectEntry(
		long subjectEntryId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _subjectEntryLocalService.getSubjectEntry(subjectEntryId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _subjectEntryLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the subject entries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vietnamobile.model.impl.SubjectEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of subject entries
	* @param end the upper bound of the range of subject entries (not inclusive)
	* @return the range of subject entries
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.vietnamobile.model.SubjectEntry> getSubjectEntries(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _subjectEntryLocalService.getSubjectEntries(start, end);
	}

	/**
	* Returns the number of subject entries.
	*
	* @return the number of subject entries
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getSubjectEntriesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _subjectEntryLocalService.getSubjectEntriesCount();
	}

	/**
	* Updates the subject entry in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param subjectEntry the subject entry
	* @return the subject entry that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.vietnamobile.model.SubjectEntry updateSubjectEntry(
		com.vietnamobile.model.SubjectEntry subjectEntry)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _subjectEntryLocalService.updateSubjectEntry(subjectEntry);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _subjectEntryLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_subjectEntryLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _subjectEntryLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public com.vietnamobile.model.SubjectEntry createSubjectEntry(long userId,
		java.lang.String course, java.lang.String subject,
		java.lang.String description, java.lang.String examType,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _subjectEntryLocalService.createSubjectEntry(userId, course,
			subject, description, examType, serviceContext);
	}

	@Override
	public com.vietnamobile.model.SubjectEntry updateSubjectEntry(long userId,
		long subjectEntryId, java.lang.String course, java.lang.String subject,
		java.lang.String description, java.lang.String examType,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _subjectEntryLocalService.updateSubjectEntry(userId,
			subjectEntryId, course, subject, description, examType,
			serviceContext);
	}

	@Override
	public com.vietnamobile.model.SubjectEntry softDeleteSubjectEntry(
		long userId, long subjectEntryId,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _subjectEntryLocalService.softDeleteSubjectEntry(userId,
			subjectEntryId, serviceContext);
	}

	@Override
	public java.util.List<com.vietnamobile.model.SubjectEntry> getAllSubjects()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _subjectEntryLocalService.getAllSubjects();
	}

	@Override
	public java.util.List<com.vietnamobile.model.SubjectEntry> findBySubjectKey(
		long userId, java.lang.String subject, java.lang.String examType,
		java.lang.String description, boolean andSearch)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _subjectEntryLocalService.findBySubjectKey(userId, subject,
			examType, description, andSearch);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public SubjectEntryLocalService getWrappedSubjectEntryLocalService() {
		return _subjectEntryLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedSubjectEntryLocalService(
		SubjectEntryLocalService subjectEntryLocalService) {
		_subjectEntryLocalService = subjectEntryLocalService;
	}

	@Override
	public SubjectEntryLocalService getWrappedService() {
		return _subjectEntryLocalService;
	}

	@Override
	public void setWrappedService(
		SubjectEntryLocalService subjectEntryLocalService) {
		_subjectEntryLocalService = subjectEntryLocalService;
	}

	private SubjectEntryLocalService _subjectEntryLocalService;
}