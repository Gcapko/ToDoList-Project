package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;
import ToDoList_DAO_Imp.ToDoList_Imp;
import ToDoList_DAO_Pack.ToDoList_DAO;
import ToDoList_Entity_Pack.ToDoList_Entity;

/**
 * Servlet implementation class ToDoList_Controller
 */
@WebServlet("/ToDoList_Controller")
public class ToDoList_Controller extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
	
	ToDoList_Entity ent = new ToDoList_Entity();
	ToDoList_Imp entIMP = new ToDoList_Imp();
	ToDoList_DAO DAO;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ToDoList_Controller() 
    {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		
		if(request.getParameter("addListItem")!=null)
		{
		
			String listContent = request.getParameter("listContent");
			String listId = request.getParameter("listID");
			ent.setContent(listContent);
			ent.setListID(listId);
			entIMP.saveListItem(ent);
			RequestDispatcher rd = request.getRequestDispatcher("add_ToDoList.jsp");
			rd.forward(request,  response);
		
		}
	}
		
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		
		if(request.getParameter("showList")!=null){
            List<ToDoList_Entity> myList = new ArrayList<>();
           // myList = ToDoList_Imp.showList();
            request.setAttribute("ToDoList", myList);
            RequestDispatcher rd = request.getRequestDispatcher("showList.jsp");
            rd.forward(request, response);
	}
		
		if(request.getParameter("deleteItem")!=null){
            int ID = Integer.parseInt(request.getParameter("id"));
            ent.setListID(ID);
            //ToDoList_Imp.deleteListItem(ID);
             RequestDispatcher rd = request.getRequestDispatcher("add_ToDoList.jsp");
           rd.forward(request, response);
        }
	
}
}