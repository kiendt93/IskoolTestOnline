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

import com.vietnamobile.model.SubjectEntry;

import java.util.List;

/**
 * The persistence utility for the subject entry service. This utility wraps {@link SubjectEntryPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author duymb
 * @see SubjectEntryPersistence
 * @see SubjectEntryPersistenceImpl
 * @generated
 */
public class SubjectEntryUtil {
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
	public static void clearCache(SubjectEntry subjectEntry) {
		getPersistence().clearCache(subjectEntry);
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
	public static List<SubjectEntry> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<SubjectEntry> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<SubjectEntry> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static SubjectEntry update(SubjectEntry subjectEntry)
		throws SystemException {
		return getPersistence().update(subjectEntry);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static SubjectEntry update(SubjectEntry subjectEntry,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(subjectEntry, serviceContext);
	}

	/**
	* Caches the subject entry in the entity cache if it is enabled.
	*
	* @param subjectEntry the subject entry
	*/
	public static void cacheResult(
		com.vietnamobile.model.SubjectEntry subjectEntry) {
		getPersistence().cacheResult(subjectEntry);
	}

	/**
	* Caches the subject entries in the entity cache if it is enabled.
	*
	* @param subjectEntries the subject entries
	*/
	public static void cacheResult(
		java.util.List<com.vietnamobile.model.SubjectEntry> subjectEntries) {
		getPersistence().cacheResult(subjectEntries);
	}

	/**
	* Creates a new subject entry with the primary key. Does not add the subject entry to the database.
	*
	* @param subjectEntryId the primary key for the new subject entry
	* @return the new subject entry
	*/
	public static com.vietnamobile.model.SubjectEntry create(
		long subjectEntryId) {
		return getPersistence().create(subjectEntryId);
	}

	/**
	* Removes the subject entry with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param subjectEntryId the primary key of the subject entry
	* @return the subject entry that was removed
	* @throws com.vietnamobile.NoSuchSubjectEntryException if a subject entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vietnamobile.model.SubjectEntry remove(
		long subjectEntryId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vietnamobile.NoSuchSubjectEntryException {
		return getPersistence().remove(subjectEntryId);
	}

	public static com.vietnamobile.model.SubjectEntry updateImpl(
		com.vietnamobile.model.SubjectEntry subjectEntry)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(subjectEntry);
	}

	/**
	* Returns the subject entry with the primary key or throws a {@link com.vietnamobile.NoSuchSubjectEntryException} if it could not be found.
	*
	* @param subjectEntryId the primary key of the subject entry
	* @return the subject entry
	* @throws com.vietnamobile.NoSuchSubjectEntryException if a subject entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vietnamobile.model.SubjectEntry findByPrimaryKey(
		long subjectEntryId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vietnamobile.NoSuchSubjectEntryException {
		return getPersistence().findByPrimaryKey(subjectEntryId);
	}

	/**
	* Returns the subject entry with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param subjectEntryId the primary key of the subject entry
	* @return the subject entry, or <code>null</code> if a subject entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vietnamobile.model.SubjectEntry fetchByPrimaryKey(
		long subjectEntryId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(subjectEntryId);
	}

	/**
	* Returns all the subject entries.
	*
	* @return the subject entries
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vietnamobile.model.SubjectEntry> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<com.vietnamobile.model.SubjectEntry> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the subject entries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vietnamobile.model.impl.SubjectEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of subject entries
	* @param end the upper bound of the range of subject entries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of subject entries
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vietnamobile.model.SubjectEntry> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the subject entries from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of subject entries.
	*
	* @return the number of subject entries
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static SubjectEntryPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (SubjectEntryPersistence)PortletBeanLocatorUtil.locate(com.vietnamobile.service.ClpSerializer.getServletContextName(),
					SubjectEntryPersistence.class.getName());

			ReferenceRegistry.registerReference(SubjectEntryUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(SubjectEntryPersistence persistence) {
	}

	private static SubjectEntryPersistence _persistence;
}