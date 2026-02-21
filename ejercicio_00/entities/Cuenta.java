package entities;

public class Cuenta {
    private String nombre;
    private int idcuenta;

    public Cuenta(String nombre, int idcuenta) {
        this.nombre = nombre;
        this.idcuenta = idcuenta;
    }
    
    public String verDados(){
        return "nombre " + nombre + "\nidcuenta " + idcuenta;
    }
    
}
