
package entities;

public class CuentaAhorros extends Cuenta {

    private double tasaInteres;
   
    public CuentaAhorros() {
        super();
    }  

    public CuentaAhorros(String nombre, int idcuenta, double balance, double tasaInteres) {
        super(nombre,idcuenta,balance);
        this.tasaInteres = tasaInteres;   
    }  
    
    public double getTasaInteres(){
        return tasaInteres;   
    }

    public void setTasaInteres(double tasaInteres){
        this.tasaInteres = tasaInteres;
    }

    public double updateBalance(){
        balance += balance * tasaInteres;
        return balance;
    }

    @Override
    public void removeBalance(double retiro){
        balance = (balance - retiro);
    }
    
}
