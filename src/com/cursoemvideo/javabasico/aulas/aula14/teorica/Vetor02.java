package com.cursoemvideo.javabasico.aulas.aula14.teorica;

public class Vetor02 {
    public static void main(String[] args) {
        String mes[] = {"jan", "fev", "mar", "abr", "mai", "jun", "jul", "ago", "set", "out", "nov", "dez"};
        String tot[] = {"31", "28", "31", "30", "31", "30", "31", "31", "30", "31", "30", "31"};

        for (int i = 0; i < mes.length; i++) {
            System.out.println("o mês de " + mes[i] + " tem " + tot[i] + " dias.");
        }
    }
}
