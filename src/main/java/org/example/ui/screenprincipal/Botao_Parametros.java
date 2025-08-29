package org.example.ui.screenprincipal;

import org.example.ui.UIComponent;
import org.example.ui.moduloParametros.Screen_ModuloParametros;
import org.example.ui.moduloprevendas.Screen_ModuloPrevendas;

import javax.swing.*;
import java.awt.*;

public class Botao_Parametros implements UIComponent {
    private JButton botao_parametros = new JButton();

    @Override
    public JButton criar() {
        botao_parametros.setText("Parametros");
        botao_parametros.setFont(new Font("Segoe UI", Font.BOLD, 14));
        botao_parametros.setFocusPainted(false);
        botao_parametros.setBackground(new Color(220, 220, 255));
        botao_parametros.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        botao_parametros.setHorizontalTextPosition(SwingConstants.CENTER);
        botao_parametros.setVerticalTextPosition(SwingConstants.BOTTOM);

        try {
            ImageIcon icone = new ImageIcon("\\\\192.168.51.178\\icons\\parametros.png");
            Image img = icone.getImage().getScaledInstance(60, 60, Image.SCALE_SMOOTH);
            botao_parametros.setIcon(new ImageIcon(img));
        } catch (Exception e) {
            // Ignora se o ícone não for encontrado
        }

        botao_parametros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botao_parametros.setBackground(new Color(200, 240, 255));
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botao_parametros.setBackground(new Color(220, 220, 255));
            }
        });

        botao_parametros.addActionListener(e-> Screen_ModuloParametros.iniciarComponent());//

        return botao_parametros;
    }
}
