package com.atividade.atividade.controllers;


import com.atividade.atividade.model.ProdutoModel;
import com.atividade.atividade.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController // Avisa o Spring que esta classe é um controlador de API do tipo REST.
@RequestMapping(path = "/Produtos") //Define o endereço base (URL) para aceder a este grupo de funcionalidades.
public class ProdutoController {
    @Autowired // Faz a Injeção de Dependências automática.
    private ProdutoService service;


    // os maping mapeiam os Métodos HTTP que o cliente Postman utiliza para indicar a ação que deseja realizar.
    @GetMapping
    public List<ProdutoModel> listar(){
        return service.listar();
    }

    @PostMapping
    public ProdutoModel save(@RequestBody ProdutoModel produtoModel){
        return service.save(produtoModel);
    }

    @PostMapping("{/id}")
    public Optional<ProdutoModel> buscaPorId(@PathVariable Long id){
        return service.buscaPorId(id);
    }

    @DeleteMapping("{/id}")
    public void deletar(@PathVariable Long id){
        service.deletar(id);
    }

    @PutMapping("{/id}")
    public ProdutoModel alterarProduto(@PathVariable Long id, @RequestBody ProdutoModel produtoModel){
       ProdutoModel produtoNovo = alterarProduto(id, produtoModel);
       return service.save(produtoNovo);

    }

}
