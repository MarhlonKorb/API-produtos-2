package com.api.produtos.model;


import java.text.DateFormat;
import java.util.Objects;
import java.util.StringJoiner;

public class Produto {

    long id;
    String nome;
    double preco;

    public Produto(Long id, String nome, double preco) {
        super();
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return id == produto.id && Double.compare(produto.preco, preco) == 0 && Objects.equals(nome, produto.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, preco);
    }
}
