<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<table>

    <tr>
        <td>product name</td>
    </tr>
    <c:forEach var="product" items="${card.products}">
        <tr>
            <td>
                <c:out value="${product}"/>
            </td>
        </tr>
    </c:forEach>

</table>
</body>
</html>
