package ManipularProdutos;

import Estoque.ControleEstoque;
import Produtos.Jogos;
import Produtos.Livro;
import Produtos.Produto;

public class ManipularJogos implements ManipularJogosInterface{

    @Override
    public boolean adicionarJogos(Jogos jogo) {
        try {
            if(!jogoExiste(jogo)){
                ControleEstoque.estoqueJogos.add(jogo);
                return true;
            }else{
                return false;
            }
        }catch (Exception e){
            return false;
        }
    }

    @Override
    public Jogos verJogos(int id) {
        int indexProduto = getJogoIndexById(id);
        if (indexProduto != -1) {
            return ControleEstoque.estoqueJogos.getLista().get(indexProduto);
        }
        return null;
    }

    @Override
    public boolean alterarJogos(Jogos jogo) {
        if (verJogos(jogo.getProdutoId()) != null) {
            int indexProduto = getJogoIndexById(jogo.getProdutoId());
            ControleEstoque.estoqueJogos.getLista().get(indexProduto).setProdutoGenero(jogo.getProdutoGenero());
            ControleEstoque.estoqueJogos.getLista().get(indexProduto).setProdutoPreco(jogo.getProdutoPreco());
            ControleEstoque.estoqueJogos.getLista().get(indexProduto).setProdutoNome(jogo.getProdutoNome());
            ControleEstoque.estoqueJogos.getLista().get(indexProduto).setDistribuidora(jogo.getDistribuidora());
            ControleEstoque.estoqueJogos.getLista().get(indexProduto).setEstudio(jogo.getEstudio());
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean removerJogos(int id) {
        Jogos jogo = verJogos(id);
        if (jogo != null) {
            ControleEstoque.estoqueJogos.getLista().remove(jogo);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int getJogoIndexById(int id) {
        for (int i = 0; i < ControleEstoque.estoqueJogos.getLista().size(); i++) {
            if (ControleEstoque.estoqueJogos.getLista().get(i).getProdutoId() == id) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean jogoExiste(Jogos jogo) {
        for (int i = 0; i < ControleEstoque.estoqueJogos.getLista().size(); i++) {
            if (ControleEstoque.estoqueJogos.getLista().get(i).getProdutoId() == jogo.getProdutoId()) {
                return true;
            }
        }
        return false;
    }

}
