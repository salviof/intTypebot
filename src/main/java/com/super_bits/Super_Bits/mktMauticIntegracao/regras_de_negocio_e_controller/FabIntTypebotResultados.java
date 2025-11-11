/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.Super_Bits.mktMauticIntegracao.regras_de_negocio_e_controller;

import com.super_bits.modulosSB.SBCore.integracao.libRestClient.WS.ItfFabricaIntegracaoRest;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.WS.conexaoWebServiceClient.FabTipoConexaoRest;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.WS.conexaoWebServiceClient.InfoConsumoRestService;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.api.servicoRegistrado.FabTipoAutenticacaoRest;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.api.servicoRegistrado.InfoConfigRestClientIntegracao;

import com.super_bits.modulosSB.SBCore.modulos.ManipulaArquivo.importacao.FabTipoArquivoImportacao;

/**
 *
 * @author SalvioF
 */
@InfoConfigRestClientIntegracao(configuracao = FabConfigModuloTypebot.class,
        enderecosDocumentacao = "https://docs.typebot.io/api-reference/",
        nomeIntegracao = "typebot",
        tipoAutenticacao = FabTipoAutenticacaoRest.CHAVE_ACESSO_METODOLOGIA_PROPRIA
)
public enum FabIntTypebotResultados implements ItfFabricaIntegracaoRest {
    @InfoConsumoRestService(getPachServico = "/v1/typebots/{0}/results?limit={1}&timeFilter=last7Days", tipoInformacaoRecebida = FabTipoArquivoImportacao.JSON,
            tipoConexao = FabTipoConexaoRest.GET,
            parametrosGet = {"typebotId", "limit", "timeFilter", "cursor"},
            adicionarAutenticacaoBearer = false,
            urlDocumentacao = "https://docs.typebot.io/api-reference/results/list"
    )
    LISTAR_7_DIAS,
    @InfoConsumoRestService(getPachServico = "/v1/typebots/{0}/results/{1}", tipoInformacaoRecebida = FabTipoArquivoImportacao.JSON,
            tipoConexao = FabTipoConexaoRest.GET,
            parametrosGet = {"typebotId", "resultId"},
            adicionarAutenticacaoBearer = true,
            urlDocumentacao = "https://docs.typebot.io/api-reference/results/get"
    )
    DADOS_RESULTADO,
    @InfoConsumoRestService(getPachServico = "/v1/typebots/{0}/results/{1}/logs", tipoInformacaoRecebida = FabTipoArquivoImportacao.JSON,
            tipoConexao = FabTipoConexaoRest.GET,
            parametrosGet = {"typebotId", "resultId"},
            adicionarAutenticacaoBearer = true,
            urlDocumentacao = "https://docs.typebot.io/api-reference/results/list-logs"
    )
    LOGS_RESULTADO;

}
