package br.org.coletivoJava.integracoes.restTypebot.implementacao;

import com.super_bits.Super_Bits.intTypebot.config.FabConfigModuloTypebot;
import com.super_bits.modulosSB.SBCore.ConfigGeral.SBCore;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.api.transmissao_recepcao_rest_client.ItfAcaoApiRest;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.implementacao.AcaoApiIntegracaoHeaderBuilder;

import java.util.HashMap;
import java.util.Map;

public class IntegracaoRestTypebot_HeaderPadrao
        extends
        AcaoApiIntegracaoHeaderBuilder {

    public IntegracaoRestTypebot_HeaderPadrao(final ItfAcaoApiRest pAcao) {
        super(pAcao);
    }

    @Override
    public void gerarHeaderPadrao() {
        super.gerarHeaderPadrao(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public Map<String, String> getHeaderPadrao() {
        Map<String, String> headerPadrao = new HashMap<>();
        //   headerPadrao.put("Host", SBCore.getConfigModulo(FabConfigModuloTypebot.class).getPropriedade(FabConfigModuloTypebot.URL_HOST_SERVIDOOR));
        headerPadrao.put("SEGREDO", SBCore.getConfigModulo(FabConfigModuloTypebot.class).getPropriedade(FabConfigModuloTypebot.CHAVE_ACESSO_SERVIDOR));
        headerPadrao.put("Authorization", "Bearer " + GestaoTokenRestTypebot.configuracao.getPropriedade(FabConfigModuloTypebot.CHAVE_ACESSO));
        return headerPadrao;
    }
}
