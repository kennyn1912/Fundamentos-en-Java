/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package patronbridgek;

/**
 *
 * @author kenny
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Figura[] figuras = new Figura[4];
        figuras[0] = new Rectangulo(new Azul());
        figuras[1] = new Circulo(new Negro());
        figuras[2] = new Circulo(new Rojo());
        figuras[3] = new Rectangulo(new Rosa());
        for(Figura f : figuras) {
        f.dibujar();
    }
    
}
}
