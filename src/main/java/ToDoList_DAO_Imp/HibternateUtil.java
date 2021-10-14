package ToDoList_DAO_Imp;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
public class HibternateUtil 
{
	private static final SessionFactory sessionFactory;
	
	static 
	{
		try 
		{
			sessionFactory = new Configuration().configure().buildSessionFactory();
		}catch(Throwable ex) 
		{
			System.err.println("Inital SessionFactory creation Failed." + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}
	
	public static SessionFactory getSessionFactory() 
	{
		return sessionFactory;
	}
}
