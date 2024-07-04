package tratamientos;

public class TratamientoIndividual extends Tratamiento{
    public TratamientoIndividual(String nombre, float precio) {
        super(nombre, precio);
    }

    @Override
    public float calcularPrecio() {
        return super.getPrecio();
    }
}
