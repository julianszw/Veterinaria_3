package tratamientos;

import java.util.ArrayList;

public class TratamientoCompuesto extends Tratamiento {
    private ArrayList<Tratamiento> tratamientos;

    public TratamientoCompuesto(String nombre, float precio) {
        super(nombre, precio);
        this.tratamientos = new ArrayList<>();

    }

    @Override
    public float calcularPrecio() {
        float precioTotal = 0;
        for (Tratamiento tratamiento : tratamientos) {
            precioTotal += tratamiento.calcularPrecio();
        }
        return precioTotal;
    }

    public void agregarTratamiento(Tratamiento tratamiento) {
        tratamientos.add(tratamiento);
    }

    public boolean removerTratamiento(Tratamiento tratamiento) {
        return tratamientos.remove(tratamiento);
    }
}
