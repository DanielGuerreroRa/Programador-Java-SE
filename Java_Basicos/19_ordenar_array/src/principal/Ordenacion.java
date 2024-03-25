package principal;

public class Ordenacion {

    public static void main(String[] args) {
        // Ordenar las edades de menor a mayor
        int[] edades = {19,26,14,55,38,27,30};
        
        // Algoritmo de ordenamiento de burbuja
        for(int i = 0; i < edades.length; i++) {
            for (int j = 0; j < edades.length - i - 1; j++) {
                if (edades[j] > edades[j + 1]) {
                    // Intercambiar elementos
                    int temp = edades[j];
                    edades[j] = edades[j + 1];
                    edades[j + 1] = temp;
                }
            }
        }
        
        // Imprimir el array ordenado
        System.out.println("Edades ordenadas de menor a mayor:");
        for (int edad : edades) {
            System.out.print(edad + " ");
        }
    }
}