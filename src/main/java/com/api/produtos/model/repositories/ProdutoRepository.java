package com.api.produtos.model.repositories;

import com.api.produtos.model.entities.Produto;


import java.util.List;

public abstract class ProdutoRepository {

    protected abstract void addProduto(long id, String nome);

    protected abstract void addProduto(long id, String nome, double preco);

    protected abstract String getProdutoById(long id);

    protected abstract List<Produto> getListByName(String nome);

    protected abstract double getPrecoProdutoById(long id);

    protected abstract List<Produto> getList(Produto produto);

    protected abstract void alterarProduto(Produto produto);

    protected abstract int countQuantidadeProdutoById(int id);

    protected abstract void deleteProdutoById(long id);


}
