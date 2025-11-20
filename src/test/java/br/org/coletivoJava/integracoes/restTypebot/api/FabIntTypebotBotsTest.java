package br.org.coletivoJava.integracoes.restTypebot.api;

import com.super_bits.Super_Bits.mktMauticIntegracao.configAppp.ConfiguradorCoreTypebotIntegracao;
import com.super_bits.modulosSB.SBCore.ConfigGeral.SBCore;
import junit.framework.TestCase;
import org.coletivojava.fw.api.tratamentoErros.FabErro;
import org.junit.Test;
import testes.testesSupers.TestesApiRest;

public class FabIntTypebotBotsTest extends TestesApiRest {
    @Test
    public void testValues() {
        try {

            SBCore.configurar(new ConfiguradorCoreTypebotIntegracao(), SBCore.ESTADO_APP.DESENVOLVIMENTO);
            gerarCodigosChamadasEndpoint(FabIntTypebotBots.class);

        } catch (Throwable t) {
            SBCore.RelatarErro(FabErro.SOLICITAR_REPARO, t.getMessage(), t);
        }
    }
}