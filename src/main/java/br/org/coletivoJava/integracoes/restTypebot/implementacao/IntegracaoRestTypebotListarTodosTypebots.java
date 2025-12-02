package br.org.coletivoJava.integracoes.restTypebot.implementacao;

import br.org.coletivoJava.integracoes.restTypebot.api.InfoIntegracaoRestTypebotBots;
import br.org.coletivoJava.integracoes.restTypebot.api.FabIntTypebotBots;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.implementacao.AcaoApiIntegracaoAbstrato;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.api.FabTipoAgenteClienteApi;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ComoUsuario;

@InfoIntegracaoRestTypebotBots(tipo = FabIntTypebotBots.LISTAR_TODOS_TYPEBOTS)
public class IntegracaoRestTypebotListarTodosTypebots
        extends
        AcaoApiIntegracaoAbstrato {


	public IntegracaoRestTypebotListarTodosTypebots(
			final FabTipoAgenteClienteApi pTipoAgente,
			final ComoUsuario pUsuario, final java.lang.Object... pParametro) {
		super(FabIntTypebotBots.LISTAR_TODOS_TYPEBOTS, pTipoAgente, pUsuario,
				pParametro);
	}
}