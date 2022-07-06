/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PatronComan;

/**
 *
 * @author kenny
 */
public class CitaMedicaEspecialista implements ICitaMedica {
EPS miEPS;
    
   public CitaMedicaEspecialista(EPS newEPS){
       
       this.miEPS = newEPS;
   }
   
   public void asignar(){
       miEPS.programar("CITA ESPECIALISTA");
   }
    
    
    
}
