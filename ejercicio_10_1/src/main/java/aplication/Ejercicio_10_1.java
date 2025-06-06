package aplication;

import entities.Employee;
import java.util.Locale;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;


public class Ejercicio_10_1 {

    public static void main(String[] args) {

        // Employee emp = new Employee(1, "Juan", 2000);
        // System.out.println(emp.getSalary());
        // emp.incraseSalary(10);
        // System.out.println(emp.getSalary());


        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = 0;
        List<Employee> listaEmp = new ArrayList<>();

        System.out.printf("Cuantos Empleados?: ");
        n = sc.nextInt();
        System.out.printf("%n");

        for (int i = 0; i < n; i++) {

          System.out.printf("Digite el ID del Empleado %d: ", i+1);

          int id = sc.nextInt();

          System.out.printf("Digite el Nombre del Empleado %d: ", i+1);
          String name = sc.next();

          System.out.printf("Digite el Salario del Empleado %d: ", i+1);
          double salary = sc.nextDouble();

          Employee emp = new Employee(id, name, salary);
          listaEmp.add(emp);

          System.out.printf("%n");
        }

        // for (Employee emp : listaEmp) {
        //     System.out.println(emp.getName());
        //     System.out.println(emp.getSalary());
        //     System.out.println(emp.getId());
        // }


        System.out.printf("Diginte el Id del empleado que va tener um aumento: ");
        int idemployee = sc.nextInt();
        Integer posicion = position(listaEmp, idemployee);
        if (posicion == null) {
            System.out.println("No existe empleado con ese id");
            System.exit(0);
        } else {
            Employee emp = listaEmp.get(posicion);
            System.out.printf("El empleado %s con el Id %d tiene un salario de %.2f%n", emp.getName(), emp.getId(), emp.getSalary());
            System.out.printf("%n");

            System.out.printf("Em que porcentaje va a aumentar el salario? ");
            double percent = sc.nextDouble();
            emp.incraseSalary(percent);
            System.out.printf("El salario del empleado %d es ahora de %.2f%n", emp.getId(), emp.getSalary());
            System.out.printf("%n");
        }

        for (Employee emp : listaEmp) {
            System.out.printf("El empleado %s con el Id %d tiene un salario de %.2f%n", emp.getName(), emp.getId(), emp.getSalary());
        }

        sc.close();
    }

    public static Integer position(List<Employee> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        return null;
    }

}

