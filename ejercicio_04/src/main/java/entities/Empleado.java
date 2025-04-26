  
package entities;


public class Empleado {
    public String nombre;
    public double salario;
    public double tasa;
    
    public double tasa() {
        double res = salario - tasa;
        return res;
    }
    
    public double aumento(double porce) {
        double resau = salario - ((salario * porce) / 100);
        return resau;
    }    
}
   
