package com.raj.library_managment;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.mysql.cj.Query;

public class Login {
	

	public static void login(String user_name, String password) {
		if (check_user(user_name , password)) {
			System.out.println("please login :)");
		} else {
			add_user(user_name, password);
		}
	}

	public static boolean check_user(String user_name, String passowrd) {
		int usercheck = get_user_id(user_name, passowrd);

		if (usercheck != -1) {
			return true;

		} else {
			return false;
		}

	}

	public static int get_user_id(String name, String password) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		String hql = "from User where user_name = :username and password = :password";

		org.hibernate.query.Query query = session.createQuery(hql);
		query.setParameter("username", name);
		query.setParameter("password", password);
		User user = (User) query.uniqueResult();
		session.close();
		if (user != null) {
			return user.getUser_id();
		} else {
			return -1;
		}
	}
	public static void add_user(String user_name , String password)
	{
		User user = new User(user_name , password);
		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(user);
		tx.commit();
		session.close();
		System.out.println("created succesfully!!!");
		
	}
}
