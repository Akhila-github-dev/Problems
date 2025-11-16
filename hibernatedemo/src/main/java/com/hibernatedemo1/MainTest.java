package com.hibernatedemo1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

import com.hibernatedemo.User;

public class MainTest {
	public static void main(String[] args) {
		Configuration configuration = new Configuration();

		configuration.configure("hibernate.cfg.xml");
		configuration.addAnnotatedClass(Student.class);
		configuration.addAnnotatedClass(Passport.class);
		System.out.println("config loaded");

		SessionFactory sessionFactory = configuration.buildSessionFactory();

		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		Passport passport=new Passport(1,"fsjhf");
		
		Student student= new Student(2,"pinky",92,passport);
//		student.setPassportId(passport);
		session.save(student);

//		Student student1 = session.get(Student.class, 1);
//		System.out.println(student1);

//		Query query = session.createQuery("from Student");
//
//		NativeQuery nativeQuery = session.createNativeQuery("select * from student");
//		System.out.println(query.list());
//		System.out.println("================================");
//		System.out.println(nativeQuery.list());
		transaction.commit();
		session.close();
		System.out.println("ended");
	}

}
