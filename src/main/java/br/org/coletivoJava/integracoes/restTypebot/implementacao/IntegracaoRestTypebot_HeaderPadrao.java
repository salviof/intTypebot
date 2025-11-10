package br.org.coletivoJava.integracoes.restTypebot.implementacao;

import com.super_bits.modulosSB.SBCore.integracao.libRestClient.implementacao.AcaoApiIntegracaoHeaderBuilder;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.api.transmissao_recepcao_rest_client.ItfAcaoApiRest;

public class IntegracaoRestTypebot_HeaderPadrao
		extends
			AcaoApiIntegracaoHeaderBuilder {

	public IntegracaoRestTypebot_HeaderPadrao(final ItfAcaoApiRest pAcao) {
		super(pAcao);
	}
}