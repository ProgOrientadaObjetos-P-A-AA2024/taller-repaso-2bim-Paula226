/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

import paquete1.Comprador;

/**
 *
 * @author Paula Lopez
 */
public class TipoCamioneta extends Comprador {
    private String marca;
    private double precioBase;
    private double precioFinal;
    private double porcentajeFijo;
    private double seguroAdicional;
    private double valorAdicional;

    public TipoCamioneta(String mar, double preBase, double porFijo,
            String nom, String ced) {
        super(nom, ced);
        marca = mar;
        precioBase = preBase;
        porcentajeFijo = porFijo;
    }

    public void establecerMarca(String n) {
        marca = n;
    }

    public void establecerPrecioBase(double n) {
        precioBase = n;
    }

    public void establecerPrecioFinal() {
        precioFinal = precioBase + porcentajeFijo + seguroAdicional;
    }

    public void establecerPorcentajeFijo(double n) {
        porcentajeFijo = n;
    }

    public void establecerSeguroAdicional() {
        seguroAdicional = valorAdicional * 1.5;
    }

    public void establecerValorAdicional() {
        valorAdicional = precioBase * (porcentajeFijo/100);
    }

    public String obtenerMarca() {
        return marca;
    }

    public double obtenerPrecioBase() {
        return precioBase;
    }

    @Override
    public double obtenerPrecioFinal() {
        return precioFinal;
    }

    public double obtenerPorcentajeFijo() {
        return porcentajeFijo;
    }

    public double obtenerSeguroAdicional() {
        return seguroAdicional;
    }

    public double obtenerValorAdicional() {
        return valorAdicional;
    }
    @Override
    public String toString() {
        String cadena = String.format( "%sTipo Camioneta:\n"
        + "Marca: %s\n"
        + "Precio Base: %.2f\n"
        + "Precio Final: %.2f\n"
        + "Porcentaje Fijo: %d\n"
        + "Seguro Adicional: %.2f\n"
        + "Valor Adicional: %.2f\n",
                super.toString(), marca,precioBase, precioFinal, 
                porcentajeFijo,seguroAdicional,valorAdicional);
        return cadena;
    }
    
}
