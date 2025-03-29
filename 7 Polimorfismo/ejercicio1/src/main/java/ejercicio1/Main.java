package ejercicio1;

public class Main {
    public static void main(String[] args) {
        Animal perro= new Perro();
        Animal gato= new Gato();
        perro.hacerSonido();
        gato.hacerSonido();
        Animal vaca= new Vaca();
        System.out.println("La vaca hace "); 
        vaca.hacerSonido();
    }
}