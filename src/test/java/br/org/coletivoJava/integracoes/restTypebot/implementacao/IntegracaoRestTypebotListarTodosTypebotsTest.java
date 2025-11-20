package br.org.coletivoJava.integracoes.restTypebot.implementacao;

import br.org.coletivoJava.integracoes.restTypebot.api.FabIntTypebotBots;
import com.super_bits.Super_Bits.mktMauticIntegracao.configAppp.ConfiguradorCoreTypebotIntegracao;
import com.super_bits.modulosSB.SBCore.ConfigGeral.SBCore;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.WS.conexaoWebServiceClient.ItfRespostaWebServiceSimples;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntegracaoRestTypebotListarTodosTypebotsTest {
    public IntegracaoRestTypebotListarTodosTypebotsTest() {
    }

    private static final String WORKSPACE_ID = "cletcoc1t0002o5kwrua8y3cw";

    @Test
    public void testSomeMethod() {
        SBCore.configurar(new ConfiguradorCoreTypebotIntegracao(), SBCore.ESTADO_APP.DESENVOLVIMENTO);

        ItfRespostaWebServiceSimples resposta = FabIntTypebotBots.LISTAR_TODOS_TYPEBOTS.getAcao(WORKSPACE_ID).getResposta();
        System.out.println(resposta);
        assertEquals(200, resposta.getCodigoResposta());
    }
}