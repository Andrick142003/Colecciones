/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.colecciones.Ejercicio4;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author and
 */
public class Ejercicio4 {

    static Random random = new Random();
    static Scanner scanner = new Scanner(System.in);

    public static void mostrarEncabezado() {
        System.out.println("=========================================");
        System.out.println(" SISTEMA DE OPERACIONES ");
        System.out.println("=========================================");
    }

    // Se crea matriz con números aleatorios
    public static int[][] crearMatriz(int filas, int columnas) {
        int[][] matriz = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = random.nextInt(10) + 1;
            }
        }

        return matriz;
    }

    // Mostrar matriz
    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // Sumar matrices
    public static int[][] sumar(int[][] a, int[][] b) {
        int filas = a.length;
        int columnas = a[0].length;
        int[][] resultado = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado[i][j] = a[i][j] + b[i][j];
            }
        }

        return resultado;
    }

    // Restar matrices
    public static int[][] restar(int[][] a, int[][] b) {
        int filas = a.length;
        int columnas = a[0].length;
        int[][] resultado = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado[i][j] = a[i][j] - b[i][j];
            }
        }

        return resultado;
    }

    // Multiplicar matrices
    public static int[][] multiplicar(int[][] a, int[][] b) {
        int filas = a.length;
        int columnas = b[0].length;
        int[][] resultado = new int[filas][columnas];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                for (int k = 0; k < b.length; k++) {
                    resultado[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        return resultado;
    }

    // Transponer matriz
    public static int[][] cruce(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        int[][] resultado = new int[columnas][filas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado[j][i] = matriz[i][j];
            }
        }

        return resultado;
    }

    public static void main(String[] args) {

        mostrarEncabezado();

        int opcion;

        System.out.print("Ingrese el numero de filas (M): ");
        int m = scanner.nextInt();

        System.out.print("Ingrese el numero de columnas (N): ");
        int n = scanner.nextInt();

        if (m <= 0 || n <= 0) {
            System.out.println("Las dimensiones deben ser mayores que cero.");
            return;
        }

        int[][] matrizA = crearMatriz(m, n);
        int[][] matrizB = crearMatriz(m, n);

        System.out.println("\nMATRIZ A:");
        mostrarMatriz(matrizA);

        System.out.println("\nMATRIZ B:");
        mostrarMatriz(matrizB);

        do {
            System.out.println("\n===== MENU DE OPERACIONES =====");
            System.out.println("1. Sumar matrices");
            System.out.println("2. Restar matrices");
            System.out.println("3. Multiplicar matrices");
            System.out.println("4. Transponer matriz A");
            System.out.println("5. Transponer matriz B");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opcion: ");

            opcion = scanner.nextInt();

            switch (opcion) {

                case 1:
                    System.out.println("\nRESULTADO DE LA SUMA:");
                    mostrarMatriz(sumar(matrizA, matrizB));
                    break;

                case 2:
                    System.out.println("\nRESULTADO DE LA RESTA:");
                    mostrarMatriz(restar(matrizA, matrizB));
                    break;

                case 3:
                    if (n == m) {
                        System.out.println("\nRESULTADO DE LA MULTIPLICACION:");
                        mostrarMatriz(multiplicar(matrizA, matrizB));
                    } else {
                        System.out.println(
                                "No se pueden multiplicar las matrices."
                        );
                        System.out.println(
                                "Las columnas de A deben ser iguales a las filas de B."
                        );
                    }
                    break;

                case 4:
                    System.out.println("\nTRANSPUESTA DE LA MATRIZ A:");
                    mostrarMatriz(cruce(matrizA));
                    break;

                case 5:
                    System.out.println("\nTRANSPUESTA DE LA MATRIZ B:");
                    mostrarMatriz(cruce(matrizB));
                    break;

                case 6:
                    System.out.println("\nPrograma finalizado.");
                    break;

                default:
                    System.out.println("Opcion no valida. Intente nuevamente.");
            }

        } while (opcion != 6);

        scanner.close();

    }

}
