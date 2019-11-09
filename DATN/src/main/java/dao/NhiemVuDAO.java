package dao;
 
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import entity.TaiKhoan;
 
@Transactional
@Repository
public class NhiemVuDAO {
 
    @Autowired
    private SessionFactory sessionFactory;
 
    public TaiKhoan findTaiKhoan(String userName) {
        Session session = this.sessionFactory.getCurrentSession();
        return session.find(TaiKhoan.class, userName);
    }
 
}