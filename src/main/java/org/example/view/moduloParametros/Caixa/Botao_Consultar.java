package org.example.view.moduloParametros.Caixa;

import org.example.model.Parametros.ParametrosCaixa;
import org.example.controller.Parametros.ParametrosCaixaDAO;

public class Botao_Consultar {
    public static void iniciarComponent(){
        Painel_ParametrosCaixa.btnConsultar.addActionListener(e->{
            ParametrosCaixa p = ParametrosCaixaDAO.listarParametros(Integer.parseInt(Painel_ParametrosCaixa.txtLoja.getText()),
                    Integer.parseInt(Painel_ParametrosCaixa.txtCaixa.getText()));
            Painel_ParametrosCaixa.txtFCARD_AUTORIZADOR_WEB      .setText(p.getFCARD_AUTORIZADOR_WEB());
            Painel_ParametrosCaixa.txtFCARD_AUTORIZADOR_WEB_LOGIN.setText(p.getFCARD_AUTORIZADOR_WEB_LOGIN());
            Painel_ParametrosCaixa.txtFCARD_AUTORIZADOR_WEB_SENHA.setText(p.getFCARD_AUTORIZADOR_WEB_SENHA());
            Painel_ParametrosCaixa.txtFCARD_AUTORIZADOR_WEB_URL  .setText(p.getFCARD_AUTORIZADOR_WEB_URL());
            Painel_ParametrosCaixa.txtFCARD_ENVIO                .setText(p.getFCARD_ENVIO());
            Painel_ParametrosCaixa.txtFCARD_RESPOSTA             .setText(p.getFCARD_RESPOSTA());
            Painel_ParametrosCaixa.txtVIDALINK_ENVIO             .setText(p.getVIDALINK_ENVIO());
            Painel_ParametrosCaixa.txtVIDALINK_RESPOSTA          .setText(p.getVIDALINK_RESPOSTA());

            if(p.getPERMITIR_CONTROLADO_VENDA_DIRETA().contains("S")){
                Painel_ParametrosCaixa.cmbPermitir_VendaDireta_Controlado.setSelectedIndex(0);
            } else if (p.getPERMITIR_CONTROLADO_VENDA_DIRETA().contains("N")){
                Painel_ParametrosCaixa.cmbPermitir_VendaDireta_Controlado.setSelectedIndex(1);
            }
        });
    }
}
