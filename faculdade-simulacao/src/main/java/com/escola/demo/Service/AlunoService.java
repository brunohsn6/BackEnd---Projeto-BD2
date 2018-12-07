package com.escola.demo.Service;


import com.escola.demo.Dao.AlunoDAO;
import com.escola.demo.Dao.HistoricoDAO;
import com.escola.demo.Entity.Aluno;
import com.escola.demo.Entity.Historico;
import com.escola.demo.Entity.Matricula;
import com.escola.demo.Exception.MatriculaInvalidaException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService extends AbstractService<Aluno,Long>{

    @Autowired
    private AlunoDAO dao;

    @Autowired
    private HistoricoDAO historicoDAO;

    public List<Aluno> listarTodos() {
        return  dao.listar();
    }

    public Aluno salvar(Aluno aluno) {
        return dao.salvar(aluno);
    }

    public Aluno atualizar(Aluno aluno) {
        return dao.atualizar(aluno);
    }

    public void deletar(Aluno aluno) {
        dao.deletar(aluno);

    }

    public Aluno buscar(Aluno aluno) {
        return dao.buscar(aluno);
    }

    public Double buscarCoeficiente(Matricula matricula) {
        return historicoDAO.buscarCoenficiente(matricula);
    }
}