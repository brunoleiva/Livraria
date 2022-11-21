package ManipularProdutos;

import Produtos.Jogos;
import Produtos.Livro;

public interface ManipularJogosInterface {
    public abstract boolean adicionarJogos(Jogos jogo);
    public abstract Jogos verJogos(int id);
    public abstract boolean alterarJogos(Jogos jogo);
    public abstract boolean removerJogos(int id);
    public int getJogoIndexById(int id);
    public boolean jogoExiste(Jogos jogo);
}
