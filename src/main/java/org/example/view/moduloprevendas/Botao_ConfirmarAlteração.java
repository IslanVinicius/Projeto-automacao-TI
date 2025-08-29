package org.example.view.moduloprevendas;

import org.example.controller.Prevendas.PrevendasDAO;
import org.example.Tratamentos;

import javax.swing.*;

public class Botao_ConfirmarAlteração {
    private static Tratamentos tratamento;

    public static void iniciarComponent(){
        Painel_1.btnConfirmar.addActionListener(event ->{
            String msgConfirmar =
                    "Tem certeza que deseja alterar a prevenda: " + Painel_1.txtPrevenda.getText()
                            + " \npara o valor: " + Painel_1.txtValor.getText();
            int linhasAfetadas;
            int resposta = JOptionPane.showConfirmDialog(
                    null,
                    msgConfirmar,
                    "Confirmação de Alteração",
                    JOptionPane.YES_NO_OPTION
            );
            if(resposta == JOptionPane.YES_OPTION){
                linhasAfetadas = PrevendasDAO.alterar_prevenda(
                        Integer.parseInt(Painel_1.txtLoja.getText()),
                        Integer.parseInt(Painel_1.txtPrevenda.getText()),
                        Float.parseFloat(Painel_1.txtValor.getText()));
                JOptionPane.showMessageDialog(null,
                        "Alteração realizada com sucesso!\n" +
                                "Linhas afetadas: " + linhasAfetadas);
                Botao_consultaItensPrevenda.function();
                Botao_consultaPrevendas.function();
                Painel_1.txtPrevenda.setText("");
                Painel_1.txtValor.setText("");
                
            }else {
                JOptionPane.showMessageDialog(null, "Ação cancelada.");
            }
        });
    }
}
