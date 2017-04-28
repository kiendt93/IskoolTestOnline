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

import com.vietnamobile.model.SubjectEntry;

/**
 * The persistence interface for the subject entry service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author duymb
 * @see SubjectEntryPersistenceImpl
 * @see SubjectEntryUtil
 * @generated
 */
public interface SubjectEntryPersistence extends BasePersistence<SubjectEntry> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SubjectEntryUtil} to access the subject entry persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the subject entry in the entity cache if it is enabled.
	*
	* @param subjectEntry the subject entry
	*/
	public void cacheResult(com.vietnamobile.model.SubjectEntry subjectEntry);

	/**
	* Caches the subject entries in the entity cache if it is enabled.
	*
	* @param subjectEntries the subject entries
	*/
	public void cacheResult(
		java.util.List<com.vietnamobile.model.SubjectEntry> subjectEntries);

	/**
	* Creates a new subject entry with the primary key. Does not add the subject entry to the database.
	*
	* @param subjectEntryId the primary key for the new subject entry
	* @return the new subject entry
	*/
	public com.vietnamobile.model.SubjectEntry create(long subjectEntryId);

	/**
	* Removes the subject entry with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param subjectEntryId the primary key of the subject entry
	* @return the subject entry that was removed
	* @throws com.vietnamobile.NoSuchSubjectEntryException if a subject entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vietnamobile.model.SubjectEntry remove(long subjectEntryId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vietnamobile.NoSuchSubjectEntryException;

	public com.vietnamobile.model.SubjectEntry updateImpl(
		com.vietnamobile.model.SubjectEntry subjectEntry)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the subject entry with the primary key or throws a {@link com.vietnamobile.NoSuchSubjectEntryException} if it could not be found.
	*
	* @param subjectEntryId the primary key of the subject entry
	* @return the subject entry
	* @throws com.vietnamobile.NoSuchSubjectEntryException if a subject entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vietnamobile.model.SubjectEntry findByPrimaryKey(
		long subjectEntryId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vietnamobile.NoSuchSubjectEntryException;

	/**
	* Returns the subject entry with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param subjectEntryId the primary key of the subject entry
	* @return the subject entry, or <code>null</code> if a subject entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vietnamobile.model.SubjectEntry fetchByPrimaryKey(
		long subjectEntryId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the subject entries.
	*
	* @return the subject entries
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vietnamobile.model.SubjectEntry> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.vietnamobile.model.SubjectEntry> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.vietnamobile.model.SubjectEntry> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the subject entries from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of subject entries.
	*
	* @return the number of subject entries
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}