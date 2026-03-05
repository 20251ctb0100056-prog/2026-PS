def Leia(): #funçao leia
    v1 = int(input('digite um valorxx: '))  #pega o valor  1
    v2 = int(input("digitaxx= ")) #pega o valor 2
    op = input('digite a operaçao  [* / + - ]: ') #pergunta ao user qual operaçao ele deseja
    msg = f'{v1} {op} {v2}' #variavel msg para padronizar 
    
    if op == '+':
        res = soma(v1,v2)
    elif op == '-':
        res = sub3(v1,v2)
    elif op == '*': 
        res = multi(v1,v2)
    elif op == '/':
        res = div(v1,v2)
    else:
        res = "Operação inválida"
        # este bloco faz com que os valores 1 e 2 sejam, somados, subtraidos, dividos, ou multiplicados
    Escreva(msg, res)

def soma(v1, v2):
    return (v1+v2)

def multi(v1, v2):
    return (v1*v2)

def div(v1, v2):
    return (v1/v2)

def sub3(v1, v2):
    return (v1-v2)

# Saída
def Escreva(msg, resultado):
    print(f'{msg} = {resultado}') 

Leia()
