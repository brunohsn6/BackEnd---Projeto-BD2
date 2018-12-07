package com.escola.demo.Service;


import com.escola.demo.Dao.CursoDAO;
import com.escola.demo.Entity.Curso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoService extends AbstractService<Curso, Long> {

    @Autowired
    private CursoDAO dao;


    public List<Curso> listarTodos() {
        return dao.listar();
    }

    public Curso salvar(Curso curso) {
        return dao.salvar(curso);

    }

    public Curso atualizar(Curso curso) {
        return dao.atualizar(curso);
    }


    public void deletar(Curso curso) {
        dao.deletar(curso);
    }


    public Curso buscar(Curso curso) {
        return dao.buscar(curso);
    }
}