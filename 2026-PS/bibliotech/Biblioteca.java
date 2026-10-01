import java.util.ArrayList;

public class Biblioteca {

    // O 0..* do diagrama: cada lista guarda muitas referencias.
    private ArrayList<Livro> livros;
    private ArrayList<Leitor> leitores;
    private ArrayList<Emprestimo> emprestimos;

    public Biblioteca() {
        this.livros = new ArrayList<Livro>();
        this.leitores = new ArrayList<Leitor>();
        this.emprestimos = new ArrayList<Emprestimo>();
    }

    public void cadastrarLivro(Livro livro) {
        livros.add(livro);
    }

    public void cadastrarLeitor(Leitor leitor) {
        leitores.add(leitor);
    }

    public void listarAcervo() {
        System.out.println("--- Acervo ---");

        for (int i = 0; i < livros.size(); i++) {
            System.out.println(livros.get(i));
        }
    }

    public Livro buscarLivro(String titulo) {
        for (int i = 0; i < livros.size(); i++) {
            if (livros.get(i).getTitulo().equals(titulo)) {
                return livros.get(i);
            }
        }

        return null;
    }

    public Leitor buscarLeitor(String matricula) {
        for (int i = 0; i < leitores.size(); i++) {
            if (leitores.get(i).getMatricula().equals(matricula)) {
                return leitores.get(i);
            }
        }

        return null;
    }

    public boolean emprestar(String titulo, String matricula) {
        Livro livro = buscarLivro(titulo);
        Leitor leitor = buscarLeitor(matricula);

        if (livro == null || leitor == null) {
            return false;
        }

        Emprestimo emprestimo = new Emprestimo(livro, leitor);

        if (!emprestimo.realizarEmprestimo()) {
            return false;
        }

        emprestimos.add(emprestimo);

        return true;
    }

    public boolean devolver(String titulo) {
        for (int i = 0; i < emprestimos.size(); i++) {
            Emprestimo emprestimo = emprestimos.get(i);

            if (emprestimo.getLivro().getTitulo().equals(titulo)
                    && emprestimo.estaAtivo()) {
                return emprestimo.registrarDevolucao();
            }
        }

        return false;
    }

    public void listarEmprestimos() {
        for (int i = 0; i < emprestimos.size(); i++) {
            System.out.println(emprestimos.get(i));
        }
    }
}