package modelo;

import collares.Collar;
import estados.Estado;

import java.util.ArrayList;

public class Mascota {
    private String nombre;
    private float peso;
    private boolean estaVacunado;
    private Dueno dueno;
    private Estado estado;
    private Collar collar;
    private ArrayList<Usuario> suscriptores;

    public Mascota(String nombre, float peso, boolean estaVacunado, Dueno dueno, Estado estado, Collar collar) {
        this.nombre = nombre;
        this.peso = peso;
        this.estaVacunado = estaVacunado;
        this.dueno = dueno;
        this.estado = estado;
        this.collar = collar;
        this.suscriptores = new ArrayList<>();
    }

    public void comer() {
        Estado nuevoEstado = this.estado.comer();
        if (nuevoEstado != null) {
            this.estado = nuevoEstado;
        }
    }

    public void tomar() {
        Estado nuevoEstado = this.estado.tomar();
        if (nuevoEstado != null) {
            this.estado = nuevoEstado;
        }
    }

    public void recibirMedicacion() {
        Estado nuevoEstado = this.estado.recibirMedicina();
        if (nuevoEstado != null) {
            this.estado = nuevoEstado;
        }
    }

    public void colocarCollar(Collar collar) {
        this.collar = collar;
    }

    public boolean suscribir(Usuario usuario) {
        return this.suscriptores.add(usuario);
    }

    public boolean desuscribir(Usuario usuario) {
        return this.suscriptores.remove(usuario);
    }

    private void notificarCambioDeEstado() {
        for (Usuario suscriptor: suscriptores) {
            suscriptor.reaccionar();
        }
    }

}
