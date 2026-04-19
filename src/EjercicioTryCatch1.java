import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class EjercicioTryCatch1 {
    public static void main(String[] args) {
        final var arrayAleatorio=RandomUtilities.generarRandomArrayInt(5,10,100, new Random());
        final var scanner = new Scanner(System.in);

        int indexLeido; //iterador

        do{
            mostrarArray(arrayAleatorio);
            indexLeido = ScannerManager.leerInt(scanner, "Ingrese el index deseado");
            if(indexLeido != -1){
                mostrarElemento(indexLeido, arrayAleatorio);
            }
        }while(indexLeido != -1);
        scanner.close();
    }
    static void mostrarElemento(int i, int[] array){
        try{
            final var elemento = array[i]; //lanza posible excepción
            System.out.printf("Elemento con index %s es %d%n%n", i , elemento);
        }catch (IndexOutOfBoundsException indexOutOfBoundsException){
            System.err.printf("IndexOutOfBoundsException: %s%n%n",
                    indexOutOfBoundsException.getLocalizedMessage());
        }
        System.out.println("no existe array");
    }
    static void mostrarArray(int[] array){
        System.out.printf("El array es: %s%n", Arrays.toString(array));
    }
}
