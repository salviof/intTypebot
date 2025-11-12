package br.org.coletivoJava.integracoes.restTypebot.implementacao;

import br.org.coletivoJava.integracoes.restTypebot.api.InfoIntegracaoRestTypebotResultados;
import com.super_bits.Super_Bits.mktMauticIntegracao.regras_de_negocio_e_controller.FabIntTypebotResultados;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.api.token.ItfTokenGestao;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.implementacao.AcaoApiIntegracaoComOauthAbstrato;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.api.FabTipoAgenteClienteApi;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ItfUsuario;

@InfoIntegracaoRestTypebotResultados(tipo = FabIntTypebotResultados.LOGS_RESULTADO)
public class IntegracaoRestTypebotLogsResultado
		extends
			AcaoApiIntegracaoComOauthAbstrato {

	public IntegracaoRestTypebotLogsResultado(
			final FabTipoAgenteClienteApi pTipoAgente,
			final ItfUsuario pUsuario, final java.lang.Object... pParametro) {
		super(FabIntTypebotResultados.LOGS_RESULTADO, pTipoAgente, pUsuario,
				pParametro);
	}

}