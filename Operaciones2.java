import java.util.Scanner;

public class Operaciones{
  public static void main (String args[]){
  
  Scanner entrada = new Scanner(System.in);
  int num_1 = 0, num_2 = 0, resultado = 0;
  int parametro = 0;

  System.out.println("Dame el primer numero de la operación");
  num_1 = entrada.nextInt();
  System.out.println("");
  System.out.println("Ahora el segundo valor de la operación");
  num_2 = entrada.nextInt();
  System.out.println("");
  System.out.println("Que operacion desearia realizar?");
  System.out.println("");
  System.out.println("1: Suma 2: Resta 3: Multiplicación 4: División ");
  parametro = entrada.nextInt(); 
    

  switch(parametro){
   case 1: resultado = num_1 + num_2;
           System.out.println("El resultdo de la suma es: " + resultado);
           break;
   case 2: resultado = num_1 - num_2;
           System.out.println("El resultado de la resta es: " + resultado);
           break;
   case 3: resultado = num_1 * num_2;
           System.out.println("El resultado de la multiplicacion es: " + resultado);
           break;
   case 4: resultado = num_1 / num_2;
           System.out.println("El resultado de la multiplicacion es: " + resultado);
           break;
   default: System.out.println("Error la opcion no existe");
            break;      
  }
  
 }
}
