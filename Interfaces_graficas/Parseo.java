package Interfaces_graficas;
import javax.swing.*;
import java.awt.event.*;

public class Parseo extends JFrame implements ActionListener {
    private JTextField textField1, textField2;
    private JLabel label1,label2,label3;
    private JButton button;
    private int valor1, valor2, resultado;

    public Parseo(){
        setLayout(null);
        textField1 = new JTextField();
        textField1.setBounds(120,10,150,20);
        add(textField1);

        textField2 = new JTextField();
        textField2.setBounds(120,40,150,20);
        add(textField2);

        label1 = new JLabel("Valor 1: ");
        label1.setBounds(50,5,100,30);
        add(label1);

        label2 = new JLabel("Valor 2: ");
        label2.setBounds(50,35,100,30);
        add(label2);

        label3 = new JLabel("Resultado: ");
        label3.setBounds(120,80,100,30);
        add(label3);

        button = new JButton("Sumar");
        button.setBounds(10,80,100,30);
        add(button);
        button.addActionListener(this);
        valor1 = 0; valor2 = 0; resultado = 0;
    }
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == button){
            valor1 = Integer.parseInt(textField1.getText());
            valor2 = Integer.parseInt(textField2.getText());
            resultado = valor1 + valor2;
            label3.setText("Resultado: " + resultado);
        }
    }
    public static void main(String [] args){
        Parseo interfaz = new Parseo();
        interfaz.setBounds(0,0, 300,150);
        interfaz.setVisible(true);
        interfaz.setResizable(false);
        interfaz.setLocationRelativeTo(null);
    }
}
