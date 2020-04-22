package Interfaces_graficas;
import javax.swing.*;
import javax.swing.event.*;
public class Radio_Boton extends JFrame implements ChangeListener{
    private JRadioButton radioButton1, radioButton2, radioButton3;
    private ButtonGroup buttonGroup;
    public Radio_Boton(){
        setLayout(null);
        buttonGroup = new ButtonGroup();

        radioButton1 = new JRadioButton("640 x 480");
        radioButton1.setBounds(10,20,100,30);
        radioButton1.addChangeListener(this);
        add(radioButton1);
        buttonGroup.add(radioButton1);

        radioButton2 = new JRadioButton("720 x 480");
        radioButton2.setBounds(10,60,100,30);
        radioButton2.addChangeListener(this);
        add(radioButton2);
        buttonGroup.add(radioButton2);

        radioButton3 = new JRadioButton("1080 x 720");
        radioButton3.setBounds(10,100,100,30);
        radioButton3.addChangeListener(this);
        add(radioButton3);
        buttonGroup.add(radioButton3);
    }
    public void stateChanged(ChangeEvent e){
        if(radioButton1.isSelected() == true){
            setSize(640,480);
        }
        if(radioButton2.isSelected() == true){
            setSize(720,480);
        }
        if(radioButton3.isSelected() == true){
            setSize(1080,720);
        }
    }
    public static void main(String [] args){
        Radio_Boton formulario = new Radio_Boton();
        formulario.setBounds(0,0,300,200);
        formulario.setVisible(true);
        formulario.setResizable(false);
        formulario.setLocationRelativeTo(null);
    }
}
