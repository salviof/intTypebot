package br.org.coletivoJava.integracoes.restTypebot.implementacao;

import br.org.coletivoJava.integracoes.restTypebot.api.FabIntTypebotResultados;
import br.org.coletivoJava.integracoes.restTypebot.api.InfoIntegracaoRestTypebotResultados;
import com.super_bits.Super_Bits.intTypebot.config.FabConfigModuloTypebot;
import com.super_bits.modulosSB.SBCore.ConfigGeral.SBCore;
import com.super_bits.modulosSB.SBCore.ConfigGeral.arquivosConfiguracao.ConfigModulo;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.api.FabTipoAgenteClienteApi;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.api.token.ItfTokenDeAcessoExterno;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.api.token.TokenDeAcessoExternoSimples;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.implementacao.gestaoToken.GestaoTokenEstatico;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ComoUsuario;

@InfoIntegracaoRestTypebotResultados(tipo = FabIntTypebotResultados.LISTAR_7_DIAS)
public class GestaoTokenRestTypebot extends GestaoTokenEstatico {

    public static ConfigModulo configuracao = SBCore.getConfigModulo(FabConfigModuloTypebot.class);

    public GestaoTokenRestTypebot(FabTipoAgenteClienteApi pTipoAgente, ComoUsuario pUsuario) {
        super(FabIntTypebotResultados.class, pTipoAgente, pUsuario);
    }

    @Override
    public boolean validarToken() {
        if (getToken() == null) {
            return false;
        }
        return getTokenCompleto().isTokenValido();
    }

    @Override
    public ItfTokenDeAcessoExterno loadTokenArmazenado() {
//        String chave = ;
        configuracoesAmbiente.getPropriedade(FabConfigModuloTypebot.CHAVE_ACESSO);
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
