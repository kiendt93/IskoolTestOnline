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

import com.vietnamobile.model.VnmArticleReportEntry;

/**
 * The persistence interface for the vnm article report entry service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author duymb
 * @see VnmArticleReportEntryPersistenceImpl
 * @see VnmArticleReportEntryUtil
 * @generated
 */
public interface VnmArticleReportEntryPersistence extends BasePersistence<VnmArticleReportEntry> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VnmArticleReportEntryUtil} to access the vnm article report entry persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the vnm article report entry in the entity cache if it is enabled.
	*
	* @param vnmArticleReportEntry the vnm article report entry
	*/
	public void cacheResult(
		com.vietnamobile.model.VnmArticleReportEntry vnmArticleReportEntry);

	/**
	* Caches the vnm article report entries in the entity cache if it is enabled.
	*
	* @param vnmArticleReportEntries the vnm article report entries
	*/
	public void cacheResult(
		java.util.List<com.vietnamobile.model.VnmArticleReportEntry> vnmArticleReportEntries);

	/**
	* Creates a new vnm article report entry with the primary key. Does not add the vnm article report entry to the database.
	*
	* @param vnmArticleReportEntryId the primary key for the new vnm article report entry
	* @return the new vnm article report entry
	*/
	public com.vietnamobile.model.VnmArticleReportEntry create(
		long vnmArticleReportEntryId);

	/**
	* Removes the vnm article report entry with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param vnmArticleReportEntryId the primary key of the vnm article report entry
	* @return the vnm article report entry that was removed
	* @throws com.vietnamobile.NoSuchVnmArticleReportEntryException if a vnm article report entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vietnamobile.model.VnmArticleReportEntry remove(
		long vnmArticleReportEntryId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vietnamobile.NoSuchVnmArticleReportEntryException;

	public com.vietnamobile.model.VnmArticleReportEntry updateImpl(
		com.vietnamobile.model.VnmArticleReportEntry vnmArticleReportEntry)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the vnm article report entry with the primary key or throws a {@link com.vietnamobile.NoSuchVnmArticleReportEntryException} if it could not be found.
	*
	* @param vnmArticleReportEntryId the primary key of the vnm article report entry
	* @return the vnm article report entry
	* @throws com.vietnamobile.NoSuchVnmArticleReportEntryException if a vnm article report entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vietnamobile.model.VnmArticleReportEntry findByPrimaryKey(
		long vnmArticleReportEntryId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vietnamobile.NoSuchVnmArticleReportEntryException;

	/**
	* Returns the vnm article report entry with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param vnmArticleReportEntryId the primary key of the vnm article report entry
	* @return the vnm article report entry, or <code>null</code> if a vnm article report entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vietnamobile.model.VnmArticleReportEntry fetchByPrimaryKey(
		long vnmArticleReportEntryId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the vnm article report entries.
	*
	* @return the vnm article report entries
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vietnamobile.model.VnmArticleReportEntry> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.vietnamobile.model.VnmArticleReportEntry> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the vnm article report entries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vietnamobile.model.impl.VnmArticleReportEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vnm article report entries
	* @param end the upper bound of the range of vnm article report entries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vnm article report entries
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vietnamobile.model.VnmArticleReportEntry> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the vnm article report entries from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of vnm article report entries.
	*
	* @return the number of vnm article report entries
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}