/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ventadecarros;

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
        float salario=1000,comision=150,salariot,cantidadv,Valorventas;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite la cantidad de carros vendidos en el mes: ");
        cantidadv = entrada.nextFloat();
        
        System.out.println("Digite el valor total de las ventas de los carros:");
        Valorventas =entrada.nextFloat();
        comision = comision*cantidadv;
        Valorventas = (Valorventas*5)/100;
        salariot = comision+salario+Valorventas;
        
        System.out.println("El salario total del trabajador es: "+salariot);
    
    } 
}
