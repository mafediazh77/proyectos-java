
package entities;


public class Cuenta {
    private String nombre;
    private int idcuenta;
    private double balance;
    
   
    public Cuenta(String nombre, int idcuenta, double balance) {
        this.nombre = nombre;
        this.idcuenta = idcuenta;
        this.balance = balance;
        
    }

    public Cuenta(String nombre, int idcuenta) {
        this.nombre = nombre;
        this.idcuenta = idcuenta;
    }
    
    public String getNombre(){
        return nombre;   
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
   
    public int getIdicuenta(){
        return idcuenta;   
    }
    public void setIdicuenta(int idcuenta){
        this.idcuenta = idcuenta;
    } 
    
    public double getBance(){
        return balance;   
    }
    
}
