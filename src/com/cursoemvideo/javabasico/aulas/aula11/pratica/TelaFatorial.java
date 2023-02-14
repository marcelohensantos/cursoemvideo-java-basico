package com.cursoemvideo.javabasico.aulas.aula11.pratica;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class TelaFatorial extends JFrame {
    private JPanel mainPanel;
    private JSpinner txtNumero;
    private JLabel lblResultado;

    public TelaFatorial() {
        setContentPane(mainPanel);
        setSize(300, 150);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);

        lblResultado.setVisible(false);
        txtNumero.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));

        txtNumero.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int numero = Integer.parseInt(txtNumero.getValue().toString());

                long fatorial = 1;

                while (numero > 1) {
                    fatorial *= numero;
                    numero -= 1;
                }

                lblResultado.setText(Long.toString(fatorial));
                lblResultado.setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        TelaFatorial telaFatorial = new TelaFatorial();
    }
}
