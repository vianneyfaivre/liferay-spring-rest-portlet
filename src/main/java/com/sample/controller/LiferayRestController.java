package com.sample.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.User;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.sample.beans.UserBean;


/**
 * Rest Controller
 *
 * @author Vianney FAIVRE
 */
@RestController
public class LiferayRestController {

	/**
	 * URL to use: http://localhost:8080/liferay-spring-rest-portlet/services/users
	 * 
	 * @return list of users as JSON
	 */
	@RequestMapping(value = "/users", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public List<UserBean> getUsers(HttpServletRequest request) throws SystemException {

		List<UserBean> userBeans = new ArrayList<UserBean>();

		for (User user : UserLocalServiceUtil.getUsers(0, 10)) {
			userBeans.add(new UserBean(user.getFirstName(), user.getLastName(), user.getEmailAddress()));
		}

		return userBeans;
	}

 }
