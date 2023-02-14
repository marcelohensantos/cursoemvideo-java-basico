package com.cursoemvideo.javabasico.aulas.aula05.teorica;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OlaMundoSwing extends JFrame {
    private JPanel mainPanel;
    private JButton btnClick;
    private JLabel lblMensagem;

    public OlaMundoSwing() {
        setContentPane(mainPanel);
        //setTitle("Welcome");
        setSize(450, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        btnClick.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblMensagem.setText("Olá, Mundo!");
            }
        });
    }

    public static void main(String[] args) {
        OlaMundoSwing olaMundo = new OlaMundoSwing();
    }
}
