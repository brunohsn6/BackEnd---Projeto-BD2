package com.escola.demo.Controller;

import com.escola.demo.Entity.Historico;
import com.escola.demo.Service.HistoricoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/historico")
@CrossOrigin(origins = "http://localhost:4200")
public class HistoricoController {


   /* @Autowired // injeção de dependencia
    private HistoricoService service;

    @PostMapping("/salvar")
    public HttpEntity salvar(@RequestBody Historico historico){
        return service.salvar(historico);
    }

    @GetMapping("/listarTodos")
    public HttpEntity<List<Historico>> listarTodos(){
        return service.listarTodos();
    }

//    @GetMapping("/buscar/{matricula}")
//    public HttpEntity buscar(@PathVariable String codigo){
//
//        Historico historico = new Historico();
//        historico.set(codigo);
//        return service.buscar(historico);
//    }

    @PutMapping("/atualizar")
    public HttpEntity atualizar(@RequestBody Historico historico){
        return service.atualizar(historico);
    }

    @DeleteMapping("/deletar")
    public HttpEntity deletar(@RequestBody Historico historico){
        return service.deletar(historico);
    }*/
}
