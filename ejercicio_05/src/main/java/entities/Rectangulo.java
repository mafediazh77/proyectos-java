
package entities;


public class Rectangulo {
    
    public double ancho;
    public double largo;
   
   
    public double area(){
        double resa = ancho * largo;
        return resa;
    }

    public double perimetro(){ 
        return (ancho *2) + (largo * 2);
    }
    
    public double diagonal(){
        double diag = Math.sqrt(ancho*ancho + largo * largo);
        return diag;
    }
    
    
    
}
