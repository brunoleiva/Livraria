package ManipularProdutos;

import Estoque.ControleEstoque;
import Produtos.Brinquedos;
import Produtos.Filmes;

public class ManipularBrinquedos implements ManipularBrinquedosInterface {

    @Override
    public boolean adicionarBrinquedos(Brinquedos brinquedo) {
        try {
            if(!brinquedoExiste(brinquedo)){
                ControleEstoque.estoqueBrinquedos.add(brinquedo);
                return true;
            }else{
                return false;
            }
        }catch (Exception e){
            return false;
        }
    }

    @Override
    public Brinquedos verBrinquedos(int id) {
        int indexProduto = getBrinquedoIndexById(id);
        if (indexProduto != -1) {
            return ControleEstoque.estoqueBrinquedos.getLista().get(indexProduto);
        }
        return null;
    }

    @Override
    public boolean alterarBrinquedos(Brinquedos brinquedos) {
        if (verBrinquedos(brinquedos.getProdutoId()) != null) {
            int indexProduto = getBrinquedoIndexById(brinquedos.getProdutoId());
            ControleEstoque.estoqueBrinquedos.getLista().get(indexProduto).setProdutoGenero(brinquedos.getProdutoGenero());
            ControleEstoque.estoqueBrinquedos.getLista().get(indexProduto).setProdutoPreco(brinquedos.getProdutoPreco());
            ControleEstoque.estoqueBrinquedos.getLista().get(indexProduto).setProdutoNome(brinquedos.getProdutoNome());
            ControleEstoque.estoqueBrinquedos.getLista().get(indexProduto).setTipo(brinquedos.getTipo());
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean removerBrinquedos(int id) {
        Brinquedos brinquedos = verBrinquedos(id);
        if (brinquedos != null) {
            ControleEstoque.estoqueBrinquedos.getLista().remove(brinquedos);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int getBrinquedoIndexById(int id) {
        for (int i = 0; i < ControleEstoque.estoqueBrinquedos.getLista().size(); i++) {
            if (ControleEstoque.estoqueBrinquedos.getLista().get(i).getProdutoId() == id) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean brinquedoExiste(Brinquedos brinquedo) {
        for (int i = 0; i < ControleEstoque.estoqueBrinquedos.getLista().size(); i++) {
            if (ControleEstoque.estoqueBrinquedos.getLista().get(i).getProdutoId() == brinquedo.getProdutoId()) {
                return true;
            }
        }
        return false;
    }
}
