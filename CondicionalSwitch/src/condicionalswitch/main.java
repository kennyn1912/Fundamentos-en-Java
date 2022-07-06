
package condicionalswitch;

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
     int dato;
     
     dato = Integer.parseInt(JOptionPane.showInputDialog("Digite un Numero entero entre 1 y 5:"));
     
     switch(dato){
         case 1: JOptionPane.showMessageDialog(null,"Digitaste el numero uno");
         break;
         case 2: JOptionPane.showMessageDialog(null,"Digitaste el numero dos");
         break;
         case 3: JOptionPane.showMessageDialog(null,"Digitaste el numero tres");
         break;
         case 4: JOptionPane.showMessageDialog(null,"Digitaste el numero cuatro");
         break;
         case 5: JOptionPane.showMessageDialog(null,"Digitaste el numero cinco");
         break;
         default: JOptionPane.showMessageDialog(null,"El numero no esta en el rango de 1 a 5");
         break;
    }
    }
}
    

