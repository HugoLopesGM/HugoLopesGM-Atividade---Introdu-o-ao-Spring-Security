package com.atividade.atividade.controllers;


import com.atividade.atividade.model.ProdutoModel;
import com.atividade.atividade.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/produtos")
public class ProdutoController {
    @Autowired
    private ProdutoService service;

    @GetMapping
    public List<ProdutoModel> listar(){
        return service.listar();
    }

    @PostMapping
    public ProdutoModel save(@RequestBody ProdutoModel produtoModel){
        return service.save(produtoModel);
    }

    @PostMapping
    public Optional<ProdutoModel> buscaPorId(@PathVariable Long id){
        return service.buscaPorId(id);
    }

    @DeleteMapping
    public void deletar(@PathVariable Long id){
        service.deletar(id);
    }

}
