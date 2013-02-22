<%-- 
    Document   : addingComputer
    Created on : Feb 17, 2013, 1:46:04 PM
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
        <form method="POST" action="/ComputerShopWebApplication/controller">
            <fieldset>
                <table cellspacing="12">
                    <tr>
                        <td><label>Название</label></td>
                        <td><input type="hidden" name="idPersonalComputer" size="15" value="${pc.idPersonalComputer}"/>
                            <input type="string" name="namePC" size="15" value="${pc.namePc}"  disabled="true"/></td>
                    </tr>
                       <tr> <td><label>Тип</label></td>
                       <td><input type="hidden" name="idType" size="15" value="${type.idType}"/>
                       <input type="string" name="nameType" size="15" value="${type.nameType}"  disabled="true"/></td>
                       </tr>
                    </tr>
                    
                       <tr>
                        <td><label>Дата выхода</label></td>
                        <td><input type="string" name="releaseDate" size="15" value="${pc.releaseDate}"  disabled="true"/></td>
                    </tr>
                    <tr>
                        <td><label>Платформа</label></td>
                        <td><input type="string" name="platform" value="${pc.platform}" disabled="true"/>
                        </td>
                    </tr>
                    <tr>
                        <td><label>Процессор</label></td>
                        <td><input type="string" name="processor" value="${pc.processor}"  disabled="true"/>
                        </td>
                    </tr>
                     <tr>
                        <td><label>Количество ядер<label></td>
                        <td><input type="string" name="numberOfCores" value="${pc.numberOfCores}"  disabled="true"/>
                        </td>
                    </tr>
                    <tr> 
                        <td><label>вес, г</label></td>
                        <td><input type="string" name="weight"  required size="15" value="${pc.weight}"  disabled="true"/></td>
                    </tr>
                    </tr>
                     <tr>
                        <td><label>Диагональ<label></td>
                        <td><input type="string" name="diagonal" value="${pc.diagonal}"  disabled="true"/>
                        </td>
                    </tr>
                    <tr>
                        <td><label>Оперативная память<label></td>
                        <td><input type="string" name="operationMemory" value="${pc.operationMemory}" disabled="true"/>
                        </td>
                    </tr>
                    <tr>
                        <td><label>Емкость жесткого диска<label></td>
                        <td><input type="string" name="hardDisk" value="${pc.hardDisk}" disabled="true"/>
                        </td>
                    </tr>
                   <tr> 
                        <td><label>Цена</label></td>
                        <td><input type="text" name="price"  required size="15" value="${pc.price}"/></td>
                    </tr>
                    <tr> 
                        <td><label>Скидка</label></td>
                        <td><input type="text" name="discount"  required size="15" value="${pc.discount}"/></td>
                    </tr>
                  
                </table>
                <br/>
                <button type="reset" value="Очистить поля">
                    Очистить поля
                </button>
                <button type="submit" name ="command" value="editPC">
                    Сохранить изменения
                </button>
            </fieldset>
        </form> 
    </body>
</html>
