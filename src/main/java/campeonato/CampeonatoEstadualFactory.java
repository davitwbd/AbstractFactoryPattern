package campeonato;

import federacaoDesportiva.Federacao;
import secretariaEstatual.Secretaria;

/** Abstract Factory Pattern 
*   Definição: O Padrão Abstract Factory fornece uma interface para criar 
*              famílias de objetos relacionados ou dependentes sem especificar suas 
*              classes concretas. 
*              
*                >>FABRICA ABSTRATA<<   **/
public interface CampeonatoEstadualFactory {

	public Federacao criarFederacao();
	public Secretaria criarSecretaria();
}
