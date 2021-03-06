package api.produtos.repositories;

import api.produtos.model.entities.Produto;
import api.produtos.model.exception.ResourceNotFoundException;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ProdutoRepository_old {

    private List<Produto> produtos = new ArrayList<Produto>();
    private int ultimoId = 0;

    /**
     * @param produto que será adicionado
     * @return void
     */
    public Produto addProduto(Produto produto) {
        ultimoId++;
        produto.setId(ultimoId);
        produtos.add(produto);
        return produto;
    }

    /**
     * @return lista de produtos
     */
    public List<Produto> getListProdutos() {
        return produtos;
    }

    /**
     * @param id do produto que será localizado
     * @return Retorna produto pelo seu id caso seja encontrado
     */
    public Optional<Produto> getProdutoById(int id) {
        return produtos
                .stream()
                .filter(produto -> produto.getId() == id)
                .findFirst();
    }

    /**
     * @param id id do produto a ser deletado.
     * @return void
     */
    public void deleteProdutoById (int id){
        produtos.removeIf(produto -> produto.getId() == id);
    }

    public List<Produto> getListByName(String nome) {
        return (List<Produto>) produtos.stream().filter(produto -> produto.getNome() == nome);
    }

    /**
     * @param produto produto a ser atualizado.
     */
    public Produto atualizarProduto (Produto produto){
        Optional<Produto> produtoEncontrado = getProdutoById(produto.getId());
        if (produtoEncontrado.isEmpty()){
            throw new ResourceNotFoundException("Produto não encontrado");
        }
        deleteProdutoById(produto.getId());
        addProduto(produto);
        return produto;
    }

  public int countQuantidadeProdutos ( List<Produto> produtos){
     if (!produtos.isEmpty()){
        return (int) produtos.stream().count();
     }
     return 0;
  }

}
