<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="jspf/header.jspf"/>

<jsp:useBean id="ProductsM" class="tayetLed.manipulate.GoodsM" scope="page"/>
<jsp:useBean id="CaterogyM" class="tayetLed.manipulate.CategoryM" scope="page"/>
<jsp:useBean id="SupplierM" class="tayetLed.manipulate.SupplierM" scope="page"/>

<form action="addGoods" method="GET">
   <p>Title  <input type="text" name="title"></p>
    <p>Describe <input type="text" name="description"> </p>
    <p>Category
        <select name="category">
            <c:forEach var="category" items="${CaterogyM.categories}">
                <option value="${category.id}">${category.title}</option>
            </c:forEach>
        </select>
    </p>
    <p>Supplier
        <select name="supplier">
            <c:forEach var="suppliers" items="${SupplierM.suppliers}">
                <option value="${suppliers.id}">${suppliers.title}</option>
            </c:forEach>
        </select>
    </p>
    <p>Fabric <input type="text" name="factory"> </p>
   <p>Price  <input type="text" name="price"></p>
   <p>Price supplier  <input type="text" name="price_supplier"></p>
   <p>Numbers  <input type="text" name="numbers"></p>
    <input type="submit" value="Add">
</form>



</body>
</html>