package secretariaEstatual;

import secretariaEstatual.Secretaria;

public class Secretaria_SP implements Secretaria {

	public void verificarPedido() {
		System.out.println("A Secretaria inicia a Verifica��o do pedido para usar espa�o p�blico em S�o Paulo "
				          + "e para oficializar o compeonato. \n");
	}

	public void autorizar() {
		System.out.println("A Secretaria do Estado de S�o Paulo resolve, no uso de suas atribui��es,"
							+ " autorizar o pedido da referida Federa��o para o uso do espa�o p�blico, \n"
							+ " e para a realiza��o do Campeonato, a partir da data da publica��o do evento em "
							+ "Di�rio Oficial do Estado. \n \n");
	}

}
