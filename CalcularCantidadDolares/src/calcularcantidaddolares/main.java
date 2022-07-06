/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calcularcantidaddolares;

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
       Scanner entrada = new Scanner(System.in);
       
       float guillermo,luis,juan,total;
       
        System.out.println("Digite la cantidad de dinero que tiene guillermo");
        guillermo = entrada.nextFloat();
        
        luis = guillermo/2;
        juan = (guillermo+luis)/2;
        
        total = guillermo+luis+juan;
        System.out.println("\nLa cantidad de dinero entre los 3 es: "+total);
    }
    
}
