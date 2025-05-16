

package aplication;

import entities.Cuenta;
import entities.CuentaEmpresarial;
import entities.CuentaAhorros;


public class Ejercicio_09 {

    public static void main(String[] args) {

        
      Cuenta cuenta = new Cuenta("Lucas", 4040, 1000); 
      
      CuentaEmpresarial ce = new CuentaEmpresarial("Maria", 3030, 500, 3000);

      
      CuentaAhorros ca = new CuentaAhorros("Maria", 3030, 500, 0.02);
      ca.getTasaInteres();


      // UPCASTING - subclases atribuidas a superclases
      
      // Cuenta cuenta1 = ce;

      //Cuenta cuenta2 = new CuentaEmpresarial("Pedro", 6060, 300, 2000);


      //Cuenta cuenta3 = new CuentaAhorros("Juan", 7707, 300, 0.01);
      //cuenta3.removeBalance(200);
      //System.out.println(" balance: " + cuenta3.getBalance());

      
      // DOWNCASTING

      // CuentaEmpresarial cuenta4 = cuenta2 <<PROBLEMA !!!>>
      // No puedo hacer que un tipo Cuenta sea un CuentaEmpresarial
      // No voy a poder usar la funcion prestamo - cuenta2.prestamo(100)
      // pq nos es un CuentaEmpresarial
      
      //Cuenta cuenta2 = new CuentaEmpresarial("Pedro", 6060, 300, 2000);
      //CuentaEmpresarial cuenta4 = (CuentaEmpresarial) cuenta2;
      //cuenta4.removeBalance(100);
      //System.out.println(" balance: " + cuenta4.getBalance());

      // CuentaEmpresarial cuenta5 = (CuentaAhorros) cuenta3; //ERROR
         
        
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
