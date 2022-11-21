import Financeiro.Financeiro;
import Financeiro.Caixa;
import ManipularProdutos.ManipularBrinquedos;
import ManipularProdutos.ManipularLivro;
import Produtos.Brinquedos;
import Produtos.Livro;


public class Livraria {
    public static void main(String[] args) {
        ManipularLivro manipularLivro = new ManipularLivro();
        ManipularBrinquedos manipularBrinquedos = new ManipularBrinquedos();
        //int id, double preco, String genero, String nome, String escritor, String editora
        Livro livro = new Livro(1,20.00,"Terror","Terror da casa verde","Bruno Leiva", "Osascus livrus");
        Livro livro2 = new Livro(2,670.00,"comedia","Comedia","Bruno Leiva", "Osascus livrus");
        Livro livro3 = new Livro(3,6750.00,"teste","Comedia","Bruno Leiva", "Osascus livrus");


        manipularLivro.adicionarLivro(livro);
        manipularLivro.adicionarLivro(livro2);

        manipularLivro.adicionarLivro(livro3);

        Brinquedos brinquedo = new Brinquedos(1,30.00,"Boneca", "Polly", "Boneca");
        manipularBrinquedos.adicionarBrinquedos(brinquedo);
        System.out.println("Bem vindo (a) livraria do Bruno!!");
/*
        System.out.println(ControleEstoque.estoqueLivro.getLista().toString());
        livro.setProdutoNome("AAAAAA");
        manipularLivro.alterarLivro(livro);

        System.out.println(manipularLivro.verLivro(1));

        System.out.println(ControleEstoque.quantidadeProdutos(ControleEstoque.estoqueLivro));
        manipularLivro.removerLivro(1);
        System.out.println(ControleEstoque.estoqueLivro.getLista().toString());
        System.out.println(ControleEstoque.quantidadeProdutos(ControleEstoque.estoqueLivro));

        System.out.println(ControleEstoque.estoqueBrinquedos.getLista().toString());


        System.out.println(ControleEstoque.listagemEstoque());

        System.out.println(ControleEstoque.listagemPorCategoria(ControleEstoque.estoqueLivro));
        System.out.println(ControleEstoque.listagemPorCategoria(ControleEstoque.estoqueBrinquedos));
*/
        Financeiro financeiro = new Financeiro();
        Caixa caixa = new Caixa(650.50);

        System.out.println(caixa.getDinheiro());
        financeiro.realizarCompra(caixa, manipularLivro.verLivro(1));
        financeiro.realizarCompra(caixa, manipularBrinquedos.verBrinquedos(1));
        System.out.println(caixa.getDinheiro());

    }
}