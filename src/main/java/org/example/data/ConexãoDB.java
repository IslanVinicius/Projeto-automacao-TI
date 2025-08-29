package org.example.data;


import java.io.IOException;
import java.sql.DriverManager;
import java.sql.*;

public class ConexãoDB {

    public static Connection conectar(int loja) throws SQLException {
        String url = " ";
        String user = "SA";
        String pass = "ERPM";

        if(loja == 11){
             url = "jdbc:sqlserver://192.168.51.198\\SQLEXPRESS;"
                    + "databaseName=LOJA;"
                    + "encrypt=false;"
                    + "trustServerCertificate=true;"
                    + "sslProtocol=TLSv1.2;";
        }else{
             url = "jdbc:sqlserver://10.10." + loja + ".250\\SQLEXPRESS;"
                    + "databaseName=LOJA;"
                    + "encrypt=false;"
                    + "trustServerCertificate=true;"
                    + "sslProtocol=TLSv1.2;";
        }

        return DriverManager.getConnection(url, user, pass);
    }

    public static Connection conectar(int loja,int caixa) throws SQLException {
        String user = "SA";
        String pass = "ERPM";
        String url = "jdbc:sqlserver://10.10." + loja + "."+ caixa +"\\SQLEXPRESS;"
                + "databaseName=PDV;"
                + "encrypt=false;"
                + "trustServerCertificate=true;"
                + "sslProtocol=TLSv1.2;";
        return DriverManager.getConnection(url, user, pass);
    }

}
