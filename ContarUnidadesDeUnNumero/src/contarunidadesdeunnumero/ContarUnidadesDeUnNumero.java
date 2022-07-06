/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contarunidadesdeunnumero;

import javax.swing.JOptionPane;

/**
 *
 * @author kenny
 */
public class ContarUnidadesDeUnNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int numero;
    numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
if(numero == 0) numero++;
System.out.println(Math.floor(Math.log10(Math.abs(numero)) + 1));

    }
}
    

