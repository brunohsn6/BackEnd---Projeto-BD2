package com.escola.demo.Service;


import com.escola.demo.Dao.DepartamentoDAO;
import com.escola.demo.Entity.Departamento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartamentoService extends AbstractService<Departamento, Long> {

    @Autowired
    private DepartamentoDAO dao;

    public List<Departamento> listarTodos() {

        return dao.listar();


    }

    public Departamento salvar(Departamento departamento) {
        return dao.salvar(departamento);
    }

    public Departamento atualizar(Departamento departamento) {
        return dao.atualizar(departamento);

    }

    public void deletar(Departamento departamento) {
        dao.deletar(departamento);
    }

    public Departamento buscar(Departamento departamento) {
        return  dao.buscar(departamento);
    }
}