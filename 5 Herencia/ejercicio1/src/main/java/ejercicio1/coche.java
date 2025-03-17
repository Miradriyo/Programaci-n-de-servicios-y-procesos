package ejercicio1;

public class Coche extends Vehiculo {
    
    private int puertas;
    
    public Coche() {
    }

    public Coche(String marca, String modelo, int km, int puertas) {
        super(marca, modelo, km);
        this.puertas = puertas;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }
    
    @Override
    public void mostrar(){
        super.mostrar();
        System.out.println("Puertas: " + puertas);
    }

}
