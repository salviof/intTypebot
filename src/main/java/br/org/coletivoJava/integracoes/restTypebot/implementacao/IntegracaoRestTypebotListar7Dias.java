package br.org.coletivoJava.integracoes.restTypebot.implementacao;

import br.org.coletivoJava.integracoes.restTypebot.api.FabIntTypebotResultados;
import br.org.coletivoJava.integracoes.restTypebot.api.InfoIntegracaoRestTypebotResultados;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.api.FabTipoAgenteClienteApi;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.implementacao.AcaoApiIntegracaoComOauthAbstrato;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ComoUsuario;

@InfoIntegracaoRestTypebotResultados(tipo = FabIntTypebotResultados.LISTAR_7_DIAS)
public class IntegracaoRestTypebotListar7Dias
        extends
        AcaoApiIntegracaoComOauthAbstrato {

    public IntegracaoRestTypebotListar7Dias(
            final FabTipoAgenteClienteApi pTipoAgente,
            final ComoUsuario pUsuario, final java.lang.Object... pParametro) {
        super(FabIntTypebotResultados.LISTAR_7_DIAS, pTipoAgente, pUsuario,
                pParametro);
    }

    //    @Override
//    public String gerarCorpoRequisicao() {
//
//        String typebotId = (String) getParametros()[0];
//        int limit = (int) getParametros()[1];
//        int timeFilter = (int) getParametros()[2];
//        int cursor = (int) getParametros()[3];
//
//
//    }
}
