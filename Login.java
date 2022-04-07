import java.util.Scanner;
public class Login{
  public static void main(String args []){

  String usuario = "", password = "";
  Scanner entrada = new Scanner (System.in);

  System.out.print("Ingresa el nombre de usuario: ");
  usuario = entrada.nextLine(); 
 
  System.out.print("Ingresa la contraseña: ");
  password = entrada.nextLine();

  if(usuario.equals("fran") && password.equals("123456") ){
   System.out.println("Inicio de sesion correcto");
  } else {
      System.out.println("Inicio de sesion incorrecto contraseña o ususario invalidos");
  }
 }
}