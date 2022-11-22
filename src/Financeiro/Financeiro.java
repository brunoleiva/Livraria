package Financeiro;

import Estoque.ControleEstoque;
import ManipularProdutos.ManipularProduto;
import Produtos.Produto;

public class Financeiro implements FinanceiroInterface {
    ManipularProduto manipularProduto = new ManipularProduto();
    @Override
    public boolean realizarCompra(Caixa caixa, Produto produto) {
        if(caixa.getDinheiro() >= produto.getProdutoPreco() && manipularProduto.verProduto(produto.getProdutoId()) != null) {
            manipularProduto.removerProduto(produto.getProdutoId());
            caixa.setDinheiro(caixa.getDinheiro() - produto.getProdutoPreco());

            return true;
        }else{
            return false;
        }
    }
}
