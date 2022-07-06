
package calculartrescalificaciones;

import java.util.Scanner;

/**
 *
 * @author kenny
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float nota1,nota2,nota3,suma;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite 3 calificaciones: ");
        nota1 = entrada.nextFloat();
        nota2 = entrada.nextFloat();
        nota3 = entrada.nextFloat();
        
        suma = nota1+nota2+nota3;
        
        System.out.println("\n La suma es: "+suma);
        
    }
    
}
