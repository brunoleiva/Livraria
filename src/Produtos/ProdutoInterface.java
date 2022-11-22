package Produtos;

public interface ProdutoInterface {

    public abstract int getProdutoId();
    public abstract void setProdutoId(int id);

    public abstract double getProdutoPreco();
    public abstract void setProdutoPreco(double preco);

    public abstract String getProdutoGenero();
    public abstract void setProdutoGenero(String genero);

    public abstract String getProdutoNome();
    public abstract void setProdutoNome(String nome);

    public abstract boolean getIsDestinadoAdultos();
    public abstract void setIsDestinadoAdultos(boolean destinadoAdultos);
}