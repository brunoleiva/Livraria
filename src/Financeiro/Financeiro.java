package Financeiro;

import Cliente.Comprador;
import ManipularProdutos.ManipularProduto;
import Produtos.Produto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.Date;

public class Financeiro implements FinanceiroInterface {
    ManipularProduto manipularProduto = new ManipularProduto();

    @Override
    public boolean realizarCompra(Caixa caixa, Produto produto) {
        if (caixa.getDinheiro() >= produto.getProdutoPreco() && manipularProduto.verProduto(produto.getProdutoId()) != null) {
            manipularProduto.removerProduto(produto.getProdutoId());
            caixa.setDinheiro(caixa.getDinheiro() - produto.getProdutoPreco());

            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean finalizarCompra(Caixa caixa, Produto produto, Comprador comprador) {
        if (isCompradorMaiordeIdade(comprador)){
            isAplicaDesconto(produto);
            realizarCompra(caixa,produto);
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean isCompradorMaiordeIdade(Comprador comprador) {
        Date dataAtual = new Date();
        //calcula diferença
        if(findDifference(comprador.getDataNascimento(),dataAtual)>=18) {
            return true;
        }else {
            return false;
        }
    }

    @Override
    public void isAplicaDesconto(Produto produto) {
        if (produto.getProdutoPreco()>200){
            produto.setProdutoPreco(produto.getProdutoPreco() + (produto.getProdutoPreco() * 0.15) );
        }
    }


    static long
    findDifference(Date start_date,
                   Date end_date) {
        SimpleDateFormat sdf
                = new SimpleDateFormat(
                "dd-MM-yyyy HH:mm:ss");
        long difference_In_Time
                = end_date.getTime() - start_date.getTime();

        long difference_In_Years
                = (difference_In_Time
                / (1000l * 60 * 60 * 24 * 365));

        return difference_In_Years;

    }

}
