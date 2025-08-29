package org.example.view.screenprincipal;

import org.example.view.UIComponent;

import javax.swing.*;
import java.awt.*;

public class TituloComponent implements UIComponent {
    protected JLabel titulo = new JLabel("MODULOS", SwingConstants.CENTER);

    @Override
    public JComponent criar() {
        titulo.setFont(new Font("Segoe UI", Font.BOLD, 28));
        titulo.setBorder(BorderFactory.createEmptyBorder(20, 0, 20, 0)); // Aumenta o espaçamento superior e inferior
        titulo.setBackground(new Color(230, 230, 240)); // Exemplo de cor de fundo
        titulo.setForeground(new Color(50, 50, 50)); // Cor do texto
        titulo.setOpaque(true); // Permite que a cor de fundo seja visível
        return titulo;
    }
}
