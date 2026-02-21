package app;

import entities.Cuenta;
import entities.CuentaAhorros;
import entities.CuentaEmpresarial;

public class Ejercicio_00 {
    public static void main(String[] args) {

      Cuenta persona1 = new Cuenta("Lucas", 4040); 
      System.out.println(persona1.verDados());

      System.out.println();

      Cuenta persona2 = new Cuenta("Mario", 1110, 50000); 
      System.out.println(persona2.verDados());

      System.out.println();

      persona1.addBalance(100000);
      System.out.println("Lucas "+persona1.getBalance());

      persona2.removeBalance(20000);
      System.out.println("Mario "+persona2.getBalance());



      System.out.println();

      CuentaAhorros persona3 = new CuentaAhorros("Pablo", 5577, 100000);
      System.out.println(persona3.verDados());

      persona3.removeBalance(60000);
      System.out.println("Pablo "+persona3.getBalance());


      System.out.println();

      CuentaEmpresarial persona4 = new CuentaEmpresarial("Jose", 1466, 5000, 200000);
      System.out.println(persona4.verDados());
      System.out.println("Jose limite "+persona4.getLimite());
      persona4.setLimite(300000);
      System.out.println("Jose limite "+persona4.getLimite());
      persona4.prestamo(250000);
      System.out.println("Jose Balance "+persona4.getBalance());

    }
}
