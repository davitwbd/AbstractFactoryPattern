package campeonato;

import federacaoDesportiva.Federacao;
import secretariaEstatual.Secretaria;

/** Abstract Factory Pattern 
*   Defini��o: O Padr�o Abstract Factory fornece uma interface para criar 
*              fam�lias de objetos relacionados ou dependentes sem especificar suas 
*              classes concretas. 
*              
*                >>FABRICA ABSTRATA<<   **/
public interface CampeonatoEstadualFactory {

	public Federacao criarFederacao();
	public Secretaria criarSecretaria();
}
