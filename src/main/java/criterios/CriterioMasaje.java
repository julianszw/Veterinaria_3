package criterios;

import modelo.Mascota;

public class CriterioMasaje extends Criterio{
    private static CriterioMasaje instancia;

    private CriterioMasaje() {}

    public CriterioMasaje getInstance() {
        if (instancia == null) {
            instancia = new CriterioMasaje();
        }
        return instancia;
    }
    @Override
    public void atenderMascota(Mascota mascota) {
        
    }
}
