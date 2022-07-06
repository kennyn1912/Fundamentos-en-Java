/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alumnos.ciclos;

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
    int edad,sumaEdad=0,conteoMayor18=0,contadorMayor175=0;
    float altura,SumaAltura=0,mediaEdad,mediaAltura;
    
    for(int i=1;i<=5;i++){
        edad = Integer.parseInt(JOptionPane.showInputDialog("Alumno"+i+"\nDigite su edad: "));
        altura = Float.parseFloat(JOptionPane.showInputDialog("Alumno "+i+"\nDigite su altura"));
        
        sumaEdad += edad;
        SumaAltura += altura;
        if(edad > 18){
            conteoMayor18++;
        }
        if(altura < 1.75){
        contadorMayor175++;
    }
    }
    mediaEdad=(float) sumaEdad/5;
    mediaAltura =(float) SumaAltura/5;
    
        System.out.println("La edad promedio es : "+mediaEdad);
        System.out.println("La estatura promedio es: "+mediaAltura);
        System.out.println("cantidad de alumnos mayores a 18 años: "+conteoMayor18);
        System.out.println("Cantidad de alumnos que miden mas de 1.75"+contadorMayor175);
    }
    
}
