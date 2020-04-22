package Interfaces_graficas;
import javax.swing.*;
import java.awt.event.*;
public class Combo_box extends JFrame implements ItemListener{
    private JComboBox comboBox;
    public Combo_box(){
        setLayout(null);
        comboBox = new JComboBox();
        comboBox.setBounds(10,10,80,20);
        add(comboBox);
        comboBox.addItem("Rojo");
        comboBox.addItem("Azul");
        comboBox.addItem("Verde");
        comboBox.addItem("Amarillo");
        comboBox.addItem("Negro");
        comboBox.addItem("Blanco");
        comboBox.addItemListener(this);
    }
    public void itemStateChanged(ItemEvent e){
        if (e.getSource() == comboBox){
            String text = comboBox.getSelectedItem().toString();
            setTitle(text);
        }
    }
    public static void main(String [] args){
        Combo_box combo_box = new Combo_box();
        combo_box.setBounds(0,0,200,150);
        combo_box.setVisible(true);
        combo_box.setResizable(false);
        combo_box.setLocationRelativeTo(null);
    }
}
