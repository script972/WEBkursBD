<%--
  Created by IntelliJ IDEA.
  User: script972
  Date: 20.05.2017
  Time: 18:11
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<jsp:include page="jspf/header.jspf"/>

    <div id="goods">
<jsp:useBean id="GoodsM" class="tayetLed.manipulate.GoodsM" scope="page"/>
<c:forEach var="good" items="${GoodsM.goods}">
        <div class="item" style="border: 1px solid red; width: 180px; display: inline-block;">
            <p class="content"><h3>ID</h3>
                ${good.id} <a href="goodsdel?id=${good.id}">XXX</a>
            </p>
            <h2>${good.title}</h2>
            <p class="content"><h3>Название</h3>
                ${good.title}
            </p>
            <p class="content"><h3>Категория</h3>
                ${good.category}
            </p>
            <p class="content"><h3>Описание</h3>
                ${good.description}
            </p>
            <p class="content"><h3>Цена</h3>
                ${good.price}
            </p>
            <p class="content"><h3>Количество на складе</h3>
                ${good.number_in_stock}
            </p>
            <p class="content"><h3>Поставшик</h3>
                ${good.supplier}
            </p>
            <p class="content"><h3>Производитель</h3>
                ${good.factory}
            </p>
        </div>
</c:forEach>
    </div>
</body>
</html>
