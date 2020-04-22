package Interfaces_graficas;

import javax.swing.*;
import java.awt.event.*;

public class Evento_2 extends JFrame implements ActionListener {
    //Cargamos 3 botones;
    private JButton button1, button2, button3;
    private JLabel label1;
    public Evento_2(){
        setLayout(null);
        button1 = new JButton("1");
        button1.setBounds(10,100,90,30);
        add(button1);
        button1.addActionListener(this);

        button2 = new JButton("2");
        button2.setBounds(110,100,90,30);
        add(button2);
        button2.addActionListener(this);

        button3 = new JButton("3");
        button3.setBounds(210,100,90,30);
        add(button3);
        button3.addActionListener(this);

        label1 = new JLabel("En espera...");
        label1.setBounds(10,10,300,30);
        add(label1);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == button1){
            label1.setText("Presionaste el boton 1");
        }
        if(e.getSource() == button2){
            label1.setText("Presionaste el boton 2");
        }
        if(e.getSource() == button3){
            label1.setText("Presionaste el boton 3");
        }
    }
    public static void main(String [] args){
        Evento_2 interfaz = new Evento_2();
        interfaz.setBounds(10,100,350,200);
        interfaz.setLocationRelativeTo(null);
        interfaz.setVisible(true);
        interfaz.setResizable(false);
    }
}
