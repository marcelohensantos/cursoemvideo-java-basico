package com.cursoemvideo.javabasico.aulas.aula10.pratica;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaTriangulo extends JFrame {
    private JPanel mainPanel;
    private JSlider sliC;
    private JSlider sliB;
    private JSlider sliA;
    private JLabel lblStatus;
    private JLabel lblTipoTriangulo;
    private JButton btnVerificar;
    private JPanel panelResposta;
    private JLabel lblA;
    private JLabel lblB;
    private JLabel lblC;

    public TelaTriangulo() {
        setContentPane(mainPanel);
        setTitle("Tipos de Triângulo");
        setSize(350, 350);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);

        panelResposta.setVisible(false);

        btnVerificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a = sliA.getValue();
                int b = sliB.getValue();
                int c = sliC.getValue();

                if ((a < b + c) && (b < a + c) && (c < a + b)) {
                    lblStatus.setText("Formam um triângulo!");
                    if ((a == b) && (a == c)) {
                        lblTipoTriangulo.setText("Equilátero");
                    } else if ((a != b) && (a != c) && (b != c)) {
                        lblTipoTriangulo.setText("Escaleno");
                    } else {
                        lblTipoTriangulo.setText("Isósceles");
                    }
                    lblTipoTriangulo.setVisible(true);

                } else {
                    lblStatus.setText("Não formam um triângulo!");
                    lblTipoTriangulo.setVisible(false);
                }

                if (!panelResposta.isVisible()) {
                    panelResposta.setVisible(true);
                }
            }
        });

        sliA.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                lblA.setText(String.valueOf(sliA.getValue()));
            }
        });

        sliB.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                lblB.setText(String.valueOf(sliB.getValue()));
            }
        });

        sliC.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                lblC.setText(String.valueOf(sliC.getValue()));
            }
        });
    }

    public static void main(String[] args) {
        TelaTriangulo telaTriangulo = new TelaTriangulo();
    }
}
