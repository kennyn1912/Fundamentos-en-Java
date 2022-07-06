/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadordemasa;

import javax.swing.JOptionPane;

/**
 *
 * @author kenny
 */
public class CalculadorDeMasa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        float libras,gramos,PesoKg;
        int opcion;
        
         opcion = Integer.parseInt(JOptionPane.showInputDialog("BIENVENIDO A SU CALCULADOR DE MASA \n"
    +"1. Mostrar peso en libras: \n"
    +"2. mostrar peso en gramos: \n"
    +"3. salir"));
    }
     switch(opcion){
          case 1: pesokg = Float.parseFloat(JOptionPane.showInputDialog("Digite su peso en Kilogramos para mostrarselo en libras"));
         libras = pesokg+1;
                 JOptionPane.showMessageDialog(null,"Su peso en libras es : " +libras);
          break; 
          case 2: 
          }
          break;
          case 3: break;
          default: JOptionPane.showMessageDialog(null,"se equivoco de opcion");
      }
        

