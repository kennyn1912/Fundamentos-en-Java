
package calculaelcuadradodeunasuma;

import java.util.Scanner;

/**
 *
 * @author kenny
 */
public class CalculaElCuadradoDeUnaSuma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        int n,s;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingresar cantidad de elementos:");
        n=teclado.nextInt();
   
        
        s=(n*(n+1)*(2*n+1))/6;
        
         System.out.println("Suma de los cuadrados de los primeros números="+s);              
    }   
}
