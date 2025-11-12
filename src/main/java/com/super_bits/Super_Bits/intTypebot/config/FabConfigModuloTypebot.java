/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.Super_Bits.intTypebot.config;

import com.super_bits.modulosSB.SBCore.ConfigGeral.arquivosConfiguracao.ItfFabConfigModulo;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.api.tipoModulos.integracaoOauth.FabPropriedadeModuloIntegracaoOauth;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.api.tipoModulos.integracaoOauth.InfoPropriedadeConfigRestIntegracao;

/**
 *
 * @author SalvioF
 */
public enum FabConfigModuloTypebot implements ItfFabConfigModulo {

    @InfoPropriedadeConfigRestIntegracao(tipoPropriedade = FabPropriedadeModuloIntegracaoOauth.URL_SERVIDOR_API)
    URL_SERVIDOR,
    @InfoPropriedadeConfigRestIntegracao(tipoPropriedade = FabPropriedadeModuloIntegracaoOauth.CHAVE_PRIVADA)
    CHAVE_ACESSO,
    @InfoPropriedadeConfigRestIntegracao(tipoPropriedade = FabPropriedadeModuloIntegracaoOauth.CHAVE_PRIVADA)
    CHAVE_ACESSO_SERVIDOR,
    @InfoPropriedadeConfigRestIntegracao(tipoPropriedade = FabPropriedadeModuloIntegracaoOauth.URL_SERVIDOR_API)
    URL_HOST_SERVIDOOR;
    public static final String NOME_INTEGRACAO = "intTypebot";


    @Override
    public String getValorPadrao() {
        switch (this) {
            case URL_SERVIDOR:
            case CHAVE_ACESSO:
            case CHAVE_ACESSO_SERVIDOR:
                break;
            default:
                throw new AssertionError();
        }
        return "não definido";
    }
}
