package org.example.view.moduloprevendas;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Tabela_PrevendasItens {

    protected static JTable tabelaPrevendasItens;
    private DefaultTableModel modeloPrevendasItens;
    private JScrollPane scrollPrevendasItens;

    // ===== TABELA SUPERIOR (PRÉ-VENDAS) =====
    public Tabela_PrevendasItens() {
        String[] colunasPrevendas = {
                "PREVENDA", "PREVENDA_ITEM", "ITEM",
                "PRODUTO", "QUANTIDADE", "PRECO_BRUTO",
                "DESCONTO","PRECO_LIQUIDO","TOTAL_ITEM"
        };
        modeloPrevendasItens = new DefaultTableModel(colunasPrevendas, 0) {
            @Override public boolean isCellEditable(int r, int c) { return false; }
        };
        tabelaPrevendasItens = new JTable(modeloPrevendasItens);
        this.scrollPrevendasItens = new JScrollPane(tabelaPrevendasItens);
    }


    public DefaultTableModel getModeloPrevendasItens() {
        return modeloPrevendasItens;
    }

    public JScrollPane getScrollPrevendasItens() {
        return scrollPrevendasItens;
    }

    public void setModeloPrevendasItens(DefaultTableModel modeloPrevendasItens) {
        this.modeloPrevendasItens = modeloPrevendasItens;
    }
}
