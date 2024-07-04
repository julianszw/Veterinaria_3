package tratamientos;

public abstract class Tratamiento {
    private String nombre;
    private float precio;

    public Tratamiento(String nombre, float precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public abstract float calcularPrecio();

    public float getPrecio() {
        return precio;
    }
}
