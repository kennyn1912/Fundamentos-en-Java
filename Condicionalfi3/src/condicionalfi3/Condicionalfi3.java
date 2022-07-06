/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package condicionalfi3;

import javax.swing.JOptionPane;

/**
 *
 * @author kenny
 */
public class Condicionalfi3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int numero,dato = 5;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
       
        if(numero != dato)//si fueramos a mirar que es distinto de 5 colocariamos !=
        {
            JOptionPane.showMessageDialog(null, "El numero es diferente de 5");
        }
        else{
            JOptionPane.showMessageDialog(null,"El numero es  5");
        }

    }
    
}
    
    

