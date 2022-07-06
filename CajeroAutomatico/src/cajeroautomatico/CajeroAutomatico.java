/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cajeroautomatico;

import javax.swing.JOptionPane;

/**
 *
 * @author kenny
 */
public class CajeroAutomatico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      final int saldo_inicial = 1000;
      int opcion;
      float ingreso,saldoActual,retiro;
      opcion = Integer.parseInt(JOptionPane.showInputDialog("BIENVENIDO A SU CAJERO AUTOMATICO\n"
    +"1. Ingresar dinero a la cuenta \n"
    +"2. Retirar dinero de la cuenta\n"
    +"3. salir"));
     
      switch(opcion){
          case 1: ingreso = Float.parseFloat(JOptionPane.showInputDialog("Digite la cantidad de dinero que va guardar en su cuenta "));
          saldoActual = saldo_inicial + ingreso;
          JOptionPane.showMessageDialog(null,"Dinero en cuenta: "+saldoActual);
          break; 
          case 2: retiro = Float.parseFloat(JOptionPane.showInputDialog("Digite la cantidad que va retirar: " ));
          if(retiro>saldo_inicial){
              JOptionPane.showMessageDialog(null,"No cuenta con el saldo suficiente");
          }else{
              saldoActual = saldo_inicial-retiro;
              JOptionPane.showMessageDialog(null, "Dinero en cuenta: "+saldoActual);
              
          }
          break;
          case 3: break;
          default: JOptionPane.showMessageDialog(null,"se equivoco de opcion");
      }
    }
    
}
