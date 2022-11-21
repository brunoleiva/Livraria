package ManipularProdutos;

import Produtos.AlbumMusica;
import Produtos.Brinquedos;

public interface ManipularAlbumMusicaInterface {
    public abstract boolean adicionarAlbumMusica(AlbumMusica albumMusica);
    public abstract AlbumMusica verAlbumMusica(int id);
    public abstract boolean alterarAlbumMusica(AlbumMusica albumMusica);
    public abstract boolean removerAlbumMusica(int id);
    public int getAlbumMusicaIndexById(int id);
    public boolean albumMusicaExiste(AlbumMusica albumMusica);
}
