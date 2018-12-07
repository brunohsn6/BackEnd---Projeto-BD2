package com.escola.demo.Dao;

import com.escola.demo.Entity.Matricula;
import com.escola.demo.Util.Situacao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;
@Repository
@Transactional
public class MatriculaDAO extends AbstractDAO<Matricula, Long> {
    @Autowired
    private EntityManagerFactory emf;

    public Double getMediaAlunosEmSituacao(Situacao situacao){
        EntityManager entityManager = emf.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        Double media = Double.valueOf(0);
        try{
            transaction.begin();
            StoredProcedureQuery storedProcedure = entityManager.createStoredProcedureQuery("mediaAlunosSituacao");
            storedProcedure.registerStoredProcedureParameter("situacao", String.class, ParameterMode.IN);
            storedProcedure.registerStoredProcedureParameter("@resultado", Double.class, ParameterMode.OUT);
            storedProcedure.setParameter("situacao",situacao.name());
            storedProcedure.execute();
            media = (Double) storedProcedure.getOutputParameterValue("@resultado");
            transaction.commit();
        }catch (Exception e){
            transaction.rollback();
        }finally {
            entityManager.close();
        }
        return media;
    }
}
