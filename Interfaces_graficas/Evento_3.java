package Interfaces_graficas;
import javax.swing.*;
import java.awt.event.*;
public class Evento_3 extends JFrame implements ActionListener{
    private JLabel label1;
    private JButton button1;
    private JTextField textField1;
    public Evento_3(){
        setLayout(null);
        label1 = new JLabel("Usuario: ");
        label1.setBounds(10,10,100,30);
        add(label1);

        button1 = new JButton("ok");
        button1.setBounds(10,80,100,30);
        add(button1);
        button1.addActionListener(this);

        textField1 = new JTextField();
        textField1.setBounds(120,17,150,20);
        add(textField1);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == button1){
            String text = textField1.getText();
            setTitle(text);
        }
    }
    public static void main(String [] args){
        Evento_3 interfaz = new Evento_3();
        interfaz.setBounds(0,0,300,150);
        interfaz.setVisible(true);
        interfaz.setResizable(false);
    }
}
