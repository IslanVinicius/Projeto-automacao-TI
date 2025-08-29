package org.example.ui.moduloParametros.Caixa;

import javax.swing.*;
import java.awt.*;

public class Painel_ParametrosCaixa {
    public JPanel painel;
    protected static JButton            btnConsultar = new JButton("Consultar");
    protected static JButton            btnEditar = new JButton("Editar");
    protected static JButton            btnConfirmar = new JButton("Confirmar");
    protected static JButton            btnCancelar = new JButton("Cancelar");
    protected static JTextField         txtLoja;
    protected static JTextField         txtCaixa;
    protected static JTextField         txtFCARD_AUTORIZADOR_WEB;
    protected static JTextField         txtFCARD_AUTORIZADOR_WEB_LOGIN;
    protected static JTextField         txtFCARD_AUTORIZADOR_WEB_SENHA;
    protected static JTextField         txtFCARD_AUTORIZADOR_WEB_URL;
    protected static JTextField         txtFCARD_ENVIO;
    protected static JTextField         txtFCARD_RESPOSTA;
    protected static JTextField         txtVIDALINK_ENVIO;
    protected static JTextField         txtVIDALINK_RESPOSTA;
    protected static JComboBox<String> cmbPermitir_VendaDireta_Controlado;

    public Painel_ParametrosCaixa() {
        painel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5); // margem entre componentes
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;


        int row = 0;

        JPanel painelSuperior = new JPanel(new GridBagLayout());
        GridBagConstraints gbc1 = new GridBagConstraints();
        gbc1.insets = new Insets(5, 5, 5, 5);
        gbc1.gridy = 0; // todos os componentes na mesma linha
        gbc1.anchor = GridBagConstraints.CENTER;


        gbc1.gridx = 0;
        painelSuperior.add(new JLabel("LOJA:"), gbc1);


        gbc1.gridx = 1;
        txtLoja = new JTextField(5);
        painelSuperior.add(txtLoja, gbc1);


        gbc1.gridx = 2;
        painelSuperior.add(new JLabel("CAIXA:"), gbc1);


        gbc1.gridx = 3;
        txtCaixa = new JTextField(5);
        painelSuperior.add(txtCaixa, gbc1);


        gbc1.gridx = 4;
        painelSuperior.add(btnConsultar, gbc1);


        gbc1.gridx = 5;
        painelSuperior.add(btnEditar, gbc1);


        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 4;
        gbc.anchor = GridBagConstraints.CENTER;
        painel.add(painelSuperior, gbc);
        gbc.gridwidth = 1;
        row++;

        txtFCARD_ENVIO = new JTextField(20);
        addField(painel, gbc, row++, "FCARD_ENVIO:", txtFCARD_ENVIO);

        txtFCARD_RESPOSTA = new JTextField(20);
        addField(painel, gbc, row++, "FCARD_RESPOSTA:", txtFCARD_RESPOSTA);

        txtFCARD_AUTORIZADOR_WEB = new JTextField(20);
        addField(painel, gbc, row++, "FCARD_AUTORIZADOR_WEB:", txtFCARD_AUTORIZADOR_WEB);

        txtFCARD_AUTORIZADOR_WEB_LOGIN = new JTextField(20);
        addField(painel, gbc, row++, "FCARD_AUTORIZADOR_WEB_LOGIN:", txtFCARD_AUTORIZADOR_WEB_LOGIN);

        txtFCARD_AUTORIZADOR_WEB_SENHA = new JTextField(20);
        addField(painel, gbc, row++, "FCARD_AUTORIZADOR_WEB_SENHA:", txtFCARD_AUTORIZADOR_WEB_SENHA);

        txtFCARD_AUTORIZADOR_WEB_URL = new JTextField(20);
        addField(painel, gbc, row++, "FCARD_AUTORIZADOR_WEB_URL:", txtFCARD_AUTORIZADOR_WEB_URL);

        txtVIDALINK_ENVIO = new JTextField(20);
        addField(painel, gbc, row++, "VIDALINK_ENVIO:", txtVIDALINK_ENVIO);

        txtVIDALINK_RESPOSTA = new JTextField(20);
        addField(painel, gbc, row++, "VIDALINK_RESPOSTA:", txtVIDALINK_RESPOSTA);

        cmbPermitir_VendaDireta_Controlado = new JComboBox<>(new String[]{"Liberado", "Bloqueado"});
        cmbPermitir_VendaDireta_Controlado.setSelectedIndex(-1);
        addField(painel, gbc, row++, "OBRIGAR_LOTE_VALIDADE:", cmbPermitir_VendaDireta_Controlado);

        row++;

        JPanel painelBotoes = new JPanel(new FlowLayout(FlowLayout.CENTER, 15, 0));

        painelBotoes.add(btnConfirmar);
        painelBotoes.add(btnCancelar);


        gbc.gridx = 0;
        gbc.gridy = row;
        gbc.gridwidth = 4;
        gbc.anchor = GridBagConstraints.CENTER;
        painel.add(painelBotoes, gbc);


        gbc.gridwidth = 1;

        Botao_Confirmar.iniciarComponent();
        Botao_Consultar.iniciarComponent();
        Botao_Cancelar.iniciarComponent();
        Botao_Editar.iniciarComponent();
        Botao_Editar.travar();
    }


    private static void addField(JPanel panel, GridBagConstraints gbc, int row, String label, JComponent field) {
        gbc.gridx = 0;
        gbc.gridy = row;
        gbc.weightx = 0;
        gbc.anchor = GridBagConstraints.EAST;
        panel.add(new JLabel(label), gbc);

        gbc.gridx = 1;
        gbc.gridwidth = 3;
        gbc.weightx = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        panel.add(field, gbc);
        gbc.gridwidth = 1;
    }

    public JPanel getPainel() {
        return painel;
    }
}
