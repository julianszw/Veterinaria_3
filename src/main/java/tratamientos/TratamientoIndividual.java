package tratamientos;

public class TratamientoIndividual extends Tratamiento{
    @Override
    public float calcularPrecio() {
        return super.getPrecio();
    }
}
