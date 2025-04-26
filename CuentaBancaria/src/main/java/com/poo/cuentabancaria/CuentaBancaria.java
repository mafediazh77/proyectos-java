/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.poo.cuentabancaria;

import com.poo.cuentabancaria.Modelo.Persona;

/**
 *
 * @author user
 */
public class CuentaBancaria {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Persona p1 = new Persona ("Juan", 20, 156,"ABC");
        p1.saludar();
        p1.getCuenta().depositar(500000);
    }
}
