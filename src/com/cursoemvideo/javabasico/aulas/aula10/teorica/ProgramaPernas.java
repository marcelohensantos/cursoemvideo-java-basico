package com.cursoemvideo.javabasico.aulas.aula10.teorica;

import java.util.Scanner;

public class ProgramaPernas {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("quantas pernas: ");
        int perna = in.nextInt();

        String tipo;
        System.out.print("isso é um(a): ");
        switch (perna) {
            case 1:
                tipo = "saci";
                break;
            case 2:
                tipo = "bípede";
                break;
            case 4:
                tipo = "quadrúpede";
                break;
            case 6, 8:
                tipo = "aranha";
                break;
            default:
                tipo = "E.T.";
        }
        System.out.println(tipo);
    }
}
