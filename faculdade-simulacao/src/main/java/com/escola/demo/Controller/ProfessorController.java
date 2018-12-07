package com.escola.demo.Controller;

import com.escola.demo.Entity.Matricula;
import com.escola.demo.Entity.Professor;
import com.escola.demo.Service.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/professor")
@CrossOrigin(origins = "http://localhost:4200")
public class ProfessorController {
/*

    @Autowired // injeção de dependencia
    private ProfessorService service;

    @PostMapping("/salvar")
    public HttpEntity salvar(@RequestBody Professor professor){
        return service.salvar(professor);
    }

    @GetMapping("/listarTodos")
    public HttpEntity<List<Professor>> listarTodos(){
        return service.listarTodos();
    }

    @GetMapping("/buscar/{matricula}")
    public HttpEntity buscar(@PathVariable String matricula){

        Professor professor = new Professor();
        professor.setMatricula(matricula);
        return service.buscar(professor);
    }

    @PutMapping("/atualizar")
    public HttpEntity atualizar(@RequestBody Professor professor){
        return service.atualizar(professor);
    }

    @DeleteMapping("/deletar")
    public HttpEntity deletar(@RequestBody Professor professor){
        return service.deletar(professor);
    }*/
}
