<%-- 
    Document   : editEmployeeList
    Created on : 16.10.2013, 18:40:05
    Author     : user
--%>

<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
    <head>
        <title>Spring 3 hibernate integration example on www.howtodoinjava.com</title>
    </head>
    <body>

        <h2>Employee Management Screen : Spring 3 hibernate integration example on www.howtodoinjava.com</h2>


    <h3>Employees</h3>
    <c:if  test="${!empty employeeList}">
        <table class="data">
            <tr>
                <th>Name</th>
                <th>Email</th>
                <th>Telephone</th>
                <th>&nbsp;</th>
            </tr>
            <c:forEach items="${employeeList}" var="emp">
                <tr>
                    <td>${emp.lastName}, ${emp.firstName} </td>
                    <td></td>
                    <td>123</td>
                    <td></td>
                </tr>
                <tr><td>ddd<a href="delete/${emp.id}">delete</a></td></tr>
            </c:forEach>
                dsfgsfhsfhdfhdfgh
        </table>
    </c:if>

</body>
</html>