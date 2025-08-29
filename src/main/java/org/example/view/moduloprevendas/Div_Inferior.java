package org.example.view.moduloprevendas;

import javax.swing.*;
import java.awt.*;

public class Div_Inferior {

    protected Painel_2 painel_2 = new Painel_2();
    protected Painel_1 painel_1 = new Painel_1();
    protected static Tabela_PrevendasItens tabela_prevendasItens = new Tabela_PrevendasItens();
    protected JPanel painelItensCompleto = new JPanel(new BorderLayout());
    protected static Tabela_Prevendas tabela_prevendas = new Tabela_Prevendas();
    protected JSplitPane mainSplit;

    public void iniciar_Div_Inferior() {

        painelItensCompleto.add(tabela_prevendasItens.getScrollPrevendasItens(), BorderLayout.CENTER);
        painelItensCompleto.add(painel_2.getPainel_2(), BorderLayout.SOUTH);

        JSplitPane bottomSplit = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, painel_1.getPainel(), painelItensCompleto);
        bottomSplit.setDividerSize(6);
        bottomSplit.setResizeWeight(0);
        bottomSplit.setDividerLocation(440);

        mainSplit = new JSplitPane(JSplitPane.VERTICAL_SPLIT, tabela_prevendas.getScrollPrevendas(), bottomSplit);
        mainSplit.setDividerSize(6);
        mainSplit.setResizeWeight(0.62);
        mainSplit.setDividerLocation(320);

    }

    public JSplitPane getMainSplit() {
        return mainSplit;
    }
}
