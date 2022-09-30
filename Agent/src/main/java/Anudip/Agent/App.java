package Anudip.Agent;

/**
 * Hello world!
 *
 */
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;





public class App 
{
    public static void main( String[] args )
    {
        
    	Agent obj1 = new Agent();
    	obj1.setId(101);
    	obj1.setName("Sheema");
    	obj1.setCity("Lucknow");
    	obj1.setCommission(1000);
    	
    	Agent obj2 = new Agent();
    	obj2.setId(102);
    	obj2.setName("Roshan");
    	obj2.setCity("Dehradun");
    	obj2.setCommission(1050);
    	
    	Agent obj3 = new Agent();
    	obj3.setId(103);
    	obj3.setName("Vanshika");
    	obj3.setCity("Delhi");
    	obj3.setCommission(1800);
    	
    	
    	
    	Configuration con = new Configuration().configure().addAnnotatedClass(Agent.class);
    	SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        session.save(obj1);
        session.save(obj2);
        session.save(obj3);
     
        
        tx.commit();
        session.flush();
        session.close();
    }
}