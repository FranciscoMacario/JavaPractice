import javax.swing.*;
import java.awt.event.*;

public class Botones2 extends JFrame implements ActionListener{
 private JButton boton1, boton2, boton3;
 private JLabel label;

 public Botones2(){
  setLayout(null);
  boton1 = new JButton("1");
  boton1.setBounds(10,100,90,30);
  add(boton1);
  boton1.addActionListener(this);

  boton2 = new JButton("2");
  boton2.setBounds(110,100,90,30);
  add(boton2);
  boton2.addActionListener(this);
  
  boton3 = new JButton("3");
  boton3.setBounds(210,100,90,30);
  add(boton3);
  boton3.addActionListener(this);
  
  label = new JLabel("En espera");
  label.setBounds(10,10,300,30);
  add(label);
 }

 public void actionPerformed(ActionEvent e){
  if(e.getSource() == boton1){
    label.setText("sos terrible navo");
  }
  if(e.getSource() == boton2){
    label.setText("pedazo de puto");
  }
  if(e.getSource() == boton3){
    label.setText("puto el que lee");
  }
 }
 public static void main(String args[]){

 Botones2 botones = new Botones2();
 botones.setBounds(0,0,350,200);
 botones.setVisible(true);
 botones.setResizable(false);
 botones.setLocationRelativeTo(null);
 }
}