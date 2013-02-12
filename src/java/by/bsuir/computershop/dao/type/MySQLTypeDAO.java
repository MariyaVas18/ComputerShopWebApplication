/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bsuir.computershop.dao.type;

import by.bsuir.computershop.dao.pc.*;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 * Определяет работу со счетом в бд
 *
 * @author Mariya Vasilevskaya
 */
public class MySQLTypeDAO implements ITypeDAO {

    Session session = null;

    public MySQLTypeDAO() {
        super();
    }
}
