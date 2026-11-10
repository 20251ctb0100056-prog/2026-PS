
public class TesteLivroDAO {

    public static void main(String[] args) {

        LivroDAO dao = new LivroDAO();

        boolean atualizou = dao.atualizarLivro(
            4,
            "Dom Casmurro - Edição Atualizada",
            "Machado de Assis",
            1899
        );

        boolean excluiu = dao.excluirLivro(7);

        System.out.println("Livro atualizado: " + atualizou);
        System.out.println("Livro excluído: " + excluiu);
    }
}
