# PROJETO DE SISTEMAS - BRUNO DE PAULA - 26/02/2026

# 1. Criando as listas para guardar os dados
produtos = ["Teclado", "Monitor", "Mouse"]
estoque = [5, 15, 45]

# 2. Usando o WHILE para o menu funcionar várias vezes
opcao = "0"
while opcao != "3":
    print("\n--- SISTEMA DE ESTOQUE ---")
    print("1 - Ver produtos")
    print("2 - Adicionar novo")
    print("3 - Sair")
    
    opcao = input("Escolha o que fazer: ")

    # OPÇÃO DE VER OS PRODUTOS
    if opcao == "1":
        # Criando contadores do zero
        qtd_critico = 0
        qtd_adequado = 0
        qtd_excesso = 0
        
        print("\nLista de Itens:")
        
        # O FOR percorre os números (0, 1, 2...) para a gente acessar as listas
        for i in range(len(produtos)):
            nome_atual = produtos[i]
            valor_atual = estoque[i]
            
            # Verificando a situação com IF/ELIF/ELSE
            if valor_atual <= 10:
                situacao = "CRITICO"
                qtd_critico = qtd_critico + 1
            elif valor_atual <= 30:
                situacao = "ADEQUADO"
                qtd_adequado = qtd_adequado + 1
            else:
                situacao = "EXCESSO"
                qtd_excesso = qtd_excesso + 1
            
            # Mostrando na tela
            print("Produto:", nome_atual, "- Quantidade:", valor_atual, "-", situacao)
        
        # Mostrando as contagens
        print("\nResumo das situações:")
        print("Critico:", qtd_critico)
        print("Adequado:", qtd_adequado)
        print("Excesso:", qtd_excesso)

    # OPÇÃO DE ADICIONAR PRODUTO
    elif opcao == "2":
        novo_nome = input("Qual o nome do produto? ")
        nova_qtd = int(input("Qual a quantidade? "))
        
        # Guardando nas listas
        produtos.append(novo_nome)
        estoque.append(nova_qtd)
        print("Pronto! Guardado com sucesso.")

# 3. FINALIZANDO O PROGRAMA
# Lógica para achar o menor estoque manualmente
menor_valor = estoque[0]
nome_do_menor = produtos[0]

for i in range(len(estoque)):
    if estoque[i] < menor_valor:
        menor_valor = estoque[i]
        nome_do_menor = produtos[i]

print("\n--- PROGRAMA ENCERRADO ---")
print("O item que tem menos no estoque é:", nome_do_menor)
print("Quantidade dele:", menor_valor)