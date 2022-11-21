package ManipularProdutos;

import Estoque.EstoqueGenerico;
import Produtos.Produto;

public interface ManipularProdutoInterface<T> {
    public abstract boolean adicionarProduto(Produto produto, EstoqueGenerico<T> estoque);
    public abstract Produto verProduto(int id);
    public abstract boolean alterarProduto(Produto produto);
    public abstract boolean removerProduto(int id);

}