package Produtos;

public class Jogos extends Produto{

    private String distribuidora;
    private String estudio;

    public Jogos(int id, double preco, String genero, String nome, String distribuidora, String estudio) {
        super(id, preco, genero, nome);
        this.distribuidora = distribuidora;
        this.estudio = estudio;
    }

    public Jogos(int id, double preco, String genero, String nome) {
        super(id, preco, genero, nome);
    }

    public Jogos(int id) {
        super(id);
    }

    public String getDistribuidora() {
        return distribuidora;
    }

    public void setDistribuidora(String distribuidora) {
        this.distribuidora = distribuidora;
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }

    @Override
    public String toString() {
        return "Jogos{" +super.toString()  +
                ",distribuidora='" + distribuidora + '\'' +
                ", estudio='" + estudio + '\'' +
                '}'+"\n";
    }
}
