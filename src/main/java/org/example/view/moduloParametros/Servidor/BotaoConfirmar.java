package org.example.view.moduloParametros.Servidor;

import org.example.model.Parametros.ParametrosBalcao;
import org.example.controller.Parametros.ParametrosBalcaoDAO;

import javax.swing.*;

public class BotaoConfirmar {
    private static ParametrosBalcao parametros;
    public static void iniciarComponent(){
        Painel_ParametrosServidor.btnConfirmar.addActionListener(e -> {

            String travaLoteValidade = "";
            if(Painel_ParametrosServidor.cmbObrigarLoteValidade.getSelectedItem().equals("Liberado")){
                travaLoteValidade = "N";
            } else if (Painel_ParametrosServidor.cmbObrigarLoteValidade.getSelectedItem().equals("Bloqueado")) {
                travaLoteValidade = "S";
            }
            int resposta = JOptionPane.showConfirmDialog(
                    null,
                "Deseja salvar a alteração nos parametros?",
                    "Confirmação de Alteração",
                    JOptionPane.YES_NO_OPTION
            );
            if(resposta == JOptionPane.YES_OPTION){
                parametros = new ParametrosBalcao(
                        travaLoteValidade,
                        Painel_ParametrosServidor.txtEPHARMA_API_CODIGO.getText(),
                        Painel_ParametrosServidor.txtEPHARMA_API_LOGIN.getText(),
                        Painel_ParametrosServidor.txtEPHARMA_API_SENHA.getText(),
                        Painel_ParametrosServidor.txtFCARD_AUTORIZADOR_WEB.getText(),
                        Painel_ParametrosServidor.txtFCARD_AUTORIZADOR_WEB_LOGIN.getText(),
                        Painel_ParametrosServidor.txtFCARD_AUTORIZADOR_WEB_SENHA.getText(),
                        Painel_ParametrosServidor.txtFCARD_AUTORIZADOR_WEB_URL.getText(),
                        Painel_ParametrosServidor.txtFCARD_ENV.getText(),
                        Painel_ParametrosServidor.txtFCARD_REC.getText(),
                        Painel_ParametrosServidor.txtFCARD_LOG.getText(),
                        Painel_ParametrosServidor.txtINTERPLAYERS_VAREJO_COMPANY_CODE.getText(),
                        Painel_ParametrosServidor.txtVIDALINK_ENVIO.getText(),
                        Painel_ParametrosServidor.txtVIDALINK_RESPOSTA.getText());
                ParametrosBalcaoDAO.updateParametros(Integer.parseInt(Painel_ParametrosServidor.txtLoja.getText()),parametros);
                BotãoCancelar.bloquear();
            }else {
                JOptionPane.showMessageDialog(null, "Ação cancelada.");
                BotãoCancelar.bloquear();
            }

        });
    }
}
