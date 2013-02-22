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
                            <td><input type="hidden" name="price" value="${notebook.price}"/>
                                <c:out value="${notebook.price}"/></td>
                            <td><input type="hidden" name="discount" value="${notebook.discount}"/>
                                <c:out value="${notebook.discount}"/></td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
            <table>
                <tr>
                    <td><button type="submit" value="viewNotebooks" name="command">
                            Просмотреть ноутбуки
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
                     <td><button type="submit" value="buyNotebook" name="command">
                            Купить ноутбук
                        </button>
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
                            <td><input type="hidden" name="price" value="${pc.price}"/>
                                <c:out value="${pc.price}"/></td>
                            <td><input type="hidden" name="discount" value="${pc.discount}"/>
                                <c:out value="${pc.discount}"/></td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
            <table>
                <tr>
                    <td><button type="submit" value="viewPersonalComputers" name="command">
                            Просмотреть компьютеры
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
                     <td><button type="submit" value="editPCPage" name="command">
                            Редактировать компьютер
                    </td>
                     <td><button type="submit" value="buyPC" name="command">
                            Купить компьютер
                    </td>
                </tr>
            </table>
              <table border='1' title='Personal computers' id="myTable">
                <thead><tr>
                        <th>#</th>
                        <th>Название продукта</th>
                        <th>Стоимость</th>
                        <th>Дата</th>
                    </tr></thead>
                <tbody>
                    <c:forEach var="purchase" items="${purchases.notebooks}"> 
                        <tr>
                            <td><input type="radio" name="idPurchase" value="${purchase.idNotebook}"/></td>
                            <td><c:out value="${purchase.nameNotebook}" /></td>
                            <td><c:out value="${purchase.nameNotebook}" /></td>
                            <td><c:out value="${purchase.nameNotebook}" /></td>
                       </tr>
                    </c:forEach>
                </tbody>
            </table>
            <table>
                <tr>
                    <td><button type="submit" value="viewPurchases" name="command">
                            Просмотреть покупки
                        </button>
                    </td>
                </tr>
            </table>
         </form>  
     </body>
</html>
