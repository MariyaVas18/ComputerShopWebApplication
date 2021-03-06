/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bsuir.computershop.dao.pc;

import by.bsuir.computershop.dao.entity.Personalcomputer;
import by.bsuir.computershop.hibernateutil.HibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 * Определяет работу со счетом в бд
 *
 * @author Mariya Vasilevskaya
 */
public class MySQLPCDAO implements IPCDAO {

    private Session session;

    public MySQLPCDAO() {
        super();
        session = null;
    }

    @Override
    public Personalcomputer getPersonalComputerById(int idPC) {
        Personalcomputer pc = null;
        try {
            this.session = HibernateUtil.getSessionFactory().getCurrentSession();
            org.hibernate.Transaction tx = session.beginTransaction();
            Query q = session.createQuery("from Personalcomputer where idPersonalComputer = " + idPC);
            pc = ((List<Personalcomputer>) q.list()).get(0);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pc;
    }

    @Override
    public boolean deletePersonalComputerById(int idPC) {
        try {
            this.session = HibernateUtil.getSessionFactory().getCurrentSession();
            org.hibernate.Transaction tx = session.beginTransaction();
            Query q = session.createQuery("delete from PersonalComputer where idPersonalComputer = " + idPC);
            q.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean insertPersonalComputer(Personalcomputer pc) {
        try {
            this.session = HibernateUtil.getSessionFactory().getCurrentSession();
            if (!this.session.isOpen()) {
                this.session = HibernateUtil.getSessionFactory().openSession();
            }
            org.hibernate.Transaction tx = session.beginTransaction();
            this.session.save(pc);
            tx.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean updatePersonalComputer(Personalcomputer pcForUpdate) {
        Personalcomputer pc = new Personalcomputer();
        try {
            this.session.flush();
            Session session1 = HibernateUtil.getSessionFactory().openSession();
            org.hibernate.Transaction tx = session1.beginTransaction();
           
            pc.setIdPersonalComputer(pcForUpdate.getIdPersonalComputer());
            pc.setDiagonal(pcForUpdate.getDiagonal());
            pc.setDiscount(pcForUpdate.getDiscount());
            pc.setHardDisk(pcForUpdate.getHardDisk());
            pc.setNamePc(pcForUpdate.getNamePc());
            pc.setNumberOfCores(pcForUpdate.getNumberOfCores());
            pc.setOperationMemory(pcForUpdate.getOperationMemory());
            pc.setPlatform(pcForUpdate.getPlatform());
            pc.setPrice(pcForUpdate.getPrice());
            pc.setProcessor(pcForUpdate.getProcessor());
            pc.setReleaseDate(pcForUpdate.getReleaseDate());
            pc.setType(pcForUpdate.getType());
            pc.setWeight(pcForUpdate.getWeight());
            session1.saveOrUpdate(pc);
            tx.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public List<Personalcomputer> getAllPersonalComputer() {
        List<Personalcomputer> pComputers = null;
        try {
            this.session = HibernateUtil.getSessionFactory().getCurrentSession();
            org.hibernate.Transaction tx = session.beginTransaction();
            Query q = session.createQuery("from Personalcomputer");
            pComputers = (List<Personalcomputer>) q.list();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pComputers;
    }
}
