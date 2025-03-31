public class SumaArray {

    public static int sumarNumeros(int [] array){
        int suma=0;
        for (int i=0; i<array.length; i++){
            suma+=array[i];
        }
        return suma;
    }
}
