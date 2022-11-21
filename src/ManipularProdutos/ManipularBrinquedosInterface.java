package ManipularProdutos;

import Produtos.Brinquedos;
import Produtos.Filmes;

public interface ManipularBrinquedosInterface {
    public abstract boolean adicionarBrinquedos(Brinquedos brinquedos);
    public abstract Brinquedos verBrinquedos(int id);
    public abstract boolean alterarBrinquedos(Brinquedos brinquedos);
    public abstract boolean removerBrinquedos(int id);
    public int getBrinquedoIndexById(int id);
    public boolean brinquedoExiste(Brinquedos brinquedo);

}
