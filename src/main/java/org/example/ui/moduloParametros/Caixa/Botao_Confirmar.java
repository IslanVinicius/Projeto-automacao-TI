package org.example.ui.moduloParametros.Caixa;

import org.example.data.Parametros.ParametrosBalcao;
import org.example.data.Parametros.ParametrosBalcaoDAO;
import org.example.data.Parametros.ParametrosCaixa;
import org.example.data.Parametros.ParametrosCaixaDAO;
import org.example.ui.moduloParametros.Servidor.BotãoCancelar;
import org.example.ui.moduloParametros.Servidor.Painel_ParametrosServidor;

import javax.swing.*;
import java.util.Objects;

public class Botao_Confirmar {
    private static ParametrosCaixa parametros;
    public static void iniciarComponent(){
        Painel_ParametrosCaixa.btnConfirmar.addActionListener(e->{
            String travaLoteValidade = "";
            if(Objects.equals(Painel_ParametrosCaixa.cmbPermitir_VendaDireta_Controlado.getSelectedItem(), "Liberado")){
                travaLoteValidade = "S";
            } else if (Objects.equals(Painel_ParametrosCaixa.cmbPermitir_VendaDireta_Controlado.getSelectedItem(), "Bloqueado")) {
                travaLoteValidade = "N";
            }
            int resposta = JOptionPane.showConfirmDialog(
                    null,
                    "Deseja salvar a alteração nos parametros?",
                    "Confirmação de Alteração",
                    JOptionPane.YES_NO_OPTION
            );
            if(resposta == JOptionPane.YES_OPTION){
                System.out.println(travaLoteValidade);
                parametros = new ParametrosCaixa(
                        travaLoteValidade,
                        Painel_ParametrosCaixa.txtFCARD_AUTORIZADOR_WEB.getText(),
                        Painel_ParametrosCaixa.txtFCARD_AUTORIZADOR_WEB_LOGIN.getText(),
                        Painel_ParametrosCaixa.txtFCARD_AUTORIZADOR_WEB_SENHA.getText(),
                        Painel_ParametrosCaixa.txtFCARD_AUTORIZADOR_WEB_URL.getText(),
                        Painel_ParametrosCaixa.txtFCARD_ENVIO.getText(),
                        Painel_ParametrosCaixa.txtFCARD_RESPOSTA.getText(),
                        Painel_ParametrosCaixa.txtVIDALINK_ENVIO.getText(),
                        Painel_ParametrosCaixa.txtVIDALINK_RESPOSTA.getText()
                );
                ParametrosCaixaDAO.updateControladoCaixa(
                        Integer.parseInt(Painel_ParametrosCaixa.txtLoja.getText()),
                        Integer.parseInt(Painel_ParametrosCaixa.txtCaixa.getText()),
                        parametros);
                Botao_Cancelar.bloquear();
            }else {
                JOptionPane.showMessageDialog(null, "Ação cancelada.");
                Botao_Cancelar.bloquear();
            }
        });
    }
}
