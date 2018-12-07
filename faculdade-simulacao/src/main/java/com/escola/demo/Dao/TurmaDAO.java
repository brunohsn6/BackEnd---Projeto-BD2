package com.escola.demo.Dao;


import com.escola.demo.Entity.Turma;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import javax.transaction.Transactional;

@Repository
@Transactional
public class TurmaDAO extends AbstractDAO<Turma, Integer>{
    @Autowired
    private EntityManagerFactory emf;

    public Turma buscarTurma(Turma turma) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        try{
            transaction.begin();
            String sql = "select * from turma where id = " + turma.getId();
            Query query = em.createNativeQuery(sql, Turma.class);
            Turma result = (Turma) query.getSingleResult();
            transaction.commit();
            return result;

        }catch(Exception e){
            e.printStackTrace();
        }finally {
            em.close();
        }
        return null;
    }
}
