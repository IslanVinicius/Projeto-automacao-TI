package org.example.view.moduloParametros;

import org.example.view.moduloParametros.Caixa.Painel_ParametrosCaixa;
import org.example.view.moduloParametros.Servidor.Painel_ParametrosServidor;

import javax.swing.*;
import java.awt.*;

public class Screen_ModuloParametros {

    public static void iniciarComponent() {
        JFrame screen_controlados = new JFrame();
        screen_controlados.setTitle("Módulo de parametros");
        screen_controlados.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        screen_controlados.setSize(500, 560);
        screen_controlados.setLocationRelativeTo(null);
        screen_controlados.setLayout(new BorderLayout());


        Painel_ParametrosServidor painelServidor = new Painel_ParametrosServidor();
        Painel_ParametrosCaixa painelCaixa = new Painel_ParametrosCaixa();

        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.setFont(new Font("Segoe UI", Font.BOLD, 14));

        tabbedPane.setBackground(new Color(230, 230, 250));
        tabbedPane.setForeground(new Color(60, 60, 60));
        UIManager.put("TabbedPane.selected", new Color(100, 149, 237));
        UIManager.put("TabbedPane.contentAreaColor", Color.WHITE);

        tabbedPane.addTab("Parametros Servidor", painelServidor.getPainel());
        tabbedPane.addTab("Parametros caixa", painelCaixa.getPainel());
        screen_controlados.add(tabbedPane,BorderLayout.CENTER);
        screen_controlados.setVisible(true);
    }
}
