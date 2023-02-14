package com.cursoemvideo.javabasico.aulas.aula14.pratica;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;

public class TelaVetor extends JFrame {
    private JPanel mainPanel;
    private JSpinner txtNum;
    private JButton btnAdicionar;
    private JButton btnOrdenar;
    private JButton btnRemover;
    private JLabel lblSelecionado;
    private JList lstVetor;
    private int vetor[] = new int[5];
    int selecionado = 0;
    DefaultListModel lista = new DefaultListModel();

    public TelaVetor() {
        setContentPane(mainPanel);
        setSize(400, 200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);

        Arrays.fill(vetor, 0);
        for (int i = 0; i < vetor.length; i++) {
            lista.addElement(vetor[i]);
        }

        lstVetor.setModel(lista);
        lblSelecionado.setText("vetor [" + selecionado + "]");

        btnAdicionar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vetor[selecionado] = (int) txtNum.getValue();
                lista.removeAllElements();
                for (int i = 0; i < vetor.length; i++) {
                    lista.addElement(vetor[i]);
                }
                lstVetor.setModel(lista);
            }
        });
        lstVetor.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                selecionado = lstVetor.getSelectedIndex();
                lblSelecionado.setText("vetor [" + selecionado + "]");
            }
        });
        btnRemover.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vetor[selecionado] = 0;
                lista.removeAllElements();
                for (int i = 0; i < vetor.length; i++) {
                    lista.addElement(vetor[i]);
                }
                lstVetor.setModel(lista);
            }
        });
        btnOrdenar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Arrays.sort(vetor);
                lista.removeAllElements();
                for (int i = 0; i < vetor.length; i++) {
                    lista.addElement(vetor[i]);
                }
            }
        });
    }

    public static void main(String[] args) {
        var telaVetor = new TelaVetor();
    }
}
