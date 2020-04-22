package Interfaces_graficas;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class Menu_2 extends JFrame implements ActionListener {
    private JMenuBar menuBar;
    private JMenu menu_principal, menu1, menu2;
    private JMenuItem menuItem1, menuItem2, menuItem3, menuItem4, menuItem5;
    public Menu_2(){
        setLayout(null);
        menuBar = new JMenuBar();
        // Sirve para colocar el menubar al principio
        setJMenuBar(menuBar);
        menu_principal = new JMenu("Opciones");
        menuBar.add(menu_principal);

        menu1 = new JMenu("Tamaños");
        menu2 = new JMenu("Colores");

        menu_principal.add(menu1);
        menu_principal.add(menu2);

        menuItem1 = new JMenuItem("300 x 200");
        menu1.add(menuItem1);
        menuItem1.addActionListener(this);

        menuItem2 = new JMenuItem("680 x 480");
        menu1.add(menuItem2);
        menuItem2.addActionListener(this);

        menuItem3 = new JMenuItem("Rojo");
        menu2.add(menuItem3);
        menuItem3.addActionListener(this);

        menuItem4 = new JMenuItem("Verde");
        menu2.add(menuItem4);
        menuItem4.addActionListener(this);

        menuItem5 = new JMenuItem("Azul");
        menu2.add(menuItem5);
        menuItem5.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == menuItem1 ){
            setSize(300,200);
        }
        if (e.getSource() == menuItem2 ){
            setSize(640,480);
        }
        if (e.getSource() == menuItem3 ){
            Color rojo = new Color(255,0,0);
            getContentPane().setBackground(rojo);
        }
        if (e.getSource() == menuItem4 ){
            Color verde = new Color(0,255,0);
            getContentPane().setBackground(verde);
        }
        if (e.getSource() == menuItem5 ){
            Color azul = new Color(0,0,255);
            getContentPane().setBackground(azul);

        }
    }
    public static void main(String [] args){
        Menu_2 menu = new Menu_2();
        menu.setBounds(0,0,300,200);
        menu.setVisible(true);
        menu.setResizable(false);
        menu.setLocationRelativeTo(null);
    }
}
