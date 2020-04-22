package Interfaces_graficas;
import javax.swing.*;
public class Ejercicio_3 extends JFrame{
    private JLabel label1;
    private JLabel label2;
    public Ejercicio_3(){
        setLayout(null);
        label1 = new JLabel("Interfaz grafica");
        label1.setBounds(10,20,300,30);
        //Sin add() no se agregará nada a la etiqueta
        add(label1);
        label2 = new JLabel("Version 1.0");
        label2.setBounds(10,100,100,30);
        add(label2);
    }
    public static void main(String[]args){
        Ejercicio_3 interfaz = new Ejercicio_3();
        interfaz.setBounds(0,0,300,200);
        interfaz.setResizable(false);
        interfaz.setVisible(true);
        interfaz.setLocationRelativeTo(null);
    }
}
