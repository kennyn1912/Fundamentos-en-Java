/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package descuentocliente;

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
        float descuento,cantidadcompra;
        
        cantidadcompra = Float.parseFloat(JOptionPane.showInputDialog("Digite el valor de la compra"));
        
        if(cantidadcompra>300000){
            descuento = (float)(cantidadcompra*0.80);
            JOptionPane.showMessageDialog(null, "La cantidad a pagar es:"+descuento);
        }else{
            JOptionPane.showMessageDialog(null, "La cantidad a pagar es:"+cantidadcompra);
        }
    }
    
}
