package criterios;

public class CriterioInyeccion extends Criterio{
    private static CriterioInyeccion instancia;

    private CriterioInyeccion() {}

    public CriterioInyeccion getInstance() {
        if (instancia == null) {
            instancia = new CriterioInyeccion();
        }
        return instancia;
    }

    @Override
    public void atenderMascota() {

    }
}
