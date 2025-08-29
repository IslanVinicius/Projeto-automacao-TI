package org.example.ui.screenprincipal;

import org.example.ui.UIComponent;

import javax.swing.*;
import java.awt.*;

public class Botao_Sair implements UIComponent {
    private JButton botao_sair = new JButton();

    @Override
    public JButton criar(){
        botao_sair.setText("Sair");
        botao_sair.setFont(new Font("Segoe UI", Font.BOLD, 14));
        botao_sair.setFocusPainted(false);
        botao_sair.setBackground(new Color(220, 220, 255));
        botao_sair.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        botao_sair.setHorizontalTextPosition(SwingConstants.CENTER);
        botao_sair.setVerticalTextPosition(SwingConstants.BOTTOM);

        try {
            ImageIcon icone = new ImageIcon("\\\\192.168.51.178\\icons\\sair.png");
            Image img = icone.getImage().getScaledInstance(60, 60, Image.SCALE_SMOOTH);
            botao_sair.setIcon(new ImageIcon(img));
        } catch (Exception e) {
            // Ignora se o ícone não for encontrado
        }

        botao_sair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botao_sair.setBackground(new Color(200, 240, 255));
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botao_sair.setBackground(new Color(220, 220, 255));
            }
        });
        botao_sair.addActionListener(e -> System.exit(0));

        return botao_sair;
    }
}
