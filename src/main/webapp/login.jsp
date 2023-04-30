<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Formulario de login</title>
  <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
</head>
<body>
<h1>Iniciar sesion</h1>
<form action="${pageContext.request.contextPath}/http-login" method="POST">
  <div>
    <label for="username">Username</label>
    <div>
      <input type="text" name="username" id="username">
    </div>
  </div>
  <div>
    <label for="password">Password</label>
    <div>
      <input type="password" name="password" id="password">
    </div>
  </div>
  <div>
    <input type="submit" value="Login">
  </div>
</form>

</body>
</html>
