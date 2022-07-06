/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calcularpromedio;

import javax.swing.JOptionPane;

/**
 *
 * @author kenny
 */
public class CalcularPromedio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int numero,elementos=0,suma=0;
       float media;
       
       numero= Integer.parseInt(JOptionPane.showInputDialog("Digite un numero:"));
       while(numero>=0){
           suma += numero;
           elementos++;//aumentamos 1 a elementos
                  numero= Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero:"));

       }
       if(elementos == 0){
           System.out.println("ERROR! la division entre o no existe");
       }
       else{
           media = (float) suma/elementos;
           System.out.println("El promedio es: "+media);
       }
    }
    
}
