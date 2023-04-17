<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<a href="hello-servlet">Hello Servlet</a>
<form action="${pageContext.request.contextPath}/http-request" method="get">
    <div class="clearfix">
        <button value="list" type="submit">Ver lista</button>
    </div>
</form>
</body>
</html>