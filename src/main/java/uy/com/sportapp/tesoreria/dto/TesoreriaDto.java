package uy.com.sportapp.tesoreria.dto;

public class TesoreriaDto {
    private int id;
    private String nombre;
    private Double saldo;
    private TesoreroDto tesoreroDto;

    public TesoreriaDto() {
    }

    public TesoreriaDto(int id, String nombre, Double saldo, TesoreroDto tesoreroDto) {
        this.id = id;
        this.nombre = nombre;
        this.saldo = saldo;
        this.tesoreroDto = tesoreroDto;
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

    public TesoreroDto getTesoreroDto() {
        return tesoreroDto;
    }

    public void setTesoreroDto(TesoreroDto tesoreroDto) {
        this.tesoreroDto = tesoreroDto;
    }

    @Override
    public String toString() {
        return "TesoreriaDto{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", saldo=" + saldo +
                ", tesoreroDto=" + tesoreroDto +
                '}';
    }
}
