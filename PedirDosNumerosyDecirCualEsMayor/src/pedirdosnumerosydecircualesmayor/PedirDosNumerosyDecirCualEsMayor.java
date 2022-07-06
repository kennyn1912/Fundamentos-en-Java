/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pedirdosnumerosydecircualesmayor;

import javax.swing.JOptionPane;

/**
 *
 * @author kenny
 */
public class PedirDosNumerosyDecirCualEsMayor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero1,numero2;
        
         numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite El primer numero"));
          numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite El segundo numero"));
          
          if(numero1>numero2){
              JOptionPane.showInternalMessageDialog(null, "El numero 1 es mayor");
          }
          else{
        JOptionPane.showMessageDialog(null, "El numero 2 es mayor");
    }
    
}
}
