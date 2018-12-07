package com.escola.demo.Controller;

import com.escola.demo.Entity.Turma;
import com.escola.demo.Service.TurmaService;
import com.escola.demo.Util.DTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/turma")
@CrossOrigin(origins = "http://localhost:4200")
public class TurmaController {
/*

    @Autowired // injeção de dependencia
    private TurmaService service;

    @PostMapping("/salvar")
    public HttpEntity salvar(@RequestBody Turma turma){
        return service.salvar(turma);
    }

    @GetMapping("/listarTodos")
    public HttpEntity<List<Turma>> listarTodos(){
        return service.listarTodos();
    }

    @GetMapping("/buscar/{codigo}")
    public HttpEntity buscar(@PathVariable String codigo){

        Turma turma = new Turma();
        turma.setCodigo(codigo);
        return service.buscar(turma);
    }

    @PutMapping("/atualizar")
    public HttpEntity atualizar(@RequestBody Turma turma){
        return service.atualizar(turma);
    }

    @DeleteMapping("/deletar")
    public HttpEntity deletar(@RequestBody Turma turma){
        return service.deletar(turma);
    }


    /*@PostMapping("/addAluno")
    public ResponseEntity<String> add (@RequestBody DTO dto){
        return service.adicionarAluno(dto);
    }*/
}
