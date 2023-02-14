package com.cursoemvideo.javabasico.aulas.aula11.teorica;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaContador extends JFrame {
    private JPanel mainPanel;
    private JLabel lblContagem;
    private JButton btnContagem;

    public TelaContador() {
        setContentPane(mainPanel);
        setSize(300, 150);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);

        btnContagem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int cc = 1;
                String contagem = "";
                while(cc <= 10) {
                    contagem += cc + " ";
                    cc++;
                }
                lblContagem.setText(contagem);
            }
        });
    }

    public static void main(String[] args) {
        var telaContador = new TelaContador();
    }
}
