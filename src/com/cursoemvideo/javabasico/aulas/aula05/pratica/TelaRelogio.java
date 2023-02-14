package com.cursoemvideo.javabasico.aulas.aula05.pratica;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class TelaRelogio extends JFrame{
    private JPanel mainPanel;
    private JButton btnHora;
    private JLabel lblHora;

    public TelaRelogio() {
        setContentPane(mainPanel);
        //setTitle("Welcome");
        setSize(350, 150);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        btnHora.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date date = new Date();
                lblHora.setText(date.toString());
            }
        });
    }

    public static void main(String[] args) {
        TelaRelogio telaRelogio = new TelaRelogio();
    }
}
