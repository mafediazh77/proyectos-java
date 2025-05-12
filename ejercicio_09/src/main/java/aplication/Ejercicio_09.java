

package aplication;

import entities.Cuenta;
import entities.CuentaEmpresarial;
import entities.CuentaAhorros;


public class Ejercicio_09 {

    public static void main(String[] args) {

      Cuenta cuenta1 = new Cuenta("Lucas", 4040, 1000); 
      cuenta1.removeBalance(100);
      System.out.println(" balance: " + cuenta1.getBalance());
      
      Cuenta cuenta2 = new CuentaAhorros("Lucas", 4040, 1000, 0.01); 
      cuenta2.removeBalance(100);
      System.out.println(" balance: " + cuenta2.getBalance());
 
      Cuenta cuenta3 = new CuentaEmpresarial("Lucas", 4040, 1000, 3000); 
      cuenta3.removeBalance(100);
      System.out.println(" balance: " + cuenta3.getBalance());

    }
}
