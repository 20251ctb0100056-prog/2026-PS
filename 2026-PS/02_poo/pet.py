'''
=============================================================================
#arquivo    : pet.py
#Diciplina  : Programaçao de Sistemas  (2026-2)
#aula       : aula 20 - porque o POO é importante?
#autor      : Bruno de Paula Carvalho
#conceitos  : classe, objetos, atributos, métudos, encapsulamneto
#atividade  :  CLASSE PET
==============================================================================
'''

class pet:
    def __init__(self, nome, especie, idade, vacinado, peso, nome_dono):

        self.nome = nome
        self.especie = especie
        self.idade = idade
        self.hospedado = False
        self.peso = peso
        self.nome_dono = nome_dono
        self.vacinado = vacinado
        

        
####################################################
    def exibir_dados(self):
        print(f"---dados dos bixns---\n")
        print(f"---nome: {self.nome}---\n")
        print(f"---Espécie: {self.especie}---\n")
        print(f"---Idade: {self.idade}---\n")
        print(f"---Nome do Dono: {self.nome_dono}---\n")
        print(f"---peso: {self.peso}---\n")
        print(f"---vacinado: {'sim' if self.vacinado else 'Não'}---\n")
        print(f"---hospedado: {'sim' if self.hospedado else 'Não'}---\n")
#############################################################################
    def registrar_entrada(self):
        if self.hospedado == True:
            print(f"{self.nome} já esta no nosso hotel!\n")
        else:
            print(f"{self.nome} foi registrado no hotel!\n")

#############################################################
    def regsitrar_saida(self):
        if self.hospedado == False:
            print(f"{self.nome} não está no registro\n")
        else:
            self.hospedado = False
            print(f"{self.nome} saiu do hotel\n")

##############################################################
    def calcular_diaria(self):

        if self.idade <= 3:
            return 50

        elif self.idade <=10:
           return 60

        else: 
           return 75
        

  
#####################################################################
def verificar_vacinacao(self):
    if self.vacinado == True:
        print(f"Este pet esta com a vacinação em dia! Parabéns!\n")
    else:
        print(f"cuidado! este pet está com a vacinação pendente, recomendamos agendar vacinação!\n")
    #laele#
##################################################################################
def atualizar_peso(self,novo_peso):

    
    self.peso = novo_peso
    print(f" o peso do {self.nome} foi atualizado para {self.peso}!\n")

def mostrar_linha():
    print("#" * 40)

def mostrar_resumo(self):
    mostrar_linha()
    print("#      resumo do pet                                   #")
    print(f"#     nome: {self.nome}                               #")
    print(f"#     espécie: {self.especie}                         #")
    print(f"#     nome do dono: {self.nome_dono}                  #")
    print(f"#     peso : {self.peso}                              #")
    print(f"#     status vacinação: {self.vacinacao}              #")
    print(f"#     status hospedagem: {self.hospedagem}            #")
    print(f"#     valor da diária:   {self.calcular_diaria():.2f} #")
    mostrar_linha()

pet1 = pet("Rex", "cachorro", 5, 'S', 10, "pedrin matador")
pet2 = pet('carleto', "gato", 10, 'N', 5, "oreia" )
pet3 = pet('tarantula', "humano", 67, 'S', 70, "pomada")



pet1.exibir_dados()
pet1.registrar_entrada()
pet1.exibir_dados()

pet2.exibir_dados()
pet2.registrar_entrada()
pet2.exibir_dados()

pet3.exibir_dados()
pet3.registrar_entrada()
pet3.exibir_dados()

