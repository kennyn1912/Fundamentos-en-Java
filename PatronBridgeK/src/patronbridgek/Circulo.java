/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patronbridgek;

/**
 *
 * @author kenny
 */
public class Circulo extends Figura {
    public Circulo(Color color){
       super(color);
    }
    
    /**
     *
     */
    @Override
    public void dibujar(){
        System.out.println("Dibujando CIRCULO....");
        color.pintar();
    
}
}
