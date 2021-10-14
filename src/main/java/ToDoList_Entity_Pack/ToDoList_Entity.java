package ToDoList_Entity_Pack;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "todolist")

public class ToDoList_Entity implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	@Column(name="listID")
	int listID;
	
	@Column(name="Content")
	String content;
	
	public ToDoList_Entity() 
	{
		
	}
	
	public ToDoList_Entity(String content)
	{
		super();
		this.content = content;
	}


	public int getListID() 
	{
		return listID;
	}



	public void setListID(int listID) 
	{
		this.listID = listID;
	}



	public String getContent() 
	{
		return content;
	}



	public void setContent(String content) 
	{
		this.content = content;
	}

	@Override
	public String toString() 
	{
		return content;
	}

	public void setListID(String listId2) {
		// TODO Auto-generated method stub
		
	}
}

