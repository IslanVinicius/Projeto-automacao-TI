package org.example.view.moduloParametros.Caixa;


public class Botao_Cancelar {
    public static void iniciarComponent(){
        Painel_ParametrosCaixa.btnCancelar.addActionListener(e->{
            bloquear();
        });
    }

    public static void bloquear(){
        Painel_ParametrosCaixa.btnConsultar          .setEnabled(true);
        Painel_ParametrosCaixa.txtLoja               .setEditable(true);
        Painel_ParametrosCaixa.txtCaixa              .setEditable(true);
        Painel_ParametrosCaixa.btnEditar             .setEnabled(true);
        Botao_Editar.travar();
    }
}
