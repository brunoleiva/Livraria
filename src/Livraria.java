import Estoque.ControleEstoque;
import Produtos.Livro;
import Produtos.Produto;


public class Livraria {
    public static void main(String[] args) {
        System.out.println("Bem vindo (a) livraria do Bruno!!");
        Produto livro = new Livro(1);
        ControleEstoque.estoqueProdutos.add(livro);
        ControleEstoque.teste();
    }
}