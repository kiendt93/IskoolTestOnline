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

import com.liferay.portal.service.persistence.BasePersistence;

import com.vietnamobile.model.OnlinetestResultEntry;

/**
 * The persistence interface for the onlinetest result entry service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author duymb
 * @see OnlinetestResultEntryPersistenceImpl
 * @see OnlinetestResultEntryUtil
 * @generated
 */
public interface OnlinetestResultEntryPersistence extends BasePersistence<OnlinetestResultEntry> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link OnlinetestResultEntryUtil} to access the onlinetest result entry persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the onlinetest result entry in the entity cache if it is enabled.
	*
	* @param onlinetestResultEntry the onlinetest result entry
	*/
	public void cacheResult(
		com.vietnamobile.model.OnlinetestResultEntry onlinetestResultEntry);

	/**
	* Caches the onlinetest result entries in the entity cache if it is enabled.
	*
	* @param onlinetestResultEntries the onlinetest result entries
	*/
	public void cacheResult(
		java.util.List<com.vietnamobile.model.OnlinetestResultEntry> onlinetestResultEntries);

	/**
	* Creates a new onlinetest result entry with the primary key. Does not add the onlinetest result entry to the database.
	*
	* @param onlinetestResultEntryId the primary key for the new onlinetest result entry
	* @return the new onlinetest result entry
	*/
	public com.vietnamobile.model.OnlinetestResultEntry create(
		long onlinetestResultEntryId);

	/**
	* Removes the onlinetest result entry with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param onlinetestResultEntryId the primary key of the onlinetest result entry
	* @return the onlinetest result entry that was removed
	* @throws com.vietnamobile.NoSuchOnlinetestResultEntryException if a onlinetest result entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vietnamobile.model.OnlinetestResultEntry remove(
		long onlinetestResultEntryId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vietnamobile.NoSuchOnlinetestResultEntryException;

	public com.vietnamobile.model.OnlinetestResultEntry updateImpl(
		com.vietnamobile.model.OnlinetestResultEntry onlinetestResultEntry)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the onlinetest result entry with the primary key or throws a {@link com.vietnamobile.NoSuchOnlinetestResultEntryException} if it could not be found.
	*
	* @param onlinetestResultEntryId the primary key of the onlinetest result entry
	* @return the onlinetest result entry
	* @throws com.vietnamobile.NoSuchOnlinetestResultEntryException if a onlinetest result entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vietnamobile.model.OnlinetestResultEntry findByPrimaryKey(
		long onlinetestResultEntryId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vietnamobile.NoSuchOnlinetestResultEntryException;

	/**
	* Returns the onlinetest result entry with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param onlinetestResultEntryId the primary key of the onlinetest result entry
	* @return the onlinetest result entry, or <code>null</code> if a onlinetest result entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vietnamobile.model.OnlinetestResultEntry fetchByPrimaryKey(
		long onlinetestResultEntryId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the onlinetest result entries.
	*
	* @return the onlinetest result entries
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vietnamobile.model.OnlinetestResultEntry> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the onlinetest result entries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vietnamobile.model.impl.OnlinetestResultEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of onlinetest result entries
	* @param end the upper bound of the range of onlinetest result entries (not inclusive)
	* @return the range of onlinetest result entries
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vietnamobile.model.OnlinetestResultEntry> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the onlinetest result entries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vietnamobile.model.impl.OnlinetestResultEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of onlinetest result entries
	* @param end the upper bound of the range of onlinetest result entries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of onlinetest result entries
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vietnamobile.model.OnlinetestResultEntry> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the onlinetest result entries from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of onlinetest result entries.
	*
	* @return the number of onlinetest result entries
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}