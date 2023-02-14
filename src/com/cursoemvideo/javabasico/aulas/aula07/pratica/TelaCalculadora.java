package com.cursoemvideo.javabasico.aulas.aula07.pratica;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaCalculadora extends JFrame {
    private JSpinner txtValor;
    private JButton btnCalcular;
    private JPanel calcPanel;
    private JPanel mainPanel;
    private JLabel lblResto;
    private JLabel lblCubo;
    private JLabel lblRaizQuad;
    private JLabel lblRaizCub;
    private JLabel lblAbs;

    public TelaCalculadora() {
        calcPanel.setVisible(false);

        setContentPane(mainPanel);
        setTitle("Tela Valores");
        setSize(450, 450);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);

        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num = (int) txtValor.getValue();

                int resto = num % 2;
                int cubo = (int) Math.pow(num, 3);
                double rq = Math.sqrt(num);
                double rc = Math.cbrt(num);
                int absoluto = Math.abs(num);

                lblResto.setText(Integer.toString(resto));
                lblCubo.setText(Integer.toString(cubo));
                lblRaizQuad.setText(String.format("%.2f", rq));
                lblRaizCub.setText(String.format("%.2f", rc));
                lblAbs.setText(Integer.toString(absoluto));
                calcPanel.setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        TelaCalculadora telaCalculadora = new TelaCalculadora();
    }
}
