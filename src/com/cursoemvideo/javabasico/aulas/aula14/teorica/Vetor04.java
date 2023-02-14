package com.cursoemvideo.javabasico.aulas.aula14.teorica;

import java.util.Arrays;

public class Vetor04 {
    public static void main(String[] args) {
        int vet[] = {3, 7, 6, 1, 9, 4, 2};
        for (int v : vet) {
            System.out.print(v + " ");
        }

        int pos = Arrays.binarySearch(vet, 1);
        System.out.println("\n" + pos);
    }
}
