package org.example.view.moduloParametros.Servidor;

public class BotãoCancelar {
    public static void iniciarComponent(){
        Painel_ParametrosServidor.btnCancelar.addActionListener(e-> {
           bloquear();
        });
    }

    public static void bloquear(){
        Painel_ParametrosServidor.btnConsultar          .setEnabled(true);
        Painel_ParametrosServidor.txtLoja               .setEditable(true);
        BotãoEditar.travar();
    }
}
