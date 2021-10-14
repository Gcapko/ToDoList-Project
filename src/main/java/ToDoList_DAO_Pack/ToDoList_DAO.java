package ToDoList_DAO_Pack;
import java.util.List;
import ToDoList_Entity_Pack.ToDoList_Entity;

public interface ToDoList_DAO {
	
	public void saveListItem(ToDoList_Entity listItem);
	public List<ToDoList_Entity> showList();
	public void deleteListItem (ToDoList_Entity listItem);
}
