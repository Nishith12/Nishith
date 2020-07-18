package com.mphasis.training.pl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.mphasis.training.entity.Department;
import com.mphasis.training.entity.Laptop;
import com.mphasis.training.entity.Location;
import com.mphasis.training.entity.*;



public class HibernateApp {

	public static void main(String[] args) {
		Configuration con=new Configuration().configure().addAnnotatedClass(Employee.class)
				.addAnnotatedClass(Department.class).addAnnotatedClass(Orders.class);
		StandardServiceRegistryBuilder builder=
				new StandardServiceRegistryBuilder().applySettings(con.getProperties());
		SessionFactory sessionFactory=con.buildSessionFactory(builder.build());
		
//		Student st=new Student();
//		st.setName("Nishith");
//		st.getEmail().add("nishith@gmail.com");
//		st.getEmail().add("Nish@mohasis.com");
//		st.getLp().setLpcode("LP123");
//		st.getLp().setBrand("HP");
//		st.getLp().setHddsize(1);
//		st.getLp().setRamsize(20);
//		st.getLp().setProcessor("MediaTeck");
		
//		Session session=sessionFactory.openSession();
//		session.beginTransaction();
//		session.save(st);
//		session.getTransaction().commit();
//		session.close();
		
//		Location l=new Location();
//		l.setLcode("L11");
//		l.setLname("GTP");
//		
//		Department d1=new Department();
//		d1.setDeptcode(111);
//		d1.setDname("sales");
//		d1.setLoc(l);
//		
//		Department d2=new Department();
//		d2.setDeptcode(112);
//		d2.setDname("enterprice");
//		d2.setLoc(l);
//		
//		Session session=sessionFactory.openSession();
//		session.beginTransaction();
//		session.save(l);
//		session.save(d1);
//		session.save(d2);
//		System.out.println(d1);
//		System.out.println(d2);
//		session.getTransaction().commit();
//		session.close();
		Product p=new Product();
		p.setPid(1);
		p.setPname("watch");
		Product p1=new Product();
		p1.setPid(2);
		p1.setPname("pen");
		p.getOrder().setOrderid(111);
		p1.getOrder().setOrderid(111);
		
		Orders o1=new Orders();
		o1.setOrderid(12);
		
		Orders o=new Orders();
		o.setOrderid(12);
		Person p2=new Person();
		p2.setPid(123);
		p2.setPname("Nishith");
		p2.getOrders().add(o);
		p2.getOrders().add(o1);
		
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.save(p1);
		session.save(p);
		session.save(o);
		session.save(p2);
		session.getTransaction().commit();
		session.close();
		
		
	}
}
