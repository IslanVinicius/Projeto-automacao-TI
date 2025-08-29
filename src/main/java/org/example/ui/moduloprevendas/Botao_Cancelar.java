package org.example.ui.moduloprevendas;

import javax.swing.*;

public class Botao_Cancelar {
    public static void iniciarComponent(){
        Painel_1.btnCancelar.addActionListener(e ->{
            Screen_ModuloPrevendas.screen_prevendas.dispose();
            Painel_1.txtValor.setText("");
            Painel_1.txtPrevenda.setText("");
            Painel_1.txtLoja.setText("");
            CarregarDadosTabelas.limparTabela(Div_Inferior.tabela_prevendas.getModeloPrevendas());
            CarregarDadosTabelas.limparTabela(Div_Inferior.tabela_prevendasItens.getModeloPrevendasItens());
        });
    }
}
