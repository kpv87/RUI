<%-- 
    Document   : Login
    Created on : 05.11.2013, 17:06:25
    Author     : user
--%>

<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Login</h1>
        <form:form method="post" action="${pageContext.request.contextPath}/login" commandName="user">

            <table>
                <tr>
                    <td><form:label path="username"><spring:message text="username"/></form:label></td>
                    <td><form:input path="username" /></td>
                </tr>
                <tr>
                    <td><form:label path="password"><spring:message text="password"/></form:label></td>
                    <td><form:input path="password" /></td>
                </tr>
                <tr>
                    <td colspan="2">
                        <input type="submit" value="<spring:message text="Enter"/>"/>
                    </td>
                </tr>
            </table> 
        </form:form>
        
        <c:if test="${errorNameOrPass}">
           <br> Не верный логин или пароль.
           <br>
        </c:if>
           
        <br> <a href="${pageContext.request.contextPath}/">На главную</a>   
    </body>
</html>
