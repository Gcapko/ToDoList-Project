<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head><title>Add To Your List</title></head>
<body>

	<div id="Add">
	<h1>Add to List</h1>
	<form action="ToDoList_Controller" method="GET">
		<table>
			<tr>
				<td> List Entry: </td>
				<td><input type="text" name="Enter Here"></td>
			</tr>
			<tr>
				<td><input type="submit" name="addToList" value="Add"></td>
			</tr>	
		</table>
	</form>
	</div>
	<form action="ToDoList_Controller" method="POST">
		<input type="submit" name="showList" value="Show">&nbsp; &nbsp;<br>
	</form>
</body>
</html>