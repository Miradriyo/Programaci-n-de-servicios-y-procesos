package ejercicio2;

public class Password {

    private String password;

    public Password(String password) {
        this.password = password;
    }

    public void cambiarPassword (String nuevoPassword){
        if(nuevoPassword.length()>=8 && nuevoPassword.matches(".*\\d.*")){
            password = nuevoPassword;
            System.out.println("Contraseña cambiada");
    }
}

public String esFuerte() {
    int digitos = 0;
    int especiales = 0;
    
    for (int i = 0; i < password.length(); i++) {
        if(Character.isDigit(password.charAt(i))) {
            digitos++;
        } else if(!Character.isLetterOrDigit(password.charAt(i))) {
            especiales++;
        }
    }
    
    if(digitos >= 2 && especiales >= 1) {
        return "La contraseña es segura";
    } else {
        return "La contraseña no es segura";
    }
}
}