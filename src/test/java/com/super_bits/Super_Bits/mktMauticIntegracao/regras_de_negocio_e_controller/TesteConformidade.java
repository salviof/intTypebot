/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.Super_Bits.mktMauticIntegracao.regras_de_negocio_e_controller;

import br.org.coletivoJava.integracoes.restTypebot.api.FabApiRestIntTypebotResultados;
import com.super_bits.Super_Bits.intTypebot.config.FabConfigModuloTypebot;
import com.super_bits.Super_Bits.mktMauticIntegracao.configAppp.ConfiguradorCoreTypebotIntegracao;
import com.super_bits.modulosSB.SBCore.ConfigGeral.SBCore;
import org.junit.Test;
import testes.testesSupers.TestesApiRest;

/**
 *
 * @author sfurbino
 */
public class TesteConformidade extends TestesApiRest {

    public TesteConformidade() {
    }

    /**
     * Test of values method, of class FabMauticContatoRest.
     */
    @Test
    public void testValues() {
        try {
            SBCore.configurar(new ConfiguradorCoreTypebotIntegracao(), SBCore.ESTADO_APP.DESENVOLVIMENTO);
            gerarCodigosChamadasEndpoint(FabApiRestIntTypebotResultados.class);
            SBCore.getConfigModulo(FabConfigModuloTypebot.class);

        } catch (Throwable t) {
            System.out.println("Deu merda");
        }

    }

}
