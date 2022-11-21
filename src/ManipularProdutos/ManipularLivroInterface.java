package ManipularProdutos;

import Produtos.Livro;

public interface ManipularLivroInterface {
    public abstract boolean adicionarLivro(Livro livro);
    public abstract Livro verLivro(int id);
    public abstract boolean alterarLivro(Livro livro);
    public abstract boolean removerLivro(int id);
    public int getLivroIndexById(int id);
    public boolean livroExiste(Livro livro);
}
