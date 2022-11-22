package ManipularProdutos;

import Estoque.ControleEstoque;
import Produtos.*;

public class ManipularProduto implements ManipularProdutoInterface {
    @Override
    public boolean adicionarProduto(Object o) {
        try {
            if(!produtoExiste(o)){
                ControleEstoque.produtos.add((Produto) o);
                return true;
            }else{
                return false;
            }
        }catch (Exception e){
            return false;
        }
    }

    @Override
    public Produto verProduto(int id) {
        int indexProduto = getProdutoIndexById(id);
        if (indexProduto != -1) {
            return ControleEstoque.produtos.getLista().get(indexProduto);
        }
        return null;
    }

    @Override
    public boolean alterarProduto(Object o) {
        int indexProduto = -1;
        indexProduto = ControleEstoque.produtos.getLista().indexOf(o);
        if (indexProduto != -1) {
            ControleEstoque.produtos.getLista().set(indexProduto, (Produto) o);
            return true;
        }else {
            return false;
        }

        /*switch (o.getClass().toString()) {
            case NomeClasses.livro:
                System.out.println("Entrou");
                indexProduto = ControleEstoque.estoqueLivro.getLista().indexOf(o);
                if (indexProduto != -1) {
                    System.out.println("Entrou2");
                    ControleEstoque.estoqueLivro.getLista().set(indexProduto, (Livro) o);
                    return true;
                }
                break;
            case NomeClasses.brinquedos:
                indexProduto = ControleEstoque.estoqueBrinquedos.getLista().indexOf(o);
                if (indexProduto != -1) {
                    ControleEstoque.estoqueBrinquedos.getLista().set(indexProduto, (Brinquedos) o);
                    return true;
                }
                break;
            case NomeClasses.albumMusica:
                indexProduto = ControleEstoque.estoqueAlbumMusica.getLista().indexOf(o);
                if (indexProduto != -1) {
                    ControleEstoque.estoqueAlbumMusica.getLista().set(indexProduto, (AlbumMusica) o);
                    return true;
                }
                break;
            case NomeClasses.filme:
                indexProduto = ControleEstoque.estoqueFilmes.getLista().indexOf(o);
                if (indexProduto != -1) {
                    ControleEstoque.estoqueFilmes.getLista().set(indexProduto, (Filmes) o);
                    return true;
                }
                break;
            case NomeClasses.jogo:
                indexProduto = ControleEstoque.estoqueJogos.getLista().indexOf(o);
                if (indexProduto != -1) {
                    ControleEstoque.estoqueJogos.getLista().set(indexProduto, (Jogos) o);
                    return true;
                }
                break;
            default:
                return false;
        }*/
    }


    @Override
    public boolean removerProduto(int id) {
        Produto produto = verProduto(id);
        if (produto != null) {
            ControleEstoque.produtos.getLista().remove(produto);
            return true;
        } else {
            return false;
        }
    }

    public int getProdutoIndexById(int id) {
        for (int i = 0; i < ControleEstoque.produtos.getLista().size(); i++) {
            if (ControleEstoque.produtos.getLista().get(i).getProdutoId() == id) {
                return i;
            }
        }
        return -1;
    }

    public boolean produtoExiste(Object o) {
        Produto produto = (Produto) o;
        for (int i = 0; i < ControleEstoque.produtos.getLista().size(); i++) {
            if (ControleEstoque.produtos.getLista().get(i).getProdutoId() == produto.getProdutoId()) {
                return true;
            }
        }
        return false;
    }

}
