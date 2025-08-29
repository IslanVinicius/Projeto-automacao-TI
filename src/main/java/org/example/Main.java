package org.example;

import org.example.data.ConexãoDB;
import org.example.data.SQLs.Select_TravaControlado_Balcao;
import org.example.data.SQLs.Select_TravaControlado_Caixa;
import org.example.ui.screenprincipal.ScreenPrincipal;

import javax.swing.*;
import java.security.Security;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.setProperty("jdk.tls.client.protocols", "TLSv1.2");
        System.setProperty("https.protocols", "TLSv1.2");
        Security.setProperty("jdk.tls.disabledAlgorithms", "");
        SwingUtilities.invokeLater(() -> {
            new ScreenPrincipal().setVisible(true);
        });
    }
}