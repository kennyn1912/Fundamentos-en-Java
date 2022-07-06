/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ciclowhile;

import java.util.Scanner;

/**
 *
 * @author kenny
 */
public class CicloWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i=1,contador;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite cuantos numeros quiere en pantalla: ");
        contador = entrada.nextInt();
        
        while(i<=contador){
            System.out.println(i);
            i++;
        }
    }
    
}
