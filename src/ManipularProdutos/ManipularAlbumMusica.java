package ManipularProdutos;

import Estoque.ControleEstoque;
import Produtos.AlbumMusica;
import Produtos.Brinquedos;

public class ManipularAlbumMusica implements ManipularAlbumMusicaInterface{

    @Override
    public boolean adicionarAlbumMusica(AlbumMusica albumMusica) {
        try {
            if(!albumMusicaExiste(albumMusica)){
                ControleEstoque.estoqueAlbumMusica.add(albumMusica);
                return true;
            }else{
                return false;
            }
        }catch (Exception e){
            return false;
        }
    }

    @Override
    public AlbumMusica verAlbumMusica(int id) {
        int indexProduto = getAlbumMusicaIndexById(id);
        if (indexProduto != -1) {
            return ControleEstoque.estoqueAlbumMusica.getLista().get(indexProduto);
        }
        return null;
    }

    @Override
    public boolean alterarAlbumMusica(AlbumMusica albumMusica) {
        if (verAlbumMusica(albumMusica.getProdutoId()) != null) {
            int indexProduto = getAlbumMusicaIndexById(albumMusica.getProdutoId());
            ControleEstoque.estoqueAlbumMusica.getLista().get(indexProduto).setProdutoGenero(albumMusica.getProdutoGenero());
            ControleEstoque.estoqueAlbumMusica.getLista().get(indexProduto).setProdutoPreco(albumMusica.getProdutoPreco());
            ControleEstoque.estoqueAlbumMusica.getLista().get(indexProduto).setProdutoNome(albumMusica.getProdutoNome());
            ControleEstoque.estoqueAlbumMusica.getLista().get(indexProduto).setMusicoBanda(albumMusica.getMusicoBanda());
            ControleEstoque.estoqueAlbumMusica.getLista().get(indexProduto).setSelo(albumMusica.getSelo());
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean removerAlbumMusica(int id) {
        AlbumMusica albumMusica = verAlbumMusica(id);
        if (albumMusica != null) {
            ControleEstoque.estoqueAlbumMusica.getLista().remove(albumMusica);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int getAlbumMusicaIndexById(int id) {
        for (int i = 0; i < ControleEstoque.estoqueAlbumMusica.getLista().size(); i++) {
            if (ControleEstoque.estoqueAlbumMusica.getLista().get(i).getProdutoId() == id) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean albumMusicaExiste(AlbumMusica albumMusica) {
        for (int i = 0; i < ControleEstoque.estoqueAlbumMusica.getLista().size(); i++) {
            if (ControleEstoque.estoqueAlbumMusica.getLista().get(i).getProdutoId() == albumMusica.getProdutoId()) {
                return true;
            }
        }
        return false;
    }
}
