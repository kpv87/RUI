<%-- 
    Document   : RegUser
    Created on : 25.10.2013, 13:17:32
    Author     : user
--%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration</title>
    </head>
    <body>
        <h1>Registration</h1>
        <form:form method="post" action="reg" commandName="user">

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
                    <td><form:label path="email"><spring:message text="email"/></form:label></td>
                    <td><form:input path="email" /></td>
                </tr>
                <tr>
                    <td colspan="2">
                        <input type="submit" value="<spring:message text="add user"/>"/>
                    </td>
                </tr>
            </table> 
        </form:form>
        
        <br> <a href="${pageContext.request.contextPath}/">На главную</a>
        <!--     <h3>Users</h3>
        <c:if  test="${!empty userList}">
            <table class="data">
                <tr>
                    <th>Name</th>
                    <th>Password</th>
                    <th>Email</th>
                    <th>&nbsp;</th>
                </tr>
            <c:forEach items="${userList}" var="emp">
                <tr>
                    <td>${emp.username}, ${emp.password} </td>
                    <td></td>
                    <td></td>
                    <td><a href="delete/${emp.id}">delete</a></td>
                </tr>
            </c:forEach>
        </table>
        </c:if>-->
    </body>
</html>
