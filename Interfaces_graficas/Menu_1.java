package Interfaces_graficas;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class Menu_1 extends JFrame implements ActionListener {
    private JMenuBar menuBar;
    private JMenu menu1;
    private JMenuItem menuItem1, menuItem2,menuItem3;
    public Menu_1(){
        setLayout(null);
        menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        menu1 = new JMenu("Opciones");
        menuBar.add(menu1);

        menuItem1 = new JMenuItem("Rojo");
        menuItem1.addActionListener(this);
        menu1.add(menuItem1);

        menuItem2 = new JMenuItem("Verde");
        menuItem2.addActionListener(this);
        menu1.add(menuItem2);

        menuItem3 = new JMenuItem("Azul");
        menuItem3.addActionListener(this);
        menu1.add(menuItem3);
    }
    public void actionPerformed(ActionEvent e){
        //Agarrar y ver todas las dimensiones de la interfaz y darselas al contenedor!
        Container fondo = this.getContentPane();
        if (e.getSource() == menuItem1){
            Color rojo = new Color(255,0,0);
            fondo.setBackground(rojo);
        }
        if (e.getSource() == menuItem2){
            Color verde = new Color(0,255,0);
            fondo.setBackground(verde);
        }
        if (e.getSource() == menuItem3){
            Color azul = new Color(0,0,255);
            fondo.setBackground(azul);
        }
    }
    public static void main(String [] args){
        Menu_1 menu = new Menu_1();
        menu.setBounds(0,0,400,300);
        menu.setVisible(true);
        menu.setResizable(false);
        menu.setLocationRelativeTo(null);
    }
}
