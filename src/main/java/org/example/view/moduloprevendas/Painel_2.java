package org.example.view.moduloprevendas;

import javax.swing.*;
import java.awt.*;

public class Painel_2 {
    protected static JTextField txtItem,txtPrecoBruto,txtDesconto,txtPrecoLiquido,txtTotalItem;
    protected static JButton btnAplicarEdicao = new JButton("Aplicar edição na linha");
    protected JPanel painel_2 = new JPanel(new GridBagLayout());

        public Painel_2() {
            GridBagConstraints gbcItens = new GridBagConstraints();
            gbcItens.insets = new Insets(5, 5, 5, 5);
            gbcItens.fill = GridBagConstraints.HORIZONTAL;

            // ------------------------------------------------------------

            gbcItens.gridx = 0; gbcItens.gridy = 0;
            painel_2.add(new JLabel("Item:"), gbcItens);
            gbcItens.gridx = 1;
            txtItem = new JTextField(8);
            txtItem.setEditable(false);
            painel_2.add(txtItem, gbcItens);

            // ------------------------------------------------------------

            gbcItens.gridx = 2;
            painel_2.add(new JLabel("Preço Bruto:"), gbcItens);
            gbcItens.gridx = 3;
            txtPrecoBruto = new JTextField(10);
            txtPrecoBruto.setEditable(false);
            painel_2.add(txtPrecoBruto, gbcItens);

            // ------------------------------------------------------------

            gbcItens.gridx = 4;
            painel_2.add(new JLabel("Desconto:"), gbcItens);
            gbcItens.gridx = 5;
            txtDesconto = new JTextField(10);
            txtDesconto.setEditable(false);
            painel_2.add(txtDesconto, gbcItens);

            // ------------------------------------------------------------

            gbcItens.gridx = 0; gbcItens.gridy = 1;
            painel_2.add(new JLabel("Preço Líquido:"), gbcItens);
            gbcItens.gridx = 1;
            txtPrecoLiquido = new JTextField(10);
            txtPrecoLiquido.setEditable(false);
            painel_2.add(txtPrecoLiquido, gbcItens);

            // ------------------------------------------------------------

            gbcItens.gridx = 2;
            painel_2.add(new JLabel("Total Item:"), gbcItens);
            gbcItens.gridx = 3;
            txtTotalItem = new JTextField(10);
            txtTotalItem.setEditable(false);
            painel_2.add(txtTotalItem, gbcItens);

            // ------------------------------------------------------------


            gbcItens.gridx = 0; gbcItens.gridy = 2; gbcItens.gridwidth = 6;
            //painel_2.add(btnAplicarEdicao, gbcItens);
            gbcItens.gridwidth = 1;

            // ------------------------------------------------------------

            Tabela_PrevendasItens.tabelaPrevendasItens.getSelectionModel().addListSelectionListener(e -> {
                if (!e.getValueIsAdjusting() && Tabela_PrevendasItens.tabelaPrevendasItens.getSelectedRow() >= 0) {
                    int row = Tabela_PrevendasItens.tabelaPrevendasItens.getSelectedRow();
                    txtItem.setText(String.valueOf(Tabela_PrevendasItens.tabelaPrevendasItens.getValueAt(row, 2)));
                    txtPrecoBruto.setText(String.valueOf(Tabela_PrevendasItens.tabelaPrevendasItens.getValueAt(row, 5)));
                    txtDesconto.setText(String.valueOf(Tabela_PrevendasItens.tabelaPrevendasItens.getValueAt(row, 6)));
                    txtPrecoLiquido.setText(String.valueOf(Tabela_PrevendasItens.tabelaPrevendasItens.getValueAt(row, 7)));
                    txtTotalItem.setText(String.valueOf(Tabela_PrevendasItens.tabelaPrevendasItens.getValueAt(row, 8)));
                }
            });


    }

    public JPanel getPainel_2() {
        return painel_2;
    }
}
