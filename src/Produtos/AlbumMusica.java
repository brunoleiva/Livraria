package Produtos;

public class AlbumMusica extends Produto{

    private String musicoBanda;
    private String selo;

    public AlbumMusica(int id, double preco, String genero, String nome, String musicoBanda, String selo) {
        super(id, preco, genero, nome);
        this.musicoBanda = musicoBanda;
        this.selo = selo;
    }

    public AlbumMusica(int id, double preco, String genero, String nome) {
        super(id, preco, genero, nome);
    }


    public AlbumMusica(int id) {
        super(id);
    }

    public String getMusicoBanda() {
        return musicoBanda;
    }

    public void setMusicoBanda(String musicoBanda) {
        this.musicoBanda = musicoBanda;
    }

    public String getSelo() {
        return selo;
    }

    public void setSelo(String selo) {
        this.selo = selo;
    }
}
