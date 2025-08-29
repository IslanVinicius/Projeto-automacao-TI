package org.example.controller.Prevendas;

import org.example.model.ConexãoDB;
import org.example.model.Prevendas.Prevendas_Itens;
import org.example.model.SQLs.Select_Itens_PrevendaItens;
import org.example.Tratamentos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Prevendas_ItensDAO {
    private static Tratamentos tratamentos = new Tratamentos();
    public static List<Prevendas_Itens> pesquisar_itens_prevenda(int prevenda, int loja){
        List<Prevendas_Itens> lista = new ArrayList<Prevendas_Itens>();
        try (Connection con = ConexãoDB.conectar(loja)){
            PreparedStatement stmt =  con.prepareStatement(Select_Itens_PrevendaItens.querye);
            stmt.setInt(1,prevenda);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){lista.add(new Prevendas_Itens(
                    rs.getInt("PREVENDA"),
                    rs.getInt("PREVENDA_ITEM"),
                    rs.getInt("ITEM"),
                    rs.getInt("PRODUTO"),
                    rs.getFloat("QUANTIDADE"),
                    rs.getFloat("PRECO_BRUTO"),
                    rs.getFloat("DESCONTO"),
                    rs.getFloat("PRECO_LIQUIDO"),
                    rs.getFloat("TOTAL_ITEM")));
            }
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
            tratamentos.sqlException(e);
        }

        return lista;
    }
}
