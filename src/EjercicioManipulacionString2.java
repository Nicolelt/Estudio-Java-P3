import java.util.Arrays;

public class EjercicioManipulacionString2 {
    public static void main(String[] args) {
        final var data = obtenerData();
        final var arrayNumeros = convertirData(data);
        final var promedioSimple = calcularPromedioSimple(arrayNumeros);
        mostrarInrmacion(arrayNumeros, promedioSimple);
  
    }
    static String obtenerData(){
        return "5,15,2,12,11";

    }
    static int[] convertirData(String data){
        final var arrayString = data.split(",");
        final var n = arrayString.length;
        final var arrayNumeros = new int[n];
        for (var i = 0; i < n; i++) {
            arrayNumeros[i] = Integer.parseInt(arrayString[i]);
        }
        return arrayNumeros;
    }
    static int calcularPromedioSimple(int[] array){
        final var n = array.length;
        var suma = 0;
        for (var elemento : array) {
            suma += elemento;
        }
        return suma / n;
    }
    static void mostrarInrmacion(int[] array, int promedioSimple){
        System.out.printf("El array es: %s%n", Arrays.toString(array));
        System.out.printf("El promedio simple es: %d%n", promedioSimple);
    }
}
