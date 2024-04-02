package principal;

public class Panel_5_Premios {
    public static void main(String[] args) {
        //Definir el tamaño del panel
        final int FILAS = 7;
        final int COLUMNAS = 7;
        int[][] panel = new int[FILAS][COLUMNAS]; //Crear una matriz para representar el panel
        int fila, columna;
        int premios = 0;

        //Generar 5 premios aleatorios distribuidos en el panel
        do {
            //Generar coordenadas aleatorias dentro del rango de filas y columnas
            fila = (int) (Math.random() * (FILAS - 1));
            columna = (int) (Math.random() * (COLUMNAS - 1));
            //Si la casilla no está ocupada, colocar un premio en ella
            if (panel[fila][columna] != 1) {
                panel[fila][columna] = 1;
                premios++;
            }
        } while (premios < 5); // Repetir hasta colocar 5 premios en el panel
        //Mostrar el panel con los premios
        mostrarPanel(panel);
    }

    //Método para mostrar el panel en consola
    static void mostrarPanel(int[][] panel) {
        for (int i = 0; i < panel.length; i++) {
            for (int j = 0; j < panel[i].length; j++) {
                System.out.print(panel[i][j] + "|"); //Mostrar el contenido de cada casilla
            }
            System.out.println(); //Salto de línea para separar las filas
        }
    }
}