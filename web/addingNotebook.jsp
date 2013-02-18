<%-- 
    Document   : addingComputer
    Created on : Feb 17, 2013, 1:46:04 PM
    Author     : 1
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
                        <td><input type="string" name="nameNotebook" size="15"/></td>
                    </tr>
                       <tr> <td><label>Тип</label></td>
                        <td>  <select name="type"  required style="width: 121px" >
                                <option></option>
                                <option value="бюджетный">бюджетный</option>
                                <option value="потребительский">потребительский</option>
                                <option value="офисный">офисный</option>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td><label>Дата выхода</label></td>
                        <td><input type="date" name="releaseDate" size="15"/></td>
                    </tr>
                    <tr>
                        <td><label>Платформа</label></td>
                        <td><select name="platform" required style="width: 121px">
                                <option ></option>
                                <option value="AMD Brazos 2.0 (2011)">AMD Brazos 2.0 (2011)</option>
                                <option value="Intel Huron River (2011)">Intel Huron River (2011)</option>
                                <option value="Intel Chief River (2012) ">Intel Chief River (2012) </option>
                                <option value="Intel Cedar Trail (2012) ">Intel Cedar Trail (2012) </option>
                        </td>
                    </tr>
                    <tr>
                        <td><label>Процессор</label></td>
                        <td><select name="processor" required style="width: 121px">
                                <option ></option>
                                <option value="AMD Fusion">AMD Fusion</option>
                                <option value="AMD A68M">AMD A68M</option>
                                <option value="Intel Core i3">Intel Core i3</option>
                                <option value="Intel Core i5">Intel Core i5</option>
                                <option value="Intel Core i7">Intel Core i7</option>
                        </td>
                    </tr>
                     <tr>
                        <td><label>Количество ядер<label></td>
                        <td><select name="numberOfCores" required style="width: 121px">
                                <option ></option>
                                <option value="1">1</option>
                                <option value="2">2</option>
                                <option value="3">3</option>
                                <option value="4">4</option>
                                <option value="8">8</option>
                                <option value="10">10</option>
                                <option value="12">12</option>
                        </td>
                    </tr>
                    <tr> 
                        <td><label>вес, г</label></td>
                        <td><input type="number" name="weight"  required size="15"/></td>
                    </tr>
                    </tr>
                     <tr>
                        <td><label>Диагональ<label></td>
                        <td><select name="diagonal" required style="width: 121px">
                                <option ></option>
                                <option value="10">10</option>
                                <option value="12.2">12.2</option>
                                <option value="12.6">12.6</option>
                                <option value="13">13</option>
                                <option value="14">14</option>
                                <option value="15.6">15.6</option>
                                <option value="17">17</option>
                        </td>
                    </tr>
                    <tr>
                        <td><label>Оперативная память<label></td>
                        <td><select name="operationMemory" required style="width: 121px">
                                <option ></option>
                                <option value="1">1</option>
                                <option value="2">2</option>
                                <option value="3">3</option>
                                <option value="4">4</option>
                                <option value="8">8</option>
                                <option value="10">10</option>
                                <option value="16">12</option>
                        </td>
                    </tr>
                    <tr>
                        <td><label>Емкость жесткого диска<label></td>
                        <td><select name="hardDisk" required style="width: 121px">
                                <option ></option>
                                <option value="200">200</option>
                                <option value="220">220</option>
                                <option value="340">340</option>
                                <option value="400">400</option>
                                <option value="460">460</option>
                                <option value="540">540</option>
                                <option value="640">640</option>
                        </td>
                    </tr>
                    <tr> 
                        <td><label>Время работы</label></td>
                        <td><input type="text" name="battery"  required size="15"/></td>
                    </tr>
                    <tr> 
                        <td><label>Цена</label></td>
                        <td><input type="text" name="price"  required size="15"/></td>
                    </tr>
                    <tr> 
                        <td><label>Скидка</label></td>
                        <td><input type="text" name="discount"  required size="15"/></td>
                    </tr>
                  
                </table>
                <br/>
                <button type="reset" value="Очистить поля">
                    Очистить поля
                </button>
                <button type="submit" name ="command" value="addingNotebook">
                    Добавить ноутбук
                </button>
            </fieldset>
        </form> 
    </body>
</html>
