package com.cursoemvideo.javabasico.aulas.aula12.teorica;

import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String op = "";
        int soma = 0;

        int num;
        do {
            System.out.print("digite um numero: ");
            num = in.nextInt();

            soma += num;

            System.out.print("deseja continuar? [s/n] ");
            op = in.next().toLowerCase();
        } while (op.equals("s"));

        System.out.println("soma: " + soma);
    }
}
