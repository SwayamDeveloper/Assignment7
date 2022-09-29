package com.example;

import org.hibernate.Session;




import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
     	Configuration con=new Configuration().configure().addAnnotatedClass(Agent.class);
    	SessionFactory ss=con.buildSessionFactory();
    	Session s=ss.openSession();
    	Transaction t= s.beginTransaction();
    	

    	
    	Agent obj =new Agent ();
    	obj.setId(101);
    	obj.setName("gurjoot");
    	obj.setcity("Delhi");
    	obj.setCommisionamount(10000);
    	s.save(obj);
    	
    	Agent obj1 =new Agent ();
    	obj1.setId(102);
    	obj1.setName("Sagar");
    	obj1.setcity("Noida");
    	obj1.setCommisionamount(20000);

    	
    	Agent obj2 =new Agent ();
    	obj2.setId(103);
    	obj2.setName("Satyam");
    	obj2.setcity("faridabad");
    	obj2.setCommisionamount(30000);
    	s.save(obj);
    	s.save(obj1);
    	s.save(obj2);
        
    	t.commit();
    	System.out.println( "Hello World!" );
    }
}

