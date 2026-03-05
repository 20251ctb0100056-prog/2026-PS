# Arquivo: 01b-debug.py
# ATENÇÃO: Este código contém 4 erros propositais. Encontre e corrija todos!

nome  = input("Digite o nome do aluno: ") # input tava escrito errado
nota1 = float(input("Digite a nota 1: "))
nota2 = float(input("Digite a nota 2: "))


media = (nota1 + nota2) / 2
#a soma tava fora dos parenteses

if media >= 6.0:
    situacao = "Aprovado"
elif media >= 4.0:
    situacao = "Recuperação"
else:                #else tava tabiado, dentro do elif
    situacao = "Reprovado"


print(f"Aluno: {nome} | Média: {media:.2f} | Situação: {situacao}")
#print tava escrito errado