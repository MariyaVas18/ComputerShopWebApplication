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
                        <th>Название</th>
                        <th>Дата выхода</th>
                        <th>Платформа</th>
                        <th>Процессор</th>
                        <th>Количество ядер</th>
                        <th>Вес</th>
                        <th>Диагональ</th>
                        <th>Оперативная память</th>
                        <th>Емкость жесткого диска</th>
                        <th>Кол часов зарядки</th>
                        <th>Цена</th>
                        <th>Скидка</th>
                    </tr></thead>
                <tbody>
                    <c:forEach var="notebook" items="${notebooks}"> 
                        <tr>
                            <td><input type="radio" name="idNotebook" value="${notebook.idNotebook}"/></td>
                            <td><c:out value="${notebook.nameNotebook}" /></td>
                            <td><c:out value="${notebook.releaseDate}" /></td>
                            <td><c:out value="${notebook.platform}"/></td>
                            <td><c:out value="${notebook.processor}"/></td>
                            <td><c:out value="${notebook.numberOfCores}"/></td>
                            <td><c:out value="${notebook.weight}"/></td>
                            <td><c:out value="${notebook.diagonal}"/></td>
                            <td><c:out value="${notebook.operationMemory}"/></td>
                            <td><c:out value="${notebook.hardDisk}"/></td>
                            <td><c:out value="${notebook.battery}"/></td>
                            <td><c:out value="${notebook.price}"/></td>
                            <td><c:out value="${notebook.discount}"/></td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
            <table>
                <tr>
                    <td><button type="submit" value="viewNotebooks" name="command">
                            View Notebooks
                        </button></td>
                         <td><button type="submit" value="deleteNotebook" name="command">
                            Удалить ноутбук
                        </button>
                    </td>
                     <td><button type="submit" value="addingNotebookPage" name="command">
                            Добавить ноутбук
                        </button>
                    </td>
                    <td><button type="submit" value="editNotebookPage" name="command">
                            Редактировать ноутбук
                    </td>
                </tr>
            </table>
        </form>  
         <form action="/ComputerShopWebApplication/controller" method="POST">
            <table border='1' title='Personal computers' id="myTable">
                <thead><tr>
                        <th>#</th>
                        <th>Название</th>
                        <th>Дата выхода</th>
                        <th>Платформа</th>
                        <th>Процессор</th>
                        <th>Количество ядер</th>
                        <th>Вес</th>
                        <th>Диагональ</th>
                        <th>Оперативная память</th>
                        <th>Емкость жесткого диска</th>
                        <th>Цена</th>
                        <th>Скидка</th>
                    </tr></thead>
                <tbody>
                    <c:forEach var="pc" items="${personalComputers}"> 
                        <tr>
                            <td><input type="radio" name="idPersonalComputer" value="${pc.idPersonalComputer}"/></td>
                            <td><c:out value="${pc.namePc}" /></td>
                            <td><c:out value="${pc.releaseDate}" /></td>
                            <td><c:out value="${pc.platform}"/></td>
                            <td><c:out value="${pc.processor}"/></td>
                            <td><c:out value="${pc.numberOfCores}"/></td>
                            <td><c:out value="${pc.weight}"/></td>
                            <td><c:out value="${pc.diagonal}"/></td>
                            <td><c:out value="${pc.operationMemory}"/></td>
                            <td><c:out value="${pc.hardDisk}"/></td>
                            <td><c:out value="${pc.price}"/></td>
                            <td><c:out value="${pc.discount}"/></td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
            <table>
                <tr>
                    <td><button type="submit" value="viewPersonalComputers" name="command">
                            View Personal computers
                        </button>
                    </td>
                    <td><button type="submit" value="deletePC" name="command">
                            Удалить компьютер
                        </button>
                    </td>
                     <td><button type="submit" value="addingPCPage" name="command">
                            Добавить компьютер
                        </button>
                    </td>
                </tr>
            </table>
         </form>  
        
    </body>
</html>
