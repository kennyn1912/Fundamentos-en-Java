
package guardadatos;

import java.util.Scanner;

/**
 *
 * @author kenny
 */
public class main {

    
    public static void main(String[] args) {
     Scanner entrada = new Scanner(System.in);
     int numero;
     
        System.out.println("Digite un numero: ");
        numero = entrada.nextInt();
        
        System.out.println("El numero es: "+numero);
        
        
        
        Scanner entrada2 = new Scanner(System.in);
     float decimal;
     
        System.out.println("Digite un NUMERO DECIMAL: ");
        decimal = entrada2.nextFloat();
        
        System.out.println("El numero es: "+decimal);
        
        
        
                    Scanner entrada3 = new Scanner(System.in);
                     double validar;
     
                        System.out.println("Digite un NUMERO  ");
                        validar = entrada3.nextDouble();
        
        System.out.println("El numero es: "+validar);
        
        
        
               Scanner entrada4 = new Scanner(System.in);
     String cadena;
     
        System.out.println("Digite una cadena : ");
         cadena = entrada4.next();
        
        System.out.println("El numero es: "+cadena);
        
        
              Scanner entrada5 = new Scanner(System.in);
     String cadena1;
     
        System.out.println("Digite una cadena larga: ");
        cadena1 = entrada5.nextLine();
        
        System.out.println("La cadena es: "+cadena1);
        
               Scanner entrada6 = new Scanner(System.in);
     char letra;
     
        System.out.println("Digite una Letra: ");
        letra = entrada6.next().charAt(0);
       
        System.out.println("La letra es: "+letra);
    }
    
}
