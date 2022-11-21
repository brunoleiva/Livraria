package Estoque;

import Produtos.*;

public class ControleEstoque {
    public static EstoqueGenerico<Livro> estoqueLivro  = new EstoqueGenerico<>();
    public static EstoqueGenerico<Brinquedos> estoqueBrinquedos = new EstoqueGenerico<>();
    public static EstoqueGenerico<Filmes> estoqueFilmes = new EstoqueGenerico<>();
    public static EstoqueGenerico<Jogos> estoqueJogos  = new EstoqueGenerico<>();
    public static EstoqueGenerico<AlbumMusica> estoqueAlbumMusica = new EstoqueGenerico<>();

    public static EstoqueGenerico<Produto> estoqueProdutos = new EstoqueGenerico<>();

    public static void teste(){
        System.out.printf(String.valueOf(estoqueProdutos.getLista().get(0).getClass()));
    }


}
