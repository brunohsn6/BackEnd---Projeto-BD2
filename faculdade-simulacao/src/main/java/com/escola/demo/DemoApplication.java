package com.escola.demo;

import com.escola.demo.Dao.CursoDAO;
import com.escola.demo.Dao.HistoricoDAO;
import com.escola.demo.Dao.MatriculaDAO;
import com.escola.demo.Entity.*;
import com.escola.demo.Repository.CursoRepository;
import com.escola.demo.Service.*;
import com.escola.demo.Util.Situacao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Time;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;

@SpringBootApplication
public class DemoApplication  implements CommandLineRunner {

    @Autowired
    AlunoService alunoService;

    @Autowired
    CursoService cursoService;

    @Autowired
    DepartamentoService departamentoService;

    @Autowired
    HistoricoService historicoService;

    @Autowired
    DisciplinaService disciplinaService;
    @Autowired
    MatriculaService matriculaService;
    @Autowired
    MatriculaDAO matriculaDAO;
    @Autowired
    HistoricoDAO historicoDAO;
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }




    @Override
    public void run(String... args) throws Exception {
        Departamento d = new Departamento();
        d.setNome("departamento 1");
        d.setCodigo("dpto 01");
        departamentoService.salvar(d);

        Curso c = new Curso();
        c.setCodigo("inf0001");
        c.setCargaHoraria(40);
        c.setCreditos(20);
        c.setDepartamento(d);
        c.setNome("Curso 01");
        cursoService.salvar(c);

        Aluno a = new Aluno();
        a.setNome("bruno");
        Matricula m = new Matricula();
        m.setMatricula("2016107000");
        m.setCurso(c);
        m.setSituacao(Situacao.Ativo);
        m.setAluno(a);

        //a.addMatricula(m);
        alunoService.salvar(a);
        matriculaService.salvar(m);

        Disciplina disc = new Disciplina();
        disc.setCodigo("disc1");
        disc.setNome("disciplina 1");
        disciplinaService.salvar(disc);

        Historico h = new Historico();
        h.setDisciplina(disc);
        h.setMatricula(m);
        h.setNotaFinal(10);
        historicoService.salvar(h);

        System.out.println(matriculaService.buscarCoeficiente(m));
        //alunoService.deletar(a);
//        Matricula m = new Matricula();
//        m.setMatricula("2016107634");
//        Aluno aluno = new Aluno();
//       aluno.setMatricula(m);
//        aluno.setNome("Felipe");
//        alunoService.salvar(aluno);
//        List<Aluno> alunos= alunoService.listarTodos();
//        alunos.forEach(a-> System.out.println(a.getMatricula() + "-" + a.getNome()));
//        aluno.setNome("lucas");
//        alunoService.atualizar(aluno);
//        System.out.println(aluno.getNome());
//        Aluno a3 = new Aluno();
//        a3.setNome("lucas");
//        a3.setMatricula(m);
//        Aluno a2 = alunoService.buscar(aluno);
//        Aluno a4 = alunoService.buscar(a3);

    }
}
