import java.util.Scanner;

public class Suma{
 public static void main (String args[]){
 
   Scanner entrada = new Scanner(System.in);
   String nombre = "";
   int num_uno = 0, num_2 = 0, resultado = 0;
   
   System.out.println ("Cual es tu nombre? ");
   nombre = entrada.nextLine();
   System.out.println ("Dame el primer valor para tu suma ");
   num_uno = entrada.nextInt();
   System.out.println ("Dame el segundo valor para la suma ");
   num_2 = entrada.nextInt();
   
   resultado = num_1 + num_2;
   System.out.println ("Hola " + nombre + "El resultado de tu    suma es " + resultado);  
 }
} 