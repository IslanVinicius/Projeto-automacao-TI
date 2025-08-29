package org.example.view.screenprincipal;

import org.example.view.UIComponent;

import javax.swing.*;
import java.awt.*;

public class PainelBotões implements UIComponent {
    protected JPanel painelBotoes = new JPanel(new GridLayout(1, 3, 15, 15));

    @Override
    public JComponent criar() {
        painelBotoes.setBorder(BorderFactory.createEmptyBorder(10, 10, 20, 20));
        painelBotoes.setBackground(new Color(240, 240, 240));
        painelBotoes.add(new Botao_Prevendas().criar());
        painelBotoes.add(new Botao_Parametros().criar());
        painelBotoes.add(new Botao_Sair().criar());
        return painelBotoes;
    }
}
