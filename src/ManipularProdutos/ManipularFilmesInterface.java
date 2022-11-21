package ManipularProdutos;

import Produtos.Filmes;
import Produtos.Jogos;

public interface ManipularFilmesInterface {
    public abstract boolean adicionarFilmes(Filmes filmes);
    public abstract Filmes verFilmes(int id);
    public abstract boolean alterarFilmes(Filmes filmes);
    public abstract boolean removerFilmes(int id);
    public int getFilmeIndexById(int id);
    public boolean filmeExiste(Filmes filme);

}
