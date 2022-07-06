/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication47;

import javax.swing.JOptionPane;

/**
 *
 * @author kenny
 */
public class JavaApplication47 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero,aleatorio,contador=0;
   
        
        aleatorio = (int)(Math.random()*100);
        
        do{
         numero= Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
         if(aleatorio > numero){
             System.out.println("Digite un numero Mayor");
         }
         else{
             System.out.println("Digite un numero Menor");
         }
         contador++;
        }while(numero != aleatorio);
        System.out.println("\nGENIAL ADIVINASTE EL NUMERO EN: "+contador+ "INTENTOS");
        
        
    }
    }
    

