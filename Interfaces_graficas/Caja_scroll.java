package Interfaces_graficas;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Caja_scroll extends JFrame implements ActionListener {
    private JTextArea textArea;
    private JTextField textField;
    private JScrollPane scrollPane;
    private JButton button;
    public Caja_scroll(){
        setLayout(null);
        textField = new JTextField();
        textField.setBounds(50,10,200,30);
        add(textField);
        textArea = new JTextArea();
        scrollPane = new JScrollPane(textArea);
        scrollPane.setBounds(50,50,400,300);
        add(scrollPane);
        button = new JButton("enviar");
        button.setBounds(260,10,80,30);
        add(button);
        button.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == button){
            String text = "Mensaje para: " + textField.getText();
            setTitle(text);
        }
    }
    public static void main(String [] args){
        Caja_scroll box_scroll = new Caja_scroll();
        box_scroll.setBounds(0,0,540,400);
        box_scroll.setVisible(true);
        box_scroll.setResizable(false);
        box_scroll.setLocationRelativeTo(null);
    }
}
