/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PatronComan;

/**
 *
 * @author kenny
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Asignador miAsignador = new Asignador();
       EPS miEPS = new EPS();
      ICitaMedica miCitaMedicaGeneral = new CitaMedicaGeneral(miEPS);
      ICitaMedica miCitaMedicaEspecialista = new CitaMedicaEspecialista(miEPS);
      ICitaMedica miCitaMedicaUrgencia = new CitaMedicaUrgencia(miEPS);
      
      miAsignador.agregarCita(miCitaMedicaGeneral);
      miAsignador.agregarCita(miCitaMedicaEspecialista);
      miAsignador.agregarCita(miCitaMedicaUrgencia);
      
      miAsignador.mostrarCita(0).asignar();
      miAsignador.mostrarCita(1).asignar();
      miAsignador.mostrarCita(2).asignar();
    }
    }
    

