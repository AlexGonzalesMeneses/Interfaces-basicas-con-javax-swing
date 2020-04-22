package Interfaces_graficas;

import javax.swing.*;

public class Ejercicio_1 extends JFrame{
    //Crea etiquetas sin la necesidad de un System.ou.println
    private JLabel label1;
    public Ejercicio_1() {
        setLayout(null);
        label1 = new JLabel("La Wikipedia de Alex");
        label1.setBounds(10, 20, 200, 300);
        add(label1);
    }
    public static void main(String [] args){
        Ejercicio_1 interfaz = new Ejercicio_1();
        interfaz.setBounds(0,0,400,300);
        interfaz.setVisible(true);
        interfaz.setLocationRelativeTo(null);
    }
}
