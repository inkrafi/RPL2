package com.tokobungadao;

import java.util.List;

import com.tokobungamodel.TokoBunga;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class TokoBungaImpl implements TokoBungaDao {
    private final SessionFactory sessionFactory;

    public TokoBungaImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void delete(TokoBunga tokoBunga) {
        // TODO Auto-generated method stub
        Session session = sessionFactory.openSession();
        try {
            session.beginTransaction();
            session.delete(tokoBunga);
            session.getTransaction().commit();
        } catch (Exception e) {
            System.err.print("Tidak dapat menghapus data bunga");
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
    }

    @Override
    public TokoBunga get(String kd_bunga) {
        // TODO Auto-generated method stub
        Session session = sessionFactory.openSession();
        try {
            session.beginTransaction();
            TokoBunga tokoBunga = (TokoBunga) session.get(TokoBunga.class, kd_bunga);
            session.getTransaction().commit();
            return tokoBunga;
        } catch (Exception e) {
            System.err.print("Tidak dapat menampilkan data bunga");
            session.getTransaction().rollback();
            return null;
        } finally {
            session.close();
        }
    }

    @Override
    public List<TokoBunga> getList() {
        // TODO Auto-generated method stub
        // Session session = sessionFactory.openSession();
        // try {
        // session.beginTransaction();
        // List<TokoBunga> listbunga = session.createCriteria(TokoBunga.class).list;
        // session.getTransaction().commit();
        // return listbunga;
        // } catch (Exception e) {
        // System.err.print("Tidak ada list bunga");
        // session.getTransaction().rollback();
        return null;
        // } finally {
        // session.close();
        // }
    }

    @Override
    public void save(TokoBunga tokoBunga) {
        // TODO Auto-generated method stub
        Session session = sessionFactory.openSession();
        try {
            session.beginTransaction();
            session.save(tokoBunga);
            session.getTransaction().commit();
        } catch (Exception e) {
            System.err.print("Tidak dapat menyimpan data bunga");
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
    }

    @Override
    public void update(TokoBunga tokoBunga) {
        // TODO Auto-generated method stub
        Session session = sessionFactory.openSession();
        try {
            session.beginTransaction();
            session.update(tokoBunga);
            session.getTransaction().commit();
        } catch (Exception e) {
            System.err.print("Tidak dapat mengupdate data bunga");
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
    }

}
