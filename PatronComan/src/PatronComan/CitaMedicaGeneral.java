
package PatronComan;

/**
 *
 * @author kenny
 */
public class CitaMedicaGeneral implements ICitaMedica {
    EPS miEPS;
    
   public  CitaMedicaGeneral(EPS newEPS){
       
       this.miEPS = newEPS;
   }
   
   public void asignar(){
       miEPS.programar("CITA GENERAL");
   }
    
    
    
}
