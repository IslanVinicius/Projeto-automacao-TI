package org.example;

import org.example.view.screenprincipal.ScreenPrincipal;

import javax.swing.*;
import java.security.Security;

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