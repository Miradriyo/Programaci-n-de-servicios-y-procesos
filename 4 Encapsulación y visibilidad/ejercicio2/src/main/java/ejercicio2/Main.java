/*Crea una clase Password que represente una contraseña. La clase debe tener un atributo privado password de tipo
String. Implementa un método cambiarPassword(String nuevoPassword) que permita cambiar la contraseña solo si 
la nueva cumple con ciertos criterios (por ejemplo, ínimo 8 caracteres y al menos un número). 
Incluye también un método esFuerte() que determine si la contraseña tiene al menos 2 dígitos y 1
carácter especial. */
package ejercicio2;

public class Main {
    public static void main(String[] args) {
        Password password = new Password("firstPassword");
        
        // Comprobamos si la primera contraseña es fuerte
        System.out.println(password.esFuerte());
        
        // Cambiamos la contraseña
        password.cambiarPassword("Pass12#word");
        
        // Comprobamos si la nueva contraseña es fuerte
        System.out.println(password.esFuerte());
    }
}