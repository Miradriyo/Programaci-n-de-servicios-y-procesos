public class vehiculos {
    private String marca;
    private String modelo;
    private int kilometraje;

    public vehiculos(string marca, string modelo, int kilometraje) {
        this.marca = marca;
        this.modelo = modelo;
        this.kilometraje = kilometraje;
    }

    public string getMarca() {
        return marca;
    }

    public void setMarca(string marca) {
        this.marca = marca;
    }

    public string getModelo() {
        return modelo;
    }

    public void setModelo(string modelo) {
        this.modelo = modelo;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

}
