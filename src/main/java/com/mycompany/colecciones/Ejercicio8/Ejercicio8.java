/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.colecciones.Ejercicio8;

import java.util.Scanner;

/**
 *
 * @author and
 */
public class Ejercicio8 {

    public static void mostrarEncabezado() {
        System.out.println("=========================================");
        System.out.println(" SISTEMA DE GRADO TRABAJADORES ");
        System.out.println("=========================================");
    }

    public static void main(String[] args) {

        // Definimos objeto que nos permite leer las entradas
        Scanner scanner = new Scanner(System.in);
        mostrarEncabezado();

        int N;

        // Ingresamos número de trabajadores para poder recorrerlos mediante el ciclo
        // for
        System.out.print("Ingrese el numero de trabajadores: ");
        N = scanner.nextInt();

        // Encerramos todo en el ciclo for para que nos permita ingresar por operario y
        // de igual forma aprovechar para la impresión de resultados
        for (int i = 1; i <= N; i++) {

            // Información por operario
            int codigo;
            int horasAusencia;
            int defectuosos;
            int producidos;
            int grado;

            System.out.println("\n--- TRABAJADOR " + i + " ---");

            System.out.print("Ingrese el codigo del trabajador: ");
            codigo = scanner.nextInt();

            System.out.print("Ingrese las horas de ausencia: ");
            horasAusencia = scanner.nextInt();

            System.out.print("Ingrese los pupitres defectuosos: ");
            defectuosos = scanner.nextInt();

            System.out.print("Ingrese los pupitres producidos: ");
            producidos = scanner.nextInt();

            // Verificar las condiciones
            boolean condicion1 = horasAusencia <= 3;
            boolean condicion2 = defectuosos < 300;
            boolean condicion3 = producidos > 10000;

            // Asignar el grado de eficiencia
            if (condicion1 && condicion2 && condicion3) {
                grado = 20;
            } else if (condicion1 && condicion2) {
                grado = 12;
            } else if (condicion1 && condicion3) {
                grado = 13;
            } else if (condicion2 && condicion3) {
                grado = 15;
            } else if (condicion1) {
                grado = 7;
            } else if (condicion2) {
                grado = 8;
            } else if (condicion3) {
                grado = 9;
            } else {
                grado = 5;
            }

            // Mostrar informacion del trabajador
            System.out.println("\n--- RESULTADO DEL TRABAJADOR ---");

            System.out.println("Codigo: " + codigo);
            System.out.println("Horas de ausencia: " + horasAusencia);
            System.out.println("Pupitres defectuosos: " + defectuosos);
            System.out.println("Pupitres producidos: " + producidos);
            System.out.println("Grado de eficiencia: " + grado);
        }

        scanner.close();
    }
}
