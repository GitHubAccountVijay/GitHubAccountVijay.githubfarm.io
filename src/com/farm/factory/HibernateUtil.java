package com.farm.factory;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.farm.user.Register;

public class HibernateUtil {

	private static SessionFactory sessionFactory;
	private static Session session;

	static {
		sessionFactory = new Configuration().configure().addAnnotatedClass(Register.class).buildSessionFactory();
	}

	public static Session getSession() {
		if (sessionFactory != null) {
			session = sessionFactory.openSession();

		} else {
			session = null;
		}
		return session;
	}

	public static void close() {
		if (sessionFactory != null) {
			sessionFactory.close();
		}

	}

}
