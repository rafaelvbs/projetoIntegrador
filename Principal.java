package br.Livraria;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
Livraria livraria=new Livraria();
        Scanner input=new Scanner(System.in);

        Livro livro1=new Livro(0,"Teste1","autor do Teste 1",2015,1250,20,12.5);

        Livro livro2=new Livro(1,"Teste2","autor do Teste 2",2018,3333,15,30.5);

        //cadastro de livros
        livraria.cadastrarLivro(livro1);
        livraria.cadastrarLivro(livro2);

        //impressão do livro
        System.out.println("digitar codigo do livro");
        int codigoLivroConsulta=input.nextInt();
        livraria.imprimir(codigoLivroConsulta);

        //venda do livro
        System.out.println("digitar codigo do livro");
        int codigoLivroVenda=input.nextInt();
        System.out.println("Quantidade desejada");
        int QuantidadeLivroVenda=input.nextInt();
        livraria.venda(codigoLivroVenda,QuantidadeLivroVenda);





    }







}
