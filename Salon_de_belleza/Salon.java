package Salon_de_belleza;

import java.util.Date;
import java.util.Objects;

public class Salon {
    private Cliente[] arrayClientes;
    private Visita[] arrayVisitas;
    private int maxClientes = Cliente.getMaxCliente();
    private int maxVisitas = Visita.getMaxVisita();

    Salon(int maxClientes, int maxVisitas) {
        this.arrayClientes = new Cliente[maxClientes];
        this.arrayVisitas = new Visita[maxVisitas];
    }

    Cliente getCliente(String DNI) {
        for (int i = 0; i < arrayClientes.length; i++) {
            if (Objects.equals(arrayClientes[i].getDNI(), DNI)) {
                return arrayClientes[i];
            }
        }
        return null;
    }
    void añadirCliente(Cliente usuario) {
        for (int i = 0; i < arrayClientes.length; i++) {
            if (arrayClientes[i] == null) {
                arrayClientes[i] = usuario;
                System.out.println("Cliente añadido");
            }
        }
    }
    void bajaCliente(Cliente usuario) {
        usuario.setSocio(false);
        usuario.setTipo_socio("no-socio");
        System.out.println("Cliente dado de baja");
    }
    void setMembresiaCliente(Cliente usuario, String membresia) {
        usuario.setTipo_socio(membresia);
        System.out.println("Membresia cambiada correctamente");
    }
    void añadirVisita(String DNI, Date fecha) {
        Cliente cli1 = new Cliente("",DNI);
        Visita vis1 = new Visita(cli1,fecha);
        for (int i = 0; i < arrayVisitas.length; i++) {
            if (arrayVisitas[i] == null) {
                arrayVisitas[i] = vis1;
                System.out.println("Cliente creado y visita añadida al salon.");
            }
        }
    }
    void getVisitasCliente(Cliente usuario) {
        int visCli = 0;
        for (int i = 0; i < arrayVisitas.length; i++) {
            if (Objects.equals(arrayVisitas[i].getUsuario().getDNI(), usuario.getDNI())) {
                visCli++;
            }
        }
        System.out.println("El cliente con DNI "+usuario.getDNI()+" ha visitado el salon "+visCli+" vez(ces).");
    }
    void mostrarClientes() {
        for (int i = 0; i < arrayClientes.length; i++) {
            System.out.println(arrayClientes[i].toString());
        }
    }
    void mostrarVisitas() {
        for (int i = 0; i < arrayVisitas.length; i++) {
            System.out.println(arrayVisitas[i].toString());
        }
    }

}
