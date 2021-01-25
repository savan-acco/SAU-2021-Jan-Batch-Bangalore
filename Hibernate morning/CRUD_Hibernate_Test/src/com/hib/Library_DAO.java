package com.hib;

import javax.imageio.spi.ServiceRegistry;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Library_DAO {
	
	public static void main(String args[])
	{
		Library_DAO.getcount();
	}
	
	public static void insert_data(){
		try {
			
			SessionFactory sessionfactory=new Configuration().configure().buildSessionFactory();
			Session session=sessionfactory.openSession();
			
		 	
			Library obj=new Library();
			
		    obj.setBook_no(1);
		    obj.setBook_name("book 1");

			
			session.save(obj);
			
			session.beginTransaction().commit();
			
		    session.close();
		    sessionfactory.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
		
		
		public static void get_data(){
			try {
				
				SessionFactory sessionfactory=new Configuration().configure("/hibernate.cfg.xml").buildSessionFactory();
				Session session=sessionfactory.openSession();
				
			 	
				Library obj=new Library();
				obj=(Library)session.get(Library.class,3);
				
				System.out.println(obj.getBook_name());
				
				
				session.beginTransaction().commit(); 
			    session.close();
			    sessionfactory.close();
				
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		
		
		
		public static void update(){
			try {
				
				SessionFactory sessionfactory=new Configuration().configure("/hibernate.cfg.xml").buildSessionFactory();
				Session session=sessionfactory.openSession();
				
			 	
				Library obj=new Library();
				obj.setBook_no(1);
				obj.setBook_name("book updated ");
				
				session.update(obj);
				
				System.out.println(obj.getBook_name());
				
				
				session.beginTransaction().commit(); 
			    session.close();
			    sessionfactory.close();
				
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		
		public static void delete(){
			try {
				
				SessionFactory sessionfactory=new Configuration().configure("/hibernate.cfg.xml").buildSessionFactory();
				Session session=sessionfactory.openSession();
				
			 	
				Library obj=new Library();
				obj.setBook_no(1);
					 
				
				session.delete(obj);
				
				System.out.println(obj.getBook_name());
				
				
				session.beginTransaction().commit(); 
			    session.close();
			    sessionfactory.close();
				
				
			} catch (Exception e) {
				System.out.println(e);
			}
		
			}
		
		
		public static void getcount(){
			try {
				
				SessionFactory sessionfactory=new Configuration().configure("/hibernate.cfg.xml").buildSessionFactory();
				Session session=sessionfactory.openSession();
				
				int count = ((Long)session.createQuery("select count(*) from Library").uniqueResult()).intValue();
				
				
				System.out.println(count);
				
				
				session.beginTransaction().commit(); 
			    session.close();
			    sessionfactory.close();
				
				
			} catch (Exception e) {
				System.out.println(e);
			}
		
			}
	
	
}
