package br.org.coletivoJava.integracoes.restTypebot.implementacao;

import br.org.coletivoJava.integracoes.restTypebot.api.FabIntTypebotResultados;
import br.org.coletivoJava.integracoes.restTypebot.api.FabIntTypebotWorkspace;
import com.super_bits.Super_Bits.mktMauticIntegracao.configAppp.ConfiguradorCoreTypebotIntegracao;
import com.super_bits.modulosSB.SBCore.ConfigGeral.SBCore;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.WS.conexaoWebServiceClient.ItfRespostaWebServiceSimples;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntegracaoRestTypebotListarTodosWorkspacesTest {
    public IntegracaoRestTypebotListarTodosWorkspacesTest() {
    }

    @Test
    public void testSomeMethod() {
        SBCore.configurar(new ConfiguradorCoreTypebotIntegracao(), SBCore.ESTADO_APP.DESENVOLVIMENTO);

        ItfRespostaWebServiceSimples resposta = FabIntTypebotWorkspace.LISTAR_TODOS_WORKSPACES.getAcao().getResposta();
        System.out.println(resposta);
        assertEquals(200, resposta.getCodigoResposta());
    }
}