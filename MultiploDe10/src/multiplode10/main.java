/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multiplode10;

import javax.swing.JOptionPane;

/**
 *
 * @author kenny
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un Numero"));
        
        if(numero%10 == 0){
            JOptionPane.showMessageDialog(null, "EL numero "+numero+" es multiplo de 10");
        }
        else{
            JOptionPane.showMessageDialog(null,"El numero no es multiplo de 10");
        }
    }
    
}
