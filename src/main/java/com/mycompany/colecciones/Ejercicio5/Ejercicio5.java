/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.colecciones.Ejercicio5;

import java.util.Scanner;

/**
 *
 * @author and
 */
public class Ejercicio5 {

    public static void mostrarEncabezado() {
        System.out.println("=========================================");
        System.out.println(" SISTEMA DE SUCURSALES ");
        System.out.println("=========================================");
    }

    public static void main(String[] args) {

        // Definimos objeto para capturar las entradas
        Scanner scanner = new Scanner(System.in);
        
        mostrarEncabezado();

        int N, M;

        // Ingresamos la cabtidad de artículos y de sucursales
        System.out.print("Ingrese la cantidad de articulos: ");
        N = scanner.nextInt();

        System.out.print("Ingrese la cantidad de sucursales: ");
        M = scanner.nextInt();

        // Creamos los Arrays para precios, cantidades, totalArticulo, totalSucursal
        double[][] precios = new double[N][M];
        int[][] cantidades = new int[N][M];

        double[] totalArticulo = new double[N];
        double[] totalSucursal = new double[M];

        // Ingresar los precios de los articulos
        System.out.println("\n--- INGRESO DE PRECIOS ---");

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {

                System.out.print("Precio del articulo " + (i + 1)
                        + " en la sucursal " + (j + 1) + ": ");

                precios[i][j] = scanner.nextDouble();
            }
        }

        // Ingresar las cantidades vendidas
        System.out.println("\n--- CANTIDADES VENDIDAS ---");

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {

                System.out.print("Cantidad del articulo " + (i + 1)
                        + " vendida en la sucursal " + (j + 1) + ": ");

                cantidades[i][j] = scanner.nextInt();
            }
        }

        // Calcular las ventas por articulo y por sucursal
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {

                double venta = precios[i][j] * cantidades[i][j];

                totalArticulo[i] += venta;
                totalSucursal[j] += venta;
            }
        }

        // Mostrar el total vendido por articulo
        System.out.println("\n--- TOTAL DE VENTAS POR ARTICULO ---");

        for (int i = 0; i < N; i++) {
            System.out.println("Articulo " + (i + 1) + ": $"
                    + totalArticulo[i]);
        }

        // Mostrar el total vendido por sucursal
        System.out.println("\n--- TOTAL DE VENTAS POR SUCURSAL ---");

        for (int j = 0; j < M; j++) {
            System.out.println("Sucursal " + (j + 1) + ": $"
                    + totalSucursal[j]);
        }

        scanner.close();

    }
}
