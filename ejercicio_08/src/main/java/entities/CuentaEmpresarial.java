
package entities;

public class CuentaEmpresarial extends Cuenta {

    private double limite;
   
    public CuentaEmpresarial(String nombre, int idcuenta, double balance, double limite) {
        super(nombre,idcuenta,balance);
        this.limite = limite;   
    }  
    
    public double getLimite(){
        return limite;   
    }

    public void setLimite(double limite){
        this.limite = limite;
    }
    
    //public void prestamo(double valor){
    //    if(valor <= limite){
    //       addBalance(valor);
    //    }
    //}

    
    public void prestamo(double valor){
        if(valor <= limite){
           balance = (balance + valor) - 50;
        }
    }    
}
