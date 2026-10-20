# 2026-PS
Repositório de Programação de Sistemas (2026-PS) do Profe. Berssa. Códigos, materiais didáticos e laboratórios interativos para o curso Técnico em Informática do IFPR - CRPG


# 📚 Repositório de Programação - Profe. Berssa

Este repositório armazena os materiais práticos e códigos de exemplo da disciplina de **Programação de Sistemas (2026-PS)**.

## 📂 Conteúdos Disponíveis

### 1. 🐍 Laboratório de Revisão Python
Conteúdo completo de revisão dos fundamentos da linguagem, organizado de forma interativa.
* **Acesse aqui:** [/00_revisaoPython](./00_revisaoPython)

---
*Mais conteúdos serão adicionados conforme o andamento do trimestre.*



> "A única maneira de aprender uma nova linguagem de programação é escrevendo programas nela." — *Dennis Ritchie*

---

## 👨‍🏫 Créditos e Autoria

**Profe. Berssa | Dr. João Henrique Berssanette**
* 🎓 **IFPR** - Centro de Referência Ponta Grossa
* 👩‍💻 **Técnico em Informática**
* 💻 **Programação de Sistemas | 2026**

Este material é de caráter educacional. Sinta-se livre para estudar, modificar e compartilhar o conhecimento!

## 6. Requisitos implementados

Os requisitos RF01, RF02, RF03, RF04 e RF05 foram testados pelo arquivo `TesteRequisitos.java`.

## 7. Resultado dos testes

| Requisito | Verificações | Resultado |
|---|---:|---|
| RF01 | 1 | Passou |
| RF02 | 1 | Passou |
| RF03 | 2 | Passou |
| RF04 | 3 | Passou |
| RF05 | 5 | Passou |
| **Total** | **12** | **12 passaram, 0 falharam** |

## 8. Limitações conhecidas

- O sistema ainda não possui login de bibliotecário, então não há controle de acesso por usuário.
- A conexão com o banco de dados depende do MariaDB estar em execução e das variáveis de ambiente estarem configuradas.
- A interface ainda possui funcionalidades que precisam ser testadas para garantir que todos os requisitos sejam atendidos.

## 9. Persistência de Dados

O BiblioTech utiliza o MariaDB para armazenar os livros cadastrados, mantendo os dados salvos mesmo depois que o programa Java é encerrado.

### Conexão com o banco

A classe `Conexao.java` é responsável por abrir a conexão com o banco de dados `bibliotech`. As credenciais são lidas pelas variáveis de ambiente `DB_USER` e `DB_PASSWORD`, evitando deixar a senha escrita diretamente no código.

### Operações com livros

A classe `LivroDAO.java` utiliza JDBC e comandos SQL preparados para realizar as operações no banco:

- `adicionarLivro()`: cadastra um livro.
- `atualizarLivro()`: altera os dados de um livro existente.
- `excluirLivro()`: exclui um livro pelo ID.

### Testes

Os arquivos `TesteConexao.java` e `TesteLivroDAO.java` são utilizados para verificar a conexão e testar as operações de cadastro, atualização e exclusão.

Para compilar e executar os testes, entre na pasta `bibliotech`, configure as variáveis de ambiente e execute:

```bash
export DB_USER=bibliotech
read -rs -p "Senha do banco: " DB_PASSWORD
echo
export DB_PASSWORD

javac -cp ".:lib/*" Conexao.java LivroDAO.java TesteConexao.java TesteLivroDAO.java
java -cp ".:lib/*" TesteConexao
java -cp ".:lib/*" TesteLivroDAO
```

A senha do banco não deve ser colocada no README nem enviada ao GitHub.