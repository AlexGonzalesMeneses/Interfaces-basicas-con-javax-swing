package Interfaces_graficas;
import javax.swing.*;
import java.awt.event.*;
//Action listener esta a la escucha de las acciones de nuestro frame
public class Evento_1 extends JFrame implements ActionListener{
   private JButton button1;
    public Evento_1(){
        setLayout(null);
        button1 = new JButton("Cerrar");
        button1.setBounds(300,250,100,30);
        add(button1);
        button1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        //getSource recupera el evento dentro el espacio de memoria de "e", o sea si le das click
        if(e.getSource() == button1){
            System.exit(0);
        }
    }
    public static void main(String[]args){
        Evento_1 interfaz = new Evento_1();
        interfaz.setBounds(0,0,450,350);
        interfaz.setLocationRelativeTo(null);
        interfaz.setVisible(true);
        interfaz.setResizable(false);
    }
}
