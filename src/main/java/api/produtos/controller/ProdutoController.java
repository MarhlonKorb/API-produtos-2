package api.produtos.controller;

import api.produtos.model.entities.Produto;
import api.produtos.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping
    public List<Produto> getProdutos(){
        return produtoService.getListProdutos();
    }

    @GetMapping("/{id}")
    public Optional<Produto> getProdutoById(@PathVariable int id) {
        return produtoService.getProdutoById(id);
    }

    @PostMapping
    public Produto adicionar(Produto produto){
       return produtoService.addProduto(produto);
    }

    @DeleteMapping("/{id}")
    public String deletar(@PathVariable int id) {
        produtoService.deleteProdutoById(id);
        return "O produto com o id " + id + " foi deletado com sucesso!" ;
    }

    @PutMapping("/{id}")
    public Produto atualizar(@RequestBody Produto produto) {
        return produtoService.atualizarProduto(produto.getId(), produto);
    }
}
