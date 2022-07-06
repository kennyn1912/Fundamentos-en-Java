
package calificacionesporcortes;

import java.util.Scanner;

/**
 *
 * @author kenny
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //pedimos y guardamos los datos 
        Scanner entrada = new Scanner(System.in);
        float participacion,primerexamen,segundoexamen,examenfinal,notafinal;
        System.out.println("Digite la nota de participacion: ");
        participacion = entrada.nextFloat();
        System.out.println("Digite la nota del primer examen parcial: ");
        primerexamen = entrada.nextFloat();
        System.out.println("Digite la nota del segundo examen parcial:");
        segundoexamen = entrada.nextFloat();
         System.out.println("Digite la nota del segundo examen final:");
        examenfinal= entrada.nextFloat();
        
        //sacamos los calculos
        participacion *=0.10f;
        primerexamen *= 0.25f;
        segundoexamen *= 0.25f;
        examenfinal *= 0.40f;
        
        //sumamos las notas
        notafinal = participacion+primerexamen+segundoexamen+examenfinal;
        
        //imprimimos la nota final
        System.out.println("La nota final del estudiante es: "+notafinal);
    }
    
}
