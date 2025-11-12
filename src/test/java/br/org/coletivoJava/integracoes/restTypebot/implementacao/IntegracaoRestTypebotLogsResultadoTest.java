package br.org.coletivoJava.integracoes.restTypebot.implementacao;

import br.org.coletivoJava.integracoes.restTypebot.api.FabIntTypebotResultados;
import com.super_bits.Super_Bits.mktMauticIntegracao.configAppp.ConfiguradorCoreTypebotIntegracao;
import com.super_bits.modulosSB.SBCore.ConfigGeral.SBCore;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.WS.conexaoWebServiceClient.ItfRespostaWebServiceSimples;
import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntegracaoRestTypebotLogsResultadoTest {
    public IntegracaoRestTypebotLogsResultadoTest() {
    }

    private static final String TYPEBOT_ID = "jucnz25a466rfdw2gijf8bv6";
    private static final String RESULT_ID = "cxgiriny267lvzsukeyb4zsx";

    @Test
    public void testSomeMethod() {
        SBCore.configurar(new ConfiguradorCoreTypebotIntegracao(), SBCore.ESTADO_APP.DESENVOLVIMENTO);

        ItfRespostaWebServiceSimples resposta = FabIntTypebotResultados.LOGS_RESULTADO.getAcao(TYPEBOT_ID, RESULT_ID).getResposta();
        System.out.println(resposta);
        assertEquals(200, resposta.getCodigoResposta());
    }
}