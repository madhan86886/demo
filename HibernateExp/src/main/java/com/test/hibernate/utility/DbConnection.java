package com.test.hibernate.utility;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DbConnection {
	
public static SessionFactory getSessionFactory(){
		
		SessionFactory sessionFactory = null;
		try{
			//creating configuration object  
		    Configuration cfg=new Configuration();  
		    cfg.configure("hibernate.cfg.xml");//populates the data of the configuration file  
		      
		    sessionFactory=cfg.buildSessionFactory();  
		}catch (Exception e) {
			System.out.println(e);
		}
		
		return sessionFactory;
	}

}
