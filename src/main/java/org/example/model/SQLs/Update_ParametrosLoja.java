package org.example.model.SQLs;

public class Update_ParametrosLoja {
    public static final String querye =
            "UPDATE PARAMETROS SET "
                    + "EPHARMA_API_CODIGO = ?, "
                    + "EPHARMA_API_LOGIN = ?, "
                    + "EPHARMA_API_SENHA = ?, "
                    + "FCARD_AUTORIZADOR_WEB = ?, "
                    + "FCARD_AUTORIZADOR_WEB_LOGIN = ?, "
                    + "FCARD_AUTORIZADOR_WEB_SENHA = ?, "
                    + "FCARD_AUTORIZADOR_WEB_URL = ?, "
                    + "FCARD_ENV = ?, "
                    + "FCARD_REC = ?, "
                    + "FCARD_LOG = ?, "
                    + "INTERPLAYERS_VAREJO_COMPANY_CODE = ?, "
                    + "VIDALINK_ENVIO = ?, "
                    + "VIDALINK_RESPOSTA = ?, "
                    + "OBRIGAR_LOTE_VALIDADE = ?";
}
