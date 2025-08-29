package org.example.model.Parametros;

public class ParametrosCaixa {
    private String
            PERMITIR_CONTROLADO_VENDA_DIRETA,
            FCARD_AUTORIZADOR_WEB,
            FCARD_AUTORIZADOR_WEB_LOGIN,
            FCARD_AUTORIZADOR_WEB_SENHA,
            FCARD_AUTORIZADOR_WEB_URL,
            FCARD_ENVIO,
            FCARD_RESPOSTA,
            VIDALINK_ENVIO,
            VIDALINK_RESPOSTA;

    public ParametrosCaixa() {
    }

    public ParametrosCaixa(String PERMITIR_CONTROLADO_VENDA_DIRETA,
                           String FCARD_AUTORIZADOR_WEB, String FCARD_AUTORIZADOR_WEB_LOGIN, String FCARD_AUTORIZADOR_WEB_SENHA,
                           String FCARD_AUTORIZADOR_WEB_URL,
                           String FCARD_ENVIO, String FCARD_RESPOSTA,
                           String VIDALINK_ENVIO, String VIDALINK_RESPOSTA) {
        this.PERMITIR_CONTROLADO_VENDA_DIRETA = PERMITIR_CONTROLADO_VENDA_DIRETA;
        this.FCARD_AUTORIZADOR_WEB = FCARD_AUTORIZADOR_WEB;
        this.FCARD_AUTORIZADOR_WEB_LOGIN = FCARD_AUTORIZADOR_WEB_LOGIN;
        this.FCARD_AUTORIZADOR_WEB_SENHA = FCARD_AUTORIZADOR_WEB_SENHA;
        this.FCARD_AUTORIZADOR_WEB_URL = FCARD_AUTORIZADOR_WEB_URL;
        this.FCARD_ENVIO = FCARD_ENVIO;
        this.FCARD_RESPOSTA = FCARD_RESPOSTA;
        this.VIDALINK_ENVIO = VIDALINK_ENVIO;
        this.VIDALINK_RESPOSTA = VIDALINK_RESPOSTA;
    }

    public String getPERMITIR_CONTROLADO_VENDA_DIRETA() {
        return PERMITIR_CONTROLADO_VENDA_DIRETA;
    }

    public void setPERMITIR_CONTROLADO_VENDA_DIRETA(String PERMITIR_CONTROLADO_VENDA_DIRETA) {
        this.PERMITIR_CONTROLADO_VENDA_DIRETA = PERMITIR_CONTROLADO_VENDA_DIRETA;
    }

    public String getFCARD_AUTORIZADOR_WEB() {
        return FCARD_AUTORIZADOR_WEB;
    }

    public void setFCARD_AUTORIZADOR_WEB(String FCARD_AUTORIZADOR_WEB) {
        this.FCARD_AUTORIZADOR_WEB = FCARD_AUTORIZADOR_WEB;
    }

    public String getFCARD_AUTORIZADOR_WEB_LOGIN() {
        return FCARD_AUTORIZADOR_WEB_LOGIN;
    }

    public void setFCARD_AUTORIZADOR_WEB_LOGIN(String FCARD_AUTORIZADOR_WEB_LOGIN) {
        this.FCARD_AUTORIZADOR_WEB_LOGIN = FCARD_AUTORIZADOR_WEB_LOGIN;
    }

    public String getFCARD_AUTORIZADOR_WEB_SENHA() {
        return FCARD_AUTORIZADOR_WEB_SENHA;
    }

    public void setFCARD_AUTORIZADOR_WEB_SENHA(String FCARD_AUTORIZADOR_WEB_SENHA) {
        this.FCARD_AUTORIZADOR_WEB_SENHA = FCARD_AUTORIZADOR_WEB_SENHA;
    }

    public String getFCARD_AUTORIZADOR_WEB_URL() {
        return FCARD_AUTORIZADOR_WEB_URL;
    }

    public void setFCARD_AUTORIZADOR_WEB_URL(String FCARD_AUTORIZADOR_WEB_URL) {
        this.FCARD_AUTORIZADOR_WEB_URL = FCARD_AUTORIZADOR_WEB_URL;
    }

    public String getFCARD_ENVIO() {
        return FCARD_ENVIO;
    }

    public void setFCARD_ENVIO(String FCARD_ENVIO) {
        this.FCARD_ENVIO = FCARD_ENVIO;
    }

    public String getFCARD_RESPOSTA() {
        return FCARD_RESPOSTA;
    }

    public void setFCARD_RESPOSTA(String FCARD_RESPOSTA) {
        this.FCARD_RESPOSTA = FCARD_RESPOSTA;
    }

    public String getVIDALINK_ENVIO() {
        return VIDALINK_ENVIO;
    }

    public void setVIDALINK_ENVIO(String VIDALINK_ENVIO) {
        this.VIDALINK_ENVIO = VIDALINK_ENVIO;
    }

    public String getVIDALINK_RESPOSTA() {
        return VIDALINK_RESPOSTA;
    }

    public void setVIDALINK_RESPOSTA(String VIDALINK_RESPOSTA) {
        this.VIDALINK_RESPOSTA = VIDALINK_RESPOSTA;
    }
}
