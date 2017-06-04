package campeonato;

import federacaoDesportiva.Federacao;
import secretariaEstatual.Secretaria;

   /** EXEMPLO DA IMPLEMENTA��O DO ABSTRACT FACTORY METHOD.
    * 
    *  Defini��o: O Padr�o Abstract Factory fornece uma interface para criar 
    *             fam�lias de objetos relacionados ou dependentes sem especificar suas 
    *             classes concretas.
    * 
    * Para exemplificar segue um exemplo hipot�tico dos processos para a autoriza��o de
    * um campeonato estadual:
    * 
    * Processos:
	* 1 - A Federa��o do respectivo esporte deve organiza o campeonato. 
	* 2 - A Federa��o deve solicitar a Secretaria Estadual respons�vel a autoriza��o 
	*     para usar o espa�o publico e tornar o campeonato oficial.
	* 3 - A Secretaria Estadual verifica a possibilidade de autoriza��o.
	* 4 - Caso n�o haja impedimentos a secretaria autoriza o evento em espa�o publico
	*     e o torna oficial com publica��o em Di�rio Oficial do Estado. 
	*     
	* Obs:    
	* >> A Classe abaixo esta fazendo o uso do padr�o Abstract Factory, atrav�s da 
	*    Classe CampeonatoEstadualFactory, com o objetivo de torna-la reutiliz�vel 
	*    para todas as federa��es e secretarias que realizarem campeonatos.
	*          
	**/

public class CampeonatoEstadual {

	private Federacao federacao;
	private Secretaria secretaria;

	                      /** Abstract Factory Pattern **/
	public CampeonatoEstadual(CampeonatoEstadualFactory factory) {
		this.federacao = factory.criarFederacao();
		this.secretaria = factory.criarSecretaria();
	}

	public void autorizarCampeonato(){
		this.federacao.organizarCampionato();
		this.federacao.solicitarAutorizacao();
		this.secretaria.verificarPedido();
		this.secretaria.autorizar();
	}
}
