package Financeiro;

import Cliente.Comprador;
import Produtos.AlbumMusica;
import Produtos.Produto;

public interface FinanceiroInterface {

    public abstract boolean realizarCompra(Caixa caixa, Produto produto);
    public abstract boolean finalizarCompra(Caixa caixa, Produto produto, Comprador comprador);
    public abstract boolean isCompradorMaiordeIdade(Comprador comprador);
    public abstract void isAplicaDesconto(Produto produto);
}
