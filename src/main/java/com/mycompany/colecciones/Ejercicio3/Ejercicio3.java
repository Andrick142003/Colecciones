/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.colecciones.Ejercicio3;

import java.util.Scanner;

/**
 *
 * @author and
 */
public class Ejercicio3 {

    public static void mostrarEncabezado() {
        System.out.println("=========================================");
        System.out.println(" SISTEMA DE REVISION DE EMPLEADOS ");
        System.out.println("=========================================");
    }

    public static void main(String[] args) {
        // Definimos el objeto Scanner que nos permitira leer las entradas por teclado
        Scanner scanner = new Scanner(System.in);
        String codigoEstudiante;
        mostrarEncabezado();

        // Indicamos el numero de empleados que deseamos registrar
        System.out.println("Ingrese el numero de empleados que desea registrar");
        int numeroRegistros = scanner.nextInt();
        scanner.nextLine();
        
        //Creamos los array que tendrán los listados
        String[] codigoEmpleados = new String[numeroRegistros];
        String[] nombreEmpleados = new String[numeroRegistros];

        
        //Iniciamos el ciclo de registro
        for (int i = 0; i < numeroRegistros; i++) {
            System.out.println("Ingrese el código del empleado " + (i + 1) + ":");
            codigoEmpleados[i] = scanner.nextLine();

            System.out.println("Ingrese los nombres del empleado " + (i + 1) + ":");
            nombreEmpleados[i] = scanner.nextLine();
        }

        System.out.println("Ingrese el codigo del estudiante");
        codigoEstudiante = scanner.nextLine();

        //Buscamos el empleado segun la posición y traemos su nombre donde encuentre la coincidencia
        for (int i = 0; i < numeroRegistros; i++) {
            if (codigoEmpleados[i].equalsIgnoreCase(codigoEstudiante)) {
                System.out.println("El nombre del empleado es: " + nombreEmpleados[i]);
            }
        }

    }

}
