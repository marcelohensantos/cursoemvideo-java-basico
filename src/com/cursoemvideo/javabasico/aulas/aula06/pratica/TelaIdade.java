package com.cursoemvideo.javabasico.aulas.aula06.pratica;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Year;

public class TelaIdade extends JFrame {
    private JPanel mainPanel;
    private JSpinner txtAnoNascimento;
    private JButton btnCalcular;
    private JLabel lblResultado;
    private JLabel lblAnoAtual;

    public TelaIdade() {
        setContentPane(mainPanel);
        setTitle("Calcular Idade");
        setSize(450, 450);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        Year year = Year.now();
        int anoAtual = year.getValue();
        lblAnoAtual.setText(Integer.toString(anoAtual));

        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int anoNascimento = Integer.parseInt(txtAnoNascimento.getValue().toString());
                int idade = Integer.parseInt(lblAnoAtual.getText()) - anoNascimento;
                lblResultado.setText(Integer.toString(idade));
            }
        });
    }

    public static void main(String[] args) {
        TelaIdade telaIdade = new TelaIdade();
    }
}
