package Interfaces_graficas;
import javax.swing.*;

public class Caja_texto extends JFrame {
    private JTextField text_field;
    private JTextArea text_area;
    public Caja_texto(){
        setLayout(null);
        text_field = new JTextField();
        text_field.setBounds(100,10,200,30);
        add(text_field);
        text_area = new JTextArea();
        text_area.setBounds(50,50,400,300);
        add(text_area);
    }
    public static void main(String [] args){
        Caja_texto formulario = new Caja_texto();
        formulario.setBounds(0,0,500,400);
        formulario.setVisible(true);
        formulario.setResizable(false);
        formulario.setLocationRelativeTo(null);
    }
}
