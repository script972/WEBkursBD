<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: script972
  Date: 01.06.2017
  Time: 10:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="jspf/header.jspf"/>
<table>
    <!-- here should go some titles... -->
    <tr>
        <th>id</th>
        <th>last name</th>
        <th>name</th>
        <th>second name</th>
        <th>email</th>
        <th>phone</th>
        <th>password</th>
        <th>discount</th>
    </tr>
    <jsp:useBean id="CustomerM" class="tayetLed.manipulate.CustomerM"/>
    <c:forEach var="customer" items="${CustomerM.customer}">
        <tr>
            <td>
                <c:out value="${customer.id}" />
            </td>
            <td>
                <c:out value="${customer.last_name}" />
            </td>
            <td>
                <c:out value="${customer.name}" />
            </td>
            <td>
                <c:out value="${customer.second_name}" />
            </td>
            <td>
                <c:out value="${customer.email}" />
            </td>
            <td>
                <c:out value="${customer.phone}" />
            </td>
            <td>
                <c:out value="${customer.pass}" />
            </td>
            <td>
                <c:out value="${customer.discount}" />
            </td>
        </tr>
    </c:forEach>
</table>