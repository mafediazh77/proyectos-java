
package app;

import entities.Empleado;
import java.util.Locale;
import java.util.Scanner;


public class Ejercicio_04 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Empleado emp = new Empleado();
        
        System.out.println("Digite el nombre del empleado ");
        emp.nombre = sc.nextLine();
        //String nombre = sc.nextLine();
        System.out.println("Digite el salario del empleado ");
        emp.salario = sc.nextDouble();
        
        
        System.out.println("Digite la tasa del empleado ");
        emp.tasa = sc.nextDouble();

        System.out.printf("nombre del empleado: ", emp.nombre);
        //System.out.printf("nombre del empleado: ", nombre);
        System.out.printf("salario %.2f%n", emp.salario);
        System.out.printf("tasa %.2f%n", emp.tasa);
        
        double res = emp.tasa();
        System.out.printf("tasa %.2f%n", res);
        
         System.out.println("Digite el porcentaje del empleado ");
        double porce = sc.nextDouble();
        double resau = emp.aumento(porce);
        System.out.printf("porcentaje %.2f%n", resau);
        
        sc.close();    
    }
}
