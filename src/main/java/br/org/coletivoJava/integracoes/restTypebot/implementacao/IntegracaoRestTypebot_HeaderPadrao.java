package br.org.coletivoJava.integracoes.restTypebot.implementacao;

import com.super_bits.Super_Bits.mktMauticIntegracao.regras_de_negocio_e_controller.FabConfigModuloTypebot;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.implementacao.AcaoApiIntegracaoHeaderBuilder;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.api.transmissao_recepcao_rest_client.ItfAcaoApiRest;

import java.util.HashMap;
import java.util.Map;

public class IntegracaoRestTypebot_HeaderPadrao
		extends
			AcaoApiIntegracaoHeaderBuilder {

	public IntegracaoRestTypebot_HeaderPadrao(final ItfAcaoApiRest pAcao) {
		super(pAcao);
	}

    @Override
    public Map<String, String> getHeaderPadrao() {
        Map<String, String> headerPadrao = new HashMap<>(); //curl -X GET  -H "Host: chatbuilder.casanovadigital.com.br" -H "SEGREDO: sX79hMGdtzQcG0xz0Uz8eqryfULB2kFkqLLtERuxs090AzHTsXwzkf4jCpi" -H "Authorization: Bearer ocTBba1mtn7x64c3OEFn3cbd" https://chatbuilder.casanovadigital.com.br/api/v1/typebots/jucnz25a466rfdw2gijf8bv6/results
        headerPadrao.put("Host", "chatbuilder.casanovadigital.com.br");
        headerPadrao.put("SEGREDO", "sX79hMGdtzQcG0xz0Uz8eqryfULB2kFkqLLtERuxs090AzHTsXwzkf4jCpi");
        headerPadrao.put("Authorization ", "Bearer " + GestaoTokenRestTypebot.configuracao.getPropriedade(FabConfigModuloTypebot.CHAVE_ACESSO));
        return headerPadrao;
    }
}