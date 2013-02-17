<%-- 
    Document   : index
    Created on : Feb 17, 2013, 11:18:20 AM
    Author     : 1
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="/ComputerShopWebApplication/controller" method="POST">
            <table border='1' title='Notebooks' id="myTable">
                <thead><tr>
                        <th>#</th>
                        <th>sd</th>
                        <th>fdf</th>
                        <th>fgfg</th>
                        <th>dgfg</th>
                        <th>fgf</th>
                        <th>fgfg</th>
                        <th>fgf</th>
                    </tr></thead>
                <tbody>
                    <c:forEach var="notebook" items="${notebooks}"> 
                        <tr>
                            <td><input type="radio" name="idNotebook" value="${notebook.idNotebook}"/></td>
                            <td><c:out value="${notebook.idNotebook}" /></td>
                            <td><c:out value="${notebook.nameNotebook}" /></td>
                            <td><c:out value="${notebook.platform}"/></td>
                            <td><c:out value="${notebook.processor}"/></td>
                            <td><c:out value="${notebook.operationMemory}"/></td>
                            <td><c:out value="${notebook.battery}"/></td>
                            <td><c:out value="${notebook.price}"/></td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
            <table>
                <tr>
                    <td><button type="submit" value="viewNotebooks" name="command">
                            Notebooks
                        </button></td>
                </tr>
            </table>
        </form>  
         <form action="/ComputerShopWebApplication/controller" method="POST">
            <table border='1' title='Personal computers' id="myTable">
                <thead><tr>
                        <th>#</th>
                        <th>sd</th>
                        <th>fdf</th>
                        <th>fgfg</th>
                        <th>dgfg</th>
                        <th>fgf</th>
                        <th>fgfg</th>
                        <th>fgf</th>
                    </tr></thead>
                <tbody>
                    <c:forEach var="pc" items="${personalComputers}"> 
                        <tr>
                            <td><input type="radio" name="idPersonalComputer" value="${pc.idPersonalComputer}"/></td>
                            <td><c:out value="${pc.idNotebook}" /></td>
                            <td><c:out value="${pc.nameNotebook}" /></td>
                            <td><c:out value="${pc.platform}"/></td>
                            <td><c:out value="${pc.processor}"/></td>
                            <td><c:out value="${pc.operationMemory}"/></td>
                            <td><c:out value="${pc.hardDisk}"/></td>
                            <td><c:out value="${pc.price}"/></td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
            <table>
                <tr>
                    <td><button type="submit" value="viewPersonalComputers" name="command">
                            Personal computers
                        </button></td>
                </tr>
            </table>
        </form>  
        <a href="addingNotebook.jsp">Добавить ноутбук</a>
    </body>
</html>