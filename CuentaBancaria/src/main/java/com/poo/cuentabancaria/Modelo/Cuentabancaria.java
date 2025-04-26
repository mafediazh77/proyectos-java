/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poo.cuentabancaria.Modelo;

/**
 *
 * @author user
 */
public class Cuentabancaria {
    private double saldo;
    private String numerocuenta;

    public Cuentabancaria(double saldo, String numerocuenta) {
        this.saldo = saldo;
        this.numerocuenta = numerocuenta;
    }
    public void depositar(double cantidad){
        saldo += cantidad;
        System.out.println("Se depositó " + cantidad + ". Saldo actual: " + saldo);
    }
    
}
