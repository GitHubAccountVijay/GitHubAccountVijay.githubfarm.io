package com.farm.user;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.farm.factory.HibernateUtil;


public class UserDao {
	public Register selectUserDaoDetails(String email) {
		Session session = HibernateUtil.getSession();
		Register register = null;
			try {
				register = session.createQuery("from Register where EMAIL = '"+email+"'", Register.class).uniqueResult();
				
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("error");
		}
		finally
		{
			session.close();
		}
		
		return register;
		
	}
	
	public void addDetails(String email,String fullname, String password, String phone)
	{
		Session session = HibernateUtil.getSession();
		try {

			Transaction transaction = session.beginTransaction();
			Register register = new Register();
			register.setEmail(email);
			register.setFullname(fullname);
			register.setPassword(password);
			register.setPhone(phone);
			session.save(register);
			transaction.commit();
		} catch (Exception e) {
			// TODO: handle exception
		}
		finally {
			HibernateUtil.close();
		}
	}
	
	
}




