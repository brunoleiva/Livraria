package ManipularProdutos;

import Estoque.ControleEstoque;
import Produtos.Filmes;
import Produtos.Jogos;

public class ManipularFilmes implements ManipularFilmesInterface{

    @Override
    public boolean adicionarFilmes(Filmes filme) {
        try {
            if(!filmeExiste(filme)){
                ControleEstoque.estoqueFilmes.add(filme);
                return true;
            }else{
                return false;
            }
        }catch (Exception e){
            return false;
        }
    }

    @Override
    public Filmes verFilmes(int id) {
        int indexProduto = getFilmeIndexById(id);
        if (indexProduto != -1) {
            return ControleEstoque.estoqueFilmes.getLista().get(indexProduto);
        }
        return null;
    }

    @Override
    public boolean alterarFilmes(Filmes filmes) {
        if (verFilmes(filmes.getProdutoId()) != null) {
            int indexProduto = getFilmeIndexById(filmes.getProdutoId());
            ControleEstoque.estoqueFilmes.getLista().get(indexProduto).setProdutoGenero(filmes.getProdutoGenero());
            ControleEstoque.estoqueFilmes.getLista().get(indexProduto).setProdutoPreco(filmes.getProdutoPreco());
            ControleEstoque.estoqueFilmes.getLista().get(indexProduto).setProdutoNome(filmes.getProdutoNome());
            ControleEstoque.estoqueFilmes.getLista().get(indexProduto).setDiretores(filmes.getDiretores());
            ControleEstoque.estoqueFilmes.getLista().get(indexProduto).setEstudio(filmes.getEstudio());
            ControleEstoque.estoqueFilmes.getLista().get(indexProduto).setProdutores(filmes.getProdutores());
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean removerFilmes(int id) {
        Filmes filme = verFilmes(id);
        if (filme != null) {
            ControleEstoque.estoqueFilmes.getLista().remove(filme);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int getFilmeIndexById(int id) {
        for (int i = 0; i < ControleEstoque.estoqueFilmes.getLista().size(); i++) {
            if (ControleEstoque.estoqueFilmes.getLista().get(i).getProdutoId() == id) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean filmeExiste(Filmes filme) {
        for (int i = 0; i < ControleEstoque.estoqueFilmes.getLista().size(); i++) {
            if (ControleEstoque.estoqueFilmes.getLista().get(i).getProdutoId() == filme.getProdutoId()) {
                return true;
            }
        }
        return false;
    }
}
