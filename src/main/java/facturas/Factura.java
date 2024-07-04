package facturas;

import java.util.ArrayList;

public class Factura {
    private ArrayList<ItemFactura> items;

    public float calcularTotal() {
        float total = 0;
        for (ItemFactura item : items) {
            total += item.calcularTotal();
        }
        return total;
    }
}
