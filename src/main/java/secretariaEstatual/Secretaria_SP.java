package secretariaEstatual;

import secretariaEstatual.Secretaria;

public class Secretaria_SP implements Secretaria {

	public void verificarPedido() {
		System.out.println("A Secretaria inicia a Verificação do pedido para usar espaço público em São Paulo "
				          + "e para oficializar o compeonato. \n");
	}

	public void autorizar() {
		System.out.println("A Secretaria do Estado de São Paulo resolve, no uso de suas atribuições,"
							+ " autorizar o pedido da referida Federação para o uso do espaço público, \n"
							+ " e para a realização do Campeonato, a partir da data da publicação do evento em "
							+ "Diário Oficial do Estado. \n \n");
	}

}
