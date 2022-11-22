package ManipularProdutos;

import Produtos.Livro;
import Produtos.Produto;

public interface ManipularProdutoInterface<T> {
    public abstract boolean adicionarProduto(T t);
    public abstract Produto verProduto(int id);
    public abstract boolean alterarProduto(T t);
    public abstract boolean removerProduto(int id);
}
