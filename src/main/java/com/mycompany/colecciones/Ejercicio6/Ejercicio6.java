/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.colecciones.Ejercicio6;

import java.util.Scanner;

/**
 *
 * @author and
 */
public class Ejercicio6 {

    public static void mostrarEncabezado() {
        System.out.println("=========================================");
        System.out.println(" SISTEMA DE OPERACIONES ");
        System.out.println("=========================================");
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        mostrarEncabezado();

        int N, M;
        
        //Ingreso del número de vendedores y años

        System.out.print("Ingrese el numero de vendedores: ");
        N = scanner.nextInt();

        System.out.print("Ingrese el numero de años: ");
        M = scanner.nextInt();

        double[][] ventas = new double[N][M];

        double[] totalVendedor = new double[N];
        double[] totalAnio = new double[M];

        double totalEmpresa = 0;

        // Ingresar las ventas de cada vendedor por año
        System.out.println("\n--- REGISTRO DE VENTAS ---");

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {

                System.out.print("Ventas del vendedor " + (i + 1)
                        + " en el año " + (j + 1) + ": ");

                ventas[i][j] = scanner.nextDouble();
            }
        }

        // Calcular los totales
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {

                totalVendedor[i] += ventas[i][j];

                totalAnio[j] += ventas[i][j];

                totalEmpresa += ventas[i][j];
            }
        }

        // Mostrar total de ventas por vendedor
        System.out.println("\n--- TOTAL DE VENTAS POR VENDEDOR ---");

        for (int i = 0; i < N; i++) {
            System.out.println("Vendedor " + (i + 1) + ": $"
                    + totalVendedor[i]);
        }

        // Mostrar total de ventas por año
        System.out.println("\n--- TOTAL DE VENTAS POR AÑO ---");

        for (int j = 0; j < M; j++) {
            System.out.println("Año " + (j + 1) + ": $"
                    + totalAnio[j]);
        }

        // Mostrar total general de la empresa
        System.out.println("\n--- TOTAL DE VENTAS DE LA EMPRESA ---");

        System.out.println("Total general: $" + totalEmpresa);

        scanner.close();

    }
}
