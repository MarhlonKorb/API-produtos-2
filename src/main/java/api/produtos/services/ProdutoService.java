package api.produtos.services;

import api.produtos.model.entities.Produto;
import api.produtos.repositories.ProdutoRepository_old;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService  {

    @Autowired
    private ProdutoRepository_old produtoRepositoryOld;

    public Produto addProduto(Produto produto) {
        return produtoRepositoryOld.addProduto(produto);
    }

    public List<Produto> getListProdutos(){
        /*Regra de negócios*/
        return produtoRepositoryOld.getListProdutos();
    }

    public Optional<Produto> getProdutoById(int id) {
        return produtoRepositoryOld.getProdutoById(id);
    }

    public void deleteProdutoById ( int id){
        produtoRepositoryOld.deleteProdutoById(id);
    }

    public List<Produto> getListByName(String nome) {
        return produtoRepositoryOld.getListByName(nome);
    }

    public Produto atualizarProduto (int id, Produto produto){
        produto.setId(id);

        return produtoRepositoryOld.atualizarProduto(produto);
    }

    public int countQuantidadeProdutos (List<Produto> produtos){
        return produtoRepositoryOld.countQuantidadeProdutos(produtos);
    }

}
