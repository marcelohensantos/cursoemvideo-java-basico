package com.cursoemvideo.javabasico.aulas.aula15.pratica;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaFatorial extends JFrame {
    private JPanel mainPanel;
    private JSpinner txtNum;
    private JButton btnFatorial;
    private JLabel lblFormula;
    private JLabel lblResultado;

    public TelaFatorial() {
        setContentPane(mainPanel);
        setSize(400, 100);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);

        txtNum.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));

        btnFatorial.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Fatorial fatorial = new Fatorial();
                int num = (int) txtNum.getValue();

                fatorial.setValor(num);
                lblFormula.setText(fatorial.getFormula());
                lblResultado.setText(String.valueOf(fatorial.getFatorial()));
            }
        });
    }

    public static void main(String[] args) {
        var telaFatorial = new TelaFatorial();
    }
}
