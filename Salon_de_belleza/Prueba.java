package Salon_de_belleza;

import java.util.Calendar;
import java.util.Date;

public class Prueba {
    public static void main(String[] args) {
        System.out.println("SALON CREADO");
        Salon Beautiful = new Salon(10,10);

        System.out.println();

        Cliente cli1 = new Cliente("Coro","38294725R");
        Cliente cli2 = new Cliente("Maria","78165278W");
        Cliente cli3 = new Cliente("Felipe","89014628V");

        System.out.println("CLIENTES AÑADIDOS AL ARRAY DE CLIENTES");
        Beautiful.añadirCliente(cli1);
        Beautiful.añadirCliente(cli2);
        Beautiful.añadirCliente(cli3);

        System.out.println();

        System.out.println("MEMBRESIA PUESTA A LOS CLIENTES");
        Beautiful.setMembresiaCliente(cli1,"Oro");
        Beautiful.setMembresiaCliente(cli3,"Premium");

        System.out.println();

        System.out.println("VISITAS CREADAS Y AÑADIDAS AL ARRAY DE VISITAS");
        Date fecha1 = new Date(2023, Calendar.JANUARY,10);
        Date fecha2 = new Date(2023, Calendar.JANUARY,11);
        Date fecha3 = new Date(2023, Calendar.JANUARY,12);
        Beautiful.añadirVisita(cli1.getDNI(), fecha1);
        Beautiful.añadirVisita(cli2.getDNI(), fecha2);
        Beautiful.añadirVisita(cli3.getDNI(), fecha3);

        System.out.println();

        System.out.println("MOSTRAR EL ARRAY DE VISITAS");
        Beautiful.mostrarVisitas();
    }
}
