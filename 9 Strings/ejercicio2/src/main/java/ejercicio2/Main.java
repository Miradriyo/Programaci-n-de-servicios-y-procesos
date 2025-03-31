package ejercicio2;

public class Main {
    public static void main(String[] args) {
/*Crea un programa en Java que realice las siguientes acciones:
1. Define dos variables String con valores "CadenaDePrueba" y "CADENAdePRUEBA" respectivamente.
2. Convierte ambas cadenas a minúsculas y compara si son iguales, mostrando un mensaje con el resultado de la comparación.
3. Crea un substring de la primera cadena que contenga los primeros 5 caracteres y muestra este nuevo substring por consola.
4. Reemplaza todas las letras 'a' de la segunda cadena por el carácter '@' y muestra el resultado por consola. */
public class Main {
    public static void main(String[] args) {
        String uno = "CadenaDePrueba";
        String dos = "CADENAdePRUEBA";
        
        // Convertir ambas cadenas a minúsculas y comparar
        unoMinusculas = uno.toLowerCase();
        String dosMinusculas = dos.toLowerCase();
        
        if (unoMinusculas.equals(dosMinusculas)) {
            System.out.println("Las cadenas son iguales");
        } else {
            System.out.println("Las cadenas son diferentes");
        }
        
        // Crear un substring de la primera cadena
        String tres = uno.substring(0, 5); 
        System.out.println("El substring de la primera cadena es: " + tres);
        
        // Reemplazar 'a' por '@'
        String reemplazo = dos.replace('a', '@');
        System.out.println("Cadena con reemplazo: " + reemplazo);
    }
}
    }
}