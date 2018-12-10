/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author PC
 */
public class Cuenta {
    
    
    private int numeroCuenta;
    private String titularCuenta;
    private int saldoCuenta;
    private int interesCuenta;
    
    public Cuenta(int numeroCuenta) {
        int cuenta = 0;
        numeroCuenta = cuenta;
        saldo = inicial;
    } 
    public void depositar(double cantidad) {
        double saldo = saldo + cantidad;
    } 

    public void retirar(double cantidad) {
        double saldo = saldo - cantidad;
    } 

    public double saldo() {
        double saldo;
        return saldo;
    } 
    

}
