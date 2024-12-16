
from datetime import datetime
class Funcionarios:
    def __init__(self,nome, sobrenome, data_nascimento):
        self.nome = nome
        self.sobrenome = sobrenome
        self.data_nascimento = data_nascimento    
        
    def nome_completo(self):
        return self.nome +' '+ self.sobrenome 
    
    def idade_funcionario(self):
        ano_atual = datetime.now().year
        self.data_nascimento = int(ano_atual - self.data_nascimento)
        return self.data_nascimento
    
   #objeto 
usuario1 = Funcionarios( 'Elena','Cabral', 2009)
usuario2 = Funcionarios('Carol','Silva', 2005)
usuario3 = Funcionarios('Andre','Iacono', 2003)


# Print

print(Funcionarios.idade_funcionario(usuario3))


from Funçoes import find_index


list1 = ['a','b','c','d','e']

var1 = find_index(list1,'b')   
print(var1)










