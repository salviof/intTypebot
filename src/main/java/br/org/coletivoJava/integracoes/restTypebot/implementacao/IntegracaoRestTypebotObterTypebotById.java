package br.org.coletivoJava.integracoes.restTypebot.implementacao;

import br.org.coletivoJava.integracoes.restTypebot.api.InfoIntegracaoRestTypebotBots;
import br.org.coletivoJava.integracoes.restTypebot.api.FabIntTypebotBots;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.implementacao.AcaoApiIntegracaoAbstrato;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.api.FabTipoAgenteClienteApi;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ComoUsuario;

@InfoIntegracaoRestTypebotBots(tipo = FabIntTypebotBots.OBTER_TYPEBOT_BY_ID)
public class IntegracaoRestTypebotObterTypebotById
        extends
        AcaoApiIntegracaoAbstrato {

<<<<<<< HEAD
    public IntegracaoRestTypebotObterTypebotById(
            final FabTipoAgenteClienteApi pTipoAgente,
            final ComoUsuario pUsuario, final java.lang.Object... pParametro) {
        super(FabIntTypebotBots.OBTER_TYPEBOT_BY_ID, pTipoAgente, pUsuario,
                pParametro);
    }
}
=======
	public IntegracaoRestTypebotObterTypebotById(
			final FabTipoAgenteClienteApi pTipoAgente,
			final ComoUsuario pUsuario, final java.lang.Object... pParametro) {
		super(FabIntTypebotBots.OBTER_TYPEBOT_BY_ID, pTipoAgente, pUsuario,
				pParametro);
	}
}
>>>>>>> a8938cd25995f1a631868fd114cec6dc035b1469
