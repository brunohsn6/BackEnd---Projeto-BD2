package com.escola.demo.Service;


import com.escola.demo.Dao.TurmaDAO;
import com.escola.demo.Entity.Turma;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TurmaService extends AbstractService<Turma,Long>{
    @Autowired
    private TurmaDAO dao;

    public List<Turma>listarTodos() {
        return dao.listar();

    }

    public Turma salvar(Turma turma) {
        return   dao.salvar(turma);
    }


    public Turma atualizar(Turma turma) {
        return  dao.atualizar(turma);
    }


    public void deletar(Turma turma) {
        dao.deletar(turma);
    }


    public Turma buscar(Turma turma) {
        return  dao.buscar(turma);
    }


}