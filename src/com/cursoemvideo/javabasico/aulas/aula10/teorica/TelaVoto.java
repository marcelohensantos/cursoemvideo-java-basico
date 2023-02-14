package com.cursoemvideo.javabasico.aulas.aula10.teorica;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Year;

public class TelaVoto extends JFrame {
    private JPanel mainPanel;
    private JTextField txtAnoNascimento;
    private JButton btnVotar;
    private JLabel lblResultado;

    public TelaVoto() {
        setContentPane(mainPanel);
        setTitle("Votação");
        setSize(350, 175);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);

        btnVotar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Year year = Year.now();

                int anoAtual = year.getValue();
                int anoNascimento = Integer.parseInt(txtAnoNascimento.getText());
                int idade = anoAtual - anoNascimento;

                if (idade < 16) {
                    lblResultado.setText("Não Vota!");
                } else if ((idade >= 16 && idade < 18) || (idade > 70)) {
                    lblResultado.setText("Opcional!");
                } else {
                    lblResultado.setText("Obrigatório!");
                }
            }
        });
    }

    public static void main(String[] args) {
        var telaVoto = new TelaVoto();
    }
}
