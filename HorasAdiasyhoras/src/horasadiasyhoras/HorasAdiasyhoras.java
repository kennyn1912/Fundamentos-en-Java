/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package horasadiasyhoras;

import java.util.Scanner;

/**
 *
 * @author kenny
 */
public class HorasAdiasyhoras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       int horasTotales, semanas,dias,horas;
       
        System.out.println("Digite el numeor de horas: ");
        horasTotales = entrada.nextInt();
        
        semanas = horasTotales / 168;
        dias = horasTotales%168 / 24;
        horas = horasTotales%24;
        
        System.out.println("\nElequivalente es: ");
        System.out.println("semanas: "+semanas);
        System.out.println("dias: "+dias);
        System.out.println("horas: "+horas);
        
    }
    
}
