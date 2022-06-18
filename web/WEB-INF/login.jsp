<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <h1>Login</h1>
        <form method="POST" action="login">
            <label>Username:</label>
            <input type="text" name="userN" value="${username}">
            <br>
            <label>Password:</label>
            <input type="password" name="passW" value="">
            <br>
            <input type="submit" name="action" value="Log in" />
        </form>
        <c:if test="${error == true}">
        <p>Please enter the right username and password.</p>
        </c:if>
    </body>
</html>
