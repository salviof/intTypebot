package br.org.coletivoJava.integracoes.restTypebot.implementacao;

import br.org.coletivoJava.integracoes.restTypebot.api.InfoIntegracaoRestTypebotWorkspace;
import br.org.coletivoJava.integracoes.restTypebot.api.FabIntTypebotWorkspace;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.implementacao.AcaoApiIntegracaoAbstrato;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.api.FabTipoAgenteClienteApi;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ItfUsuario;

@InfoIntegracaoRestTypebotWorkspace(tipo = FabIntTypebotWorkspace.OBTER_WORKSPACE_BY_ID)
public class IntegracaoRestTypebotObterWorkspaceById
		extends
			AcaoApiIntegracaoAbstrato {

	public IntegracaoRestTypebotObterWorkspaceById(
			final FabTipoAgenteClienteApi pTipoAgente,
			final ItfUsuario pUsuario, final java.lang.Object... pParametro) {
		super(FabIntTypebotWorkspace.OBTER_WORKSPACE_BY_ID, pTipoAgente,
				pUsuario, pParametro);
	}
}