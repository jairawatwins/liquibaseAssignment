package com.liquabasedemo.springbootliquabase.hibernate;

import com.liquabasedemo.springbootliquabase.utility.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

import java.io.File;



@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class DemoApplication {


	public static void main(String[] args) {


		SessionFactory factory = new Configuration()
				.configure(new File("src/main/resources/hibernate.cfg.xml"))
				.buildSessionFactory();


		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		session.getTransaction().commit();
		session.close();
	}
}

