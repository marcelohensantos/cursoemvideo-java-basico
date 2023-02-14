package com.cursoemvideo.javabasico.aulas.aula09.teorica;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaParImpar extends JFrame {
    private JPanel mainPanel;
    private JTextField txtValor;
    private JButton btnVerificar;
    private JLabel lblResultado;

    public TelaParImpar() {
        setContentPane(mainPanel);
        setSize(350, 175);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);

        btnVerificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int valor = Integer.parseInt(txtValor.getText());

                if (valor % 2 == 0) {
                    lblResultado.setText("par!");
                } else {
                    lblResultado.setText("impar!");
                }
            }
        });
    }

    public static void main(String[] args) {
        TelaParImpar telaParImpar = new TelaParImpar();
    }
}
