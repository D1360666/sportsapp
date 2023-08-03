package uy.com.sportapp.institucion.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "Jugadores")
public class JugadorModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private String apellido;
    private int ci;
    private Date fnacimiento;
    private Date vencimientoCarnet;
    private String direccion;
    private String telefono;
    private String responsable;
    private int nroCamiseta;

    public JugadorModel() {
    }

    public JugadorModel(int id, String nombre, String apellido, int ci, Date fnacimiento, Date vencimientoCarnet, String direccion, String telefono, String responsable, int nroCamiseta) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.ci = ci;
        this.fnacimiento = fnacimiento;
        this.vencimientoCarnet = vencimientoCarnet;
        this.direccion = direccion;
        this.telefono = telefono;
        this.responsable = responsable;
        this.nroCamiseta = nroCamiseta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public Date getFnacimiento() {
        return fnacimiento;
    }

    public void setFnacimiento(Date fnacimiento) {
        this.fnacimiento = fnacimiento;
    }

    public Date getVencimientoCarnet() {
        return vencimientoCarnet;
    }

    public void setVencimientoCarnet(Date vencimientoCarnet) {
        this.vencimientoCarnet = vencimientoCarnet;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public int getNroCamiseta() {
        return nroCamiseta;
    }

    public void setNroCamiseta(int nroCamiseta) {
        this.nroCamiseta = nroCamiseta;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", ci=" + ci +
                ", fnacimiento=" + fnacimiento +
                ", vencimientoCarnet=" + vencimientoCarnet +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", responsable='" + responsable + '\'' +
                ", nroCamiseta=" + nroCamiseta +
                '}';
    }
}
