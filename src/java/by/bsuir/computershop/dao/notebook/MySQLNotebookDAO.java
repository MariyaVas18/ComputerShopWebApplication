/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bsuir.computershop.dao.notebook;

import by.bsuir.computershop.dao.entity.Notebook;
import by.bsuir.computershop.hibernateutil.HibernateUtil;
import java.util.Collection;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 * Определяет работу со счетом в бд
 *
 * @author Mariya Vasilevskaya
 */
public class MySQLNotebookDAO implements INotebookDAO {

    private Session session;

    public MySQLNotebookDAO() {
        super();
        session = null;
    }

    @Override
    public List<Notebook> getAllNotebook() {
        List<Notebook> notebooks = null;
        try {
            this.session = HibernateUtil.getSessionFactory().getCurrentSession();
            org.hibernate.Transaction tx = session.beginTransaction();
            Query q = session.createQuery("from Notebook");
            notebooks = (List<Notebook>) q.list();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return notebooks;
    }

    @Override
    public Notebook getNotebookById(int idNotebook) {
         Notebook notebook = null;
        try {
            this.session = HibernateUtil.getSessionFactory().getCurrentSession();
            org.hibernate.Transaction tx = session.beginTransaction();
            Query q = session.createQuery("from Notebook where idNotebook = " + idNotebook);
            notebook = ((List<Notebook>) q.list()).get(0);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return notebook;
    }

    @Override
    public boolean deleteNotebookById(int idNotebook) {
        try {
            this.session = HibernateUtil.getSessionFactory().getCurrentSession();
            org.hibernate.Transaction tx = session.beginTransaction();
            Query q = session.createQuery("delete from Notebook where idNotebook = " + idNotebook);
            q.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean insertNotebook(Notebook notebook) {
        try {
            this.session = HibernateUtil.getSessionFactory().getCurrentSession();
            org.hibernate.Transaction tx = session.beginTransaction();
            this.session.save(notebook);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean updateNotebook(Notebook notebook) {
         try {
            this.session = HibernateUtil.getSessionFactory().getCurrentSession();
            org.hibernate.Transaction tx = session.beginTransaction();
            this.session.saveOrUpdate(notebook);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
