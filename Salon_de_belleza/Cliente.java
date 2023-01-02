package Salon_de_belleza;

import java.util.Objects;

public class Cliente {
    private String nombre;
    private String DNI;
    private Boolean socio;
    private String tipo_socio;

    Cliente(String nombre, String DNI, Boolean socio, String tipo_socio) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.socio = socio;
        this.tipo_socio = tipo_socio;
    }
    Cliente(String nombre, String DNI) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.socio = false;
    }

    int getDescuento() {
        if (socio) {
            if (Objects.equals(tipo_socio, "Platino")) {
                return 10;
            }
            if (Objects.equals(tipo_socio, "Oro")) {
                return 15;
            }
            if (Objects.equals(tipo_socio, "Premium")) {
                return 20;
            }
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", DNI='" + DNI + '\'' +
                ", tipo_socio='" + tipo_socio + '\'' +
                '}';
    }
}
