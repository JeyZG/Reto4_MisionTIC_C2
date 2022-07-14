package Tienda;

public class Cliente {
    //ATRIBUTOS
    String nombreCompleto, documentoIdentidad, fechaCompra, numeroFactura;
    int totalAPagar;

    //CONSTRUCTOR
    public Cliente(String nombreCompleto, String documentoIdentidad, int totalAPagar, String fechaCompra, String numeroFactura) {
        this.nombreCompleto = nombreCompleto;
        this.documentoIdentidad = documentoIdentidad;
        this.totalAPagar = totalAPagar;
        this.fechaCompra = fechaCompra;
        this.numeroFactura = numeroFactura;
    }   
    
    //GETTERS Y SETTERS

    public int getTotalAPagar() {
        return totalAPagar;
    }

    public void setTotalAPagar(int totalAPagar) {
        this.totalAPagar = totalAPagar;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getDocumentoIdentidad() {
        return documentoIdentidad;
    }

    public void setDocumentoIdentidad(String documentoIdentidad) {
        this.documentoIdentidad = documentoIdentidad;
    }

    public String getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(String fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public String getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(String numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombreCompleto='" + nombreCompleto + '\'' +
                ", documentoIdentidad='" + documentoIdentidad + '\'' +
                ", fechaCompra='" + fechaCompra + '\'' +
                ", numeroFactura='" + numeroFactura + '\'' +
                ", totalAPagar=" + totalAPagar +
                '}';
    }
}