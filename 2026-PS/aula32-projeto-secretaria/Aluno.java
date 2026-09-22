public class Aluno {

    // ATRIBUTOS: os campos impressos na ficha.
    // "private" = só o código DESTA classe mexe neles. De fora ninguém
    // escreve direto; tem que passar pelos métodos públicos lá embaixo.
    private String nome;
    private String matricula;
    private String curso;
    private String cidade; // <-- o campo extra DESTE exemplo; o seu é outro

    // CONSTRUTOR: roda no momento do "new" e preenche a ficha.
    // É o _init_ de vocês, em Java. Tem o mesmo nome da classe e não
    // declara tipo de retorno. Os valores chegam de fora, entre parênteses.
    public Aluno(String nome, String matricula, String curso, String cidade) {
        // "this" = ESTA ficha aqui (o self do Java).
        // this.nome é o atributo da ficha; nome, sozinho, é o parâmetro
        // que acabou de chegar. Sem o this, os dois seriam o parâmetro.
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.cidade = cidade;
    }

    // GETTERS: as janelas de leitura da ficha.
    // Devolvem o valor guardado sem deixar ninguém de fora alterar.
    // Padrão do nome: get + Atributo, com a primeira letra maiúscula.
    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getCurso() {
        return curso;
    }

    public String getCidade() {
        return cidade;
    }

    // SETTERS: a única porta de entrada para mudar um dado da ficha.
    // Hoje eles só trocam o valor, mas é aqui que um dia entra a regra
    // ("nome vazio não vale", "curso tem que existir").
    // Repare que não existe setMatricula: matrícula não muda, por decisão
    // do projeto. Sem setter, ninguém altera - nem por engano.
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", matricula='" + matricula + '\'' +
                ", curso='" + curso + '\'' +
                ", cidade='" + cidade + '\'' +
                '}';
    }
}
