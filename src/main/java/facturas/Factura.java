package facturas;

import java.util.ArrayList;

public class Factura {
    private ArrayList<ItemFactura> items;
    private String dniDueno;

    public Factura(String dniDueno) {
        this.dniDueno = dniDueno;
    }

    public float calcularTotal() {
        float total = 0;
        for (ItemFactura item : items) {
            total += item.calcularTotal();
        }
        return total;
    }

    public String getDniDueno() {
        return dniDueno;
    }

    public void agregarItemFactura(ItemFactura itemFactura) {
        this.items.add(itemFactura);
    }
}
