public class Automovil {

    private int id;
    private String marca;
    private String modelo;
    private int year;
    private int kilometraje;
    private String estado;

    public Automovil(int id, String marca, String modelo, int kilometraje, int year, String estado) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.kilometraje = kilometraje;
        this.year = year;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public String getMarca() {
        return marca;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public String getModelo() {
        return modelo;
    }

    public int getYear() {
        return year;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
