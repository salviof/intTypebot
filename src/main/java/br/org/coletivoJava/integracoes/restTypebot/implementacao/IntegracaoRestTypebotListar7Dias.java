package br.org.coletivoJava.integracoes.restTypebot.implementacao;

import br.org.coletivoJava.integracoes.restTypebot.api.InfoIntegracaoRestTypebotResultados;
<<<<<<< HEAD
import br.org.coletivoJava.integracoes.restTypebot.api.FabIntTypebotResultados;
=======
import com.super_bits.Super_Bits.mktMauticIntegracao.regras_de_negocio_e_controller.FabIntTypebotResultados;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.WS.conexaoWebServiceClient.FabTipoConexaoRest;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.WS.conexaoWebServiceClient.RespostaWebServiceSimples;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.api.token.ItfTokenGestao;
>>>>>>> 94a58671dd6836e1ec54949b8a96ce539e4866c7
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.implementacao.AcaoApiIntegracaoComOauthAbstrato;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.api.FabTipoAgenteClienteApi;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.implementacao.gestaoToken.GestaoTokenEstatico;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ItfUsuario;

@InfoIntegracaoRestTypebotResultados(tipo = FabIntTypebotResultados.LISTAR_7_DIAS)
public class IntegracaoRestTypebotListar7Dias
		extends
			AcaoApiIntegracaoComOauthAbstrato {

	public IntegracaoRestTypebotListar7Dias(
			final FabTipoAgenteClienteApi pTipoAgente,
			final ItfUsuario pUsuario, final java.lang.Object... pParametro) {
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