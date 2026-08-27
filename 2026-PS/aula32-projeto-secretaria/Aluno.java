/*diciplina: Programação Orientada a Objetos
 *Estudante: Bruno de Paula Carvalho
 *data: 13/08/2026
 *projeto: aula32-projeto-secretaria
 *arquivo: Aluno.java
 */
public class Aluno{
    private String nome;
    private String matricula;
    private String curso;

    public Aluno(String nome, String matricula, String curso) {
        this.nome = nome;
       this.matricula = matricula;
        this.curso = curso;
    }
    // GETTERS: as janelas de leitura da Ficha.
// Devolvem o valor guardado sem deixar ninguém de fora alterar.
// Padrão de nome: get + Atributo, com a primeira letra maiúscula.
public String getNome() {
    return nome;
}

public String getMatricula() {
    return matricula;
}

public String getCurso() {
    return curso;
}

public void setNome(String nome) {
    this.nome = nome;
}

public void setCurso(String curso) {
    this.curso = curso;
}

 }

