package org.example.ui.moduloprevendas;


import javax.swing.*;
import java.awt.*;

public class Painel_1  {
    //DECLARAÇÂO
    protected static JPanel painel = new JPanel(new GridBagLayout());
    protected static JTextField txtLoja, txtPrevenda, txtValor;
    protected static JButton bt_consulta = new JButton("Consultar");
    protected static JButton btnConsultarItens = new JButton("Consultar Itens");
    protected static JButton btnConfirmar = new JButton("Alterar Prevenda");
    protected static JButton btnCancelar = new JButton("Cancelar");


    public Painel_1() {
        painel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        painel.setPreferredSize(new Dimension(430, 180));
        painel.setMinimumSize(new Dimension(380, 150));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(6, 6, 6, 6);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.anchor = GridBagConstraints.WEST;

        //------------------------------------------------------------------------
        //PRIMEIRO CAMPO

        gbc.gridx = 0; gbc.gridy = 0;
        painel.add(new JLabel("Número da Loja:"), gbc);

        gbc.gridx = 1;
        txtLoja = new JTextField(10);
        painel.add(txtLoja, gbc);

        gbc.gridx = 2;
        Botao_consultaPrevendas.iniciarComponent();
        painel.add(bt_consulta,gbc);

        //------------------------------------------------------------------------
        //SEGUNDO CAMPO

        gbc.gridx = 0; gbc.gridy = 1;
        painel.add(new JLabel("Pré-venda:"), gbc);

        gbc.gridx = 1;
        txtPrevenda = new JTextField(10);
        painel.add(txtPrevenda, gbc);

        gbc.gridx = 2;
        Botao_consultaItensPrevenda.iniciarComponent();
        painel.add(btnConsultarItens, gbc);

        //------------------------------------------------------------------------
        //TERCEIRO CAMPO

        gbc.gridx = 0; gbc.gridy = 2;
        painel.add(new JLabel("Valor Final (R$):"), gbc);

        gbc.gridx = 1; gbc.gridwidth = 2;
        txtValor = new JTextField(10);
        painel.add(txtValor, gbc);


        //------------------------------------------------------------------------
        //BOTOES CONFIRMAR E CANCELAR

        gbc.gridwidth = 1; gbc.gridx = 1; gbc.gridy = 3;
        Botao_ConfirmarAlteração.iniciarComponent();
        painel.add(btnConfirmar, gbc);

        gbc.gridx = 2;
        Botao_Cancelar.iniciarComponent();
        painel.add(btnCancelar, gbc);

        //------------------------------------------------------------------------

        Tabela_Prevendas.tabelaPrevendas.getSelectionModel().addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting() && Tabela_Prevendas.tabelaPrevendas.getSelectedRow() >= 0) {
                Object v = Tabela_Prevendas.tabelaPrevendas.getValueAt(Tabela_Prevendas.tabelaPrevendas.getSelectedRow(), 0);
                if (v != null) txtPrevenda.setText(String.valueOf(v));
            }
        });
    }

    public JPanel getPainel() {
        return painel;
    }

}
