package com.cursoemvideo.javabasico.aulas.aula15.teorica;

public class TesteFuncao01 {
     public static int soma(int a, int b) {
        int s = a + b;
        return s;
    }

    public static void main(String[] args) {
        int s = soma(5,2);
        System.out.println("a soma é: " + s);
    }
}
