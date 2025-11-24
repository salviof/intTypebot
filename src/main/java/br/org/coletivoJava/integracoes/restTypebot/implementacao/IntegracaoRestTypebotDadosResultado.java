package br.org.coletivoJava.integracoes.restTypebot.implementacao;

import br.org.coletivoJava.integracoes.restTypebot.api.FabIntTypebotResultados;
import br.org.coletivoJava.integracoes.restTypebot.api.InfoIntegracaoRestTypebotResultados;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.api.FabTipoAgenteClienteApi;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.implementacao.AcaoApiIntegracaoComOauthAbstrato;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ComoUsuario;

@InfoIntegracaoRestTypebotResultados(tipo = FabIntTypebotResultados.DADOS_RESULTADO)
public class IntegracaoRestTypebotDadosResultado
        extends
        AcaoApiIntegracaoComOauthAbstrato {

    public IntegracaoRestTypebotDadosResultado(
            final FabTipoAgenteClienteApi pTipoAgente,
            final ComoUsuario pUsuario, final java.lang.Object... pParametro) {
        super(FabIntTypebotResultados.DADOS_RESULTADO, pTipoAgente, pUsuario,
                pParametro);
    }
}
