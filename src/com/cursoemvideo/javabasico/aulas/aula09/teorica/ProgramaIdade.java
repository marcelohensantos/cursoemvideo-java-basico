package com.cursoemvideo.javabasico.aulas.aula09.teorica;

import java.util.Scanner;

public class ProgramaIdade {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int anoAtual = 2022;

        System.out.print("ano de nascimento: ");
        int anoNascimento = in.nextInt();

        int idade = anoAtual - anoNascimento;
        System.out.println("idade: " + idade);

        if (idade >= 18) {
            System.out.println("maior!");
        } else {
            System.out.println("menor!");
        }
    }
}
