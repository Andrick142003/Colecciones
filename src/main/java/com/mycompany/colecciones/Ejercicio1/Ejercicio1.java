/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.colecciones.Ejercicio1;

import java.util.Scanner;

/**
 *
 * @author and
 */
public class Ejercicio1 {

    // Procedimiento: No retorna valor (void), solo ejecuta una acción visual del
    // ejercicio
    public static void mostrarEncabezado() {
        System.out.println("=========================================");
        System.out.println(" SISTEMA DE REVISION DE NOTAS ");
        System.out.println("=========================================");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalReprobadosMaterias = 0;
        // 1. Invocación del procedimiento que muestre el encabezado de nuestro programa
        mostrarEncabezado();

        // Aqui estamos definiendo el tamaño del array de estudiantes que reprobaron
        // matemáticas
        System.out.print("Ingrese el numero de estudiantes que reprobaron la asignatura de matematicas:");
        int numeroReprobadosMatematica = scanner.nextInt();
        scanner.nextLine();

        String[] identificacionMatematicas = new String[numeroReprobadosMatematica];

        // Colocamos las cedulas en las posiciones del array
        for (int i = 0; i < numeroReprobadosMatematica; i++) {
            System.out.print("Ingrese la identificacion del estudiante numero " + (i + 1) + ":");
            identificacionMatematicas[i] = scanner.nextLine();
        }

        // Entramos a definir el tamaño del array de estudiantes que reprobaron
        // Ingles
        System.out.print("Ingrese el numero de estudiantes que reprobaron la asignatura de Ingles:");
        int numeroReprobadosIngles = scanner.nextInt();
        scanner.nextLine();

        String[] identificacionIngles = new String[numeroReprobadosIngles];

        // Colocamos las cedulas en las posiciones del array
        for (int i = 0; i < numeroReprobadosIngles; i++) {
            System.out.print("Ingrese la identificacion del estudiante numero " + (i + 1) + ":");
            identificacionIngles[i] = scanner.nextLine();
        }

        // Creamos un array con un tamaño definido
        String[] estudiantesReprobados = new String[numeroReprobadosMatematica];

        // Iniciamos el proceso de comparacion de cedulas en las dos materias
        for (String cedulaMatematicas : identificacionMatematicas) {
            for (String cedulaIngles : identificacionIngles) {
                if (cedulaMatematicas.equals(cedulaIngles)) {
                    estudiantesReprobados[totalReprobadosMaterias] = cedulaMatematicas;
                    totalReprobadosMaterias++;

                }
            }
        }

        // Mostrar resultados reprobados matematicas
        System.out.println("\n=========================================");
        System.out.println("ESTUDIANTES QUE REPROBARON MATEMATICAS");
        System.out.println("=========================================");

        for (String reprobadosMate : identificacionMatematicas) {
            System.out.println(reprobadosMate);
        }

        // Mostrar resultados reprobados ingles
        System.out.println("\n=========================================");
        System.out.println("ESTUDIANTES QUE REPROBARON INGLES");
        System.out.println("=========================================");

        for (String reprobadosIngles : identificacionIngles) {
            System.out.println(reprobadosIngles);
        }

        // Mostrar resultados
        System.out.println("\n=========================================");
        System.out.println("ESTUDIANTES QUE REPROBARON AMBAS MATERIAS");
        System.out.println("=========================================");

        for (int i = 0; i < totalReprobadosMaterias; i++) {
            System.out.println(estudiantesReprobados[i]);
        }

        scanner.close();
    }

}
