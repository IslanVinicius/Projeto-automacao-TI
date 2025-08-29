package org.example.model.SQLs;

public class Update_TravaControlado_Caixa {
    public static final String querye =
            "UPDATE PARAMETROS SET "
                    + "PERMITIR_CONTROLADO_VENDA_DIRETA = ?, "
                    + "FCARD_AUTORIZADOR_WEB = ?, "
                    + "FCARD_AUTORIZADOR_WEB_LOGIN = ?, "
                    + "FCARD_AUTORIZADOR_WEB_SENHA = ?, "
                    + "FCARD_AUTORIZADOR_WEB_URL = ?, "
                    + "FCARD_ENVIO = ?, "
                    + "FCARD_RESPOSTA = ?, "
                    + "VIDALINK_ENVIO = ?, "
                    + "VIDALINK_RESPOSTA = ?";
}
