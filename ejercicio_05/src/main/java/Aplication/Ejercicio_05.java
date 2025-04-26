

package Aplication;
import entities.Rectangulo;
import java.util.Locale;
import java.util.Scanner;


public class Ejercicio_05 {

    public static void main(String[] args) {
      Locale.setDefault(Locale.US);
      Scanner sc = new Scanner(System.in); 
      Rectangulo rec = new Rectangulo(); 
        
      System.out.println("Digite el ancho del rectangulo");
      rec.ancho = sc.nextDouble();  
      
      System.out.println("Digite el largo del rectangulo");
      rec.largo = sc.nextDouble();  
      
           
      double resa = rec.area();
      System.out.printf("area %.2f%n", resa);  
      
      double resperi = rec.perimetro();
      System.out.printf("perimetro %.2f%n", resperi); 
            
      
      System.out.printf("diagonal %.2f%n", rec.diagonal());
      
            
        sc.close();   
    }
}
