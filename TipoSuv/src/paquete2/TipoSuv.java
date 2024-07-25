/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete2;

import paquete1.Comprador;

/**
 *
 * @author Paula Lopez
 */
public class TipoSuv extends Comprador {

    private String marca;
    private double precioBase;
    private double precioFinal;
    private double porcentajeSeguro;
    private double seguroPersona;

    public TipoSuv(String mar1, double preBase, double porSeguro, String nom, String ced) {
        super(nom, ced);
        marca = mar1;
        precioBase = preBase;
        porcentajeSeguro = porSeguro;
    }

    public void establecerMarca(String n) {
        marca = n;
    }

    public void establecerPrecioBase(double n) {
        precioBase = n;
    }

    public void establecerPrecioFinal() {
        precioFinal = precioBase + seguroPersona;
    }
    public void establecerPorcentajeSeguro(double n) {
        porcentajeSeguro = n;
    }
    public void establecerSeguroPersona() {
       seguroPersona =  precioBase * (porcentajeSeguro / 100);
    }

    public String obtenerMarca() {
        return marca;
    }

    public double obtenerPrecioBase() {
        return precioBase;
    }

    public double obtenerPrecioFinal() {
        return precioFinal;
    }

    public double obtenerPorcentajeSeguro() {
        return porcentajeSeguro;
    }

    public double obtenerSeguroPersona() {
        return seguroPersona;
    }

     @Override
    public String toString() {
        String cadena = String.format( "%sTipo Suv:\n"
        + "Marca: %s\n"
        + "Precio Base: %.2f\n"
        + "Precio Final: %.2f\n"
        + "Porcentaje Seguro: %d\n"
        + "Seguro Persona: %.2f\n",
        super.toString(), marca, precioBase, precioFinal, porcentajeSeguro, 
        seguroPersona);
        return cadena;
    }
}
