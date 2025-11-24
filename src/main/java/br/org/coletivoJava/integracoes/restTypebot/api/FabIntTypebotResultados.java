/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.coletivoJava.integracoes.restTypebot.api;

import com.super_bits.Super_Bits.intTypebot.config.FabConfigModuloTypebot;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.WS.ComoFabricaIntegracaoRest;
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
        nomeIntegracao = FabConfigModuloTypebot.NOME_INTEGRACAO,
        tipoAutenticacao = FabTipoAutenticacaoRest.CHAVE_ACESSO_METODOLOGIA_PROPRIA
)
public enum FabIntTypebotResultados implements ComoFabricaIntegracaoRest {
    @InfoConsumoRestService(getPachServico = "/v1/typebots/{0}/results?limit=50&timeFilter=last7Days", tipoInformacaoRecebida = FabTipoArquivoImportacao.JSON,
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
    LOGS_RESULTADO

}
