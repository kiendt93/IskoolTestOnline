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
 * Provides the local service utility for QuestionEntry. This utility wraps
 * {@link com.vietnamobile.service.impl.QuestionEntryLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author duymb
 * @see QuestionEntryLocalService
 * @see com.vietnamobile.service.base.QuestionEntryLocalServiceBaseImpl
 * @see com.vietnamobile.service.impl.QuestionEntryLocalServiceImpl
 * @generated
 */
public class QuestionEntryLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.vietnamobile.service.impl.QuestionEntryLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the question entry to the database. Also notifies the appropriate model listeners.
	*
	* @param questionEntry the question entry
	* @return the question entry that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.vietnamobile.model.QuestionEntry addQuestionEntry(
		com.vietnamobile.model.QuestionEntry questionEntry)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addQuestionEntry(questionEntry);
	}

	/**
	* Creates a new question entry with the primary key. Does not add the question entry to the database.
	*
	* @param questionEntryId the primary key for the new question entry
	* @return the new question entry
	*/
	public static com.vietnamobile.model.QuestionEntry createQuestionEntry(
		long questionEntryId) {
		return getService().createQuestionEntry(questionEntryId);
	}

	/**
	* Deletes the question entry with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param questionEntryId the primary key of the question entry
	* @return the question entry that was removed
	* @throws PortalException if a question entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vietnamobile.model.QuestionEntry deleteQuestionEntry(
		long questionEntryId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteQuestionEntry(questionEntryId);
	}

	/**
	* Deletes the question entry from the database. Also notifies the appropriate model listeners.
	*
	* @param questionEntry the question entry
	* @return the question entry that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.vietnamobile.model.QuestionEntry deleteQuestionEntry(
		com.vietnamobile.model.QuestionEntry questionEntry)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteQuestionEntry(questionEntry);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vietnamobile.model.impl.QuestionEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vietnamobile.model.impl.QuestionEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static com.vietnamobile.model.QuestionEntry fetchQuestionEntry(
		long questionEntryId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchQuestionEntry(questionEntryId);
	}

	/**
	* Returns the question entry with the primary key.
	*
	* @param questionEntryId the primary key of the question entry
	* @return the question entry
	* @throws PortalException if a question entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vietnamobile.model.QuestionEntry getQuestionEntry(
		long questionEntryId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getQuestionEntry(questionEntryId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
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
	public static java.util.List<com.vietnamobile.model.QuestionEntry> getQuestionEntries(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getQuestionEntries(start, end);
	}

	/**
	* Returns the number of question entries.
	*
	* @return the number of question entries
	* @throws SystemException if a system exception occurred
	*/
	public static int getQuestionEntriesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getQuestionEntriesCount();
	}

	/**
	* Updates the question entry in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param questionEntry the question entry
	* @return the question entry that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.vietnamobile.model.QuestionEntry updateQuestionEntry(
		com.vietnamobile.model.QuestionEntry questionEntry)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateQuestionEntry(questionEntry);
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

	public static com.vietnamobile.model.QuestionEntry createQuestionEntry(
		long userId, java.lang.String title, java.lang.String subject,
		java.lang.String questionContent, java.lang.String solutionA,
		java.lang.String solutionB, java.lang.String solutionC,
		java.lang.String solutionD, double level, java.lang.String answer,
		double score, com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .createQuestionEntry(userId, title, subject,
			questionContent, solutionA, solutionB, solutionC, solutionD, level,
			answer, score, serviceContext);
	}

	public static com.vietnamobile.model.QuestionEntry updateQuestionEntry(
		long questionEntryId, long userId, java.lang.String title,
		java.lang.String subject, java.lang.String questionContent,
		java.lang.String solutionA, java.lang.String solutionB,
		java.lang.String solutionC, java.lang.String solutionD, double level,
		java.lang.String answer, double score,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateQuestionEntry(questionEntryId, userId, title,
			subject, questionContent, solutionA, solutionB, solutionC,
			solutionD, level, answer, score, serviceContext);
	}

	public static com.vietnamobile.model.QuestionEntry softDeleteQuestionEntry(
		long userId, long questionEntryId,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .softDeleteQuestionEntry(userId, questionEntryId,
			serviceContext);
	}

	public static java.util.List<com.vietnamobile.model.QuestionEntry> searchQuestioEntry(
		long userId, java.lang.String subject, java.lang.String content,
		double level, boolean andSearch)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .searchQuestioEntry(userId, subject, content, level,
			andSearch);
	}

	public static java.util.List<com.vietnamobile.model.QuestionEntry> searchQuestioEntry(
		long userId, java.lang.String title, java.lang.String subject,
		java.lang.String content, double level, boolean andSearch)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .searchQuestioEntry(userId, title, subject, content, level,
			andSearch);
	}

	public static void clearService() {
		_service = null;
	}

	public static QuestionEntryLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					QuestionEntryLocalService.class.getName());

			if (invokableLocalService instanceof QuestionEntryLocalService) {
				_service = (QuestionEntryLocalService)invokableLocalService;
			}
			else {
				_service = new QuestionEntryLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(QuestionEntryLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(QuestionEntryLocalService service) {
	}

	private static QuestionEntryLocalService _service;
}