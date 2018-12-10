/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import clases.Cuenta;

/**
 *
 * @author PC
 */
public class Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           
        double totalCuenta;

        Cuenta Cuenta1;
        Cuenta1 = new Cuenta(24500);
        
        totalCuenta = Cuenta1.saldo();
        System.out.println("Total actual en la cuenta: " + totalCuenta + "CLP");

        int ingreso = 0;
        System.out.println("Se ingresan en la cuenta: " + ingreso + " CLP");
        Cuenta1.depositar(ingreso);
        
        System.out.println("-------------------------------------------------");

        totalCuenta = Cuenta1.saldo();
        System.out.println("Total actual en la cuenta: " + totalCuenta + "CLP");        
        
    }
    

    }
    

