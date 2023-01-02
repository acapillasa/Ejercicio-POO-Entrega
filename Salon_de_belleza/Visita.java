package Salon_de_belleza;

import java.util.Date;

public class Visita {
    private Cliente usuario;
    private Date fecha;
    private int impTotal;

    Visita(Cliente usuario, Date fecha) {
        this.usuario = usuario;
        this.fecha = fecha;
        impTotal = 0;
    }

    void cobrar(int dinero) {
        impTotal = dinero - dinero * (usuario.getDescuento()*100);
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
