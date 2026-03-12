package entities;

public class CuentaAhorros extends Cuenta {

    public CuentaAhorros(String nombre, int idcuenta, double balance) {
        super(nombre,idcuenta,balance);
    }

    @Override
    public void removeBalance(double retiro){
        balance = (balance - retiro);
    }
}
