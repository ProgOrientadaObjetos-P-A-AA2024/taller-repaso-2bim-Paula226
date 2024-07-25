/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import cliente.Comprador;

/**
 *
 * @author Paula Lopez
 */
public class TipoSedan extends Comprador {
    private String marca;
    private double precioBase;
    private double precioFinal;
    private double porcentajeDescuento;
    private double valorDescuento;
    private double seguroMecanico;

    public TipoSedan(String mar, double preBase, double porDescuento,
            String nom, String ced) {
        super(nom, ced);
        marca = mar;
        precioBase = preBase;
        porcentajeDescuento = porDescuento;
    }

    public void establecerMarca(String n) {
        marca = n;
    }

    public void establecerPrecioBase(double n) {
        precioBase = n;
    }

    public void establecerPrecioFinal() {
        precioFinal = precioBase - valorDescuento + seguroMecanico;
    }

    public void establecerPorcentajeDescuento(double n) {
        porcentajeDescuento = n;
    }

    public void establecerValorDescuento(double valorDescuento) {
        valorDescuento = precioBase * (porcentajeDescuento/100);
    }

    public void establecerSeguroMecanico(double seguroMecanico) {
        seguroMecanico = precioBase * 0.01;
    }
<<<<<<< HEAD

    public String obtenerMarca() {
        return marca;
    }

    public double obtenerPrecioBase() {
        return precioBase;
    }

    public double obtenerPrecioFinal() {
        return precioFinal;
    }

    public double obtenerPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public double obtenerValorDescuento() {
        return valorDescuento;
    }

    public double obtenerSeguroMecanico() {
        return seguroMecanico;
    }
    @Override
    public String toString() {
        String cadena = String.format( "%sTipo Sedan:\n"
        + "Marca: %s\n"
        + "Precio Base: %.2f\n"
        + "Precio Final: %.2f\n"
        + "Porcentaje Descuento: %d\n"
        + "Valor del Descuento: %.2f\n"
        + "Seguro Mecanico: %.2f\n",
    super.toString(), marca,precioBase, precioFinal, 
    porcentajeDescuento, valorDescuento, seguroMecanico);
        return cadena;
    }
=======
    
    
>>>>>>> d9a6cab919b87b084b4d9987c4aa266fa9ec0e2f
}
