package Produtos;

public class Produto implements ProdutoInterface {
    private int id;
    private double preco;
    private String genero;
    private String nome;
    private boolean isDestinadoAdultos;

    public Produto(int id, double preco, String genero, String nome) {
        this.id = id;
        this.preco = preco;
        this.genero = genero;
        this.nome = nome;
    }
    public Produto(int id, double preco, String genero, String nome, boolean isDestinadoAdultos) {
        this.id = id;
        this.preco = preco;
        this.genero = genero;
        this.nome = nome;
        this.isDestinadoAdultos = isDestinadoAdultos;
    }

    public Produto(int id) {
        this.id = id;
    }

    public Produto() {

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

    @Override
    public boolean getIsDestinadoAdultos() {
        return this.isDestinadoAdultos;
    }

    @Override
    public void setIsDestinadoAdultos(boolean isDestinadoAdultos) {
        this.isDestinadoAdultos = isDestinadoAdultos;
    }

    @Override
    public String toString() {
        return  "id=" + id +
                ", preco=" + preco +
                ", genero='" + genero + '\'' +
                ", nome='" + nome + '\'' ;
    }
    @Override
    public boolean equals(Object obj) {

        Produto produto = (Produto) obj;

        if(getProdutoId() == produto.getProdutoId()) {
            return true;
        } else {
            return false;
        }
    }
}