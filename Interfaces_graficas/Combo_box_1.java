package Interfaces_graficas;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
public class Combo_box_1 extends JFrame implements ActionListener{
    private JComboBox combo1;
    private JComboBox combo2;
    private JComboBox combo3;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JButton button;
    public Combo_box_1(){
        setLayout(null);
        label1 = new JLabel("Rojo");
        label1.setBounds(10,10,100,10);
        add(label1);
        label2 = new JLabel("Verde");
        label2.setBounds(10,50,100,10);
        add(label2);
        label3 = new JLabel("Azul");
        label3.setBounds(10,90,100,10);
        add(label3);
        combo1 = new JComboBox();
        combo1.setBounds(120,10,50,30);
        combo2 = new JComboBox();
        combo2.setBounds(120,50,50,30);
        combo3 = new JComboBox();
        combo3.setBounds(120,90,50,30);
        for(int i = 0; i <= 255; i++){
            combo1.addItem(String.valueOf(i));
            combo2.addItem(String.valueOf(i));
            combo3.addItem(String.valueOf(i));
        }
        add(combo1);
        add(combo2);
        add(combo3);
        button = new JButton("Fijar color");
        button.setBounds(10,130,140,30);
        add(button);
        button.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == button){
            String text1 = combo1.getSelectedItem().toString();
            String text2 = combo2.getSelectedItem().toString();
            String text3 = combo3.getSelectedItem().toString();
            int rojo = Integer.parseInt(text1);
            int verde = Integer.parseInt(text2);
            int azul = Integer.parseInt(text3);
            Color color = new Color(rojo,verde,azul);
            button.setBackground(color);
        }
    }
    public static void main(String [] args){
        Combo_box_1 comboBox = new Combo_box_1();
        comboBox.setBounds(0,0,300,200);
        comboBox.setVisible(true);
        comboBox.setResizable(false);
        comboBox.setLocationRelativeTo(null);
    }
}
