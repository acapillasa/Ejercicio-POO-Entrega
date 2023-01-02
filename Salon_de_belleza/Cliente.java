package Salon_de_belleza;

import java.util.Objects;

public class Cliente {
    private String nombre;
    private String DNI;
    private Boolean socio;
    private String tipo_socio;
    private static int maxCliente;

    Cliente(String nombre, String DNI, Boolean socio, String tipo_socio) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.socio = socio;
        this.tipo_socio = tipo_socio;
        maxCliente++;
    }
    Cliente(String nombre, String DNI) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.socio = false;
        maxCliente++;
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

    public String getDNI() {
        return DNI;
    }

    public void setSocio(Boolean socio) {
        this.socio = socio;
    }

    public void setTipo_socio(String tipo_socio) {
        this.tipo_socio = tipo_socio;
    }

    public static int getMaxCliente() {
        return maxCliente;
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
