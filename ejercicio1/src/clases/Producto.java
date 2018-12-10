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
  public abstract class Producto {
  private String nombre;
  private String referencia;
  private double precioUnit;
  

    public Producto(String nombre, String referencia, double precioUnit) {
        this.nombre = nombre;
        this.referencia = referencia;
        this.precioUnit = precioUnit;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public void setPrecioUnit(double precioUnit) {
        this.precioUnit = precioUnit;
    }

    public String getNombre() {
        return nombre;
    }

    public String getReferencia() {
        return referencia;
    }

    public double getPrecioUnit() {
        return precioUnit;
    }
  }
