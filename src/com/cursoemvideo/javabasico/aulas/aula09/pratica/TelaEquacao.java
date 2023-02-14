package com.cursoemvideo.javabasico.aulas.aula09.pratica;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;

public class TelaEquacao extends JFrame {
    private JSpinner txtB;
    private JSpinner txtC;
    private JSpinner txtA;
    private JLabel lblB;
    private JLabel lblA;
    private JLabel lblC;
    private JButton calcularΔButton;
    private JPanel pnlResultado;
    private JLabel lblTipoRaizes;
    private JLabel lblDelta;
    private JPanel pnlEquacao;
    private JPanel mainPanel;

    public TelaEquacao() {
        setContentPane(mainPanel);
        setSize(450, 225);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);

        pnlResultado.setVisible(false);

        calcularΔButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double a = Double.parseDouble(txtA.getValue().toString());
                double b = Double.parseDouble(txtB.getValue().toString());
                double c = Double.parseDouble(txtC.getValue().toString());

                double delta = Math.pow(b, 2) - (4 * a * c);
                lblDelta.setText(String.format("%.1f", delta));

                if (delta < 0) {
                    lblTipoRaizes.setText("Não existem raízes reais");
                } else {
                    lblTipoRaizes.setText("Existem raízes reais");
                }
                pnlResultado.setVisible(true);
            }
        });

        txtA.addComponentListener(new ComponentAdapter() {
        });
        txtA.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                lblA.setText(txtA.getValue().toString());
            }
        });
        txtB.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                lblB.setText(txtB.getValue().toString());
            }
        });
        txtC.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                lblC.setText(txtC.getValue().toString());
            }
        });
    }

    public static void main(String[] args) {
        var TelaEquacao = new TelaEquacao();
    }
}
