# Arquivo: 01b-debug.py
# ATENÇÃO: 4 erros corrigidos!

def saudacao(nome, turno="manhã"):
    mensagem = f"Bom {turno}, {nome}!"
    return mensagem #com1: Adicionado return para retornar o texto


saudacao("Ana")
print(saudacao("Bruno", "tarde"))


def dobrar(x):
    resultado = x * 2
    return resultado # 2: Adicionado return para retornar o cálculo


print("Dobro de 5:", dobrar(5))


total = 0
def incrementar():
    global total #  3: Adicionado global para alterar a variável de fora
    total = total + 1


incrementar()
print("Total:", total)


def contagem(n):
    print(n)
    if n > 0: # 4: Adicionada condição para a contagem parar no 0
        contagem(n - 1)


contagem(3)