package org.example.ui.moduloParametros.Servidor;


public class BotãoEditar {
    protected static boolean travaForm;
    public static void iniciarComponent(){
            Painel_ParametrosServidor.btnEditar.addActionListener(e->{
                if (travaForm){
                    Painel_ParametrosServidor.btnEditar.setEnabled(false);
                    destravar();
                    Painel_ParametrosServidor.txtLoja.setEditable(false);
                    Painel_ParametrosServidor.btnConsultar.setEnabled(false);
                }
            });
    }

    protected static void travar(){
            Painel_ParametrosServidor.txtVIDALINK_RESPOSTA                .setEditable(false);
            Painel_ParametrosServidor.txtVIDALINK_ENVIO                   .setEditable(false);
            Painel_ParametrosServidor.txtFCARD_LOG                        .setEditable(false);
            Painel_ParametrosServidor.txtFCARD_ENV                        .setEditable(false);
            Painel_ParametrosServidor.txtFCARD_REC                        .setEditable(false);
            Painel_ParametrosServidor.txtFCARD_AUTORIZADOR_WEB_URL        .setEditable(false);
            Painel_ParametrosServidor.txtFCARD_AUTORIZADOR_WEB            .setEditable(false);
            Painel_ParametrosServidor.txtFCARD_AUTORIZADOR_WEB_SENHA      .setEditable(false);
            Painel_ParametrosServidor.txtFCARD_AUTORIZADOR_WEB_LOGIN      .setEditable(false);
            Painel_ParametrosServidor.txtEPHARMA_API_SENHA                .setEditable(false);
            Painel_ParametrosServidor.txtEPHARMA_API_LOGIN                .setEditable(false);
            Painel_ParametrosServidor.txtEPHARMA_API_CODIGO               .setEditable(false);
            Painel_ParametrosServidor.txtVIDALINK_ENVIO                   .setEditable(false);
            Painel_ParametrosServidor.txtVIDALINK_RESPOSTA                .setEditable(false);
            Painel_ParametrosServidor.txtINTERPLAYERS_VAREJO_COMPANY_CODE .setEditable(false);
            Painel_ParametrosServidor.cmbObrigarLoteValidade              .setEditable(false);
            Painel_ParametrosServidor.cmbObrigarLoteValidade              .setEnabled (false);
            Painel_ParametrosServidor.btnCancelar                         .setEnabled (false);
            Painel_ParametrosServidor.btnConfirmar                        .setEnabled (false);
            travaForm = true;
    }

    protected static void destravar(){
            Painel_ParametrosServidor.txtVIDALINK_RESPOSTA                .setEditable(true);
            Painel_ParametrosServidor.txtVIDALINK_ENVIO                   .setEditable(true);
            Painel_ParametrosServidor.txtFCARD_LOG                        .setEditable(true);
            Painel_ParametrosServidor.txtFCARD_ENV                        .setEditable(true);
            Painel_ParametrosServidor.txtFCARD_REC                        .setEditable(true);
            Painel_ParametrosServidor.txtFCARD_AUTORIZADOR_WEB_URL        .setEditable(true);
            Painel_ParametrosServidor.txtFCARD_AUTORIZADOR_WEB            .setEditable(true);
            Painel_ParametrosServidor.txtFCARD_AUTORIZADOR_WEB_SENHA      .setEditable(true);
            Painel_ParametrosServidor.txtFCARD_AUTORIZADOR_WEB_LOGIN      .setEditable(true);
            Painel_ParametrosServidor.txtEPHARMA_API_SENHA                .setEditable(true);
            Painel_ParametrosServidor.txtEPHARMA_API_LOGIN                .setEditable(true);
            Painel_ParametrosServidor.txtEPHARMA_API_CODIGO               .setEditable(true);
            Painel_ParametrosServidor.txtVIDALINK_ENVIO                   .setEditable(true);
            Painel_ParametrosServidor.txtVIDALINK_RESPOSTA                .setEditable(true);
            Painel_ParametrosServidor.txtINTERPLAYERS_VAREJO_COMPANY_CODE .setEditable(true);
            Painel_ParametrosServidor.cmbObrigarLoteValidade              .setEditable(true);
            Painel_ParametrosServidor.cmbObrigarLoteValidade              .setEnabled (true);
            Painel_ParametrosServidor.btnCancelar                         .setEnabled (true);
            Painel_ParametrosServidor.btnConfirmar                        .setEnabled (true);
            Painel_ParametrosServidor.btnEditar                           .setEnabled (true);
            travaForm = false;
    }
}
