package org.example.controller.Prevendas;

import org.example.model.ConexãoDB;
import org.example.model.Prevendas.Prevenda;
import org.example.model.SQLs.Select_Top15_PREVENDAS;
import org.example.model.SQLs.Update_ValorFinal_PREVENDA;
import org.example.Tratamentos;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PrevendasDAO {
    private static Tratamentos tratamentos = new Tratamentos();

    public static List<Prevenda> listar(int loja){
        List<Prevenda> prevendas = new ArrayList<Prevenda>();
        try (Connection con = ConexãoDB.conectar(loja)){
            PreparedStatement stmt = con.prepareStatement(Select_Top15_PREVENDAS.querye);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()){
                prevendas.add(new Prevenda(rs.getInt("PREVENDA"),
                        rs.getString("CHAVE"),
                        rs.getString("DATA"),
                        rs.getFloat("TOTAL_BRUTO"),
                        rs.getFloat("TOTAL_DESCONTO"),
                        rs.getFloat("TOTAL_LIQUIDO")));
            }

            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
            tratamentos.sqlException(e);
        }
        return prevendas;
    }

    public static int alterar_prevenda (int loja,int prevenda,float valorfinal){
        int linhasAfetadas = 0;
        try(Connection con = ConexãoDB.conectar(loja)){
            PreparedStatement stmt = con.prepareStatement(Update_ValorFinal_PREVENDA.querye);
            stmt.setInt(1,prevenda);
            stmt.setFloat(2,valorfinal);
            linhasAfetadas = stmt.executeUpdate();
            con.close();
        }catch (SQLException e){
            e.printStackTrace();
            tratamentos.sqlException(e);
        }
        return linhasAfetadas;
    }
}
