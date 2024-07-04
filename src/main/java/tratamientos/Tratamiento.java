package tratamientos;

public abstract class Tratamiento {
    private String nombre;
    private float precio;

    public abstract float calcularPrecio();

    public float getPrecio() {
        return precio;
    }
}
