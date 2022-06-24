package com.api.produtos.repository;

import com.api.produtos.model.Produto;

import java.util.List;

public abstract class ProdutoRepository {

    protected abstract void addProduto(long id, String nome);

    abstract void addProduto(long id, String nome, double preco);

    abstract String getProdutoById(long id);

    abstract List<Produto> getListByName(String nome);

    abstract double getPrecoProdutoById(long id);

    abstract List<Produto> getList(Produto produto);

    abstract void alterarProduto(Produto produto);

    abstract int countQuantidadeProdutoById(int id);

    abstract void deleteProdutoById(long id);


}
