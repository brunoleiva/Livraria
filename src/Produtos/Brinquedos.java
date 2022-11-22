package Produtos;

public class Brinquedos extends Produto {

    private String tipo;

    public Brinquedos(int id, double preco, String genero, String nome, String tipo) {
        super(id, preco, genero, nome);
        this.tipo = tipo;
    }
    public Brinquedos(int id, double preco, String genero,boolean isDestinadoAdultos, String nome, String tipo) {
        super(id, preco, genero, nome,isDestinadoAdultos);
        this.tipo = tipo;
    }

    public Brinquedos(int id, double preco, String genero, String nome) {
        super(id, preco, genero, nome);
    }

    public Brinquedos(int id) {
        super(id);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Brinquedos{"+super.toString()  +
                ",tipo='" + tipo + '\'' +
                '}'+"\n";
    }
}
