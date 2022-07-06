
package fechacorrecta;

import javax.swing.JOptionPane;

/**
 *
 * @author kenny
 */
public class FechaCorrecta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dia,mes,año;
        
        dia = Integer.parseInt(JOptionPane.showInputDialog("Digite el dia: "));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Digite el mes: "));
        año = Integer.parseInt(JOptionPane.showInputDialog("Digite el año: "));
        
        if((dia>=1) && (dia<=30)){
            if((mes>=1) && (mes<=12)){
                if(año !=0){
                    JOptionPane.showInternalConfirmDialog(null,"Fecha Correcta");
                }
            }else{
                JOptionPane.showMessageDialog(null,"Fecha Incorrecta mes Incorrecto");
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "La fehca es incorrecta");
        }
    }
    
}
