/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package entradaysalidadatos;

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
      //VARIABLES
        String cadena;
       int entero;
       char letra;
       double decimal;
       float decimalito;
       
       //PEDIMOS LOS DATOS
       cadena = JOptionPane.showInputDialog("Digite una cadena");
       entero = Integer.parseInt(JOptionPane.showInputDialog("Digite un entero"));
       letra = JOptionPane.showInputDialog("Digite un Carcater").charAt(0);
       decimal = Double.parseDouble(JOptionPane.showInputDialog("Digite un decimal: "));
       decimalito = Float.parseFloat(JOptionPane.showInputDialog("Digite un decimalito: "));
       
       
      //IMPRIMIMOS LOS DATOS 
       JOptionPane.showMessageDialog(null,"La cadena es: "+cadena);
       JOptionPane.showMessageDialog(null,"El entero es: "+entero);
       JOptionPane.showMessageDialog(null,"La letra es: "+letra);
       JOptionPane.showMessageDialog(null,"El decimal es: "+decimal);
       JOptionPane.showMessageDialog(null,"El decimalito es: "+decimalito);
       
    }
    
}
