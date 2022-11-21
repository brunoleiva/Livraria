package Financeiro;

import Produtos.AlbumMusica;
import Produtos.Produto;

public interface FinanceiroInterface {

    public abstract boolean realizarCompra(Caixa caixa, Produto produto);
}
