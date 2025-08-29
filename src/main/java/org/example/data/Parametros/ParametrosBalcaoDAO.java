package org.example.data.Parametros;

import org.example.data.ConexãoDB;
import org.example.data.SQLs.Select_ParametrosLoja;
import org.example.data.SQLs.Select_TravaControlado_Balcao;
import org.example.data.SQLs.Update_ParametrosLoja;
import org.example.data.Tratamentos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ParametrosBalcaoDAO {
    private static Tratamentos tratamentos = new Tratamentos();

    public static ParametrosBalcao listarParametros(int loja){
        ParametrosBalcao p = new ParametrosBalcao();
        try(Connection con = ConexãoDB.conectar(loja)){
            PreparedStatement stmt = con.prepareStatement(Select_ParametrosLoja.querye);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()){
                p.setOBRIGAR_LOTE_VALIDADE (rs.getString("OBRIGAR_LOTE_VALIDADE"));
                p.setEPHARMA_API_CODIGO(rs.getString("EPHARMA_API_CODIGO"));
                p.setEPHARMA_API_LOGIN (rs.getString("EPHARMA_API_LOGIN"));
                p.setEPHARMA_API_SENHA (rs.getString("EPHARMA_API_SENHA"));
                p.setFCARD_AUTORIZADOR_WEB (rs.getString("FCARD_AUTORIZADOR_WEB"));
                p.setFCARD_AUTORIZADOR_WEB_LOGIN(rs.getString("FCARD_AUTORIZADOR_WEB_LOGIN"));
                p.setFCARD_AUTORIZADOR_WEB_SENHA(rs.getString("FCARD_AUTORIZADOR_WEB_SENHA"));
                p.setFCARD_AUTORIZADOR_WEB_URL  (rs.getString("FCARD_AUTORIZADOR_WEB_URL"));
                p.setFCARD_ENV(rs.getString("FCARD_ENV"));
                p.setFCARD_REC(rs.getString("FCARD_REC"));
                p.setFCARD_LOG(rs.getString("FCARD_LOG"));
                p.setINTERPLAYERS_VAREJO_COMPANY_CODE(rs.getString("INTERPLAYERS_VAREJO_COMPANY_CODE"));
                p.setVIDALINK_ENVIO (rs.getString("VIDALINK_ENVIO"));
                p.setVIDALINK_RESPOSTA (rs.getString("VIDALINK_RESPOSTA"));
            }
        con.close();
        }catch(SQLException e){
            tratamentos.sqlException(e);
        }
        return p;
    }

    public static void updateParametros (int loja, ParametrosBalcao parametros){
        try(Connection con = ConexãoDB.conectar(loja)){
            PreparedStatement stmt = con.prepareStatement(Update_ParametrosLoja.querye);
            stmt.setString(1,parametros.getEPHARMA_API_CODIGO());
            stmt.setString(2,parametros.getEPHARMA_API_LOGIN());
            stmt.setString(3,parametros.getEPHARMA_API_SENHA());
            stmt.setString(4,parametros.getFCARD_AUTORIZADOR_WEB());
            stmt.setString(5,parametros.getFCARD_AUTORIZADOR_WEB_LOGIN());
            stmt.setString(6,parametros.getFCARD_AUTORIZADOR_WEB_SENHA());
            stmt.setString(7,parametros.getFCARD_AUTORIZADOR_WEB_URL());
            stmt.setString(8,parametros.getFCARD_ENV());
            stmt.setString(9,parametros.getFCARD_REC());
            stmt.setString(10,parametros.getFCARD_LOG());
            stmt.setString(11,parametros.getINTERPLAYERS_VAREJO_COMPANY_CODE());
            stmt.setString(12,parametros.getVIDALINK_ENVIO());
            stmt.setString(13,parametros.getVIDALINK_RESPOSTA());
            stmt.setString(14,parametros.getOBRIGAR_LOTE_VALIDADE());

            stmt.executeUpdate();
            con.close();
        }catch (SQLException e){
            tratamentos.sqlException(e);
        }
    }
}
