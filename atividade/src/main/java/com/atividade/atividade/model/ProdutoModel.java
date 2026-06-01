package com.atividade.atividade.model;

import jakarta.persistence.*;
import lombok.Data;

@Data// É uma anotação do Lombok que gera automaticamente todo o código repetitivo da classe.
@Entity //  Avisa o JPA (Java Persistence API) que esta classe Java é uma Entidade.
@Table(name = "tb_produto") //Define o nome exato da tabela na base de dados.
public class ProdutoModel {


@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private int valor;

    public ProdutoModel() {

    }
}
