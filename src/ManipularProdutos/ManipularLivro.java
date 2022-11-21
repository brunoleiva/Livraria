package ManipularProdutos;

import Estoque.ControleEstoque;
import Estoque.EstoqueGenerico;
import Produtos.Livro;
import Produtos.Produto;

public class ManipularLivro implements ManipularLivroInterface {

    @Override
    public boolean adicionarLivro(Livro livro) {
        try {
            if (!livroExiste(livro)) {
                ControleEstoque.estoqueLivro.add(livro);
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public Livro verLivro(int id) {
        int indexProduto = getLivroIndexById(id);
        if (indexProduto != -1) {
            return ControleEstoque.estoqueLivro.getLista().get(indexProduto);
        }
        return null;
    }

    @Override
    public boolean alterarLivro(Livro livro) {

        if (verLivro(livro.getProdutoId()) != null) {
            int indexProduto = getLivroIndexById(livro.getProdutoId());
            ControleEstoque.estoqueLivro.getLista().get(indexProduto).setProdutoGenero(livro.getProdutoGenero());
            ControleEstoque.estoqueLivro.getLista().get(indexProduto).setProdutoPreco(livro.getProdutoPreco());
            ControleEstoque.estoqueLivro.getLista().get(indexProduto).setProdutoNome(livro.getProdutoNome());
            ControleEstoque.estoqueLivro.getLista().get(indexProduto).setEditora(livro.getEditora());
            ControleEstoque.estoqueLivro.getLista().get(indexProduto).setEscritor(livro.getEscritor());
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean removerLivro(int id) {
        Livro livro = verLivro(id);
        if (livro != null) {
            ControleEstoque.estoqueLivro.getLista().remove(livro);
            return true;
        } else {
            return false;
        }
    }
    @Override
    public int getLivroIndexById(int id) {
        for (int i = 0; i < ControleEstoque.estoqueLivro.getLista().size(); i++) {
            if (ControleEstoque.estoqueLivro.getLista().get(i).getProdutoId() == id) {
                return i;
            }
        }
        return -1;
    }
    @Override
    public boolean livroExiste(Livro livro) {
        for (int i = 0; i < ControleEstoque.estoqueLivro.getLista().size(); i++) {
            if (ControleEstoque.estoqueLivro.getLista().get(i).getProdutoId() == livro.getProdutoId()) {
                return true;
            }
        }
        return false;
    }

  }
