package org.example.data;

import javax.swing.*;
import java.sql.SQLException;

public class Tratamentos extends Exception{

    public void sqlException (SQLException e){
        JOptionPane.showMessageDialog(
                null,
                "<html><div style='text-align: center; width: 300px;'>"
                        + e.getMessage()
                        + "</div></html>",
                "Erro de Conexão",
                JOptionPane.ERROR_MESSAGE);
    }

    public void numException (Exception e){
        JOptionPane.showMessageDialog(
                null,
                "<html><div style='text-align: center; width: 300px;'>"
                        + e.getMessage()
                        + "</div></html>",
                "Favor digitar um numero",
                JOptionPane.ERROR_MESSAGE);
    }
}
