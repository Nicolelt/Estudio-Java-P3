import java.util.Arrays;

public class EjercicioManipulaciónString {
    public static void main(String[] args) {
        final var arrayNombres = crearData();
        mostrarArray(arrayNombres);
        orderArray(arrayNombres);
        mostrarArray(arrayNombres);
    }
    
    static String[] crearData(){
        return new String[]{"Hola", "Mundo", "Java", "Programación"};
    }
    static void orderArray(String[] array){
        final var n = array.length;
        for (var i = 0; i < n; i++) {
            for (var j = 0; j < n - i - 1; j++) {
                if (array[j].compareTo(array[j + 1]) >= 0) {
                    String temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
    static void mostrarArray(String[] array){
      System.out.printf("El array es: %s%n", Arrays.toString(array));
    }
}
