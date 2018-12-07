package com.escola.demo.Controller;

import com.escola.demo.Entity.Curso;
import com.escola.demo.Entity.Departamento;
import com.escola.demo.Service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/curso")
@CrossOrigin(origins = "http://localhost:4200")
public class CursoController {

/*
    @Autowired // injeção de dependencia
    private CursoService service;

    @PostMapping("/salvar")
    public HttpEntity salvar(@RequestBody Curso curso){
        return service.salvar(curso);
    }
	
	@GetMapping("/listarTodos")
    public HttpEntity<List<Curso>> listarTodos(){
        return service.listarTodos();
    }

    @GetMapping("/buscar/{codigo}") // aqui tu passa codigo para as outras entities mari
    public HttpEntity buscar(@PathVariable String codigo){
        Curso c = new Curso(); c.setCodigo(codigo);
        return service.buscar(c);
    }

    @PutMapping("/atualizar")
    public HttpEntity atualizar(@RequestBody Curso curso){
        return service.atualizar(curso);
    }

    @DeleteMapping("/deletar")
    public HttpEntity deletar(@RequestBody Curso curso){
        return service.deletar(curso);
    }*/
}