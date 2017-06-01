<%--
  Created by IntelliJ IDEA.
  User: script972
  Date: 14.05.2017
  Time: 17:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration</title>
</head>
<body>
    <div id="registration-form">
        <form method="post" action="registration">
            <p>Имя</p> <input type="text" name="name"><br>
            <p>Отчество</p> <input type="text" name="second_name"><br>
            <p>Фамилия</p> <input type="text" name="last_name"><br>
            <p>Логин</p> <input type="text" name="login"> <br>
            <p>Пароль</p> <input type="password" name="password"> <br>
            <p>email</p> <input type="text" name="email"> <br>
            <p>Телефон</p> <input type="text" name="phone"><br>
            <button type="submit" value="">Регистрация</button>
        </form>
    </div>
</body>
</html>
