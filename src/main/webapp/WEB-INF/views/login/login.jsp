<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Login</title>
</head>
<body>
<%@ include file="/WEB-INF/views/header.jspf" %>
<h2>Login</h2>
<form action="login" method="post">
  <label for="username">Username:</label>
  <input type="text" id="username" name="username">
  <br>
  <label for="password">Password:</label>
  <input type="password" id="password" name="password">
  <br>
  <button type="submit">Login</button>
</form>

<!-- Hiển thị thông báo lỗi (nếu có) -->
<c:if test="${not empty error}">
  <p style="color: red;">${error}</p>
</c:if>
</body>
</html>