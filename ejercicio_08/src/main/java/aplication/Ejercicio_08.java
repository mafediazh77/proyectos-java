

package aplication;

import entities.Cuenta;
import entities.CuentaEmpresarial;


public class Ejercicio_08 {

    public static void main(String[] args) {

    Cuenta cuenta = new Cuenta("maria", 5555, 1000); 
    
    CuentaEmpresarial cuenta2 = new CuentaEmpresarial("maria", 3030, 500, 3000); 
    
    cuenta2.prestamo(2000);
    
        System.out.println(
                "Cuenta "+cuenta2.getIdcuenta()+ 
                ", Nombre: "+cuenta2.getNombre()+
                ", Balance: " + cuenta2.getBalance()
        );
 
    }
}
