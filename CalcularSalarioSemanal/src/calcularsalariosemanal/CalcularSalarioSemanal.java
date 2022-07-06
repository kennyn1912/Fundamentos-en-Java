/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calcularsalariosemanal;

import javax.swing.JOptionPane;

/**
 *
 * @author kenny
 */
public class CalcularSalarioSemanal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
       int horastrabajadas;
       float salariototal;
       
        horastrabajadas = Integer.parseInt(JOptionPane.showInputDialog("Cuantas horas has trabajado: "));
        
       if(horastrabajadas<=40){
           salariototal = horastrabajadas * 16;
       }
       else{
           salariototal = (40+16) + ((horastrabajadas-40)*20);
           
       }
       JOptionPane.showMessageDialog(null,"El salario total es: "+salariototal);
    }
    
}
