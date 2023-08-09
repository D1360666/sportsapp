package uy.com.sportapp.tesoreria.model;

public class TesoreriaModel {
    private int id;
    private String nombre;
    private Double saldo;
    private TesoreroModel tesoreroModel;

    public TesoreriaModel() {
    }

    public TesoreriaModel(int id, String nombre, Double saldo, TesoreroModel tesoreroModel) {
        this.id = id;
        this.nombre = nombre;
        this.saldo = saldo;
        this.tesoreroModel = tesoreroModel;
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

    public TesoreroModel getTesorero() {
        return tesoreroModel;
    }

    public void setTesoreroDto(TesoreroModel tesoreroModel) {
        this.tesoreroModel = tesoreroModel;
    }

    @Override
    public String toString() {
        return "Tesoreria{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", saldo=" + saldo +
                ", tesoreroDto=" + tesoreroModel +
                '}';
    }
}
