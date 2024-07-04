package modelo;

import collares.Collar;
import collares.CollarMolde;
import facturas.Factura;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Clinica {
    private String nombre;
    private CollarMolde collarFactory;
    private ArrayList<Factura> facturas;

    private void cambiarCollarFactory(CollarMolde collarFactory) {
        this.collarFactory = collarFactory;
    }

    public Collar obtenerCollarDelDia() {
        return collarFactory.generarCollar();
    }

    public void agregarFactura(Factura factura) {
        this.facturas.add(factura);
    }

    public void facturarTratamientos(String dni) {

    }

}
