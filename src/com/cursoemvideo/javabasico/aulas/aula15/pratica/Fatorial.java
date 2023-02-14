package com.cursoemvideo.javabasico.aulas.aula15.pratica;

public class Fatorial {
    private int num = 0;
    private int fat = 1;
    private String formula = "";

    public void setValor(int n) {
        num = n;
        int f = 1;
        String str = "";
        for (int i = n; i > 1; i--) {
            f *= i;
            str += i + " x ";
        }
        fat = f;
        formula = str + "1 = ";
    }

    public int getFatorial() {
        return fat;
    }

    public String getFormula() {
        return formula;
    }
}
