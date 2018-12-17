<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/12/12
  Time: 15:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="doRegister" method="post">
        用户名：<input type="text" name="username" id="uname"><span id="message"></span><br>
        密码：<input type="password" name="pwd"><br>
        确认密码: <input type="password" name="pwds"><br>
        电话：<input type="text" name="tele"><br>
        <input type="submit" value="注册">
    </form>

    <script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>
    <script type="text/javascript">
        $(function () {
            /*使用ajax*/
            var un = $("#uname").val()
            $.ajax({
                url:"doRegister",
                type:"get",
                data:un
            })
        })

    </script>
</body>
</html>
