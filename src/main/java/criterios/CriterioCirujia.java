package criterios;

import modelo.Mascota;

public class CriterioCirujia extends Criterio{
    private static CriterioCirujia instancia;

    private CriterioCirujia() {}

    public static CriterioCirujia getInstance() {
        if (instancia == null) {
            instancia = new CriterioCirujia();
        }
        return instancia;
    }

    @Override
    public void atenderMascota(Mascota mascota) {
        
    }
}
