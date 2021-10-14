<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
	
	  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
	  
	  <script>
	  
	  $(document).ready(function())
	  {
		  
		  $("#deleteListItem").hide();
		  $("#updateItem").hide();
		  
		  $("#update").click(function)
		  {
			  
			  $("#updateListItem").show();
			  $("#deleteListItem").hide();
			  
		  });
		  
		  $("delete").click(function)(){
			  
			  $("#deleteListItem").show();
			  $("#UpdateListItem").hide();
		  });
		  
	  });
	  </script>
</head>
<body>

	All List Items: <br>
	
	<c :forEach var="list" items="${myList}">
	
		List Item ID: ${list.id}<br>
		List Item Conent: ${list.content}<br>
		-------------------------------------------<br>
	</c :forEach>
	
	 <form action="ToDoList_Controller" method="POST">
            Update: <input type="checkbox" id="update"> Delete: <input type="checkbox" id="delete" onclick="document.getElementById('listID').disabled=this.checked;document.getElementById('listIDUpdate').disabled=this.checked;"><br><br>
            <select name="id">
                <c :forEach items="${myList}" var="ToDoList">
                <option value="${list.id}">${list.id}</option>
                </c :forEach>
            </select>
            
            <br>
            Update List Content: <input id="content" type="text" name="ListContent"><br>
            Update List Number: <input id="listnumberupdate" type="text" name="listID"> <br><br>
            <button type="submit" id="updateItem" name="updateItem"> Update</button> <br> <br>
            <button type="submit" id="deleteItem" name="deleteItem"> Delete </button>
            <button type="submit" id="AddNewItem" name=AddNewItem">Add New Item</button>
	</form>
</body>
</html>