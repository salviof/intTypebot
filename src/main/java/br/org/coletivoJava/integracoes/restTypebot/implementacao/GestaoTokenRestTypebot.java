package br.org.coletivoJava.integracoes.restTypebot.implementacao;

import br.org.coletivoJava.integracoes.restTypebot.api.InfoIntegracaoRestTypebotResultados;
import com.super_bits.Super_Bits.mktMauticIntegracao.regras_de_negocio_e_controller.FabIntTypebotResultados;
import com.super_bits.Super_Bits.mktMauticIntegracao.regras_de_negocio_e_controller.FabConfigModuloTypebot;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.WS.ItfFabricaIntegracaoRest;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.implementacao.gestaoToken.GestaoTokenOath2;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.api.token.ItfTokenDeAcessoExterno;
import jakarta.json.JsonObject;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.api.FabTipoAgenteClienteApi;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.api.token.TokenDeAcessoExternoDinamico;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.api.token.TokenDeAcessoExternoSimples;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.implementacao.gestaoToken.GestaoTokenChaveUnica;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ItfUsuario;

@InfoIntegracaoRestTypebotResultados(tipo = FabIntTypebotResultados.LISTAR_7_DIAS)
public class GestaoTokenRestTypebot extends GestaoTokenChaveUnica {

    public GestaoTokenRestTypebot(Class<? extends ItfFabricaIntegracaoRest> pClasseEndpoints, FabTipoAgenteClienteApi pTipoAgente, ItfUsuario pUsuario) {
        super(pClasseEndpoints, pTipoAgente, pUsuario);
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
