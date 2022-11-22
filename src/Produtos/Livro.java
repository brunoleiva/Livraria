package Produtos;

public class Livro extends Produto{

    private String escritor;
    private String editora;

    public Livro(int id, double preco, String genero, String nome, String escritor, String editora) {
        super(id, preco, genero, nome);
        this.escritor = escritor;
        this.editora = editora;
    }

    public Livro(int id, double preco, String genero, String nome,boolean isDestinadoAdultos, String escritor, String editora) {
        super(id, preco, genero, nome,isDestinadoAdultos);
        this.escritor = escritor;
        this.editora = editora;
    }

    public Livro() {

    }

    public String getEscritor() {
        return escritor;
    }

    public void setEscritor(String escritor) {
        this.escritor = escritor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    @Override
    public String toString() {
        return "Livro{" +super.toString()  +
                ", escritor='" + escritor + '\'' +
                ", editora='" + editora + '\'' +
                '}' +"\n";
    }
}
