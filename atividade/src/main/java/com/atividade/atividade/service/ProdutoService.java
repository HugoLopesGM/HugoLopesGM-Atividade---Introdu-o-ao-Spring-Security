package com.atividade.atividade.service;

import com.atividade.atividade.model.ProdutoModel;
import com.atividade.atividade.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {
    @Autowired
    private ProdutoRepository repository;

    public List<ProdutoModel>listar(){
        return repository.findAll();
    }

    public ProdutoModel save(ProdutoModel produtoModel){
        return repository.save(produtoModel);
    }

    public Optional<ProdutoModel> buscaPorId(Long id){
        return repository.findById(id);
    }

    public void deletar(Long id){
        repository.deleteById(id);
    }

    public



}
