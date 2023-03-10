<%--
  Created by IntelliJ IDEA.
  User: andremurray
  Date: 3/9/23
  Time: 2:41 PM
  To change this template use File | Settings | File Templates.
--%>
<%
    String foodType = request.getParameter("food");
    request.setAttribute("foodType", foodType);
    System.out.println(foodType);
%>


<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>food order</title>
</head>
<body>
<h1>Food Order ${foodType}</h1>
<form method="post" action="/food.jsp">
  <select name="food" id="food">
    <option value="dairy">Dairy</option>
      <option value="meat">Meat</option>
  </select>
    <button>Submit</button>
</form>
</body>
</html>
