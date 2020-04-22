package Interfaces_graficas;
import javax.swing.*;
public class Ejercicio_2 extends JFrame{
    public Ejercicio_2(){
        //para coordinar las cordenadas del frame
        setLayout(null);
    }
    public static void main (String [] args){
        Ejercicio_2 interfaz = new Ejercicio_2();
        interfaz.setBounds(150,100,400,500);
        interfaz.setVisible(true);
        //Para modificar el tamaño de la ventana false=no redimencionar
        interfaz.setResizable(false);
        //Quiero que se ejecute que mi interfaz aparezca en el centro
        interfaz.setLocationRelativeTo(null);
    }
}
