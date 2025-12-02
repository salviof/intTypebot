package br.org.coletivoJava.integracoes.restTypebot.implementacao;

import br.org.coletivoJava.integracoes.restTypebot.api.InfoIntegracaoRestTypebotWorkspace;
import br.org.coletivoJava.integracoes.restTypebot.api.FabIntTypebotWorkspace;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.implementacao.AcaoApiIntegracaoAbstrato;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.api.FabTipoAgenteClienteApi;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ComoUsuario;

@InfoIntegracaoRestTypebotWorkspace(tipo = FabIntTypebotWorkspace.LISTAR_TODOS_WORKSPACES)
public class IntegracaoRestTypebotListarTodosWorkspaces
        extends
        AcaoApiIntegracaoAbstrato {


	public IntegracaoRestTypebotListarTodosWorkspaces(
			final FabTipoAgenteClienteApi pTipoAgente,
			final ComoUsuario pUsuario, final java.lang.Object... pParametro) {
		super(FabIntTypebotWorkspace.LISTAR_TODOS_WORKSPACES, pTipoAgente,
				pUsuario, pParametro);
	}
}
