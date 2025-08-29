package org.example.ui.moduloprevendas;

import org.example.data.Prevendas.Prevenda;
import org.example.data.Prevendas.PrevendasDAO;

import java.sql.SQLException;
import java.util.List;

public class Botao_consultaPrevendas {
    public static void iniciarComponent() {
        Painel_1.bt_consulta.addActionListener(e->{
            function();
        });
    }
    public static void function(){
        try {
            List<Prevenda> lista = PrevendasDAO.listar(Integer.parseInt(Painel_1.txtLoja.getText()));

            CarregarDadosTabelas.carregarDadosTabelaPrevendas(Div_Inferior.tabela_prevendas.getModeloPrevendas(),
                    lista,
                    prevenda -> new Object[]{
                            prevenda.getPrevenda(),
                            prevenda.getChave(),
                            prevenda.getTotal_bruto(),
                            prevenda.getTotal_desconto(),
                            prevenda.getTotal_liquido(),
                            prevenda.getData()
                    });

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
