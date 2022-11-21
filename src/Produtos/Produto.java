package Produtos;

public class Produto implements ProdutoInterface {
    private int id;
    private double preco;
    private String genero;
    private String nome;

    public Produto(int id, double preco, String genero, String nome) {
        this.id = id;
        this.preco = preco;
        this.genero = genero;
        this.nome = nome;
    }

    public Produto(int id) {
        this.id = id;
    }

    @Override
    public int getProdutoId() {
        return this.id;
    }

    @Override
    public void setProdutoId(int id) {
        this.id = id;
    }

    @Override
    public double getProdutoPreco() {
        return this.preco;
    }

    @Override
    public void setProdutoPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String getProdutoGenero() {
        return this.genero;
    }

    @Override
    public void setProdutoGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String getProdutoNome() {
        return this.nome;
    }

    @Override
    public void setProdutoNome(String nome) {
        this.nome = nome;
    }
}