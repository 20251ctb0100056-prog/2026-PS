/*
 * Disciplina: 2026-PS
 * Projeto   : bibliotech
 * Arquivo   : Leitor.java
 * Autor     : seu nome
 * Descricao : Leitor E UM TIPO DE Usuario: herda nome, matricula e entrar().
 */

public class Leitor extends Usuario {

    // Só o que o Leitor acrescenta
    private int limiteEmprestimos;
    private int livrosEmMaos;

    public Leitor(String nome, String matricula, int limiteEmprestimos) {

        super(nome, matricula);

        this.limiteEmprestimos = limiteEmprestimos;
        this.livrosEmMaos = 0;
    }

    public int getLimiteEmprestimos() {
        return limiteEmprestimos;
    }

    public int getLivrosEmMaos() {
        return livrosEmMaos;
    }

    // Verifica se o leitor ainda pode pegar outro livro
    public boolean podePegarEmprestado() {
        return livrosEmMaos < limiteEmprestimos;
    }

    // Registra que o leitor pegou um livro
    public void pegouLivro() {
        this.livrosEmMaos = this.livrosEmMaos + 1;
    }

    // Registra que o leitor devolveu um livro
    public void devolveuLivro() {
        this.livrosEmMaos = this.livrosEmMaos - 1;
    }

    public String toString() {
        return "Leitor " + super.toString() + " - "
                + livrosEmMaos + " de " + limiteEmprestimos + " livros";
    }
}