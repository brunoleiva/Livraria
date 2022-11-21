package Estoque;

import Produtos.*;

public class ControleEstoque {
    public static EstoqueGenerico<Livro> estoqueLivro  = new EstoqueGenerico<>();
    public static EstoqueGenerico<Brinquedos> estoqueBrinquedos = new EstoqueGenerico<>();
    public static EstoqueGenerico<Filmes> estoqueFilmes = new EstoqueGenerico<>();
    public static EstoqueGenerico<Jogos> estoqueJogos  = new EstoqueGenerico<>();
    public static EstoqueGenerico<AlbumMusica> estoqueAlbumMusica = new EstoqueGenerico<>();


    public static EstoqueGenerico<Produto> produtos = new EstoqueGenerico<>();


    public static int quantidadeProdutos(EstoqueGenerico estoque){
        return estoque.size();
    }

    public static String listagemPorCategoria(EstoqueGenerico estoque){
        return "Listagem por categoria: \n" + estoque.getLista().toString();
    }
    public static String listagemEstoque(){
        produtos.getLista().addAll(estoqueLivro.getLista());
        produtos.getLista().addAll(estoqueBrinquedos.getLista());
        produtos.getLista().addAll(estoqueFilmes.getLista());
        produtos.getLista().addAll(estoqueJogos.getLista());
        produtos.getLista().addAll(estoqueAlbumMusica.getLista());
        return "Listagem completa: \n" + produtos.getLista().toString();
    }
}
