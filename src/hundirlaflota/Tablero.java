package hundirlaflota;

import java.util.Arrays;

/**
 * Clase Tablero: representa un tablero de juego de Hundir la Flota.
 *
 * ● Atributos - tablero: un array bidimensional de caracteres, de tamaño 10x10
 *
 * En cada posición del array puede haber uno de los siguientes caracteres: O
 * hay un barco no descubierto en esa posición. X hay un barco tocado en esa
 * posición. . posición en la que se ha disparado pero donde no hay ningún
 * barco. (espacio) posición donde no hay ningún barco y donde aún no se ha
 * disparado.
 *
 * ● Métodos - constructor: Pone todas las posiciones del array a " "
 * (espacios). - generar: crea 6 barcos que ocupan una sola casilla, en
 * posiciones aleatorias del tablero. Para colocar un barco basta con establecer
 * la posición correspondiente del array con el char 'O' - mostrar: muestra el
 * tablero de este modo:
 *
 *
 * 1 2 3 4 5 6 7 8 9 10 A O . . . B . . X . . . . C D O O . . E . . O X F G O O
 * H X I X . .
 *
 * - disparar: recibe como parámetros una fila (char) y una columna (int). Marca
 * la posición del array con el carácter correspondiente (X para tocado, un
 * punto para agua). Devuelve 0 para 'agua', 1 para 'tocado'.
 */
public class Tablero {

    static char tablero[][] = new char[10][11];

    public Tablero() {
        Arrays.fill(tablero, ' ');
    }

    public void generar() {

        for (int cont = 0; cont < 6; cont++) {
            int fila = (int) (Math.random() * 9 + 1);
            int columna = (int) (Math.random() * 9 + 1);
            tablero[fila][columna] = 'O';
        }
    }

    public static void main(String[] args) {

        mostrar();
        System.out.println("");
    }

    public static void mostrar() {
/*
        //   1  2  3  4  5  6  7  8  9 10
        tablero[0][0] = ' ';
        tablero[0][1] = 1;
        tablero[0][2] = 2;
        tablero[0][3] = 3;
        tablero[0][4] = 4;
        tablero[0][5] = 5;
        tablero[0][6] = 6;
        tablero[0][7] = 7;
        tablero[0][8] = 8;
        tablero[0][9] = 9;
        tablero[0][10] = 10;

        //letras
        tablero[1][0] = 'A';
        tablero[2][0] = 'B';
        tablero[3][0] = 'C';
        tablero[4][0] = 'D';
        tablero[5][0] = 'E';
        tablero[6][0] = 'F';
        tablero[7][0] = 'G';
        tablero[8][0] = 'H';
        tablero[9][0] = 'I';*/

        for (int i = 1; i <= tablero.length; i++) {
            System.out.print(" " + i);
        }
        System.out.println(" ");
        char letra='A';
        for (int i = 1; i <= tablero.length; i++) {
            
            System.out.println(letra);
            letra++;
        }

        for (int f = 0; f <= tablero[0].length; f++) {
            if (f == 0) {
                System.out.print("*");
            }

        }
        System.out.println("");

    }
}
