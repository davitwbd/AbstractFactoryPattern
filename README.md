# AbstractFactoryPattern

 EXEMPLO DA IMPLEMENTAÇÃO DO ABSTRACT FACTORY METHOD.
     
      Definição: O Padrão Abstract Factory fornece uma interface para criar 
                 famílias de objetos relacionados ou dependentes sem especificar suas 
                 classes concretas.
     
     Para exemplificar segue um exemplo hipotético dos processos para a autorização de
     um campeonato estadual:
     
     Processos:
	 1 - A Federação do respectivo esporte deve organiza o campeonato. 
	 2 - A Federação deve solicitar a Secretaria Estadual responsável a autorização 
	     para usar o espaço publico e tornar o campeonato oficial.
	 3 - A Secretaria Estadual verifica a possibilidade de autorização.
	 4 - Caso não haja impedimentos a secretaria autoriza o evento em espaço publico
	     e o torna oficial com publicação em Diário Oficial do Estado. 
	     
	 Obs:    
	 >> A Classe CampeonatoEstadual esta fazendo o uso do padrão Abstract Factory, através da 
	    Classe CampeonatoEstadualFactory, com o objetivo de torna-la reutilizável 
	    para todas as federações e secretarias que realizarem campeonatos.
	         
	
