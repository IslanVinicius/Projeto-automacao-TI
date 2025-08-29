package org.example.data.Parametros;

import org.example.data.ConexãoDB;
import org.example.data.SQLs.Select_ParametrosCaixa;
import org.example.data.SQLs.Select_TravaControlado_Caixa;
import org.example.data.SQLs.Update_TravaControlado_Caixa;
import org.example.data.Tratamentos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ParametrosCaixaDAO {
    private static Tratamentos tratamentos = new Tratamentos();

    public static ParametrosCaixa listarParametros(int loja, int caixa){
        ParametrosCaixa p = new ParametrosCaixa();
        try(Connection con = ConexãoDB.conectar(loja,caixa)) {
            PreparedStatement stmt = con.prepareStatement(Select_ParametrosCaixa.querye);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                p.setPERMITIR_CONTROLADO_VENDA_DIRETA(rs.getString("PERMITIR_CONTROLADO_VENDA_DIRETA"));
                p.setFCARD_AUTORIZADOR_WEB(rs.getString("FCARD_AUTORIZADOR_WEB"));
                p.setFCARD_AUTORIZADOR_WEB_LOGIN(rs.getString("FCARD_AUTORIZADOR_WEB_LOGIN"));
                p.setFCARD_AUTORIZADOR_WEB_SENHA(rs.getString("FCARD_AUTORIZADOR_WEB_SENHA"));
                p.setFCARD_AUTORIZADOR_WEB_URL(rs.getString("FCARD_AUTORIZADOR_WEB_URL"));
                p.setFCARD_ENVIO(rs.getString("FCARD_ENVIO"));
                p.setFCARD_RESPOSTA(rs.getString("FCARD_RESPOSTA"));
                p.setVIDALINK_ENVIO(rs.getString("VIDALINK_ENVIO"));
                p.setVIDALINK_RESPOSTA(rs.getString("VIDALINK_RESPOSTA"));
            }
            con.close();
        }catch (SQLException e){
            tratamentos.sqlException(e);
        }
        return p;
    }

    public static void updateControladoCaixa(int loja,int caixa,ParametrosCaixa p){
        try(Connection con = ConexãoDB.conectar(loja,caixa)){
            PreparedStatement stmt = con.prepareStatement(Update_TravaControlado_Caixa.querye);
            stmt.setString(1, p.getPERMITIR_CONTROLADO_VENDA_DIRETA());
            stmt.setString(2, p.getFCARD_AUTORIZADOR_WEB());
            stmt.setString(3, p.getFCARD_AUTORIZADOR_WEB_LOGIN());
            stmt.setString(4, p.getFCARD_AUTORIZADOR_WEB_SENHA());
            stmt.setString(5, p.getFCARD_AUTORIZADOR_WEB_URL());
            stmt.setString(6, p.getFCARD_ENVIO());
            stmt.setString(7, p.getFCARD_RESPOSTA());
            stmt.setString(8, p.getVIDALINK_ENVIO());
            stmt.setString(9, p.getVIDALINK_RESPOSTA());

            stmt.executeUpdate();
            con.close();

        }catch (SQLException e){
            tratamentos.sqlException(e);
        }
    }
}
