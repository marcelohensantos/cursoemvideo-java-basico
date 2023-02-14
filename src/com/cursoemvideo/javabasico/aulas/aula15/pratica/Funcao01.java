package com.cursoemvideo.javabasico.aulas.aula15.pratica;

public class Funcao01 {
    public static void main(String[] args) {
        Fatorial fatorial = new Fatorial();
        fatorial.setValor(5);
        System.out.print(fatorial.getFormula());
        System.out.println(fatorial.getFatorial()  );
    }
}
