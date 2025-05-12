

package aplication;

import entities.Cuenta;
import entities.CuentaEmpresarial;
import entities.CuentaAhorros;


public class Ejercicio_08 {

    public static void main(String[] args) {

      Cuenta cuenta = new Cuenta("Lucas", 4040, 1000); 
      
      CuentaEmpresarial ce = new CuentaEmpresarial("Maria", 3030, 500, 3000); 


      // UPCASTING - subclases atribuidas a superclases
      
      // Cuenta cuenta1 = ce;

      Cuenta cuenta2 = new CuentaEmpresarial("Pedro", 6060, 300, 2000);

      Cuenta cuenta3 = new CuentaAhorros("Juan", 7707, 300, 0.01);

      
      // DOWNCASTING

      // CuentaEmpresarial cuenta4 = cuenta2 <<PROBLEMA !!!>>
      // No puedo hacer que un tipo Cuenta sea un CuentaEmpresarial
      // No voy a poder usar la funcion prestamo - cuenta2.prestamo(100)
      // pq nos es un CuentaEmpresarial
      
      CuentaEmpresarial cuenta4 = (CuentaEmpresarial) cuenta2;
      cuenta4.prestamo(100);

      // CuentaEmpresarial cuenta5 = (CuentaAhorros) cuenta3; //ERROR
      //
      // Como Validar

      if(cuenta3 instanceof CuentaEmpresarial){
          System.out.println("Es CuentaEmpresarial");
          CuentaEmpresarial cuenta5 = (CuentaEmpresarial) cuenta3; //ERROR
          CuentaAhorros cuentaAhorros = (CuentaAhorros) cuenta;
          // cuentaAhorros.prestamo(100);
      }
 
    }
}
