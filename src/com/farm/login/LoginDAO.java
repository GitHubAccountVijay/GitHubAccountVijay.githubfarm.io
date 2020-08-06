package com.farm.login;

import com.farm.user.Register;
import com.farm.user.UserDao;

public class LoginDAO {
	public Register loginSelect(String email, String password)
	{
		UserDao userDao = new UserDao();
		Register selectUserDaoDetails = userDao.selectUserDaoDetails(email);
		System.out.println(selectUserDaoDetails);
		return selectUserDaoDetails;
		
	}

}
