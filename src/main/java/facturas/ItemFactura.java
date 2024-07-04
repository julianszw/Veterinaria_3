package facturas;

import tratamientos.Tratamiento;

import java.util.ArrayList;

public class ItemFactura {
    private Tratamiento tratamiento;
    private int cantidad;

    public float calcularTotal() {
        return cantidad * tratamiento.calcularPrecio();
    }
}
