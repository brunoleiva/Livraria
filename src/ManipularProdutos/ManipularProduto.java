package ManipularProdutos;

import Estoque.ControleEstoque;
import Estoque.EstoqueGenerico;
import Produtos.Produto;

public class ManipularProduto implements ManipularProdutoInterface{

    @Override
    public boolean adicionarProduto(Produto produto, EstoqueGenerico estoque) {
        try {
            estoque.add(produto);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @Override
    public Produto verProduto(int id) {
        int indexProduto = getProdutoIndexById(id);
        if(indexProduto != -1) {
            return ControleEstoque.estoqueProdutos.getLista().get(indexProduto);
        }
        return null;
    }

    @Override
    public boolean alterarProduto(Produto produto) {
        if(verProduto(produto.getProdutoId())!= null){
            ControleEstoque.estoqueProdutos.getLista().get(getProdutoIndexById(produto.getProdutoId())).setProdutoPreco();
            ControleEstoque.estoqueProdutos.getLista().get(getProdutoIndexById(produto.getProdutoId())).setProdutoPreco();
            ControleEstoque.estoqueProdutos.getLista().get(getProdutoIndexById(produto.getProdutoId())).setProdutoPreco();
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean removerProduto(int id) {
        return false;
    }

    public int getProdutoIndexById(int id){
        for(int i = 0; i < ControleEstoque.estoqueProdutos.getLista().size(); i++){
            if (ControleEstoque.estoqueProdutos.getLista().get(i).getProdutoId() == id){
                return i;
            }
        }
        return -1;
    }

}
