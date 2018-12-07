package com.escola.demo.Controller;

import com.escola.demo.Entity.Disciplina;
import com.escola.demo.Service.DisciplinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/disciplina")
@CrossOrigin(origins = "http://localhost:4200")
public class DisciplinaController {
/*

    @Autowired // injeção de dependencia
    private DisciplinaService service;


    @PostMapping("/salvar")
    public HttpEntity salvar(@RequestBody Disciplina disciplina){
        return service.salvar(disciplina);
    }

    @GetMapping("/listarTodos")
    public HttpEntity<List<Disciplina>> listarTodos(){
        return service.listarTodos();
    }

    @GetMapping("/buscar/{codigo}")
    public HttpEntity buscar(@PathVariable String codigo){

        Disciplina disciplina = new Disciplina();
        disciplina.setCodigo(codigo);
        return service.buscar(disciplina);
    }

    @PutMapping("/atualizar")
    public HttpEntity atualizar(@RequestBody Disciplina disciplina){
        return service.atualizar(disciplina);
    }

    @DeleteMapping("/deletar")
    public HttpEntity deletar(@RequestBody Disciplina disciplina){
        return service.deletar(disciplina);
    }*/
}
