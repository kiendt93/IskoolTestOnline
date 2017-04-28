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
 * Provides a wrapper for {@link VnmArticleReportEntryLocalService}.
 *
 * @author duymb
 * @see VnmArticleReportEntryLocalService
 * @generated
 */
public class VnmArticleReportEntryLocalServiceWrapper
	implements VnmArticleReportEntryLocalService,
		ServiceWrapper<VnmArticleReportEntryLocalService> {
	public VnmArticleReportEntryLocalServiceWrapper(
		VnmArticleReportEntryLocalService vnmArticleReportEntryLocalService) {
		_vnmArticleReportEntryLocalService = vnmArticleReportEntryLocalService;
	}

	/**
	* Adds the vnm article report entry to the database. Also notifies the appropriate model listeners.
	*
	* @param vnmArticleReportEntry the vnm article report entry
	* @return the vnm article report entry that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.vietnamobile.model.VnmArticleReportEntry addVnmArticleReportEntry(
		com.vietnamobile.model.VnmArticleReportEntry vnmArticleReportEntry)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vnmArticleReportEntryLocalService.addVnmArticleReportEntry(vnmArticleReportEntry);
	}

	/**
	* Creates a new vnm article report entry with the primary key. Does not add the vnm article report entry to the database.
	*
	* @param vnmArticleReportEntryId the primary key for the new vnm article report entry
	* @return the new vnm article report entry
	*/
	@Override
	public com.vietnamobile.model.VnmArticleReportEntry createVnmArticleReportEntry(
		long vnmArticleReportEntryId) {
		return _vnmArticleReportEntryLocalService.createVnmArticleReportEntry(vnmArticleReportEntryId);
	}

	/**
	* Deletes the vnm article report entry with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param vnmArticleReportEntryId the primary key of the vnm article report entry
	* @return the vnm article report entry that was removed
	* @throws PortalException if a vnm article report entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.vietnamobile.model.VnmArticleReportEntry deleteVnmArticleReportEntry(
		long vnmArticleReportEntryId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vnmArticleReportEntryLocalService.deleteVnmArticleReportEntry(vnmArticleReportEntryId);
	}

	/**
	* Deletes the vnm article report entry from the database. Also notifies the appropriate model listeners.
	*
	* @param vnmArticleReportEntry the vnm article report entry
	* @return the vnm article report entry that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.vietnamobile.model.VnmArticleReportEntry deleteVnmArticleReportEntry(
		com.vietnamobile.model.VnmArticleReportEntry vnmArticleReportEntry)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vnmArticleReportEntryLocalService.deleteVnmArticleReportEntry(vnmArticleReportEntry);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _vnmArticleReportEntryLocalService.dynamicQuery();
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
		return _vnmArticleReportEntryLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vietnamobile.model.impl.VnmArticleReportEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vnmArticleReportEntryLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vietnamobile.model.impl.VnmArticleReportEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vnmArticleReportEntryLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
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
		return _vnmArticleReportEntryLocalService.dynamicQueryCount(dynamicQuery);
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
		return _vnmArticleReportEntryLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.vietnamobile.model.VnmArticleReportEntry fetchVnmArticleReportEntry(
		long vnmArticleReportEntryId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vnmArticleReportEntryLocalService.fetchVnmArticleReportEntry(vnmArticleReportEntryId);
	}

	/**
	* Returns the vnm article report entry with the primary key.
	*
	* @param vnmArticleReportEntryId the primary key of the vnm article report entry
	* @return the vnm article report entry
	* @throws PortalException if a vnm article report entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.vietnamobile.model.VnmArticleReportEntry getVnmArticleReportEntry(
		long vnmArticleReportEntryId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vnmArticleReportEntryLocalService.getVnmArticleReportEntry(vnmArticleReportEntryId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vnmArticleReportEntryLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the vnm article report entries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vietnamobile.model.impl.VnmArticleReportEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vnm article report entries
	* @param end the upper bound of the range of vnm article report entries (not inclusive)
	* @return the range of vnm article report entries
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.vietnamobile.model.VnmArticleReportEntry> getVnmArticleReportEntries(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vnmArticleReportEntryLocalService.getVnmArticleReportEntries(start,
			end);
	}

	/**
	* Returns the number of vnm article report entries.
	*
	* @return the number of vnm article report entries
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getVnmArticleReportEntriesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vnmArticleReportEntryLocalService.getVnmArticleReportEntriesCount();
	}

	/**
	* Updates the vnm article report entry in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vnmArticleReportEntry the vnm article report entry
	* @return the vnm article report entry that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.vietnamobile.model.VnmArticleReportEntry updateVnmArticleReportEntry(
		com.vietnamobile.model.VnmArticleReportEntry vnmArticleReportEntry)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vnmArticleReportEntryLocalService.updateVnmArticleReportEntry(vnmArticleReportEntry);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _vnmArticleReportEntryLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_vnmArticleReportEntryLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _vnmArticleReportEntryLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	@Override
	public void saveLogVnmArticleModify(long userId,
		java.lang.String articleId, java.lang.String title, double version,
		java.lang.String action, int status)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_vnmArticleReportEntryLocalService.saveLogVnmArticleModify(userId,
			articleId, title, version, action, status);
	}

	@Override
	public java.util.List<com.vietnamobile.model.VnmArticleReportEntry> searchLogArticle(
		java.lang.String title, java.lang.String userName,
		java.lang.String action, int status, java.util.Date fromDate,
		java.util.Date toDate, boolean andSearch)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vnmArticleReportEntryLocalService.searchLogArticle(title,
			userName, action, status, fromDate, toDate, andSearch);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public VnmArticleReportEntryLocalService getWrappedVnmArticleReportEntryLocalService() {
		return _vnmArticleReportEntryLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedVnmArticleReportEntryLocalService(
		VnmArticleReportEntryLocalService vnmArticleReportEntryLocalService) {
		_vnmArticleReportEntryLocalService = vnmArticleReportEntryLocalService;
	}

	@Override
	public VnmArticleReportEntryLocalService getWrappedService() {
		return _vnmArticleReportEntryLocalService;
	}

	@Override
	public void setWrappedService(
		VnmArticleReportEntryLocalService vnmArticleReportEntryLocalService) {
		_vnmArticleReportEntryLocalService = vnmArticleReportEntryLocalService;
	}

	private VnmArticleReportEntryLocalService _vnmArticleReportEntryLocalService;
}