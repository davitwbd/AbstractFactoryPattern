package campeonato.sp;

import campeonato.CampeonatoEstadualFactory;
import federacaoDesportiva.Federacao;
import federacaoDesportiva.sp.FederacaoDesportivaDeJudo_SP;
import secretariaEstatual.Secretaria;
import secretariaEstatual.Secretaria_SP;

/** IMPLEMENTAÇÃO DOS METODOS DA FABRICA ABSTRATA - Abstract Factory Pattern **/
public class CampeonatoEstadualDeJudo_SP implements CampeonatoEstadualFactory{

	public Federacao criarFederacao() {
		return new FederacaoDesportivaDeJudo_SP();
	}

	public Secretaria criarSecretaria() {
		return new Secretaria_SP();
	}

}
