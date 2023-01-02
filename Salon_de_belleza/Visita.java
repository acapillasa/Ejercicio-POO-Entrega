package Salon_de_belleza;

import java.util.Date;

public class Visita {
    private Cliente usuario;
    private Date fecha;
    private double impTotal;
    private static int maxVisita;

    Visita(Cliente usuario, Date fecha) {
        this.usuario = usuario;
        this.fecha = fecha;
        impTotal = 0;
        maxVisita++;
    }

    void cobrar(int dinero) {
        impTotal = dinero - dinero * ((double)usuario.getDescuento()/100);
    }

    public Cliente getUsuario() {
        return usuario;
    }

    public static int getMaxVisita() {
        return maxVisita;
    }

    @Override
    public String toString() {
        return "Visita{" +
                "usuario=" + usuario +
                ", fecha=" + fecha +
                ", impTotal=" + impTotal +
                '}';
    }
}
