package main.api.produtos.controller;

import main.api.produtos.model.entities.Produto;
import main.api.produtos.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping
    public List<Produto> getProdutos(){
        return produtoService.getListProdutos();
    }

    @PostMapping
    public Produto adicionar(@RequestBody Produto produto){
        produtoService.addProduto(produto);
        return produto;
    }
}
