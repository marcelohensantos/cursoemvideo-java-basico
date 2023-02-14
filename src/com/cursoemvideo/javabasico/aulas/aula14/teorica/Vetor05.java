package com.cursoemvideo.javabasico.aulas.aula14.teorica;

import java.util.Arrays;

public class Vetor05 {
    public static void main(String[] args) {
        int vet[] = new int[20];
        Arrays.fill(vet, 0);

        for (int valor : vet) {
            System.out.print(valor + " ");
        }
    }
}
