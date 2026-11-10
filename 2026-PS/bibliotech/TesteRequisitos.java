
public class TesteLivroDAO {

    public static void main(String[] args) {

        LivroDAO dao = new LivroDAO();

        boolean restaurou = dao.atualizarLivro(
            4, "Dom Casmurro", "Machado de Assis", 1899
        );

        boolean cadastrou = dao.adicionarLivro(
            "O Hobbit", "J. R. R. Tolkien", 1937
        );

        System.out.println("Dom Casmurro preparado: " + restaurou);
        System.out.println("O Hobbit cadastrado: " + cadastrou);
    }
}
