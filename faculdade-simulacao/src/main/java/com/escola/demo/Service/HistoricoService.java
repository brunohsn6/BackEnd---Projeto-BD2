package com.escola.demo.Service;


import com.escola.demo.Dao.HistoricoDAO;
import com.escola.demo.Entity.Historico;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HistoricoService extends AbstractService<Historico, Long> {
    @Autowired
    private HistoricoDAO dao;

    public List<Historico> listarTodos() {
        return dao.listar();
    }


    public Historico salvar(Historico historico) {
        return dao.salvar(historico);
    }


    public Historico atualizar(Historico historico) {
        return dao.atualizar(historico);
    }


    public void deletar(Historico historico) {
        dao.deletar(historico);
    }


    public Historico buscar(Historico historico) {
        return dao.buscar(historico);
    }
}