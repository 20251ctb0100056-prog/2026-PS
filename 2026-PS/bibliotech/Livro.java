/*
 * Disciplina: 2026-PS
 * Projeto    : bibliotech
 * Arquivo    : Livro.java
 * Autor      : seu nome
 * Descricao  : a caixa "Livro" do diagrama de classes, em Java (Aula 37)
 */

public class Livro {

    // Atributos
    private String titulo;
    private String autor;
    private int ano;
    private boolean disponivel;

    // Construtor
    public Livro(String titulo, String autor, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.disponivel = true;
    }

    // Getters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAno() {
        return ano;
    }

    // Verifica se o livro está disponível
    public boolean estaDisponivel() {
        return disponivel;
    }

    // Empresta o livro
    public void emprestar() {
        this.disponivel = false;
    }

    // Devolve o livro
    public void devolver() {
        this.disponivel = true;
    }

    // Mostra as informações do livro
    public String toString() {
        String situacao = disponivel ? "disponivel" : "emprestado";

        return titulo + " (" + autor + ", " + ano + ") - " + situacao;
    }
}