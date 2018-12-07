package com.escola.demo.Dao;


import com.escola.demo.Entity.AbstractEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.List;

@Repository
@Component
public abstract class AbstractDAO<T extends AbstractEntity, I extends Serializable> {

    @Autowired
    private EntityManagerFactory emf;

    protected Class<T> classe;

    public AbstractDAO(Class<T> classe) {
		this.classe = classe;
    }
    public AbstractDAO() {
        this.classe = (Class<T>) ((ParameterizedType) getClass()
            .getGenericSuperclass()).getActualTypeArguments()[0];
     }

  

    public T salvar(T entity) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        try {
            transaction.begin();
            em.persist(entity);
            transaction.commit();
        }catch(Exception e){
            e.printStackTrace();
            transaction.rollback();
        }finally {
            em.close();
        }
        return entity;
    }

    public List<T> listar() {
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        List<T> result = new ArrayList<>();
        try {
            transaction.begin();
            CriteriaBuilder builder = em.getCriteriaBuilder();
            CriteriaQuery<T> cq = builder.createQuery(classe);
            Root<T> rootEntry = cq.from(classe);
            CriteriaQuery<T> all = cq.select(rootEntry);
            TypedQuery<T> allQuery = em.createQuery(all);
            result =  allQuery.getResultList();
            transaction.commit();
        }catch(Exception e){
            e.printStackTrace();
            transaction.rollback();
        }finally {
            em.close();
        }
        return result;
    }

    public T buscar(T entity){
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        try{
            transaction.begin();
            T result = em.find(classe,entity);
            transaction.commit();
            return result;
        }catch(Exception e){
            e.printStackTrace();
            transaction.rollback();
        }finally {
            em.close();
        }
        return null;
    }


    // nao implementados. apenas copiados
    public T atualizar(T entity){
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        try{
            transaction.begin();
            T result = em.merge(entity);
            transaction.commit();
            return result;
        }catch(Exception e){
            e.printStackTrace();
            transaction.rollback();
        }finally {
            em.close();
        }
        return null;
    }

    public void deletar(T entity){
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        try{
            transaction.begin();
            em.remove(entity);
            transaction.commit();
        }catch(Exception e){
            e.printStackTrace();
            transaction.rollback();
        }finally {
            em.close();
        }
    }

}
