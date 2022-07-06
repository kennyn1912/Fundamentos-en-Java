/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numeroimpares;

/**
 *
 * @author kenny
 */
public class NumeroImpares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      long producto = 1;
      for(int i=1 ; i<=20 ; i+=2){
          producto *=i;
      }
        System.out.println("El producto es: "+producto);
    }
    
}
