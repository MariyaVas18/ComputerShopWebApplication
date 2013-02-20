/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bsuir.computershop.dao.type;

import by.bsuir.computershop.dao.entity.Notebook;
import by.bsuir.computershop.dao.entity.Type;
import by.bsuir.computershop.hibernateutil.HibernateUtil;
import java.util.List;
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

    @Override
    public List<Type> getAllType() {
         List<Type> types = null;
        try {
            this.session = HibernateUtil.getSessionFactory().getCurrentSession();
            org.hibernate.Transaction tx = session.beginTransaction();
            Query q = session.createQuery("from Type");
            types = (List<Type>) q.list();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return types;
    }

    @Override
    public Type getTypeByID(int idType) {
        Type type = null;
        try {
            this.session = HibernateUtil.getSessionFactory().getCurrentSession();
            org.hibernate.Transaction tx = session.beginTransaction();
            Query q = session.createQuery("from Type where idType = " + idType);
            type = ((List<Type>) q.list()).get(0);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return type;
    }
    
}
