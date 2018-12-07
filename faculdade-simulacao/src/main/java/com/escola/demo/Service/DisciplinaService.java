package com.escola.demo.Service;


import com.escola.demo.Dao.DisciplinaDAO;
import com.escola.demo.Entity.Disciplina;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DisciplinaService extends AbstractService<Disciplina, Long> {
    @Autowired
    private DisciplinaDAO dao;


    public List<Disciplina>listarTodos() {
        return dao.listar();
    }


    public Disciplina salvar(Disciplina disciplina) {
        return dao.salvar(disciplina);
    }


    public Disciplina atualizar(Disciplina disciplina) {
        return       dao.atualizar(disciplina);
    }


    public void deletar(Disciplina disciplina) {
        dao.deletar(disciplina);
    }


    public Disciplina buscar(Disciplina disciplina) {
        return  dao.buscar(disciplina);
    }
}