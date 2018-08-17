
package Video19RandomKev;

import java.util.*;

public class Random {

public void adivinar(){
    
    int aleatorio = (int)(Math.random()*10); //solo 10
    Scanner entrada = new Scanner(System.in);
  
    int numero = 0;
    int intentos = 0;
    
    while(numero!=aleatorio){  
        intentos++;
        
        System.out.println();
        
        System.out.println("Introduce un numero: ");
        
        
        System.out.println("Numero correcto es: " + aleatorio); //solo es para guiarme
        
        numero = entrada.nextInt();
        
        if(aleatorio < numero){
            
       
         System.out.println("El numero aleatorio generado es mas bajo");
            
        }else if(aleatorio>numero){
            
         System.out.println();
            
            System.out.println("El numero aleatorio generado es mas alto");
        }
    }
    
    System.out.println("Muy bien, despues de " + intentos + "intentos, lo lograste");
}
    
}
