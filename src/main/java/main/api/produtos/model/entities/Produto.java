package main.api.produtos.model.entities;


import jakarta.persistence.Id;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import java.util.Objects;


@RequestMapping(path = "/produtos")
public class Produto {

    @Id
    private long id;

    @NotBlank
    private String nome;
    @Min(0)
    @Max(1)
    private double preco;

    public Produto(@RequestBody Long id, String nome, double preco) {
        super();
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public Long getId() {
        return id;
    }

    public void setId(long id) {
        this.id =  id;
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
