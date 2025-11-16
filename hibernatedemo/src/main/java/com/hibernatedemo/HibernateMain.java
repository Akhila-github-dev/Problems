package com.hibernatedemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;



public class HibernateMain {
	
	public static void main(String[] args) {
		Configuration configuration= new Configuration();
		
		configuration.configure("hibernate.cfg.xml");
		configuration.addAnnotatedClass(User.class);
		System.out.println("config loaded");
		User u=new User();
		u.setId(9);
		u.setName("ak");
		u.setMarks(69);//transient  state
		
		SessionFactory sessionFactory= configuration.buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
//		User user= new User(3,"prassu",92);  //persistent  state
//		session.save(user);
		
//		User user2 = session.get(User.class, 1);
//		System.out.println(user2);
		
		Query query = session.createQuery("from User");
		
		NativeQuery nativeQuery = session.createNativeQuery("select * from user");
		System.out.println(query.list());
		System.out.println("================================");
		System.out.println(nativeQuery.list());
		transaction.commit();
		session.close();
		
		u.setId(56);// detached state
		System.out.println("ended");
	}

}
