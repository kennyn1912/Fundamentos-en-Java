/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numerospareyimpares;

import javax.swing.JOptionPane;

/**
 *
 * @author kenny
 */
public class NumerosPareyImpares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int numero1,numero2;
       numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero 1:  "));
       numero2 =  Integer.parseInt(JOptionPane.showInputDialog("Digite el numero 2:  "));
       if(numero1%2 == 0){
           JOptionPane.showMessageDialog(null,"El numero1 es par");
       }
       else{
           JOptionPane.showMessageDialog(null, "El numero1 es impar");
       }
       if(numero2%2 == 0){
           JOptionPane.showMessageDialog(null,"El numero2 es par");
       }
       else{
           JOptionPane.showMessageDialog(null, "El numero2 es impar");
       }
    }
    
}
