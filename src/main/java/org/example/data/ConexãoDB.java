package org.example.data;


import java.io.IOException;
import java.sql.DriverManager;
import java.sql.*;

public class ConexãoDB {

    public static Connection conectar(int loja) throws SQLException {
        String url = " ";
        String user = "";
        String pass = "";

        if(loja == 11){
             url = "jdbc:sqlserver://;"
                    + "databaseName=;"
                    + "encrypt=false;"
                    + "trustServerCertificate=true;"
                    + "sslProtocol=TLSv1.2;";
        }else{
             url = "jdbc:sqlserver://10.10." + loja + ".250\\;"
                    + "databaseName=;"
                    + "encrypt=false;"
                    + "trustServerCertificate=true;"
                    + "sslProtocol=TLSv1.2;";
        }

        return DriverManager.getConnection(url, user, pass);
    }

    public static Connection conectar(int loja,int caixa) throws SQLException {
        String user = "SA";
        String pass = "ERPM";
        String url = "jdbc:sqlserver://10.10." + loja + "."+ caixa +"\\;"
                + "databaseName=;"
                + "encrypt=false;"
                + "trustServerCertificate=true;"
                + "sslProtocol=TLSv1.2;";
        return DriverManager.getConnection(url, user, pass);
    }

}
