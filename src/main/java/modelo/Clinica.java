package modelo;

import collares.Collar;
import collares.CollarMolde;
import facturas.Factura;
import facturas.ItemFactura;

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

    private void agregarFactura(Factura factura) {
        this.facturas.add(factura);
    }

    public void facturarTratamientos(String dni) {
        Factura facturaEncontrada = this.buscarFactura(dni);
        if (facturaEncontrada != null) {
            System.out.println("El total a facturar es: " + facturaEncontrada.calcularTotal());
        } else {
            System.out.println("No hay facturas para el DNI " + dni);
        }
    }

    public void agregarItemFactura(ItemFactura nuevoItem, String dni) {
        Factura facturaEncontrada = this.buscarFactura(dni);
        if (this.buscarFactura(dni) != null) {
            facturaEncontrada.agregarItemFactura(nuevoItem);
        } else {
            Factura nuevaFactura = new Factura(dni);
            nuevaFactura.agregarItemFactura(nuevoItem);
            this.facturas.add(nuevaFactura);
        }
    }

    private Factura buscarFactura(String dni) {
        Factura facturaEncontrada = null;
        int i = 0;
        while (facturaEncontrada == null && i < this.facturas.size()) {
            Factura facturaActual = facturas.get(i);
            if (facturaActual.getDniDueno().equals(dni)) {
                facturaEncontrada = facturaActual;
            }
            i++;
        }
        return facturaEncontrada;
    }

}
