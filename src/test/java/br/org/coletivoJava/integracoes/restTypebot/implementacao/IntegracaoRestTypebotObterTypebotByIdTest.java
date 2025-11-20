package br.org.coletivoJava.integracoes.restTypebot.implementacao;

import br.org.coletivoJava.integracoes.restTypebot.api.FabIntTypebotBots;
import br.org.coletivoJava.integracoes.restTypebot.api.FabIntTypebotResultados;
import com.super_bits.Super_Bits.mktMauticIntegracao.configAppp.ConfiguradorCoreTypebotIntegracao;
import com.super_bits.modulosSB.SBCore.ConfigGeral.SBCore;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.WS.conexaoWebServiceClient.ItfRespostaWebServiceSimples;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntegracaoRestTypebotObterTypebotByIdTest {
    public IntegracaoRestTypebotObterTypebotByIdTest() {
    }

    private static final String TYPEBOT_ID = "cmemuavrf000jfp4tqcnnscdf";

    @Test
    public void testSomeMethod() {
        SBCore.configurar(new ConfiguradorCoreTypebotIntegracao(), SBCore.ESTADO_APP.DESENVOLVIMENTO);

        ItfRespostaWebServiceSimples resposta = FabIntTypebotBots.OBTER_TYPEBOT_BY_ID.getAcao(TYPEBOT_ID).getResposta();
        System.out.println(resposta);
        assertEquals(200, resposta.getCodigoResposta());
    }
}