<%--
  Created by IntelliJ IDEA.
  User: 赖宏曲
  Date: 2019/11/11
  Time: 22:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>商品列表</title>
</head>
<body>
<table>
    <tr>
        <th>商品名称</th>
        <th>商品价格</th>
        <th>商品描述</th>
        <th>生产时间</th>
    </tr>
    <c:forEach items="${productlist}" var="list">
        <tr>
            <td>${list.name}</td>
            <td>${list.price}</td>
            <td>${list.detail}</td>
            <td>${list.createtime}</td>
        </tr>
    </c:forEach>

</table>
</body>
</html>
