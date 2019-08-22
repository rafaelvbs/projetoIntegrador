package br.Livraria;

import java.util.List;


public class Livraria {




    List<Livro> livros = new java.util.ArrayList<>();

    public void cadastrarLivro(Livro livro) {
        this.livros.add(livro);
    }

    public void venda(int codigo,int quantidadeVendida) {
        if (livros.get(codigo).getQuantidade()==0||livros.get(codigo).getQuantidade()-quantidadeVendida<0){
            System.out.println("Estoque esgotado");}else{
        livros.get(codigo).setQuantidade(livros.get(codigo).getQuantidade() - quantidadeVendida);}
    }



    public void imprimir(int codigo) {
            try {
                Livro livroSelecionado = livros.get(codigo);
                System.out.println(livroSelecionado.getCodigo() + " " + livroSelecionado.getTitulo() + " " + livroSelecionado.getAutor() + " " + livroSelecionado.getAno() + " " + livroSelecionado.getCodigoISBN() + " " + livroSelecionado.getQuantidade() + " " + livroSelecionado.getPreco());
            }catch (IndexOutOfBoundsException erro){
                System.out.println("Livro não encontrado");
            }
    }
}

