package paquete3;

import paquete2.*;

public class Principal {

    public static void main(String[] args) {
        TipoSedan sedan1 = new TipoSedan("Toyota", 20000, 10.0, "Juan Pérez", "1234567890");
        sedan1.establecerValorDescuento();
        sedan1.establecerSeguroMecanico();
        sedan1.establecerPrecioFinal();
        
        TipoSedan sedan2 = new TipoSedan("Honda", 22000, 5.0, "Ana Gómez", "0987654321");
        sedan2.establecerValorDescuento();
        sedan2.establecerSeguroMecanico();
        sedan2.establecerPrecioFinal();
        
        TipoSuv suv1 = new TipoSuv("Ford", 30000, 8, "Carlos López", "1122334455");
        suv1.establecerSeguroPersona();
        suv1.establecerPrecioFinal();
        
        TipoCamioneta camioneta1 = new TipoCamioneta("Chevrolet", 35000, 12, "Maria Garcia", "3344556677");
        camioneta1.establecerValorAdicional();
        camioneta1.establecerSeguroAdicional();
        camioneta1.establecerPrecioFinal();
        
        Concesionaria concesionaria1 = new Concesionaria("Concesionaria El AutoPro");
        concesionaria1.agregarVehiculo(sedan1);
        concesionaria1.agregarVehiculo(sedan2);
        concesionaria1.agregarVehiculo(suv1);
        concesionaria1.agregarVehiculo(camioneta1);
       
        System.out.println(concesionaria1.toString());
        System.out.println(sedan1.toString());
        System.out.println(sedan2.toString());
        System.out.println(suv1.toString());
        System.out.println(camioneta1.toString());
    }
}
