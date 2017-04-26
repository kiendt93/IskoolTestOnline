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

package com.vietnamobile.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.vietnamobile.model.QuestionEntry;

import java.util.List;

/**
 * The persistence utility for the question entry service. This utility wraps {@link QuestionEntryPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author duymb
 * @see QuestionEntryPersistence
 * @see QuestionEntryPersistenceImpl
 * @generated
 */
public class QuestionEntryUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(QuestionEntry questionEntry) {
		getPersistence().clearCache(questionEntry);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<QuestionEntry> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<QuestionEntry> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<QuestionEntry> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static QuestionEntry update(QuestionEntry questionEntry)
		throws SystemException {
		return getPersistence().update(questionEntry);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static QuestionEntry update(QuestionEntry questionEntry,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(questionEntry, serviceContext);
	}

	/**
	* Caches the question entry in the entity cache if it is enabled.
	*
	* @param questionEntry the question entry
	*/
	public static void cacheResult(
		com.vietnamobile.model.QuestionEntry questionEntry) {
		getPersistence().cacheResult(questionEntry);
	}

	/**
	* Caches the question entries in the entity cache if it is enabled.
	*
	* @param questionEntries the question entries
	*/
	public static void cacheResult(
		java.util.List<com.vietnamobile.model.QuestionEntry> questionEntries) {
		getPersistence().cacheResult(questionEntries);
	}

	/**
	* Creates a new question entry with the primary key. Does not add the question entry to the database.
	*
	* @param questionEntryId the primary key for the new question entry
	* @return the new question entry
	*/
	public static com.vietnamobile.model.QuestionEntry create(
		long questionEntryId) {
		return getPersistence().create(questionEntryId);
	}

	/**
	* Removes the question entry with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param questionEntryId the primary key of the question entry
	* @return the question entry that was removed
	* @throws com.vietnamobile.NoSuchQuestionEntryException if a question entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vietnamobile.model.QuestionEntry remove(
		long questionEntryId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vietnamobile.NoSuchQuestionEntryException {
		return getPersistence().remove(questionEntryId);
	}

	public static com.vietnamobile.model.QuestionEntry updateImpl(
		com.vietnamobile.model.QuestionEntry questionEntry)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(questionEntry);
	}

	/**
	* Returns the question entry with the primary key or throws a {@link com.vietnamobile.NoSuchQuestionEntryException} if it could not be found.
	*
	* @param questionEntryId the primary key of the question entry
	* @return the question entry
	* @throws com.vietnamobile.NoSuchQuestionEntryException if a question entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vietnamobile.model.QuestionEntry findByPrimaryKey(
		long questionEntryId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vietnamobile.NoSuchQuestionEntryException {
		return getPersistence().findByPrimaryKey(questionEntryId);
	}

	/**
	* Returns the question entry with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param questionEntryId the primary key of the question entry
	* @return the question entry, or <code>null</code> if a question entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vietnamobile.model.QuestionEntry fetchByPrimaryKey(
		long questionEntryId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(questionEntryId);
	}

	/**
	* Returns all the question entries.
	*
	* @return the question entries
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vietnamobile.model.QuestionEntry> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the question entries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vietnamobile.model.impl.QuestionEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of question entries
	* @param end the upper bound of the range of question entries (not inclusive)
	* @return the range of question entries
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vietnamobile.model.QuestionEntry> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the question entries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vietnamobile.model.impl.QuestionEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of question entries
	* @param end the upper bound of the range of question entries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of question entries
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vietnamobile.model.QuestionEntry> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the question entries from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of question entries.
	*
	* @return the number of question entries
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static QuestionEntryPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (QuestionEntryPersistence)PortletBeanLocatorUtil.locate(com.vietnamobile.service.ClpSerializer.getServletContextName(),
					QuestionEntryPersistence.class.getName());

			ReferenceRegistry.registerReference(QuestionEntryUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(QuestionEntryPersistence persistence) {
	}

	private static QuestionEntryPersistence _persistence;
}