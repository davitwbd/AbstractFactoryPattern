package testAbstractFactory;

import campeonato.CampeonatoEstadual;
import campeonato.rj.CampeonatoEstadualDeJudo_RJ;
import campeonato.sp.CampeonatoEstadualDeJudo_SP;

public class TesteDoAbstractFactory {

	public static void main(String[] args) {
		
		System.out.println("Campeonato 1");
		CampeonatoEstadual campeonato  = new CampeonatoEstadual(new CampeonatoEstadualDeJudo_SP());
		campeonato.autorizarCampeonato();
		
		System.out.println("Campeonato 2");
		CampeonatoEstadual campeonato2 = new CampeonatoEstadual(new CampeonatoEstadualDeJudo_RJ());
		campeonato2.autorizarCampeonato();
	}
}
