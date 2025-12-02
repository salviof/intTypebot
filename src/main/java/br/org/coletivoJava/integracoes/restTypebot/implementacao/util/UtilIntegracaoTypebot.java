/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.org.coletivoJava.integracoes.restTypebot.implementacao.util;

import jakarta.json.JsonArray;
import jakarta.json.JsonObject;
import java.util.Objects;

/**
 *
 * @author salvio
 */
public class UtilIntegracaoTypebot {

    public static boolean isContemVariavelProgramada(JsonObject botJson, final String pNomeVariavel, final String P_VALOR) {
        if (botJson == null) {
            return false;
        }

        // 1 — Busca o ID da variável INTEGRAR_DADOS
        String integrarVarId = botJson.getJsonArray("variables")
                .stream()
                .map(JsonObject.class::cast)
                .filter(v -> pNomeVariavel.equals(v.getString("name", null)))
                .findFirst()
                .map(v -> v.getString("id", null))
                .filter(Objects::nonNull)
                .orElse(null);

        if (integrarVarId == null) {
            return false; // variável não existe → padrão false
        }

        // 2 — Verifica se existe algum "Set variable" que define ela como true
        return botJson.getJsonArray("groups")
                .stream()
                .map(JsonObject.class::cast)
                .map(g -> g.getJsonArray("blocks"))
                .filter(Objects::nonNull)
                .flatMap(blocks -> blocks.getValuesAs(JsonObject.class).stream())
                .filter(block -> "Set variable".equals(block.getString("type", null)))
                .map(block -> block.getJsonObject("options"))
                .filter(Objects::nonNull)
                .anyMatch(options -> {
                    String varId = options.getString("variableId", null);
                    String expression = options.getString("expressionToEvaluate", "").trim();

                    return integrarVarId.equals(varId)
                            && (P_VALOR.equalsIgnoreCase(expression) || "True".equals(expression));
                });
    }

    public static boolean isIntegrarDadosTrue(JsonObject botJson) {
        return isContemVariavelProgramada(botJson, "INTEGRAR_DADOS", "true");
    }
}
