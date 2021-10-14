package ToDoList_DAO_Imp;
import java.util.ArrayList;
import java.util.List;
import ToDoList_DAO_Pack.ToDoList_DAO;
import ToDoList_Entity_Pack.ToDoList_Entity;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.Query;
import org.hibernate.SQLQuery;

public class ToDoList_Imp implements ToDoList_DAO 
{

	@Override
	public void saveListItem(ToDoList_Entity listItem)
	{
		Session session = HibternateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		session.save(listItem);
		transaction.commit();
		session.close();
		
	}

	public List<ToDoList_Entity> showList() 
	{
		List<ToDoList_Entity> myList = new ArrayList();
		Session session = HibternateUtil.getSessionFactory().openSession();
		SQLQuery query = session.createSQLQuery("select * from todolist");
		myList = query.list();
		return myList;
	}
	
	  public void updateEmployee(int listId, String content) {
	        Session session = HibternateUtil.getSessionFactory().openSession();
	        Transaction transaction = session.beginTransaction();
	        ToDoList_Entity ent = (ToDoList_Entity)session.load(ToDoList_Entity.class, listId);
	        ent.setContent(content);
	        session.update(ent);
	        transaction.commit();
	        session.close();  
	    }
	@Override
	public void deleteListItem(ToDoList_Entity listItem) 
	{
		Session session = HibternateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		session.delete(listItem);
		transaction.commit();
		session.close();
		
		
	}

}
