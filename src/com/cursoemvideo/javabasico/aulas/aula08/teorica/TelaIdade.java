package com.cursoemvideo.javabasico.aulas.aula08.teorica;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Year;

public class TelaIdade extends JFrame {
    private JPanel mainPanel;
    private JTextField txtAno;
    private JButton btnCalcular;
    private JLabel lblIdade;
    private JLabel lblSituacao;

    public TelaIdade() {
        setContentPane(mainPanel);
        setTitle("Verificador de Idade");
        setSize(350, 250);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);

        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Year year = Year.now();
                int anoNascimento = Integer.parseInt(txtAno.getText());
                int idade = year.getValue() - anoNascimento;

                lblIdade.setText(Integer.toString(idade));

                String situacao = ((idade >= 16 && idade < 18) || (idade > 70)) ? "opcional" : "não opcional";
                lblSituacao.setText(situacao);
            }
        });
    }

    public static void main(String[] args) {
        var telaIdade = new TelaIdade();
    }
}
