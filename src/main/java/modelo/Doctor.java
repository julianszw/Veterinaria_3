package modelo;

import criterios.Criterio;

public class Doctor extends Usuario{
    private Mascota mascotaAtendida;
    private Criterio criterio;

    public Doctor(String telefono, String email, String dni, String nombre, String apellido, Criterio criterio) {
        super(telefono, email, dni, nombre, apellido);
        this.criterio = criterio;
    }

    private void modificarCriterio(Criterio criterio) {
        this.criterio = criterio;
    }

    public void atenderMascota(Mascota mascota) {

    }

    private void colocarCollar() {

    }

    @Override
    public void reaccionar() {

    }
}
