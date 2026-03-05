#_____________________________________
#SISTEMAS DE APROVAÇAO DE ALUNOS
# ____________________________________
# DICIPLINA : PROGRAAÇAO DE SISTEMAS
#AULA 04 VARIAVEIS, TIPOS E CONTROLES DE FLUXO
# AUTOR : BRUNO DE PAULA
#DATA : 24 02 2026
#REPOSITORIO: https://github.com/20251ctb0100056-prog/2026-PS
# ====================================================================
#
#DESCRIÇAO:
#ESTE PROGRAMA PROCESSA AS NoTAS DE UMA TURMA E DETERMINA A SITUAÇAO DE ACADA ALUNO (APROVADO, RECUPERAÇAO OU REPROVADO).
#CONCEITOS UTILIAZADOS: VARIAVEIS, TIPO E DADO, OPERADORES, ESTRUTURASDE SELEÇAO E ESTRUTURAS DE REPTIÇAO
#==========================================================

print("==== Sistema e Aprovação de Alunos====")
print()
nome = input("digite o nome do aluno: ")

nota1 = float(input("digite a nota 1 (0 a 10): "))
nota2 = float(input("digite a nota 2 (0 a 10): "))

#procesamento___________________

media = (nota1 + nota2) / 2

print()
print(f"ALUNO  : {nome}")
print(f"nota 1 : {nota1:.1f}")
print(f"nota 2 : {nota2:.1f}")
print(f"Média: {media:.2f}")

#---------------decisao------------------

if media >= 6.0:
    situacao = "✅aproved"
elif media >= 4.0:
    situacao = "⚠️Recuperação"
else:

    situacao= "reprovado seu but"

print(f"situação: {situacao}")
print("-" * 40)

# ---- DADOS DA TURMA ----
# Uma lista de dicionários: cada dicionário representa um aluno

turma = [
    {"nome": "Ana", "nota1": 8.0, "nota2": 7.5},
    {"nome": "Bruno", "nota1": 4.5, "nota2": 5.0},
    {"nome": "Carla", "nota1": 2.0, "nota2": 3.5},
]

print("--- Resultado da Turma ---")
print()

# O 'for' percorre cada aluno da lista automaticamente
for aluno in turma:
    nome = aluno["nome"]
    nota1 = aluno["nota1"]
    nota2 = aluno["nota2"]
    media = (nota1 + nota2) / 2

    if media >= 6.0:
        situacao = "✅ Aprovado"
    elif media >= 4.0:
        situacao = "⚠️ Recuperação"
    else:
        situacao = "❌ Reprovado"

    print(f"Aluno   : {nome}")
    print(f"Média   : {media:.2f}")
    print(f"Situação: {situacao}")
    print("-" * 30)
    continuar = "s"

while continuar == "s":

    print("\nDeseja processar outro aluno? (s/n): ", end="")
    continuar = input().lower()

    if continuar == "s":
        
        nome = input("digite o nome do aluno: ")
        nota1 = float(input("digite a nota 1 (0 a 10): "))
        nota2 = float(input("digite a nota 2 (0 a 10): "))
        if media >= 6.0:
            situacao = "✅aproved"
        elif media >= 4.0:
            situacao = "⚠️Recuperação"
        else:

            situacao= "reprovado seu but"

            print(f"situação: {situacao}")
            print("-" * 40)