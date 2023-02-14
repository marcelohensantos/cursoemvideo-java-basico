package com.cursoemvideo.javabasico.aulas.aula13.pratica;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaContador extends JFrame {
    private JSlider sliInicio;
    private JSlider sliFim;
    private JSlider sliPasso;
    private JList lstContar;
    private JButton btnContar;
    private JLabel lblInicio;
    private JLabel lblPasso;
    private JLabel lblFim;
    private JPanel mainPanel;

    public TelaContador() {

        setContentPane(mainPanel);
        setSize(475, 275);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(true);

        sliInicio.setMinimum(0);
        sliInicio.setMaximum(5);
        sliInicio.setValue(0);

        sliFim.setMinimum(6);
        sliFim.setMaximum(20);
        sliFim.setValue(6);

        sliPasso.setMinimum(1);
        sliPasso.setMaximum(4);
        sliPasso.setValue(1);

        lblInicio.setText(String.valueOf(sliInicio.getValue()));
        lblFim.setText(Integer.toString(sliFim.getValue()));
        lblPasso.setText(Integer.toString(sliPasso.getValue()));

        //JScrollPane jScrollPane1 = new JScrollPane(lstContar);

        btnContar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultListModel list = new DefaultListModel();

                int inicio = sliInicio.getValue();
                int fim = sliFim.getValue();
                int passo = sliPasso.getValue();

                for (int i = inicio; i <= fim; i += passo) {
                    list.addElement(i);
                }

                lstContar.setModel(list);
            }
        });
        sliInicio.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                lblInicio.setText(String.valueOf(sliInicio.getValue()));
            }
        });
        sliFim.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                lblFim.setText(Integer.toString(sliFim.getValue()));
            }
        });
        sliPasso.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                lblPasso.setText(Integer.toString(sliPasso.getValue()));
            }
        });
    }

    public static void main(String[] args) {
        TelaContador telaContador = new TelaContador();
    }
}
