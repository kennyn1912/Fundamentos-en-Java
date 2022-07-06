/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package meidadenumeros;

import javax.swing.JOptionPane;

/**
 *
 * @author kenny
 */
public class Media {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero,suma_positivos=0,conteo_positivos=0,suma_negativos=0,conteo_negativos=0,conteo_ceros=0;
        float media_pos,media_neg;
        
        for(int i=1;i<=10;i++){
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero:"));
            if(numero == 0){
                conteo_ceros++;
            }
            else if(numero>0){
                suma_positivos += numero;
            
        }
            else{
                suma_negativos+=numero;
                conteo_negativos++;
            }
        }
        if(conteo_positivos == 0){
            System.out.println("No se puede sacar la media de los positivos");
        }else{
            media_pos = (float) suma_positivos/conteo_positivos;
            System.out.println("La media de los numeros positivos es: "+media_pos);
            
        }
        if(conteo_negativos==0){
            System.out.println("No se puede sacar la media de los negativos");
        }
        else{
            media_neg =(float) suma_negativos/conteo_negativos;
            System.out.println("La media de los negativos es: "+media_neg);
        }
    }
    
}
