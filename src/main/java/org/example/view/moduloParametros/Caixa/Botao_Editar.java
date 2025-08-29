package org.example.view.moduloParametros.Caixa;

public class Botao_Editar {
    protected static boolean travaForm;

    public static void iniciarComponent(){
        Painel_ParametrosCaixa.btnEditar.addActionListener(e->{
            if(travaForm == true) {
                destravar();
                Painel_ParametrosCaixa.txtCaixa.setEditable(false);
                Painel_ParametrosCaixa.txtLoja.setEditable(false);
                Painel_ParametrosCaixa.btnEditar.setEnabled(false);
                Painel_ParametrosCaixa.btnConsultar.setEnabled(false);
            }

        });
    }


    public static void travar(){
        Painel_ParametrosCaixa.txtFCARD_AUTORIZADOR_WEB          .setEditable(false);
        Painel_ParametrosCaixa.txtFCARD_AUTORIZADOR_WEB_LOGIN    .setEditable(false);
        Painel_ParametrosCaixa.txtFCARD_AUTORIZADOR_WEB_SENHA    .setEditable(false);
        Painel_ParametrosCaixa.txtFCARD_AUTORIZADOR_WEB_URL      .setEditable(false);
        Painel_ParametrosCaixa.txtFCARD_ENVIO                    .setEditable(false);
        Painel_ParametrosCaixa.txtFCARD_RESPOSTA                 .setEditable(false);
        Painel_ParametrosCaixa.txtVIDALINK_ENVIO                 .setEditable(false);
        Painel_ParametrosCaixa.txtVIDALINK_RESPOSTA              .setEditable(false);
        Painel_ParametrosCaixa.cmbPermitir_VendaDireta_Controlado.setEnabled(false);
        Painel_ParametrosCaixa.cmbPermitir_VendaDireta_Controlado.setEditable(false);
        Painel_ParametrosCaixa.btnCancelar                       .setEnabled(false);
        Painel_ParametrosCaixa.btnConfirmar                      .setEnabled(false);
        travaForm = true;
    }
    public static void destravar(){
        Painel_ParametrosCaixa.txtLoja                           .setEditable(true);
        Painel_ParametrosCaixa.txtCaixa                          .setEditable(true);
        Painel_ParametrosCaixa.txtFCARD_AUTORIZADOR_WEB          .setEditable(true);
        Painel_ParametrosCaixa.txtFCARD_AUTORIZADOR_WEB_LOGIN    .setEditable(true);
        Painel_ParametrosCaixa.txtFCARD_AUTORIZADOR_WEB_SENHA    .setEditable(true);
        Painel_ParametrosCaixa.txtFCARD_AUTORIZADOR_WEB_URL      .setEditable(true);
        Painel_ParametrosCaixa.txtFCARD_ENVIO                    .setEditable(true);
        Painel_ParametrosCaixa.txtFCARD_RESPOSTA                 .setEditable(true);
        Painel_ParametrosCaixa.txtVIDALINK_ENVIO                 .setEditable(true);
        Painel_ParametrosCaixa.txtVIDALINK_RESPOSTA              .setEditable(true);
        Painel_ParametrosCaixa.cmbPermitir_VendaDireta_Controlado.setEnabled(true);
        Painel_ParametrosCaixa.cmbPermitir_VendaDireta_Controlado.setEditable(true);
        Painel_ParametrosCaixa.btnCancelar                       .setEnabled(true);
        Painel_ParametrosCaixa.btnConfirmar                      .setEnabled(true);
        Painel_ParametrosCaixa.btnEditar                         .setEnabled(true);
        travaForm = false;
    }

}
