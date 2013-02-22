/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bsuir.computershop.dao.purchase;

import by.bsuir.computershop.dao.entity.Purchase;
import by.bsuir.computershop.hibernateutil.HibernateUtil;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 * Определяет работу со счетом в бд
 *
 * @author Mariya Vasilevskaya
 */
public class MySQLPurchaseDAO implements IPurchaseDAO {

    private Session session;

    public MySQLPurchaseDAO() {
        super();
        session = null;
    }

    @Override
    public Collection getAllPurchase() {
        List<Purchase> purchses = null;
        try {
            this.session = HibernateUtil.getSessionFactory().getCurrentSession();
            org.hibernate.Transaction tx = session.beginTransaction();
            Query q = session.createQuery("from Purchase");
            purchses = (List<Purchase>) q.list();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return purchses;
    }

    @Override
    public Purchase getPurchaseById(int idPurcase) {
        Purchase purchase = null;
        try {
            this.session = HibernateUtil.getSessionFactory().getCurrentSession();
            org.hibernate.Transaction tx = session.beginTransaction();
            Query q = session.createQuery("from Purchase where idPurchase = " + idPurcase);
            purchase = ((List<Purchase>) q.list()).get(0);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return purchase;
    }

    @Override
    public Purchase getPurchaseByDate(Date date) {
        Purchase purchase = null;
        try {
            this.session = HibernateUtil.getSessionFactory().getCurrentSession();
            org.hibernate.Transaction tx = session.beginTransaction();
            Query q = session.createQuery("from Purchase where releaseDate = '" + date + "'");
            purchase = ((List<Purchase>) q.list()).get(0);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return purchase;
    }
     @Override
    public boolean insertPurchase(Purchase purchase) {
        try {
            this.session = HibernateUtil.getSessionFactory().getCurrentSession();
            if (!this.session.isOpen()) {
                this.session = HibernateUtil.getSessionFactory().openSession();
            }
            org.hibernate.Transaction tx = session.beginTransaction();
            this.session.save(purchase);
            tx.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
