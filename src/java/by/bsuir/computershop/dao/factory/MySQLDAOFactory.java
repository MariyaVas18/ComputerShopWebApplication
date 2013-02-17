/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bsuir.computershop.dao.factory;

import by.bsuir.computershop.dao.notebook.INotebookDAO;
import by.bsuir.computershop.dao.notebook.MySQLNotebookDAO;
import by.bsuir.computershop.dao.pc.IPCDAO;
import by.bsuir.computershop.dao.pc.MySQLPCDAO;
import by.bsuir.computershop.dao.purchase.IPurchaseDAO;
import by.bsuir.computershop.dao.purchase.MySQLPurchaseDAO;
import by.bsuir.computershop.dao.type.ITypeDAO;
import by.bsuir.computershop.dao.type.MySQLTypeDAO;

/**
 * Определяет типы DAO объектов
 *
 * @author Mariya Vasilevskaya
 */
public class MySQLDAOFactory extends DAOFactory {

    @Override
    public INotebookDAO getNotebookDAO() {
        return new MySQLNotebookDAO();
    }

    @Override
    public IPCDAO getPCDAO() {
        return new MySQLPCDAO();
    }

    @Override
    public ITypeDAO getTypeDAO() {
        return new MySQLTypeDAO();
    }

    @Override
    public IPurchaseDAO getPurchaseDAO() {
        return new MySQLPurchaseDAO();
    }
}
