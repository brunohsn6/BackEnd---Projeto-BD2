package com.escola.demo.Dao;


import com.escola.demo.Entity.Aluno;
import com.escola.demo.Exception.MatriculaInvalidaException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import javax.transaction.Transactional;

@Repository
@Transactional
public class AlunoDAO extends AbstractDAO<Aluno, Integer>{

    @Autowired
    private EntityManagerFactory emf;

    public Aluno buscarAluno(Aluno aluno){
        EntityManager em = emf.createEntityManager();
//        EntityTransaction transaction = em.getTransaction();
//        try{
//            transaction.begin();
//            String sql = "select * from aluno al inner join matricula_aluno mat on al.matricula_id = mat.id" +
//                    " where mat.matricula = "+ "'"+ aluno.getMatricula().getMatricula()+"'";
//            Query query = em.createNativeQuery(sql, Aluno.class);
//            Aluno result = (Aluno) query.getSingleResult();
//            transaction.commit();
//            return result;
//        }catch(Exception e){
//            e.printStackTrace();
//            transaction.rollback();
//        }finally {
//            em.close();
//        }
        return null;
    }

    public String salvarAluno(Aluno aluno){
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        try{
            transaction.begin();
            StoredProcedureQuery storedProcedure = em.createStoredProcedureQuery("checkAlunoExistence");
            storedProcedure.registerStoredProcedureParameter("matricula", String.class, ParameterMode.IN);
            storedProcedure.registerStoredProcedureParameter("@status", Boolean.class, ParameterMode.OUT);
//            storedProcedure.setParameter("matricula", aluno.getMatricula().getMatricula());
            storedProcedure.execute();
            boolean valido = (Boolean) storedProcedure.getOutputParameterValue("@status");
            if(valido){
                return "Erro da procedure";
            }
            em.persist(aluno);

            transaction.commit();
        }catch(Exception e){
            e.printStackTrace();
            transaction.rollback();
        }finally {
            em.close();
        }
        return "Aluno cadastrado!";
    }

}
