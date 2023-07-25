package uy.com.sportapp.tesoreria.model;

import uy.com.sportapp.tesoreria.dto.TesoreroDto;

public class Tesoreria {
    private int id;
    private String nombre;
    private Double saldo;
    private Tesorero tesorero;

    public Tesoreria() {
    }

    public Tesoreria(int id, String nombre, Double saldo, Tesorero tesorero) {
        this.id = id;
        this.nombre = nombre;
        this.saldo = saldo;
        this.tesorero = tesorero;
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

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Tesorero getTesorero() {
        return tesorero;
    }

    public void setTesoreroDto(Tesorero tesorero) {
        this.tesorero = tesorero;
    }

    @Override
    public String toString() {
        return "Tesoreria{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", saldo=" + saldo +
                ", tesoreroDto=" + tesorero +
                '}';
    }
}
