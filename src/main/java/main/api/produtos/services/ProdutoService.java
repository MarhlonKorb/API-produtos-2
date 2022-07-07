package main.api.produtos.services;

import main.api.produtos.model.entities.Produto;
import main.api.produtos.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService  {

    @Autowired
    private ProdutoRepository produtoRepository;

    public Produto addProduto(Produto produto) {
        return produtoRepository.addProduto(produto);
    }

    public List<Produto> getListProdutos(){
        /*Regra de negócios*/
        return produtoRepository.getListProdutos();
    }

    public Optional<Produto> getProdutoById(int id) {
        return produtoRepository.getProdutoById(id);
    }

    public void deleteProdutoById ( int id){
        produtoRepository.deleteProdutoById(id);
    }

    public List<Produto> getListByName(String nome) {
        return produtoRepository.getListByName(nome);
    }

    public Produto atualizarProduto (int id, Produto produto){
        produto.setId(id);

        return produtoRepository.atualizarProduto(produto);
    }

    public int countQuantidadeProdutos (List<Produto> produtos){
        return produtoRepository.countQuantidadeProdutos(produtos);
    }

}
