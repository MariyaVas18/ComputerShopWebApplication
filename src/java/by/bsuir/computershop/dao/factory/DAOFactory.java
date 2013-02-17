/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bsuir.computershop.dao.factory;

import by.bsuir.computershop.dao.notebook.INotebookDAO;
import by.bsuir.computershop.dao.pc.IPCDAO;
import by.bsuir.computershop.dao.purchase.IPurchaseDAO;
import by.bsuir.computershop.dao.type.ITypeDAO;

/**
 * Определяет фабрику для работы с субд
 *
 * @author Mariya Vasilevskaya
 */
public abstract class DAOFactory {

    private static final String MYSQL = "MYSQL";

    public abstract INotebookDAO getNotebookDAO();

    public abstract IPCDAO getPCDAO();

    public abstract ITypeDAO getTypeDAO();

    public abstract IPurchaseDAO getPurchaseDAO();

    public static DAOFactory getDAOFactory(String whichFactory) {
        if (MYSQL.equals(whichFactory)) {
            return new MySQLDAOFactory();
        } else {
            return null;
        }
    }
}
