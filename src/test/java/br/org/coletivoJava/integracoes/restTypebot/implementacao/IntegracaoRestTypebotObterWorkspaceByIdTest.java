package br.org.coletivoJava.integracoes.restTypebot.implementacao;

import br.org.coletivoJava.integracoes.restTypebot.api.FabIntTypebotResultados;
import br.org.coletivoJava.integracoes.restTypebot.api.FabIntTypebotWorkspace;
import com.super_bits.Super_Bits.mktMauticIntegracao.configAppp.ConfiguradorCoreTypebotIntegracao;
import com.super_bits.modulosSB.SBCore.ConfigGeral.SBCore;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.WS.conexaoWebServiceClient.ItfRespostaWebServiceSimples;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntegracaoRestTypebotObterWorkspaceByIdTest {
    public IntegracaoRestTypebotObterWorkspaceByIdTest() {
    }

    private static final String WORKSPACE_ID = "cletcoc1t0002o5kwrua8y3cw";

    @Test
    public void testSomeMethod() {
        SBCore.configurar(new ConfiguradorCoreTypebotIntegracao(), SBCore.ESTADO_APP.DESENVOLVIMENTO);

        ItfRespostaWebServiceSimples resposta = FabIntTypebotWorkspace.OBTER_WORKSPACE_BY_ID.getAcao(WORKSPACE_ID).getResposta();
        System.out.println(resposta);
        assertEquals(200, resposta.getCodigoResposta());
    }
}