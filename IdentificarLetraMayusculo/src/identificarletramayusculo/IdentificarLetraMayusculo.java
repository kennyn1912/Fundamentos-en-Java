/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package identificarletramayusculo;

import javax.swing.JOptionPane;

/**
 *
 * @author kenny
 */
public class IdentificarLetraMayusculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char letra;
        
        letra = JOptionPane.showInputDialog("Diite una letra: ").charAt(0);
        
        if(Character.isUpperCase(letra)){
            JOptionPane.showMessageDialog(null,"Es una letra Mayuscula");
        }
        else{
            JOptionPane.showMessageDialog(null, "Es una letra Minuscula");
        }
    }
    
}
