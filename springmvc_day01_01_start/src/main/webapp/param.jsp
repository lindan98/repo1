<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/6/25
  Time: 18:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
   <%-- <a href="param/testParam?username=hehe">请求参数绑定</a>--%>
    <%--<form action="param/saveAccount" method="post">
        姓名:<input type="test" name="username" /><br/>
        密码:<input type="password" name="password"/><br/>
        金额:<input type="test" name="money" /><br/>
        用户姓名:<input type="test" name="user.username" /><br/>
        用户年龄:<input type="test" name="user.age" /><br/>
        <input type="submit" value="提交">
    </form>--%>

   <form action="param/saveUser" method="post">
       姓名:<input type="text" name="username" /><br/>
       年龄:<input type="text" name="age"/><br/>
       日期:<input type="text" name="date"/><br/>
       <input type="submit" value="提交">
   </form>
</body>
</html>
