package com.cursoemvideo.javabasico.aulas.aula12.pratica;

import javax.swing.JOptionPane;

public class ExercicioRepita {
    public static void main(String[] args) {
        int impar = 0;
        int maior100 = 0;
        int par = 0;
        int soma = 0;
        int total = 0;
        int n;
        double media;

        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "<html>Informe um número: <br><em>(valor 0 interrompe)</em></html>"));

            if (n != 0) {

                if (n % 2 == 0) {
                    par += 1;
                } else {
                    impar += 1;
                }

                if (n > 100) {
                    maior100 += 1;
                }

                soma += n;
                total += 1;
            }

        } while (n != 0);

        media = (double) (soma / (double) total);
        JOptionPane.showMessageDialog(null, "<html>Resultado: <br><hr> "
                + "<br>Total de Valores: " + total
                + "<br>Total de Pares: " + par
                + "<br>Total de Impares: " + impar
                + "<br>Acima de 100: " + maior100
                + "<br>Média dos Valores: " + media
                + "</html>");
    }
}
