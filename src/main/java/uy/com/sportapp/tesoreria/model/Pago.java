package uy.com.sportapp.tesoreria.model;

import java.util.Date;

public class Pago {
    private int id;
    private Socio socio;
    private Double importe;
    private String razon;
    private Date fecha;

    public Pago() {
    }

    public Pago(int id, Socio socio, Double importe, String razon, Date fecha) {
        this.id = id;
        this.socio = socio;
        this.importe = importe;
        this.razon = razon;
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Socio getSocio() {
        return socio;
    }

    public void setSocio(Socio socio) {
        this.socio = socio;
    }

    public Double getImporte() {
        return importe;
    }

    public void setImporte(Double importe) {
        this.importe = importe;
    }

    public String getRazon() {
        return razon;
    }

    public void setRazon(String razon) {
        this.razon = razon;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Pago{" +
                "id=" + id +
                ", socio=" + socio +
                ", importe=" + importe +
                ", razon='" + razon + '\'' +
                ", fecha=" + fecha +
                '}';
    }
}
