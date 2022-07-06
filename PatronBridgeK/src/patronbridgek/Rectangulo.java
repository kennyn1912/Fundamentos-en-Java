/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patronbridgek;

/**
 *
 * @author kenny
 */
public class Rectangulo extends Figura {
    public Rectangulo(Color color){
        super(color);
    }
    
    @Override
    public void dibujar() {
        System.out.println("Dibujando rectangulo....");
        color.pintar();
    }
}
