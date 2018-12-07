package com.escola.demo.Controller;

import com.escola.demo.Entity.Aluno;
import com.escola.demo.Entity.Matricula;
import com.escola.demo.Service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/aluno")
@CrossOrigin(origins = "http://localhost:4200")
public class AlunoController {
   /* @Autowired
    private AlunoService service;

    @PostMapping("/salvar")
    public HttpEntity salvar(@RequestBody Aluno aluno){
        return service.salvar(aluno);
    }

    @GetMapping("/listarTodos")
    public HttpEntity<List<Aluno>> listarTodos(){
        return service.listarTodos();
    }

    @GetMapping("/buscar/{matricula}")
    public HttpEntity buscar(@PathVariable String matricula){
        Matricula m = new Matricula();
        m.setMatricula(matricula);
        Aluno aluno = new Aluno();
       // aluno.setMatricula(m);
        return service.buscar(aluno);
    }

    @PutMapping("/atualizar")
    public HttpEntity atualizar(@RequestBody Aluno aluno){
        return service.atualizar(aluno);
    }

    @DeleteMapping("/deletar")
    public HttpEntity deletar(@RequestBody Aluno aluno){
        return service.deletar(aluno);
    }

    @GetMapping("/coeficiente")
    public ResponseEntity getCoef(@RequestBody Matricula matricula){
        return service.buscarCoeficiente(matricula);
    }*/
}
