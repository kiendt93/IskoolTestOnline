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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for SubjectEntry. This utility wraps
 * {@link com.vietnamobile.service.impl.SubjectEntryLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author duymb
 * @see SubjectEntryLocalService
 * @see com.vietnamobile.service.base.SubjectEntryLocalServiceBaseImpl
 * @see com.vietnamobile.service.impl.SubjectEntryLocalServiceImpl
 * @generated
 */
public class SubjectEntryLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.vietnamobile.service.impl.SubjectEntryLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the subject entry to the database. Also notifies the appropriate model listeners.
	*
	* @param subjectEntry the subject entry
	* @return the subject entry that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.vietnamobile.model.SubjectEntry addSubjectEntry(
		com.vietnamobile.model.SubjectEntry subjectEntry)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addSubjectEntry(subjectEntry);
	}

	/**
	* Creates a new subject entry with the primary key. Does not add the subject entry to the database.
	*
	* @param subjectEntryId the primary key for the new subject entry
	* @return the new subject entry
	*/
	public static com.vietnamobile.model.SubjectEntry createSubjectEntry(
		long subjectEntryId) {
		return getService().createSubjectEntry(subjectEntryId);
	}

	/**
	* Deletes the subject entry with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param subjectEntryId the primary key of the subject entry
	* @return the subject entry that was removed
	* @throws PortalException if a subject entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vietnamobile.model.SubjectEntry deleteSubjectEntry(
		long subjectEntryId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteSubjectEntry(subjectEntryId);
	}

	/**
	* Deletes the subject entry from the database. Also notifies the appropriate model listeners.
	*
	* @param subjectEntry the subject entry
	* @return the subject entry that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.vietnamobile.model.SubjectEntry deleteSubjectEntry(
		com.vietnamobile.model.SubjectEntry subjectEntry)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteSubjectEntry(subjectEntry);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
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
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
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
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static com.vietnamobile.model.SubjectEntry fetchSubjectEntry(
		long subjectEntryId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchSubjectEntry(subjectEntryId);
	}

	/**
	* Returns the subject entry with the primary key.
	*
	* @param subjectEntryId the primary key of the subject entry
	* @return the subject entry
	* @throws PortalException if a subject entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vietnamobile.model.SubjectEntry getSubjectEntry(
		long subjectEntryId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getSubjectEntry(subjectEntryId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
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
	public static java.util.List<com.vietnamobile.model.SubjectEntry> getSubjectEntries(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getSubjectEntries(start, end);
	}

	/**
	* Returns the number of subject entries.
	*
	* @return the number of subject entries
	* @throws SystemException if a system exception occurred
	*/
	public static int getSubjectEntriesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getSubjectEntriesCount();
	}

	/**
	* Updates the subject entry in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param subjectEntry the subject entry
	* @return the subject entry that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.vietnamobile.model.SubjectEntry updateSubjectEntry(
		com.vietnamobile.model.SubjectEntry subjectEntry)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateSubjectEntry(subjectEntry);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static com.vietnamobile.model.SubjectEntry createSubjectEntry(
		long userId, java.lang.String course, java.lang.String subject,
		java.lang.String description, java.lang.String examType,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .createSubjectEntry(userId, course, subject, description,
			examType, serviceContext);
	}

	public static com.vietnamobile.model.SubjectEntry updateSubjectEntry(
		long userId, long subjectEntryId, java.lang.String course,
		java.lang.String subject, java.lang.String description,
		java.lang.String examType,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateSubjectEntry(userId, subjectEntryId, course, subject,
			description, examType, serviceContext);
	}

	public static com.vietnamobile.model.SubjectEntry softDeleteSubjectEntry(
		long userId, long subjectEntryId,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .softDeleteSubjectEntry(userId, subjectEntryId,
			serviceContext);
	}

	public static java.util.List<com.vietnamobile.model.SubjectEntry> getAllSubjects()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getAllSubjects();
	}

	public static java.util.List<com.vietnamobile.model.SubjectEntry> findBySubjectKey(
		long userId, java.lang.String subject, java.lang.String examType,
		java.lang.String description, boolean andSearch)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findBySubjectKey(userId, subject, examType, description,
			andSearch);
	}

	public static void clearService() {
		_service = null;
	}

	public static SubjectEntryLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					SubjectEntryLocalService.class.getName());

			if (invokableLocalService instanceof SubjectEntryLocalService) {
				_service = (SubjectEntryLocalService)invokableLocalService;
			}
			else {
				_service = new SubjectEntryLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(SubjectEntryLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(SubjectEntryLocalService service) {
	}

	private static SubjectEntryLocalService _service;
}