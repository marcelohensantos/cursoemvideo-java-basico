package com.cursoemvideo.javabasico.aulas.aula09.teorica;

import java.util.Scanner;

public class ProgramaMedia {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float n1 = in.nextFloat();
        float n2 = in.nextFloat();
        float m = (n1 + n2) / 2;
        System.out.format("media %.2f\n", m);

        if (m > 9) {
            System.out.println("parabéns!");
        }
    }
}
