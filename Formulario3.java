import javax.swing.*;

public class Formulario3 extends JFrame{

  private JLabel etiqueta1;
  private JLabel etiqueta2;
  
  public Formulario3(){
  setLayout(null);
  etiqueta1 = new JLabel("Interfaz gráfica");
  etiqueta1.setBounds(10,20,300,30);
  add(etiqueta1);
  etiqueta2 = new JLabel("Version 1.0");
  etiqueta2.setBounds(10,100,100,30);
  add(etiqueta2);
  }

  public static void main(String args[]){
  Formulario3 formulario = new Formulario3();
  formulario.setBounds(0,0,300,200);
  formulario.setResizable(false);
  formulario.setVisible(true);
  formulario.setLocationRelativeTo(null);  
 }
}