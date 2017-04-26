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
 * Provides the local service utility for VnmOnlintestReportEntry. This utility wraps
 * {@link com.vietnamobile.service.impl.VnmOnlintestReportEntryLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author duymb
 * @see VnmOnlintestReportEntryLocalService
 * @see com.vietnamobile.service.base.VnmOnlintestReportEntryLocalServiceBaseImpl
 * @see com.vietnamobile.service.impl.VnmOnlintestReportEntryLocalServiceImpl
 * @generated
 */
public class VnmOnlintestReportEntryLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.vietnamobile.service.impl.VnmOnlintestReportEntryLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the vnm onlintest report entry to the database. Also notifies the appropriate model listeners.
	*
	* @param vnmOnlintestReportEntry the vnm onlintest report entry
	* @return the vnm onlintest report entry that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.vietnamobile.model.VnmOnlintestReportEntry addVnmOnlintestReportEntry(
		com.vietnamobile.model.VnmOnlintestReportEntry vnmOnlintestReportEntry)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addVnmOnlintestReportEntry(vnmOnlintestReportEntry);
	}

	/**
	* Creates a new vnm onlintest report entry with the primary key. Does not add the vnm onlintest report entry to the database.
	*
	* @param vnmOnlintestReportEntryId the primary key for the new vnm onlintest report entry
	* @return the new vnm onlintest report entry
	*/
	public static com.vietnamobile.model.VnmOnlintestReportEntry createVnmOnlintestReportEntry(
		long vnmOnlintestReportEntryId) {
		return getService()
				   .createVnmOnlintestReportEntry(vnmOnlintestReportEntryId);
	}

	/**
	* Deletes the vnm onlintest report entry with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param vnmOnlintestReportEntryId the primary key of the vnm onlintest report entry
	* @return the vnm onlintest report entry that was removed
	* @throws PortalException if a vnm onlintest report entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vietnamobile.model.VnmOnlintestReportEntry deleteVnmOnlintestReportEntry(
		long vnmOnlintestReportEntryId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .deleteVnmOnlintestReportEntry(vnmOnlintestReportEntryId);
	}

	/**
	* Deletes the vnm onlintest report entry from the database. Also notifies the appropriate model listeners.
	*
	* @param vnmOnlintestReportEntry the vnm onlintest report entry
	* @return the vnm onlintest report entry that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.vietnamobile.model.VnmOnlintestReportEntry deleteVnmOnlintestReportEntry(
		com.vietnamobile.model.VnmOnlintestReportEntry vnmOnlintestReportEntry)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .deleteVnmOnlintestReportEntry(vnmOnlintestReportEntry);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vietnamobile.model.impl.VnmOnlintestReportEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vietnamobile.model.impl.VnmOnlintestReportEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static com.vietnamobile.model.VnmOnlintestReportEntry fetchVnmOnlintestReportEntry(
		long vnmOnlintestReportEntryId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .fetchVnmOnlintestReportEntry(vnmOnlintestReportEntryId);
	}

	/**
	* Returns the vnm onlintest report entry with the primary key.
	*
	* @param vnmOnlintestReportEntryId the primary key of the vnm onlintest report entry
	* @return the vnm onlintest report entry
	* @throws PortalException if a vnm onlintest report entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vietnamobile.model.VnmOnlintestReportEntry getVnmOnlintestReportEntry(
		long vnmOnlintestReportEntryId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getVnmOnlintestReportEntry(vnmOnlintestReportEntryId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the vnm onlintest report entries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vietnamobile.model.impl.VnmOnlintestReportEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vnm onlintest report entries
	* @param end the upper bound of the range of vnm onlintest report entries (not inclusive)
	* @return the range of vnm onlintest report entries
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vietnamobile.model.VnmOnlintestReportEntry> getVnmOnlintestReportEntries(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getVnmOnlintestReportEntries(start, end);
	}

	/**
	* Returns the number of vnm onlintest report entries.
	*
	* @return the number of vnm onlintest report entries
	* @throws SystemException if a system exception occurred
	*/
	public static int getVnmOnlintestReportEntriesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getVnmOnlintestReportEntriesCount();
	}

	/**
	* Updates the vnm onlintest report entry in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vnmOnlintestReportEntry the vnm onlintest report entry
	* @return the vnm onlintest report entry that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.vietnamobile.model.VnmOnlintestReportEntry updateVnmOnlintestReportEntry(
		com.vietnamobile.model.VnmOnlintestReportEntry vnmOnlintestReportEntry)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateVnmOnlintestReportEntry(vnmOnlintestReportEntry);
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

	public static void updateOnlineTestReportEntry(long onlineTestEntryId,
		long questionEntryId, int correctAnswer, int wrongAnswer) {
		getService()
			.updateOnlineTestReportEntry(onlineTestEntryId, questionEntryId,
			correctAnswer, wrongAnswer);
	}

	public static java.util.List<com.vietnamobile.model.VnmOnlintestReportEntry> getReportFillterBy(
		long onlinetestEntryId, long questionEntryId, boolean andSearch)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getReportFillterBy(onlinetestEntryId, questionEntryId,
			andSearch);
	}

	public static java.util.List<com.vietnamobile.model.VnmOnlintestReportEntry> getReportFillterBy(
		long onlinetestEntryId, long questionEntryId, java.lang.String company,
		boolean andSearch)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getReportFillterBy(onlinetestEntryId, questionEntryId,
			company, andSearch);
	}

	public static void clearService() {
		_service = null;
	}

	public static VnmOnlintestReportEntryLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					VnmOnlintestReportEntryLocalService.class.getName());

			if (invokableLocalService instanceof VnmOnlintestReportEntryLocalService) {
				_service = (VnmOnlintestReportEntryLocalService)invokableLocalService;
			}
			else {
				_service = new VnmOnlintestReportEntryLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(VnmOnlintestReportEntryLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(VnmOnlintestReportEntryLocalService service) {
	}

	private static VnmOnlintestReportEntryLocalService _service;
}