package br.org.coletivoJava.integracoes.restTypebot.implementacao;

import br.org.coletivoJava.integracoes.restTypebot.api.InfoIntegracaoRestTypebotWorkspace;
import br.org.coletivoJava.integracoes.restTypebot.api.FabApiRestTypebotWorkspace;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.implementacao.AcaoApiIntegracaoAbstrato;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.api.FabTipoAgenteClienteApi;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ComoUsuario;

@InfoIntegracaoRestTypebotWorkspace(tipo = FabApiRestTypebotWorkspace.OBTER_WORKSPACE_BY_ID)
public class IntegracaoRestTypebotObterWorkspaceById
        extends
        AcaoApiIntegracaoAbstrato {


	public IntegracaoRestTypebotObterWorkspaceById(
			final FabTipoAgenteClienteApi pTipoAgente,
			final ComoUsuario pUsuario, final java.lang.Object... pParametro) {
		super(FabApiRestTypebotWorkspace.OBTER_WORKSPACE_BY_ID, pTipoAgente,
				pUsuario, pParametro);
	}
}
