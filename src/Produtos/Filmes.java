package Produtos;

import java.util.ArrayList;

public class Filmes extends Produto{

    private String estudio;
    private ArrayList<String> diretores;
    private ArrayList<String> produtores;

    public Filmes(int id, double preco, String genero, String nome, String estudio, ArrayList<String> diretores, ArrayList<String> produtores) {
        super(id, preco, genero, nome);
        this.estudio = estudio;
        this.diretores = diretores;
        this.produtores = produtores;
    }

    public Filmes(int id, double preco, String genero, String nome) {
        super(id, preco, genero, nome);
    }

    public Filmes(int id) {
        super(id);
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }

    public ArrayList<String> getDiretores() {
        return diretores;
    }

    public void setDiretores(ArrayList<String> diretores) {
        this.diretores = diretores;
    }

    public ArrayList<String> getProdutores() {
        return produtores;
    }

    public void setProdutores(ArrayList<String> produtores) {
        this.produtores = produtores;
    }
}
