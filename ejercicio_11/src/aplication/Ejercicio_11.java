package aplication;

import entities.Employee;
import entities.OutsourcedEmployee;
import java.util.Locale;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;


public class Ejercicio_11 {

    public static void main(String[] args) {

        // Employee emp = new Employee("Juan", 20, 100);
        // System.out.println(emp.payment());
        //
        // OutsourcedEmployee outEmp = new OutsourcedEmployee("Juan", 20, 100, 300);
        // System.out.println(outEmp.payment());


        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = 0;
        List<Employee> listaEmp = new ArrayList<>();

        System.out.printf("Cuantos Empleados?: ");
        n = sc.nextInt();
        System.out.printf("%n");


        for (int i = 0; i < n; i++) {

            System.out.printf("Digite el Nombre del Empleado %d: ", i+1);
            String name = sc.next();

            System.out.printf("Digite numero de horas trabajadas %d: ", i+1);
            int hours = sc.nextInt();

            System.out.printf("Digite el valor por hora del Empleado %d: ", i+1);
            double valuePerHour = sc.nextDouble();

            System.out.printf("Es un Empleado tercerizado? s/n ");
            String isOutSourced = sc.next();

            if (isOutSourced.equals("s")){

                System.out.printf("Digite el valor adicional del Empleado %d: ", i+1);
                double additionalCharge = sc.nextDouble();

                OutsourcedEmployee outEmp = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
                listaEmp.add(outEmp);

            } else {
                Employee emp = new Employee(name, hours, valuePerHour);
                listaEmp.add(emp);

            }
            System.out.printf("%n");
        }


        for (Employee emp : listaEmp) {
            System.out.printf("El empleado %s tendra un salario de %.2f%n",
                emp.getName(), emp.payment());
        }

        sc.close();

    }

}

