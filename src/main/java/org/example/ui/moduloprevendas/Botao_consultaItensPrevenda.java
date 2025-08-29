package org.example.ui.moduloprevendas;

import org.example.data.Prevendas.Prevendas_Itens;
import org.example.data.Prevendas.Prevendas_ItensDAO;

import java.sql.SQLException;
import java.util.List;

public class Botao_consultaItensPrevenda {
    public static void iniciarComponent() {
        Painel_1.btnConsultarItens.addActionListener(e->{
            function();
        });
    }

    public static void function(){
        try {
            List<Prevendas_Itens> lista = Prevendas_ItensDAO.pesquisar_itens_prevenda(
                    Integer.parseInt(Painel_1.txtPrevenda.getText()),
                    Integer.parseInt(Painel_1.txtLoja.getText()));

            CarregarDadosTabelas.carregarDadosTabelaPrevendas(Div_Inferior.tabela_prevendasItens.getModeloPrevendasItens(),
                    lista,
                    prevenda_item -> new Object[]{
                            prevenda_item.getPrevenda(),
                            prevenda_item.getPrevenda_item(),
                            prevenda_item.getItem(),
                            prevenda_item.getProduto(),
                            prevenda_item.getQuantidade(),
                            prevenda_item.getPreco_bruto(),
                            prevenda_item.getDesconto(),
                            prevenda_item.getPreco_liquido(),
                            prevenda_item.getTotal_item()
                    });

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
