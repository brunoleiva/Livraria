package Produtos;

public class Livro extends Produto{

    private String escritor;
    private String editora;

    public Livro(int id, double preco, String genero, String nome) {
        super(id, preco, genero, nome);
    }

    public Livro(int id) {
        super(id);
    }

    public Livro(int id, double preco, String genero, String nome, String escritor, String editora) {
        super(id, preco, genero, nome);
        this.escritor = escritor;
        this.editora = editora;
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
}
