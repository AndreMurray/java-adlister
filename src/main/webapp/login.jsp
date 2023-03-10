<%--
  Created by IntelliJ IDEA.
  User: andremurray
  Date: 3/9/23
  Time: 7:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%
    String username = request.getParameter("name");
    String password = request.getParameter("password1");

    if (username != null && password != null && username.equals("admin") && password.equals("password")) {
        response.sendRedirect("profile.jsp");
    } else {
        response.sendRedirect("login.jsp");
    }
%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>jspAndJstl</title>
</head>
<body>
<form method="POST" action="profile.jsp">
    <label for="userName">Username:</label>
    <input type="text" id="userName" name="name">
    <label for="password">Password:</label>
    <input type="password" id="password" name="password1">
    <button>Submit</button>
</form>

</body>
</html>
