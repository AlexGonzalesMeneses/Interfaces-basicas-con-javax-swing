package Interfaces_graficas;
import javax.swing.event.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Formulario_1 extends JFrame implements ActionListener, ChangeListener {
    private JLabel label;
    private JCheckBox checkBox;
    private JButton button;
    public Formulario_1(){
        setLayout(null);
        label = new JLabel("Aceptar términos y condiciones");
        label.setBounds(10,10,400,30);
        add(label);

        checkBox = new JCheckBox("Acepto");
        checkBox.setBounds(10,50,100,30);
        checkBox.addChangeListener(this);
        add(checkBox);

        button = new JButton("Aceptar");
        button.setBounds(10,90,130,30);
        button.addActionListener(this);
        add(button);
        button.setEnabled(false);
    }
    public void stateChanged(ChangeEvent e){
        if(checkBox.isSelected() == true){
            button.setEnabled(true);
        }else{
            button.setEnabled(false);
        }
    }
  public void actionPerformed(ActionEvent e){
        if (e.getSource() == button){
            System.exit(0);
        }
  }
    public static void main(String [] args){
        Formulario_1 formulario = new Formulario_1();
        formulario.setBounds(0,0,250,175);
        formulario.setVisible(true);
        formulario.setResizable(false);
        formulario.setLocationRelativeTo(null);
    }
}
