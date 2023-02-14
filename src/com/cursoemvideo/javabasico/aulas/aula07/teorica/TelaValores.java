package com.cursoemvideo.javabasico.aulas.aula07.teorica;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaValores extends JFrame {
    private JPanel mainPanel;
    private JTextField txtNumerador;
    private JTextField txtDenominador;
    private JButton btnDividir;
    private JLabel lblResultDivisao;
    private JLabel lblRaizQuadrada;

    public TelaValores() {
        setContentPane(mainPanel);
        setTitle("Tela Valores");
        setSize(300, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        btnDividir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float num = Float.parseFloat(txtNumerador.getText());
                float den = Float.parseFloat(txtDenominador.getText());

                lblResultDivisao.setText(Float.toString(num/den));
                lblRaizQuadrada.setText(Float.toString((float) Math.sqrt(num)));
            }
        });
    }

    public static void main(String[] args) {
        TelaValores telaValores = new TelaValores();
    }
}
