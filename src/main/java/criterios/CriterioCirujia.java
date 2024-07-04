package criterios;

public class CriterioCirujia extends Criterio{
    private static CriterioCirujia instancia;

    private CriterioCirujia() {}

    public CriterioCirujia getInstance() {
        if (instancia == null) {
            instancia = new CriterioCirujia();
        }
        return instancia;
    }

    @Override
    public void atenderMascota() {
        
    }
}
