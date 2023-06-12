<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Login</title>
  </head>
  <body>
    <h2>Login</h2>
    <form action="/login" method="post">
      <div>
        <label for="username">Username:</label>
        <input type="text" id="username" name="username" required />
      </div>
      <div>
        <label for="password">Password:</label>
        <input type="password" id="password" name="password" required />
      </div>
      <div>
        <button type="submit">Login</button>
      </div>
      <c:if test="${param.error != null}">
        <p style="color: red">Invalid username or password.</p>
      </c:if>
    </form>
  </body>
</html>
