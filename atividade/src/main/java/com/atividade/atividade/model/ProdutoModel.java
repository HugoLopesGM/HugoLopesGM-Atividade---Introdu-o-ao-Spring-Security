package com.atividade.atividade.model;

import jakarta.persistence.*;
import lombok.Data;

@Data// serve
@Entity
@Table(name = "tb_produto")
public class ProdutoModel {
@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    public ProdutoModel() {

    }
}
