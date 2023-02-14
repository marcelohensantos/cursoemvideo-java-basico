package com.cursoemvideo.javabasico.aulas.aula04.pratica;

import java.awt.Dimension;
import java.awt.Toolkit;

public class ResolucaoTela {
    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dim = toolkit.getScreenSize();

        System.out.println("A resolucao do seu sistema é: " + dim.getWidth() + " x " + dim.getHeight());
    }
}
