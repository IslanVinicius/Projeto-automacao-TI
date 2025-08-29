package org.example.view.moduloprevendas;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Tabela_Prevendas {

    protected static JTable tabelaPrevendas;
    private DefaultTableModel modeloPrevendas;
    private JScrollPane scrollPrevendas;

    // ===== TABELA SUPERIOR (PRÉ-VENDAS) =====
    public Tabela_Prevendas() {
        String[] colunasPrevendas = {
                "PREVENDA", "CHAVE",
                "TOTAL BRUTO", "TOTAL DESCONTO",
                "TOTAL LIQUIDO", "DATA"
        };
        modeloPrevendas = new DefaultTableModel(colunasPrevendas, 0) {
            @Override public boolean isCellEditable(int r, int c) { return false; }
        };
        tabelaPrevendas = new JTable(modeloPrevendas);
        this.scrollPrevendas = new JScrollPane(tabelaPrevendas);
    }


    public JScrollPane getScrollPrevendas() {
        return this.scrollPrevendas;
    }

    public DefaultTableModel getModeloPrevendas() {
        return modeloPrevendas;
    }

    public void setModeloPrevendas(DefaultTableModel modeloPrevendas) {
        this.modeloPrevendas = modeloPrevendas;
    }
}
