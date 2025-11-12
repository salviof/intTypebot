package br.org.coletivoJava.integracoes.restTypebot.implementacao;

import br.org.coletivoJava.integracoes.restTypebot.api.InfoIntegracaoRestTypebotResultados;
<<<<<<< HEAD
import br.org.coletivoJava.integracoes.restTypebot.api.FabIntTypebotResultados;
import com.super_bits.Super_Bits.intTypebot.config.FabConfigModuloTypebot;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.api.token.ItfTokenDeAcessoExterno;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.api.FabTipoAgenteClienteApi;
=======
import com.super_bits.Super_Bits.mktMauticIntegracao.regras_de_negocio_e_controller.FabConfigModuloTypebot;
import com.super_bits.Super_Bits.mktMauticIntegracao.regras_de_negocio_e_controller.FabIntTypebotResultados;
import com.super_bits.modulosSB.SBCore.ConfigGeral.SBCore;
import com.super_bits.modulosSB.SBCore.ConfigGeral.arquivosConfiguracao.ConfigModulo;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.WS.ItfFabricaIntegracaoRest;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.api.FabTipoAgenteClienteApi;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.api.token.ItfTokenDeAcessoExterno;
>>>>>>> 94a58671dd6836e1ec54949b8a96ce539e4866c7
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.api.token.TokenDeAcessoExternoSimples;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.implementacao.gestaoToken.GestaoTokenChaveUnica;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.implementacao.gestaoToken.GestaoTokenEstatico;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ItfUsuario;

@InfoIntegracaoRestTypebotResultados(tipo = FabIntTypebotResultados.LISTAR_7_DIAS)
public class GestaoTokenRestTypebot extends GestaoTokenEstatico {
    public static ConfigModulo configuracao = SBCore.getConfigModulo(FabConfigModuloTypebot.class);

    public GestaoTokenRestTypebot(FabTipoAgenteClienteApi pTipoAgente, ItfUsuario pUsuario) {
        super(FabIntTypebotResultados.class, pTipoAgente, pUsuario);
    }

    @Override
    public boolean validarToken() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ItfTokenDeAcessoExterno loadTokenArmazenado() {
//        String chave = ;

        return new TokenDeAcessoExternoSimples(configuracao.getPropriedade(FabConfigModuloTypebot.CHAVE_ACESSO));

    }

    @Override
    protected void setToken(ItfTokenDeAcessoExterno pToken) {
        super.setToken(loadTokenArmazenado());
    }

    @Override
    public ItfTokenDeAcessoExterno gerarNovoToken() {
        return new TokenDeAcessoExternoSimples(configuracao.getPropriedade(FabConfigModuloTypebot.CHAVE_ACESSO));

    }
}
