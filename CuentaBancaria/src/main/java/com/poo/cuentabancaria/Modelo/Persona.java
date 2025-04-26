/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poo.cuentabancaria.Modelo;

/**
 *
 * @author user
 */
public class Persona {
    private String nombre;
    private int edad;
    private Cuentabancaria cuenta;

    public Persona(String nombre, int edad, double saldo, String numerocuenta) {
        this.nombre = nombre;
        this.edad = edad;
        this.cuenta = new Cuentabancaria(saldo, numerocuenta);
        
    }
    
   public void saludar(){
       System.out.println("Hola" + nombre);
       System.out.println("Su edad es" + edad);
   }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public Cuentabancaria getCuenta() {
        return cuenta;
    }
   
}
