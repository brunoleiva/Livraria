import Estoque.ControleEstoque;
import Financeiro.Financeiro;
import Financeiro.Caixa;
import ManipularProdutos.ManipularProduto;
import Produtos.Brinquedos;
import Produtos.Livro;


public class Livraria {
    public static void main(String[] args) {
        ManipularProduto manipular = new ManipularProduto();

        //int id, double preco, String genero, String nome, String escritor, String editora
        Livro livro = new Livro(40,20.00,"Terror","Terror da casa verde","Bruno Leiva", "Osascus livrus");
        Livro livro2 = new Livro(60,670.00,"comedia","Comedia","Bruno Leiva", "Osascus livrus");
        Livro livro3 = new Livro(70,6750.00,"teste","Comedia","Bruno Leiva", "Osascus livrus");


        manipular.adicionarProduto(livro);
        manipular.adicionarProduto(livro2);

        manipular.adicionarProduto(livro3);

        Brinquedos brinquedo = new Brinquedos(1,30.00,"Boneca", "Polly", "Boneca");
        manipular.adicionarProduto(brinquedo);

        System.out.println("Bem vindo (a) livraria do Bruno!!");

        //System.out.println(manipular.verProduto(60).toString());
        //System.out.println(ControleEstoque.listagemEstoque());
        Livro livroAlterar = (Livro) manipular.verProduto(60);
        manipular.removerProduto(livroAlterar.getProdutoId());
        //System.out.println(ControleEstoque.listagemEstoque());


        Financeiro financeiro = new Financeiro();
        Caixa caixa = new Caixa(650.50);

        System.out.println(caixa.getDinheiro());
        System.out.println(ControleEstoque.listagemEstoque());
        financeiro.realizarCompra(caixa, manipular.verProduto(40));
        //financeiro.realizarCompra(caixa, manipularBrinquedos.verBrinquedos(1));
        System.out.println(ControleEstoque.listagemEstoque());
        System.out.println(caixa.getDinheiro());

        /*Livro livroAlterar = (Livro) manipular.verProduto(60);
        livroAlterar.setProdutoNome("NOME ALTERADO");
        manipular.alterarProduto(livroAlterar);
        System.out.println(ControleEstoque.produtos.getLista().toString());*/




        /*System.out.println(ControleEstoque.estoqueLivro.getLista().toString());
        Livro livroAlterar = manipularLivro.verLivro(1);
        livroAlterar.setProdutoNome("AAAAAA");
        System.out.println(ControleEstoque.estoqueLivro.getLista().toString());
        manipular.alterarProduto(livroAlterar);

        System.out.println(manipularLivro.verLivro(1));
        System.out.println(ControleEstoque.estoqueLivro.getLista().toString());*/
/*
        System.out.println(ControleEstoque.quantidadeProdutos(ControleEstoque.estoqueLivro));
        manipularLivro.removerLivro(1);
        System.out.println(ControleEstoque.estoqueLivro.getLista().toString());
        System.out.println(ControleEstoque.quantidadeProdutos(ControleEstoque.estoqueLivro));

        System.out.println(ControleEstoque.estoqueBrinquedos.getLista().toString());


        System.out.println(ControleEstoque.listagemEstoque());

        System.out.println(ControleEstoque.listagemPorCategoria(ControleEstoque.estoqueLivro));
        System.out.println(ControleEstoque.listagemPorCategoria(ControleEstoque.estoqueBrinquedos));*/
/*
        Financeiro financeiro = new Financeiro();
        Caixa caixa = new Caixa(650.50);

        System.out.println(caixa.getDinheiro());
        financeiro.realizarCompra(caixa, manipularLivro.verLivro(1));
        financeiro.realizarCompra(caixa, manipularBrinquedos.verBrinquedos(1));
        System.out.println(caixa.getDinheiro());
*/
    }
}