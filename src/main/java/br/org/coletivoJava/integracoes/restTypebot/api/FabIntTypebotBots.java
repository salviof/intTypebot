package br.org.coletivoJava.integracoes.restTypebot.api;

import com.super_bits.Super_Bits.intTypebot.config.FabConfigModuloTypebot;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.WS.ComoFabricaIntegracaoRest;
<<<<<<< HEAD

=======
>>>>>>> a8938cd25995f1a631868fd114cec6dc035b1469
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
public enum FabIntTypebotBots implements ComoFabricaIntegracaoRest {

    @InfoConsumoRestService(getPachServico = "/api/v1/typebots?workspaceId={0}", tipoInformacaoRecebida = FabTipoArquivoImportacao.JSON,
            tipoConexao = FabTipoConexaoRest.GET,
            parametrosGet = {"workspaceId"},
            adicionarAutenticacaoBearer = true,
            urlDocumentacao = "https://docs.typebot.io/api-reference/typebot/list"
    )
    LISTAR_TODOS_TYPEBOTS,
    @InfoConsumoRestService(getPachServico = "/api/v1/typebots/{0}", tipoInformacaoRecebida = FabTipoArquivoImportacao.JSON,
            tipoConexao = FabTipoConexaoRest.GET,
            parametrosGet = {"typebotId"},
            adicionarAutenticacaoBearer = true,
            urlDocumentacao = "https://docs.typebot.io/api-reference/typebot/get"
    )
    OBTER_TYPEBOT_BY_ID

}
