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
    
    
}
