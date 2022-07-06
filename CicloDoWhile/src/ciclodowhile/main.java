/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ciclodowhile;

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
        int i=1,contador;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite la cantida de numeros: ");
        contador = entrada.nextInt();
        do{
            System.out.println(i);
            i++;
        }while(i<=contador);
    }
    
}
