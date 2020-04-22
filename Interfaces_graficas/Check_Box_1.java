package Interfaces_graficas;
import javax.swing.*;
import javax.swing.event.*;

public class Check_Box_1 extends JFrame implements ChangeListener{
    private JCheckBox checkBox1;
    private JCheckBox checkBox2;
    private JCheckBox checkBox3;
    public Check_Box_1(){
        setLayout(null);
        checkBox1 = new JCheckBox("Inglés");
        checkBox1.setBounds(10,10,150,30);
        add(checkBox1);
        checkBox1.addChangeListener(this);

        checkBox2 = new JCheckBox("Alemán");
        checkBox2.setBounds(10,50,150,30);
        add(checkBox2);
        checkBox2.addChangeListener(this);

        checkBox3 = new JCheckBox("Frances");
        checkBox3.setBounds(10,90,150,30);
        add(checkBox3);
        checkBox3.addChangeListener(this);
    }
    public void stateChanged(ChangeEvent e){
        String cad = "";
        if(checkBox1.isSelected() == true){
            cad += "Ingles-";
        }
        if(checkBox2.isSelected() == true){
            cad += "Alemán-";
        }
        if(checkBox3.isSelected() == true){
            cad += "Francés-";
        }
        setTitle(cad);
    }
    public static void main(String [] args){
        Check_Box_1 formulario = new Check_Box_1();
        formulario.setBounds(0,0,300,200);
        formulario.setVisible(true);
        formulario.setResizable(false);
        formulario.setLocationRelativeTo(null);
    }
}
