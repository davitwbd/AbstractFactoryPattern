package campeonato.rj;

import campeonato.CampeonatoEstadualFactory;
import federacaoDesportiva.Federacao;
import federacaoDesportiva.rj.FederacaoDesportivaDeJudo_RJ;
import secretariaEstatual.Secretaria;
import secretariaEstatual.Secretaria_RJ;

/** IMPLEMENTAÇÃO DOS METODOS DA FABRICA ABSTRATA - Abstract Factory Pattern **/
public class CampeonatoEstadualDeJudo_RJ implements CampeonatoEstadualFactory {

	public Federacao criarFederacao() {
		return new FederacaoDesportivaDeJudo_RJ();
	}

	public Secretaria criarSecretaria() {
		return new Secretaria_RJ();
	}

}
