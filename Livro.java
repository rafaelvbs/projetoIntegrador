package br.Livraria;

import java.util.ArrayList;
import java.util.List;

public class Livro {
    private int codigo;
    private String titulo;
    private String autor;
    private int ano;
    private int codigoISBN;
    private int quantidade;
    private double preco;


    public Livro(int codigo, String titulo, String autor, int ano, int codigoISBN, int quantidade, double preco) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.codigoISBN = codigoISBN;
        this.quantidade = quantidade;
        this.preco = preco;

    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getCodigoISBN() {
        return codigoISBN;
    }

    public void setCodigoISBN(int codigoISBN) {
        this.codigoISBN = codigoISBN;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }


    }



