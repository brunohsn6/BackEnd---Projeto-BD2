package com.escola.demo.Service;


import com.escola.demo.Dao.ProfessorDAO;
import com.escola.demo.Entity.Professor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfessorService extends AbstractService<Professor, Long> {

    @Autowired
    private ProfessorDAO dao;

    public List<Professor> listarTodos() {
        return  dao.listar();
    }


    public Professor salvar(Professor professor) {
        return dao.salvar(professor);
    }


    public Professor atualizar(Professor professor) {
        return  dao.atualizar(professor);
    }


    public void deletar(Professor professor) {
        dao.deletar(professor);
    }


    public Professor buscar(Professor professor) {
        return  dao.buscar(professor);
    }
}