package com.escola.demo.Service;

import com.escola.demo.Dao.AbstractDAO;
import com.escola.demo.Entity.AbstractEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;


public abstract class AbstractService<T extends AbstractEntity<ID>, ID extends Serializable> {

//    @Autowired
//    private AbstractDAO<T, ID> dao;
//
//    @Autowired
//    private JpaRepository<T,ID> dao;




//    public List<T> listarTodos(T t){
//        return dao.listar(t);
//    }
//
//    public T buscar(T t){
//        return dao.buscar(t);
//    }
//
//    public T salvar(T t){
//        return dao.salvar(t);
//    }
//
//    public T atualizar(T t){
//        return dao.atualizar(t);
//    }
//
//    public void deletar(T t){
//        dao.deletar(t);
//    }
//    public abstract HttpEntity <List<T>> listarTodos();
//    public abstract HttpEntity salvar(T t);
//
//    public abstract HttpEntity  atualizar(T t);
//
//    public abstract HttpEntity deletar(T t);
//
//    public abstract HttpEntity buscar(T t);
}