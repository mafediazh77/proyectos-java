
package entities;


public class Cuenta {
    private String nombre;
    private int idcuenta;
    protected double balance;

    public Cuenta() {
    }  

    public Cuenta(String nombre, int idcuenta, double balance) {
        this.nombre = nombre;
        this.idcuenta = idcuenta;
        this.balance = balance;
        
    }
    
    public String getNombre(){
        return nombre;   
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }    
    public int getIdcuenta(){
        return idcuenta;   
    }
    public void setIdcuenta(int idcuenta){
        this.idcuenta = idcuenta;
    } 
    
    public double getBalance(){
        return balance;   
    }

    public void addBalance(double deposito){
        balance = balance + deposito;
    }
    
    public void removeBalance(double retiro){
        balance = (balance - retiro) - 5;
    }




    
}
