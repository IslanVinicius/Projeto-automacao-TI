package org.example.view.screenprincipal;

import javax.swing.*;
import java.awt.*;

public class ScreenPrincipal extends JFrame {
    public ScreenPrincipal() {
        setTitle("APP_TI");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 260);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        add(new TituloComponent().criar(), BorderLayout.NORTH);
        add(new PainelBotões().criar());
    }


}
