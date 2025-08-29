package org.example.ui.moduloprevendas;

import javax.swing.*;
import java.awt.*;

public class Screen_ModuloPrevendas {

    protected static JFrame screen_prevendas;
    protected static Div_Inferior div_inferior = new Div_Inferior();

    public static void iniciarComponent() {
        screen_prevendas = new JFrame();
        screen_prevendas.setTitle("Módulo de Pré-vendas");
        screen_prevendas.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        screen_prevendas.setSize(1100, 600);
        screen_prevendas.setLocationRelativeTo(null);
        screen_prevendas.setLayout(new BorderLayout(10, 10));


        div_inferior.iniciar_Div_Inferior();
        screen_prevendas.add(div_inferior.mainSplit);

        screen_prevendas.setVisible(true);
    }



}
