/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

import java.util.ArrayList;
import paquete1.Comprador;

/**
 *
 * @author Paula Lopez
 */
public class Concesionaria {
    private String nombre;
    private ArrayList<Comprador> listadoVehiculos;
    private String nombreConcesionaria;
    private double ventasTotales;
    private double costoVehiculoMasCaro;
    private double costoVehiculoMasBarato;

     public Concesionaria(String nom) {
        nombre = nom;
        listadoVehiculos = new ArrayList<>();
        ventasTotales = 0.0;
        costoVehiculoMasCaro = 0.0;
        costoVehiculoMasBarato = 0.0;
    
    }
     public void agregarVehiculo(Comprador vehiculo) {
        listadoVehiculos.add(vehiculo);
        actualizarEstadisticas(vehiculo);
    }
     private void actualizarEstadisticas(Comprador vehiculo) {
        double precioFinal = vehiculo.obtenerPrecioFinal();
        
        ventasTotales += precioFinal;

        if (precioFinal > costoVehiculoMasCaro) {
            costoVehiculoMasCaro = precioFinal;
        }

        if (precioFinal < costoVehiculoMasBarato) {
            costoVehiculoMasBarato = precioFinal;
        }
    }

    public void establecerNombre(String c) {
        nombre = c;
    }

    public void establecerListadoVehiculos(ArrayList<Comprador> c) {
        listadoVehiculos = c;
    }

    public void establecerNombreConcesionaria(String c) {
        nombreConcesionaria = c;
    }

    public void establecerVentasTotales(double c) {
        ventasTotales = c;
    }

    public void establecerCostoVehiculoMasCaro(double c) {
        costoVehiculoMasCaro = c;
    }

    public void establecerCostoVehiculoMasBarato(double c) {
        costoVehiculoMasBarato = c;
    }
     

    public String obtenerNombre() {
        return nombre;
    }

    public ArrayList<Comprador> obtenerListadoVehiculos() {
        return listadoVehiculos;
    }

    public String obtenerNombreConcesionaria() {
        return nombreConcesionaria;
    }

    public double obtenerVentasTotales() {
        return ventasTotales;
    }

    public double obtenerCostoVehiculoMasCaro() {
        return costoVehiculoMasCaro;
    }

    public double obtenerCostoVehiculoMasBarato() {
        return costoVehiculoMasBarato;
    }



    @Override
public String toString() {
    String cadena = String.format("Concesionaria:\n"
        + "Nombre: %s\n"
        + "Ventas Totales: %.2f\n"
        + "Costo del Vehículo Más Caro: %.2f\n"
        + "Costo del Vehículo Más Barato: %.2f\n",
        nombre, ventasTotales, costoVehiculoMasCaro, costoVehiculoMasBarato);
    return cadena;
}

}

  