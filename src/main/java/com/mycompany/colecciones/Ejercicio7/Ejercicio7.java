/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.colecciones.Ejercicio7;

import java.util.Scanner;

/**
 *
 * @author and
 */
public class Ejercicio7 {

    public static void mostrarEncabezado() {
        System.out.println("=========================================");
        System.out.println(" SISTEMA DE UNIVERSIDAD ");
        System.out.println("=========================================");
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        mostrarEncabezado();

        int N;
        int materias = 8;

        System.out.print("Ingrese el numero de estudiantes: ");
        N = scanner.nextInt();

        double[][] notas = new double[N][materias];

        double[] promedioEstudiante = new double[N];
        double[] promedioMateria = new double[materias];

        int[] aprobados = new int[materias];
        int[] reprobados = new int[materias];

        double mayorPromedio = 0;
        int mejorEstudiante = 0;

        // Ingresar las calificaciones
        System.out.println("\n--- INGRESO DE CALIFICACIONES ---");

        for (int i = 0; i < N; i++) {

            System.out.println("\nEstudiante " + (i + 1));

            for (int j = 0; j < materias; j++) {

                System.out.print("Nota de la materia " + (j + 1) + ": ");
                notas[i][j] = scanner.nextDouble();
            }
        }

        // Calcular promedios y contar aprobados y reprobados
        for (int i = 0; i < N; i++) {

            double sumaEstudiante = 0;

            for (int j = 0; j < materias; j++) {

                sumaEstudiante += notas[i][j];

                promedioMateria[j] += notas[i][j];

                if (notas[i][j] >= 7 && notas[i][j] <= 10) {
                    aprobados[j]++;
                } else if (notas[i][j] < 7) {
                    reprobados[j]++;
                }
            }

            promedioEstudiante[i] = sumaEstudiante / materias;

            // Buscar el estudiante con mayor promedio
            if (i == 0 || promedioEstudiante[i] > mayorPromedio) {

                mayorPromedio = promedioEstudiante[i];
                mejorEstudiante = i + 1;
            }
        }

        // Calcular promedio de cada materia
        for (int j = 0; j < materias; j++) {
            promedioMateria[j] = promedioMateria[j] / N;
        }

        // Mostrar promedio de cada estudiante
        System.out.println("\n--- PROMEDIO POR ESTUDIANTE ---");

        for (int i = 0; i < N; i++) {

            System.out.println("Estudiante " + (i + 1) + ": "
                    + promedioEstudiante[i]);
        }

        // Mostrar promedio de cada materia
        System.out.println("\n--- PROMEDIO POR MATERIA ---");

        for (int j = 0; j < materias; j++) {

            System.out.println("Materia " + (j + 1) + ": "
                    + promedioMateria[j]);
        }

        // Mostrar estudiante con mayor promedio
        System.out.println("\n--- MEJOR ESTUDIANTE ---");

        System.out.println("Estudiante: " + mejorEstudiante);
        System.out.println("Mayor promedio: " + mayorPromedio);

        // Mostrar aprobados y reprobados por materia
        System.out.println("\n--- APROBADOS Y REPROBADOS ---");

        for (int j = 0; j < materias; j++) {

            System.out.println("\nMateria " + (j + 1));
            System.out.println("Aprobados: " + aprobados[j]);
            System.out.println("Reprobados: " + reprobados[j]);
        }

        scanner.close();
    }
}
