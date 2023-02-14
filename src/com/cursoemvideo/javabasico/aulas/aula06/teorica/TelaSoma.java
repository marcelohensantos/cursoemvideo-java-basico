package com.cursoemvideo.javabasico.aulas.aula06.teorica;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaSoma extends JFrame {
    private JPanel mainPanel;
    private JTextField txtN1;
    private JTextField txtN2;
    private JButton button1;
    private JLabel lblResultado;

    public TelaSoma() {
        setContentPane(mainPanel);
        setTitle("TelaSoma");
        setSize(500, 100);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float n1 = Float.parseFloat(txtN1.getText());
                float n2 = Float.parseFloat(txtN2.getText());
                float soma = n1 + n2;

                lblResultado.setText(Float.toString(soma));
            }
        });
    }

    public static void main(String[] args) {
        var telaSoma = new TelaSoma();
    }
}
