package br.org.coletivoJava.integracoes.restTypebot.implementacao;

import br.org.coletivoJava.integracoes.restTypebot.api.InfoIntegracaoRestTypebotResultados;
import com.super_bits.Super_Bits.mktMauticIntegracao.regras_de_negocio_e_controller.FabConfigModuloTypebot;
import com.super_bits.Super_Bits.mktMauticIntegracao.regras_de_negocio_e_controller.FabIntTypebotResultados;
import com.super_bits.modulosSB.SBCore.ConfigGeral.SBCore;
import com.super_bits.modulosSB.SBCore.ConfigGeral.arquivosConfiguracao.ConfigModulo;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.WS.ItfFabricaIntegracaoRest;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.api.FabTipoAgenteClienteApi;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.api.token.ItfTokenDeAcessoExterno;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.api.token.TokenDeAcessoExternoSimples;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.implementacao.gestaoToken.GestaoTokenChaveUnica;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.implementacao.gestaoToken.GestaoTokenEstatico;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ItfUsuario;

@InfoIntegracaoRestTypebotResultados(tipo = FabIntTypebotResultados.LISTAR_7_DIAS)
public class GestaoTokenRestTypebot extends GestaoTokenEstatico {
    public static ConfigModulo configuracao = SBCore.getConfigModulo(FabConfigModuloTypebot.class);

    public GestaoTokenRestTypebot(Class<? extends ItfFabricaIntegracaoRest> pClasseEndpoints, FabTipoAgenteClienteApi pTipoAgente, ItfUsuario pUsuario) {
        super(pClasseEndpoints, pTipoAgente, pUsuario);
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
