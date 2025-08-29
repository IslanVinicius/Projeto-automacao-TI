package org.example.ui.moduloprevendas;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import java.util.List;
import java.util.function.Function;

public class CarregarDadosTabelas {

    static DefaultTableModel model = new DefaultTableModel();
    public static <T> void carregarDadosTabelaPrevendas(
            DefaultTableModel model,
            List<T> lista,
            Function<T, Object[]> mapper) throws SQLException
    {
        model.setRowCount(0);
        for (T item : lista) {
            model.addRow(mapper.apply(item));
        }
    }

    public static void limparTabela(DefaultTableModel model){
        model.setRowCount(0);
    }
}
