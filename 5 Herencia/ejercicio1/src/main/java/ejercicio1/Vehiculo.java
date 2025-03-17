package ejercicio1;

public class Vehiculo {

    private String marca;
    private String modelo;
    private int km;
    
    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, int km) {
        this.marca = marca;
        this.modelo = modelo;
        this.km = km;
    }

    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public void mostrar(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Kilometros: " + km);
    }

}
