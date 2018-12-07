package com.escola.demo.Dao;

import com.escola.demo.Entity.Professor;
import org.hibernate.HibernateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
@Transactional
public class ProfessorDAO extends AbstractDAO<Professor, Integer>{


    @Autowired
    private EntityManagerFactory emf;

    public String salvarProfessor(Professor professor) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        try {
            transaction.begin();

            em.persist(professor);

            transaction.commit();
        } catch (Exception e) {

            e.printStackTrace();
            transaction.rollback();
            return e.getMessage();
        } finally {
            em.close();
        }
        return "Professor cadastrado!";
    }
}
