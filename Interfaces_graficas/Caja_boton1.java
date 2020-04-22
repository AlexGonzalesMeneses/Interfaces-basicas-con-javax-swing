package Interfaces_graficas;
import javax.swing.*;
import java.awt.event.*;
public class Caja_boton1 extends JFrame implements ActionListener{
    private JTextField textField;
    private JTextArea textArea;
    private JButton button;
    private JScrollPane scrollPane;
    private String texto;
    public Caja_boton1(){
        setLayout(null);
        textArea = new JTextArea();
        scrollPane = new JScrollPane(textArea);
        scrollPane.setBounds(50,50,400,300);
        add(scrollPane);

        textField = new JTextField();
        textField.setBounds(50,10,200,30);
        add(textField);

        button = new JButton("Agregar");
        button.setBounds(260,10,120,30);
        add(button);
        button.addActionListener(this);

        texto = "";
    }
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == button){
            texto += textField.getText() + "\n";
            textArea.setText(texto);
            textField.setText("");
        }
    }

    public static void main(String [] args){
        Caja_boton1 interfaz = new Caja_boton1();
        interfaz.setBounds(0,0,540,400);
        interfaz.setVisible(true);
        interfaz.setResizable(false);
        interfaz.setLocationRelativeTo(null);
    }
}
