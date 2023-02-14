package com.cursoemvideo.javabasico.aulas.aula05.pratica;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaResolucao extends JFrame {
    private JPanel mainPanel;
    private JButton btnResolucao;
    private JLabel lblResolucao;

    public TelaResolucao() {
        setContentPane(mainPanel);
        //setTitle("Welcome");
        setSize(350, 150);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        btnResolucao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Toolkit toolkit = Toolkit.getDefaultToolkit();
                Dimension dim = toolkit.getScreenSize();
                lblResolucao.setText(dim.getWidth() + " x " + dim.getHeight());
            }
        });
    }

    public static void main(String[] args) {
        var telaResolucao = new TelaResolucao();
    }
}
