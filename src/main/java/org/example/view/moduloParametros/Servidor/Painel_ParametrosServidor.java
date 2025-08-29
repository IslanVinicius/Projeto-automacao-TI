package org.example.view.moduloParametros.Servidor;

import javax.swing.*;
import java.awt.*;

public class Painel_ParametrosServidor {

    public JPanel painel;
    protected static JButton btnConsultar = new JButton("Consultar");
    protected static JButton btnEditar = new JButton("Editar");
    protected static JButton btnConfirmar = new JButton("Confirmar");
    protected static JButton btnCancelar = new JButton("Cancelar");
    protected static JTextField txtLoja;
    protected static JTextField txtEPHARMA_API_CODIGO;
    protected static JTextField txtEPHARMA_API_LOGIN;
    protected static JTextField txtEPHARMA_API_SENHA;
    protected static JTextField txtFCARD_AUTORIZADOR_WEB;
    protected static JTextField txtFCARD_AUTORIZADOR_WEB_LOGIN;
    protected static JTextField txtFCARD_AUTORIZADOR_WEB_SENHA;
    protected static JTextField txtFCARD_AUTORIZADOR_WEB_URL;
    protected static JTextField txtFCARD_ENV;
    protected static JTextField txtFCARD_REC;
    protected static JTextField txtFCARD_LOG;
    protected static JTextField txtINTERPLAYERS_VAREJO_COMPANY_CODE;
    protected static JTextField txtVIDALINK_ENVIO;
    protected static JTextField txtVIDALINK_RESPOSTA;
    protected static JComboBox<String> cmbObrigarLoteValidade;

    public Painel_ParametrosServidor() {
        painel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5); // margem entre componentes
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;


        int row = 0;

        // Linha Loja + Consultar + Editar
        txtLoja = new JTextField(25);

        // Label Loja
        gbc.gridx = 0;
        gbc.gridy = row;
        gbc.weightx = 0;
        painel.add(new JLabel("LOJA:"), gbc);

        // Campo Loja (ocupa 1 coluna, sobra espaço para os botões)
        gbc.gridx = 1;
        gbc.weightx = 1.0;
        painel.add(txtLoja, gbc);

        // Botão Consultar
        gbc.gridx = 2;
        gbc.weightx = 0;
        Botao_Consultar.iniciarComponent();
        painel.add(btnConsultar, gbc);

        // Botão Editar
        gbc.gridx = 3;
        BotãoEditar.iniciarComponent();
        painel.add(btnEditar, gbc);

        BotãoCancelar.iniciarComponent();
        BotaoConfirmar.iniciarComponent();

        row++;

        // Criar os outros campos (agora sempre gridwidth = 3)
        txtEPHARMA_API_CODIGO = new JTextField(20);
        addField(painel, gbc, row++, "EPHARMA_API_CODIGO:", txtEPHARMA_API_CODIGO);

        txtEPHARMA_API_LOGIN = new JTextField(20);
        addField(painel, gbc, row++, "EPHARMA_API_LOGIN:", txtEPHARMA_API_LOGIN);

        txtEPHARMA_API_SENHA = new JTextField(20);
        addField(painel, gbc, row++, "EPHARMA_API_SENHA:", txtEPHARMA_API_SENHA);

        txtFCARD_AUTORIZADOR_WEB = new JTextField(20);
        addField(painel, gbc, row++, "FCARD_AUTORIZADOR_WEB:", txtFCARD_AUTORIZADOR_WEB);

        txtFCARD_AUTORIZADOR_WEB_LOGIN = new JTextField(20);
        addField(painel, gbc, row++, "FCARD_AUTORIZADOR_WEB_LOGIN:", txtFCARD_AUTORIZADOR_WEB_LOGIN);

        txtFCARD_AUTORIZADOR_WEB_SENHA = new JTextField(20);
        addField(painel, gbc, row++, "FCARD_AUTORIZADOR_WEB_SENHA:", txtFCARD_AUTORIZADOR_WEB_SENHA);

        txtFCARD_AUTORIZADOR_WEB_URL = new JTextField(20);
        addField(painel, gbc, row++, "FCARD_AUTORIZADOR_WEB_URL:", txtFCARD_AUTORIZADOR_WEB_URL);

        txtFCARD_ENV = new JTextField(20);
        addField(painel, gbc, row++, "FCARD_ENV:", txtFCARD_ENV);

        txtFCARD_REC = new JTextField(20);
        addField(painel, gbc, row++, "FCARD_REC:", txtFCARD_REC);

        txtFCARD_LOG = new JTextField(20);
        addField(painel, gbc, row++, "FCARD_LOG:", txtFCARD_LOG);

        txtINTERPLAYERS_VAREJO_COMPANY_CODE = new JTextField(20);
        addField(painel, gbc, row++, "INTERPLAYERS_VAREJO_COMPANY_CODE:", txtINTERPLAYERS_VAREJO_COMPANY_CODE);

        txtVIDALINK_ENVIO = new JTextField(20);
        addField(painel, gbc, row++, "VIDALINK_ENVIO:", txtVIDALINK_ENVIO);

        txtVIDALINK_RESPOSTA = new JTextField(20);
        addField(painel, gbc, row++, "VIDALINK_RESPOSTA:", txtVIDALINK_RESPOSTA);

        cmbObrigarLoteValidade = new JComboBox<>(new String[]{"Liberado", "Bloqueado"});
        cmbObrigarLoteValidade.setSelectedIndex(-1);
        addField(painel, gbc, row++, "OBRIGAR_LOTE_VALIDADE:", cmbObrigarLoteValidade);

        // Depois do OBRIGAR_LOTE_VALIDADE
        row++;

        // Painel de botões centralizados
        JPanel painelBotoes = new JPanel(new FlowLayout(FlowLayout.CENTER, 15, 0));

        painelBotoes.add(btnConfirmar);
        painelBotoes.add(btnCancelar);

        // Adiciona ocupando todas as colunas
        gbc.gridx = 0;
        gbc.gridy = row;
        gbc.gridwidth = 4; // ocupa as 4 colunas do layout
        gbc.anchor = GridBagConstraints.CENTER;
        painel.add(painelBotoes, gbc);

        // volta ao normal
        gbc.gridwidth = 1;



        BotãoEditar.travar();
    }

    public void iniciarComponent() {
    }

    // Método auxiliar adaptado (gridwidth fixo = 3)
    private static void addField(JPanel panel, GridBagConstraints gbc, int row, String label, JComponent field) {
        gbc.gridx = 0;
        gbc.gridy = row;
        gbc.weightx = 0;
        gbc.anchor = GridBagConstraints.EAST;
        panel.add(new JLabel(label), gbc);

        gbc.gridx = 1;
        gbc.gridwidth = 3; // agora sempre 3 colunas
        gbc.weightx = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        panel.add(field, gbc);
        gbc.gridwidth = 1;
    }

    public JPanel getPainel() {
        return painel;
    }
}