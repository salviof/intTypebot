package br.org.coletivoJava.integracoes.restTypebot.implementacao;

import br.org.coletivoJava.integracoes.restTypebot.api.InfoIntegracaoRestTypebotResultados;
import br.org.coletivoJava.integracoes.restTypebot.api.FabIntTypebotResultados;
import com.super_bits.Super_Bits.intTypebot.config.FabConfigModuloTypebot;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.api.token.ItfTokenDeAcessoExterno;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.api.FabTipoAgenteClienteApi;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.api.token.TokenDeAcessoExternoSimples;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.implementacao.gestaoToken.GestaoTokenChaveUnica;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ItfUsuario;

@InfoIntegracaoRestTypebotResultados(tipo = FabIntTypebotResultados.LISTAR_7_DIAS)
public class GestaoTokenRestTypebot extends GestaoTokenChaveUnica {

    public GestaoTokenRestTypebot(FabTipoAgenteClienteApi pTipoAgente, ItfUsuario pUsuario) {
        super(FabIntTypebotResultados.class, pTipoAgente, pUsuario);
    }

    @Override
    public boolean validarToken() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ItfTokenDeAcessoExterno loadTokenArmazenado() {
        String chave = FabConfigModuloTypebot.CHAVE_ACESSO.getValorParametroSistema();

        return new TokenDeAcessoExternoSimples(chave);

    }

}
