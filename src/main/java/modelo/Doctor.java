package modelo;

import criterios.Criterio;
import facturas.ItemFactura;
import tratamientos.Tratamiento;
import tratamientos.TratamientoIndividual;

public class Doctor extends Usuario{
    private Mascota mascotaAtendida;
    private Criterio criterio;
    private Clinica clinica;

    public Doctor(String telefono, String email, String dni, String nombre, String apellido, Criterio criterio) {
        super(telefono, email, dni, nombre, apellido);
        this.criterio = criterio;
    }

    public void cambiarMascotaAtendida(Mascota mascota) {
        this.mascotaAtendida = mascota;
    }

    private void modificarCriterio(Criterio criterio) {
        this.criterio = criterio;
    }

    public void atenderMascota() {
        this.criterio.atenderMascota(mascotaAtendida);
        this.colocarCollar(mascotaAtendida);
    }

    public void aplicarTratamiento(Tratamiento tratamiento, int cantidad) {
        String dniDueno = this.mascotaAtendida.getDueno().getDni();
        ItemFactura itemFactura = new ItemFactura(tratamiento, cantidad);
        this.clinica.agregarItemFactura(itemFactura, dniDueno);
    }

    private void colocarCollar(Mascota mascotaAtendida) {
        if (this.mascotaAtendida != null) {
            this.mascotaAtendida.colocarCollar(this.clinica.obtenerCollarDelDia());
        }
    }

    @Override
    public void reaccionar() {

    }
}
