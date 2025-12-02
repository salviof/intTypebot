package br.org.coletivoJava.integracoes.restTypebot.api;

import com.super_bits.Super_Bits.intTypebot.config.FabConfigModuloTypebot;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.WS.ComoFabricaIntegracaoRest;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.WS.conexaoWebServiceClient.FabTipoConexaoRest;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.WS.conexaoWebServiceClient.InfoConsumoRestService;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.api.servicoRegistrado.FabTipoAutenticacaoRest;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.api.servicoRegistrado.InfoConfigRestClientIntegracao;
import com.super_bits.modulosSB.SBCore.modulos.ManipulaArquivo.importacao.FabTipoArquivoImportacao;

@InfoConfigRestClientIntegracao(configuracao = FabConfigModuloTypebot.class,
        enderecosDocumentacao = "https://docs.typebot.io/api-reference/",
        nomeIntegracao = FabConfigModuloTypebot.NOME_INTEGRACAO,
        tipoAutenticacao = FabTipoAutenticacaoRest.CHAVE_ACESSO_METODOLOGIA_PROPRIA
)
public enum FabIntTypebotWorkspace implements ComoFabricaIntegracaoRest {
    @InfoConsumoRestService(getPachServico = "/api/v1/workspaces", tipoInformacaoRecebida = FabTipoArquivoImportacao.JSON,
            tipoConexao = FabTipoConexaoRest.GET,
            parametrosGet = {"workspaceId"},
            adicionarAutenticacaoBearer = true,
            urlDocumentacao = "https://docs.typebot.io/api-reference/workspace/list"
    )
    LISTAR_TODOS_WORKSPACES,
    @InfoConsumoRestService(getPachServico = "/api/v1/workspaces/{0}", tipoInformacaoRecebida = FabTipoArquivoImportacao.JSON,
            tipoConexao = FabTipoConexaoRest.GET,
            parametrosGet = {"workspaceId"},
            adicionarAutenticacaoBearer = true,
            urlDocumentacao = "https://docs.typebot.io/api-reference/workspace/get"
    )
    OBTER_WORKSPACE_BY_ID
}
