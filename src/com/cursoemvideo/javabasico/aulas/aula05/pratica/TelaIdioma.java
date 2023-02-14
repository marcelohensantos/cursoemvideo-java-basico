package com.cursoemvideo.javabasico.aulas.aula05.pratica;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;

public class TelaIdioma extends JFrame{
    private JPanel mainPanel;
    private JButton btnIdioma;
    private JLabel lblIdioma;

    public TelaIdioma(){
        setContentPane(mainPanel);
        //setTitle("Welcome");
        setSize(300, 150);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        btnIdioma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Locale loc = Locale.getDefault();
                lblIdioma.setText(loc.getDisplayLanguage());
            }
        });
    }

    public static void main(String[] args) {
        TelaIdioma telaIdioma = new TelaIdioma();
    }
}
