<<<<<<< HEAD
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.super_bits.Super_Bits.mktMauticIntegracao.regras_de_negocio_e_controller;

import br.org.coletivoJava.integracoes.restTypebot.api.FabIntTypebotResultados;
import com.super_bits.Super_Bits.mktMauticIntegracao.configAppp.ConfiguradorCoreTypebot;
import com.super_bits.modulosSB.SBCore.ConfigGeral.SBCore;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.WS.conexaoWebServiceClient.ItfRespostaWebServiceSimples;
import org.coletivojava.fw.api.tratamentoErros.FabErro;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import testes.testesSupers.TestesApiRest;

/**
 *
 * @author salvio
 */
public class FabIntTypebotResultadosTest extends TestesApiRest {

    /**
     * Test of values method, of class FabApiRestIntMatrixChatSalas.
     */
    @Test
    public void testValues() {
        try {

            SBCore.configurar(new ConfiguradorCoreTypebot(), SBCore.ESTADO_APP.DESENVOLVIMENTO);
            gerarCodigosChamadasEndpoint(FabIntTypebotResultados.class);

        } catch (Throwable t) {
            SBCore.RelatarErro(FabErro.SOLICITAR_REPARO, t.getMessage(), t);
        }
    }

}
=======
package com.super_bits.Super_Bits.mktMauticIntegracao.regras_de_negocio_e_controller;

import com.super_bits.Super_Bits.mktMauticIntegracao.configAppp.ConfiguradorCoreTypebotIntegracao;
import com.super_bits.modulosSB.SBCore.ConfigGeral.SBCore;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.WS.conexaoWebServiceClient.ItfRespostaWebServiceSimples;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.api.FabTipoAgenteClienteApi;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FabIntTypebotResultadosTest {


    private static final String TYPEBOT_ID = "jucnz25a466rfdw2gijf8bv6";
    private static final int LIMIT = 50;
    @Test
    public void testFabIntTypebotResultados() {
        SBCore.configurar(new ConfiguradorCoreTypebotIntegracao(), SBCore.ESTADO_APP.DESENVOLVIMENTO);

        ItfRespostaWebServiceSimples resposta = FabIntTypebotResultados.LISTAR_7_DIAS.getAcao().getResposta();
        System.out.println(resposta);
        assertEquals(200, resposta.getCodigoResposta());

    }

}
>>>>>>> 94a58671dd6836e1ec54949b8a96ce539e4866c7
