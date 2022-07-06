
package condicionalif;

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
        int numero,dato = 5;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        if(numero == dato)//si fueramos a mirar que es distinto de 5 colocariamos !=
        {
            JOptionPane.showMessageDialog(null, "El numero es 5");
        }
        else{
            JOptionPane.showMessageDialog(null,"El numero es dieferente de 5");
        }

    }
    
}
