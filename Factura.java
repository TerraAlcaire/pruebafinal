/**
 * Clase que genera facturas de clientes, con sus conceptos, importes y pagas.
 * 
 * @author Terra
 * @version 1.0
 * @since 2015-12-10
 */

public class Factura {

    /**
     * Nombre del cliente.
     */
    private String cliente;

    /**
     * Conceptos de la factura. 
     */
    private String concepto;

    /**
     * Importe de la factura
     */
    private double importe;

    /**
     * Indica si se ha pagado la factura.
     */
    private boolean pagada;

    /**
     * Creacion de la factura con el nombre del cliente, sus conceptos y el importe a pagar, tambien si lo a pagado.
     * 
     * @param cliente Nombre del cliente.
     * @param concepto Los conceptos de la factura.
     * @param importe El importe de la factura.
     */
    public Factura(String cliente, String concepto, double importe) {
        this.cliente = cliente;
        this.concepto = concepto;
        this.importe = importe;
        this.pagada = false;
    }

    /**
     * Devuelve el nombre del cliente.
     * 
     * @return Nombre del cliente.
     */
    public String getCliente() {
        return cliente;
    }

    /**
     * Devuelve los conceptos de la factura.
     * 
     * @return Conceptos e la factura.
     */
    public String getConcepto() {
        return concepto;
    }

    /**
     * Devuelve el importe de la factura.
     * 
     * @return importe de la factura.
     */
    public double getImporte() {
        return importe;
    }

    /**
     * Devuelve si se a pagado la factura o no.
     * 
     * @return factura pagada o no
     */
    public boolean estaPagada() {
        return pagada;
    }

    /**
     * Marca que esta pagada la factura.
     */
    public void marcarComoPagada() {
        this.pagada = true;
    }

    /**
     * muestra por pantalla la factura con el nombre del cliente, sus conceptos, el importe final y si esta pagada o no.
     */
    public void mostrarFactura() {
        System.out.println("Cliente: " + cliente);
        System.out.println("Concepto: " + concepto);
        System.out.println("Importe: " + importe + " €");
        System.out.println("Estado: " + (pagada ? "Pagada" : "Pendiente"));
    }
}
