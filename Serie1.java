public class Serieone{
  public static void main(String args[]){
  System.out.println("Ciclo de serie for: ");
  int i = 0;
    for(i = 1; i <= 10; i++){
     if(i < 10){
      System.out.print(i + ","); 
     }else{
      System.out.print(i);
     }
    }
  i = 1;
  System.out.println("");

  System.out.println("Ciclo de serie while: ");
  while(i <= 10){
   if(i < 10){
      System.out.print(i + ","); 
     } else{
      System.out.print(i);
     }
     i++;
    }
    i = 1;
    System.out.println("");
    System.out.println("Ciclo con do while: ");
    do{
     if(i < 10){
      System.out.print(i + ","); 
     } else{
      System.out.print(i);
     } 
     i++;
  } while(i <= 10 );
 }
}
