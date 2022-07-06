/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PatronComan;

import java.util.ArrayList;
/**
 *
 * @author kenny
 */
public class Asignador {
    
    private ArrayList<ICitaMedica> ListaCitasMedicas = new ArrayList<ICitaMedica>();
    
    public Asignador(){
        
        
    }
    public void agregarCita(ICitaMedica newCitaMedica){
        
        this.ListaCitasMedicas.add(newCitaMedica);
    }
    
    public ICitaMedica mostrarCita(int posicion){
return this.ListaCitasMedicas.get(posicion);
    }
    
}
