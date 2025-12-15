package br.org.coletivoJava.integracoes.restTypebot.implementacao;

import br.org.coletivoJava.integracoes.restTypebot.api.FabApiRestIntTypebotResultados;
import br.org.coletivoJava.integracoes.restTypebot.api.InfoIntegracaoRestTypebotResultados;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.api.FabTipoAgenteClienteApi;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.implementacao.AcaoApiIntegracaoComOauthAbstrato;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ComoUsuario;

@InfoIntegracaoRestTypebotResultados(tipo = FabApiRestIntTypebotResultados.LOGS_RESULTADO)
public class IntegracaoRestTypebotLogsResultado
        extends
        AcaoApiIntegracaoComOauthAbstrato {

    public IntegracaoRestTypebotLogsResultado(
            final FabTipoAgenteClienteApi pTipoAgente,
            final ComoUsuario pUsuario, final java.lang.Object... pParametro) {
        super(FabApiRestIntTypebotResultados.LOGS_RESULTADO, pTipoAgente, pUsuario,
                pParametro);
    }

}
