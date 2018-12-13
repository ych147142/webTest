<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/12/13
  Time: 20:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="doUpdate">
        商品名称：<input type="text" name="name" value="${p.productName}"><br>
        商品价格：<input type="text" name="price" value="${p.price}"><br>
        商品图片：<input type="text" name="url" value="${p.url}"><br>
        商品描述：<input type="text" name="des"  value="${p.productDes}"><br>
        <input type="submit" value="修改">
    </form>
</body>
</html>
