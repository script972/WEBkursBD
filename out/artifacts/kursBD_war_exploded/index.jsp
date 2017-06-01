<%--
  Created by IntelliJ IDEA.
  User: script972
  Date: 15.05.2017
  Time: 20:26
  To change this template use File | Settings | File Templates.
--%>
<html>
<head>
  <title>Kurs</title>
  <meta charset="UTF-8">
  <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>

<div id="registration-form">
  <form method="post" action="login">
    <p>  Login:   <input type="text" name="login"></p>
    <p> Password: <input type="password" name="password"></p>
    <button type="submit">Login </button>
  </form>
  <a href="registration.jsp">Registration</a>
  <%-- <%
     response.getWriter().print(request.getAttribute("login"));
   %>--%>

</div>
</body>
</html>

