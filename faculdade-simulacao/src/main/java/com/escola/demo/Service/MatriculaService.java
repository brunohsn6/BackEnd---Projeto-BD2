package com.escola.demo.Service;

import com.escola.demo.Dao.HistoricoDAO;
import com.escola.demo.Dao.MatriculaDAO;
import com.escola.demo.Entity.Matricula;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatriculaService extends AbstractService<Matricula, Long> {
    @Autowired
    private MatriculaDAO dao;

    @Autowired
    private HistoricoDAO historicoDAO;

    public List<Matricula> listarTodos() {
        return  dao.listar();
    }

    public Matricula salvar(Matricula matricula) {
        return dao.salvar(matricula);
    }

    public Matricula atualizar(Matricula matricula) {
        return dao.atualizar(matricula);
    }

    public void deletar(Matricula matricula) {
        dao.deletar(matricula);

    }

    public Matricula buscar(Matricula matricula) {
        return dao.buscar(matricula);
    }

    public Double buscarCoeficiente(Matricula matricula) {
        return historicoDAO.buscarCoenficiente(matricula);
    }
}
