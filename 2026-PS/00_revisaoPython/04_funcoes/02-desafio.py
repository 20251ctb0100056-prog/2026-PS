"""
============================================================
SISTEMA DE NOTAS - PADRÃO IFPR
BRUNO DE PAULA CARVALHO
------------------------------------------------------------
fazer um sistema de notas para alunos, aprovado ou reprovado com base nas suas notas
============================================================
"""

def verificar_situacao(media):
    """
    Aqui é onde o IFPR manda: 
    6 pra cima tá suave, 4 a 5.9 é sufoco (recuperação) e abaixo de 4 já era.
    """
    if media >= 6.0:
        return "Aprovado"
    elif 4.0 <= media < 6.0:
        return "Recuperação"
    else:
        return "Reprovado"


def calcular_media_recursiva(notas):
    """
    Em vez de um 'for' comum agente soma o primeiro item com o resto da lista ate não sobrar nada. brutal
    """
    def somar_tudo(lista):
        if not lista:  # Se a lista esvaziou, para aqui (Caso Base)
            return 0
        # Pega o primeiro e chama a função de novo com o que sobrou
        return lista[0] + somar_tudo(lista[1:])
    
    if not notas: 
        return 0
    
    # Faz a média real dividindo a soma total pela quantidade de notas
    return somar_tudo(notas) / len(notas)


def solicitar_notas(nome_aluno):
    """
    Aqui a gente garante que o usuário não vai digitar 'batata' onde devia ser 10.
    O 'while True' só deixa passar quando a nota é (0 a 10).
    """
    notas_limpas = []
    print(f"\n Notas do aluno: {nome_aluno}")
    
    for i in range(1, 3):
        while True:
            try:
                valor = float(input(f"   Diz aí a {i}ª nota: "))
                if 0 <= valor <= 10:
                    notas_limpas.append(valor)
                    break # Nota ok! Sai do loop e vai pra próxima
                print("    Opa! A nota precisa ser entre 0 e 10.")
            except ValueError:
                print("    Erro: Digite apenas números")

    return notas_limpas


# --- NÍVEL A: Resumo da Galera ---

def resumo_turma(lista_situacoes):
    """
    Conta quantos passaram e quantos ficaram pelo caminho.
    Retorna 3 valores de uma vez pra gente 'desempacotar' depois.
    """
    ap = lista_situacoes.count("Aprovado")
    rec = lista_situacoes.count("Recuperação")
    rep = lista_situacoes.count("Reprovado")
    return ap, rec, rep


# --- PROGRAMA PRINCIPAL (Onde tudo acontece) ---

def rodar_sistema():
    historico_da_turma = []
    
    print(" INICIANDO PROCESSAMENTO DE NOTAS IFPR")
    
    # Processando 3 alunos como pedido
    for _ in range(3):
        nome = input("\n Nome do Aluno: ")
        
        # Pega as notas (com validação Nível B)
        notas = solicitar_notas(nome)
        
        # Faz a média (com elegância Nível A)
        media = calcular_media_recursiva(notas)
        
        # Define o destino do aluno (Nível C)
        status = verificar_situacao(media)
        historico_da_turma.append(status)
        
        # Mostra o resultado na hora
        print(f"    Resultado: Média {media:.1f} -> {status}")

    # Desempacotando os resultados finais (Aquele toque de Nível A)
    aprovados, recuperacao, reprovados = resumo_turma(historico_da_turma)
    
    print("\n" + "="*45)
    print(" RESUMO FINAL DA TURMA")
    print(f" Aprovados: {aprovados}  |   Em Recuperação: {recuperacao}  |   Reprovados: {reprovados}")
    print("="*45)

if __name__ == "__main__":
    rodar_sistema()