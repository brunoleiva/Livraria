package Financeiro;

import Produtos.Produto;

public class Financeiro implements FinanceiroInterface {

    @Override
    public boolean realizarCompra(Caixa caixa, Produto produto) {
        if(caixa.getDinheiro() >= produto.getProdutoPreco() && produto.) {
            caixa.setDinheiro(caixa.getDinheiro() - produto.getProdutoPreco());

            return true;
        }else{
            return false;
        }
    }
}
