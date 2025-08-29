package org.example.view.screenprincipal;

import org.example.view.UIComponent;
import org.example.view.moduloprevendas.Screen_ModuloPrevendas;

import javax.swing.*;
import java.awt.*;

public class Botao_Prevendas implements UIComponent {
    private JButton botao_prevendas = new JButton();

    @Override
    public JButton criar() {
        botao_prevendas.setText("Alterar Prevendas");
        botao_prevendas.setFont(new Font("Segoe UI", Font.BOLD, 14));
        botao_prevendas.setFocusPainted(false);
        botao_prevendas.setBackground(new Color(220, 220, 255));
        botao_prevendas.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        botao_prevendas.setHorizontalTextPosition(SwingConstants.CENTER);
        botao_prevendas.setVerticalTextPosition(SwingConstants.BOTTOM);

        try {
            ImageIcon icone = new ImageIcon("\\\\192.168.51.178\\icons\\pre-venda.png");
            Image img = icone.getImage().getScaledInstance(60, 60, Image.SCALE_SMOOTH);
            botao_prevendas.setIcon(new ImageIcon(img));
        } catch (Exception e) {
            // Ignora se o ícone não for encontrado
        }

        botao_prevendas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botao_prevendas.setBackground(new Color(200, 240, 255));
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botao_prevendas.setBackground(new Color(220, 220, 255));
            }
        });

        botao_prevendas.addActionListener(e -> {
            Screen_ModuloPrevendas.iniciarComponent();
        } );

        return botao_prevendas;
    }
}
