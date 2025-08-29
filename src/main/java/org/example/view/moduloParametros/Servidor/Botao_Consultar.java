package org.example.view.moduloParametros.Servidor;

import org.example.model.Parametros.ParametrosBalcao;
import org.example.controller.Parametros.ParametrosBalcaoDAO;

public class Botao_Consultar {

    private static ParametrosBalcao parametros = new ParametrosBalcao();

    public static void iniciarComponent(){
        Painel_ParametrosServidor.btnConsultar.addActionListener(e ->{
                    parametros = ParametrosBalcaoDAO.listarParametros(
                            Integer.parseInt(Painel_ParametrosServidor.txtLoja.getText()));
                            carregar();
                    if(parametros.getOBRIGAR_LOTE_VALIDADE().contains("N")){
                        Painel_ParametrosServidor.cmbObrigarLoteValidade.setSelectedIndex(0);
                    } else if (parametros.getOBRIGAR_LOTE_VALIDADE().contains("S")) {
                        Painel_ParametrosServidor.cmbObrigarLoteValidade.setSelectedIndex(1);
                    }
                }
                );
    }
    public static void carregar(){
        Painel_ParametrosServidor.txtEPHARMA_API_CODIGO.setText(parametros.getEPHARMA_API_CODIGO());
        Painel_ParametrosServidor.txtEPHARMA_API_LOGIN.setText(parametros.getEPHARMA_API_LOGIN());
        Painel_ParametrosServidor.txtEPHARMA_API_SENHA.setText(parametros.getEPHARMA_API_SENHA());
        Painel_ParametrosServidor.txtFCARD_AUTORIZADOR_WEB.setText(parametros.getFCARD_AUTORIZADOR_WEB());
        Painel_ParametrosServidor.txtFCARD_AUTORIZADOR_WEB_LOGIN.setText(parametros.getFCARD_AUTORIZADOR_WEB_LOGIN());
        Painel_ParametrosServidor.txtFCARD_AUTORIZADOR_WEB_SENHA.setText(parametros.getFCARD_AUTORIZADOR_WEB_SENHA());
        Painel_ParametrosServidor.txtFCARD_AUTORIZADOR_WEB_URL.setText(parametros.getFCARD_AUTORIZADOR_WEB_URL());
        Painel_ParametrosServidor.txtFCARD_ENV.setText(parametros.getFCARD_ENV());
        Painel_ParametrosServidor.txtFCARD_REC.setText(parametros.getFCARD_REC());
        Painel_ParametrosServidor.txtFCARD_LOG.setText(parametros.getFCARD_LOG());
        Painel_ParametrosServidor.txtINTERPLAYERS_VAREJO_COMPANY_CODE.setText(parametros.getINTERPLAYERS_VAREJO_COMPANY_CODE());
        Painel_ParametrosServidor.txtVIDALINK_ENVIO.setText(parametros.getVIDALINK_ENVIO());
        Painel_ParametrosServidor.txtVIDALINK_RESPOSTA.setText(parametros.getVIDALINK_RESPOSTA());
        if(parametros.getOBRIGAR_LOTE_VALIDADE().contains("S")){
            Painel_ParametrosServidor.cmbObrigarLoteValidade.setSelectedIndex(0);
        } else if (parametros.getOBRIGAR_LOTE_VALIDADE().contains("N")) {
            Painel_ParametrosServidor.cmbObrigarLoteValidade.setSelectedIndex(1);
        }
    }
}
