package com.escola.demo.Controller;

import com.escola.demo.Entity.Departamento;
import com.escola.demo.Service.DepartamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departamento")
@CrossOrigin(origins = "http://localhost:4200")
public class DepartamentoController {

/*
    @Autowired // injeção de dependencia
    private DepartamentoService service;

    @PostMapping("/salvar")
    public ResponseEntity salvar(@RequestBody Departamento departamento){
        return service.salvar(departamento);
    }

    @GetMapping("/listarTodos")
    public HttpEntity<List<Departamento>> listarTodos(){
        return service.listarTodos();
    }

    @GetMapping("/buscar/{codigo}")
    public HttpEntity buscar(@PathVariable String codigo){

        Departamento departamento = new Departamento();
        departamento.setCodigo(codigo);
        return service.buscar(departamento);
    }

    @PutMapping("/atualizar")
    public HttpEntity atualizar(@RequestBody Departamento departamento){
        return service.atualizar(departamento);
    }

    @DeleteMapping("/deletar")
    public HttpEntity deletar(@RequestBody Departamento departamento){
        return service.deletar(departamento);
    }*/
}