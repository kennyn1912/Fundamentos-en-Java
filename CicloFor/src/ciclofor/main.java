/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ciclofor;

import java.util.Scanner;

/**
 *
 * @author kenny
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        int contador;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite la cantidad de numero: ");
        contador = entrada.nextInt();
       for(int i=1; i<=contador ;i++){
           System.out.println(i);
       }
    }
    
}
