<%@page import="java.util.List"%>
<%@page import="com.amolinfo.dto.Category"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	List<Category> allCategories = (List<Category>)
	request.getAttribute("categories");
	if(allCategories == null)
	{
	%> 
	<h3>No categories to display</h3>
	<%
	}else
	{	
	%>
	<table border='1'>
	<tr>
		<th>Name</th>
		<th>Description</th>
		<th>Image</th>
	</tr>
	<%
	for(Category objCategory : allCategories)
	{
	%>
	<tr>
	<td><%=objCategory.getCatName()%></td>
	<td><%=objCategory.getCatDesc()%></td>
	<td><%=objCategory.getCatImageUrl()%></td>
	</tr>
	<% 	
	}
	%>
	</table>
	<%
	}
	%>

</body>
</html>