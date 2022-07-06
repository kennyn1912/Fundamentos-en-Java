
package calculandosalariosemanal;

import java.util.Scanner;

/**
 *
 * @author kenny
 */
public class CalculandoSalarioSemanal {

   
    public static void main(String[] args) {
  Scanner calculando = new Scanner(System.in);
  float salariot,horast,salarioh=35000;
 
        
        System.out.println("Digite el numero de horas trabajadas: ");
        horast = calculando.nextFloat();
      
        
        salariot = horast*salarioh;
        
        System.out.println("\n El salario total es "+salariot);
    }
    
}
