import java.util.Scanner;

public class Vectoresd{
  public static void main(String args[]){
  
  int longi = 0;
  Scanner entrada = new Scanner(System.in);
  
  System.out.print("Cuantos numeros desea ingresar? : ");
  longi = entrada.nextInt();
  
  int numeros[] = new int [longi];
  
  for(int i = 0; i < numeros.length; i++){
   System.out.println("Dame el valor # " + (i + 1));
   numeros[i] = entrada.nextInt();
  }
  for(int i = 0; i < numeros.length; i++ ){
   System.out.print("[" + numeros[i] + "]");
  }
 }
} 