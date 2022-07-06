/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paresyimpares;

import javax.swing.JOptionPane;

/**
 *
 * @author kenny
 */
public class ParesyImpares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int numero;
       numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
       while(numero !=0){//mientras el numero sea distinto de 0
           if(numero %2 == 0){//el numero es par
               System.out.println("El numero"+numero+"es PAR");
           }
           else{
               System.out.println("El numero"+numero+"es IMPAR");
           }
           numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero: ")); 
       }
    }
    
}
