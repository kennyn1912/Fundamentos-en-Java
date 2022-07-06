
package tipodevariables;

/**
 *
 * @author kenny
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
      byte entero = 12;
      short entero1 =12456;
      int entero2 = 1234567;
      long entero3 = 123456789;
      
      float decimal = 12.4f;
      double decimal1 = 12.123456;
      
      char caracter = 'a';
      
      boolean decision = true;
     
        System.out.println("Numero Entero Byte "+entero);
        System.out.println("Numero Entero short "+entero1);
        System.out.println("Numero Entero Int "+entero2);
        System.out.println("Numero Entero Long "+entero3);
        
        System.out.println("Numero Decimal Float "+decimal);
        System.out.println("Numero Decimal Double "+decimal1);
        
        System.out.println("Caracter tipo Char "+caracter);
        
        System.out.println("Variable tipo boolean tru or false: "+decision);
    }
    
}
