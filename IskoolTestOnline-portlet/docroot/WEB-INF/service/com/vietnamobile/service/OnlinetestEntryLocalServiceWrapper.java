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
 * Provides a wrapper for {@link OnlinetestEntryLocalService}.
 *
 * @author duymb
 * @see OnlinetestEntryLocalService
 * @generated
 */
public class OnlinetestEntryLocalServiceWrapper
	implements OnlinetestEntryLocalService,
		ServiceWrapper<OnlinetestEntryLocalService> {
	public OnlinetestEntryLocalServiceWrapper(
		OnlinetestEntryLocalService onlinetestEntryLocalService) {
		_onlinetestEntryLocalService = onlinetestEntryLocalService;
	}

	/**
	* Adds the onlinetest entry to the database. Also notifies the appropriate model listeners.
	*
	* @param onlinetestEntry the onlinetest entry
	* @return the onlinetest entry that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.vietnamobile.model.OnlinetestEntry addOnlinetestEntry(
		com.vietnamobile.model.OnlinetestEntry onlinetestEntry)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _onlinetestEntryLocalService.addOnlinetestEntry(onlinetestEntry);
	}

	/**
	* Creates a new onlinetest entry with the primary key. Does not add the onlinetest entry to the database.
	*
	* @param onlinetestEntryId the primary key for the new onlinetest entry
	* @return the new onlinetest entry
	*/
	@Override
	public com.vietnamobile.model.OnlinetestEntry createOnlinetestEntry(
		long onlinetestEntryId) {
		return _onlinetestEntryLocalService.createOnlinetestEntry(onlinetestEntryId);
	}

	/**
	* Deletes the onlinetest entry with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param onlinetestEntryId the primary key of the onlinetest entry
	* @return the onlinetest entry that was removed
	* @throws PortalException if a onlinetest entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.vietnamobile.model.OnlinetestEntry deleteOnlinetestEntry(
		long onlinetestEntryId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _onlinetestEntryLocalService.deleteOnlinetestEntry(onlinetestEntryId);
	}

	/**
	* Deletes the onlinetest entry from the database. Also notifies the appropriate model listeners.
	*
	* @param onlinetestEntry the onlinetest entry
	* @return the onlinetest entry that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.vietnamobile.model.OnlinetestEntry deleteOnlinetestEntry(
		com.vietnamobile.model.OnlinetestEntry onlinetestEntry)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _onlinetestEntryLocalService.deleteOnlinetestEntry(onlinetestEntry);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _onlinetestEntryLocalService.dynamicQuery();
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
		return _onlinetestEntryLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vietnamobile.model.impl.OnlinetestEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _onlinetestEntryLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vietnamobile.model.impl.OnlinetestEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _onlinetestEntryLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
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
		return _onlinetestEntryLocalService.dynamicQueryCount(dynamicQuery);
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
		return _onlinetestEntryLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.vietnamobile.model.OnlinetestEntry fetchOnlinetestEntry(
		long onlinetestEntryId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _onlinetestEntryLocalService.fetchOnlinetestEntry(onlinetestEntryId);
	}

	/**
	* Returns the onlinetest entry with the primary key.
	*
	* @param onlinetestEntryId the primary key of the onlinetest entry
	* @return the onlinetest entry
	* @throws PortalException if a onlinetest entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.vietnamobile.model.OnlinetestEntry getOnlinetestEntry(
		long onlinetestEntryId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _onlinetestEntryLocalService.getOnlinetestEntry(onlinetestEntryId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _onlinetestEntryLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the onlinetest entries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vietnamobile.model.impl.OnlinetestEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of onlinetest entries
	* @param end the upper bound of the range of onlinetest entries (not inclusive)
	* @return the range of onlinetest entries
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.vietnamobile.model.OnlinetestEntry> getOnlinetestEntries(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _onlinetestEntryLocalService.getOnlinetestEntries(start, end);
	}

	/**
	* Returns the number of onlinetest entries.
	*
	* @return the number of onlinetest entries
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getOnlinetestEntriesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _onlinetestEntryLocalService.getOnlinetestEntriesCount();
	}

	/**
	* Updates the onlinetest entry in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param onlinetestEntry the onlinetest entry
	* @return the onlinetest entry that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.vietnamobile.model.OnlinetestEntry updateOnlinetestEntry(
		com.vietnamobile.model.OnlinetestEntry onlinetestEntry)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _onlinetestEntryLocalService.updateOnlinetestEntry(onlinetestEntry);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _onlinetestEntryLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_onlinetestEntryLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _onlinetestEntryLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public com.vietnamobile.model.OnlinetestEntry createOnlinetestEntry(
		long userId, int numberOfQuestions,
		java.util.ArrayList<java.lang.String> subject,
		java.util.ArrayList<java.lang.Integer> percentOfHighLevel,
		java.util.ArrayList<java.lang.Integer> percentOfNormalLevel,
		java.util.ArrayList<java.lang.Integer> percentOfEasyLevel,
		java.util.ArrayList<java.lang.Integer> specialNumberOfQuestion,
		java.util.Date testStartTime, java.util.Date testEndTime, int duration,
		java.lang.String title,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _onlinetestEntryLocalService.createOnlinetestEntry(userId,
			numberOfQuestions, subject, percentOfHighLevel,
			percentOfNormalLevel, percentOfEasyLevel, specialNumberOfQuestion,
			testStartTime, testEndTime, duration, title, serviceContext);
	}

	@Override
	public com.vietnamobile.model.OnlinetestEntry createOnlinetestEntry(
		long userId, java.util.ArrayList<java.lang.String> subject,
		java.util.ArrayList<java.lang.Integer> specialNumberOfQuestion,
		java.util.Date testStartTime, java.util.Date testEndTime, int duration,
		java.lang.String title, int point,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _onlinetestEntryLocalService.createOnlinetestEntry(userId,
			subject, specialNumberOfQuestion, testStartTime, testEndTime,
			duration, title, point, serviceContext);
	}

	@Override
	public com.vietnamobile.model.OnlinetestEntry updateOnlinetestEntry(
		long userId, long onlinetestEntryId, java.lang.String questionIds,
		int numberOfQuestions, java.lang.String title,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _onlinetestEntryLocalService.updateOnlinetestEntry(userId,
			onlinetestEntryId, questionIds, numberOfQuestions, title,
			serviceContext);
	}

	@Override
	public com.vietnamobile.model.OnlinetestEntry softDeleteOnlineTestEntry(
		long userId, long onlineTestEntryId,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _onlinetestEntryLocalService.softDeleteOnlineTestEntry(userId,
			onlineTestEntryId, serviceContext);
	}

	@Override
	public java.util.List<com.vietnamobile.model.OnlinetestEntry> getAllOnlinetests()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _onlinetestEntryLocalService.getAllOnlinetests();
	}

	@Override
	public java.lang.String createQuestionLists(
		java.util.ArrayList<java.lang.String> subject,
		java.util.ArrayList<java.lang.Integer> specialNumberOfQuestion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _onlinetestEntryLocalService.createQuestionLists(subject,
			specialNumberOfQuestion);
	}

	@Override
	public java.lang.String createQuestionLists(int numberOfQuestion,
		java.util.ArrayList<java.lang.String> subject,
		java.util.ArrayList<java.lang.Integer> percentOfHighLevel,
		java.util.ArrayList<java.lang.Integer> percentOfNormalLevel,
		java.util.ArrayList<java.lang.Integer> percentOfEasyLevel,
		java.util.ArrayList<java.lang.Integer> specialNumberOfQuestion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _onlinetestEntryLocalService.createQuestionLists(numberOfQuestion,
			subject, percentOfHighLevel, percentOfNormalLevel,
			percentOfEasyLevel, specialNumberOfQuestion);
	}

	@Override
	public java.util.List<com.vietnamobile.model.OnlinetestEntry> searchOnlinetestEntry(
		java.lang.String title, java.lang.String userName,
		java.util.Date fromDate, java.util.Date toDate, boolean andSearch)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _onlinetestEntryLocalService.searchOnlinetestEntry(title,
			userName, fromDate, toDate, andSearch);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public OnlinetestEntryLocalService getWrappedOnlinetestEntryLocalService() {
		return _onlinetestEntryLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedOnlinetestEntryLocalService(
		OnlinetestEntryLocalService onlinetestEntryLocalService) {
		_onlinetestEntryLocalService = onlinetestEntryLocalService;
	}

	@Override
	public OnlinetestEntryLocalService getWrappedService() {
		return _onlinetestEntryLocalService;
	}

	@Override
	public void setWrappedService(
		OnlinetestEntryLocalService onlinetestEntryLocalService) {
		_onlinetestEntryLocalService = onlinetestEntryLocalService;
	}

	private OnlinetestEntryLocalService _onlinetestEntryLocalService;
}