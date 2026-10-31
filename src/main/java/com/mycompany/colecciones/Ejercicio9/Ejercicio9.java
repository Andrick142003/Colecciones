/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.colecciones.Ejercicio9;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author and
 */
public class Ejercicio9 {
    
        public static void mostrarEncabezado() {
        System.out.println("=========================================");
        System.out.println(" SISTEMA DE FARMACIA ");
        System.out.println("=========================================");
    }

    public static void main(String[] args) {

        // Definimos objeto que permite leer lo ingresado
        Scanner scanner = new Scanner(System.in);
        mostrarEncabezado();

        // Definimos las listas de Array por cada detalle
        ArrayList<String> nombres = new ArrayList<>();
        ArrayList<Integer> stock = new ArrayList<>();
        ArrayList<Integer> stockMinimo = new ArrayList<>();
        ArrayList<Double> precios = new ArrayList<>();

        int opcion;

        // Creamos el menu de opciones mediante el ciclo do while
        do {

            System.out.println("\n===== INVENTARIO DE FARMACIA =====");
            System.out.println("1. Registrar medicamento");
            System.out.println("2. Mostrar medicamentos con stock bajo");
            System.out.println("3. Calcular valor total del inventario");
            System.out.println("4. Registrar una venta");
            System.out.println("5. Mostrar reporte general");
            System.out.println("6. Salir");

            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();

            switch (opcion) {

                // Opciones
                case 1:

                    scanner.nextLine();

                    System.out.print("Ingrese el nombre del medicamento: ");
                    String nombre = scanner.nextLine();

                    System.out.print("Ingrese el stock actual: ");
                    int cantidad = scanner.nextInt();

                    System.out.print("Ingrese el stock minimo: ");
                    int minimo = scanner.nextInt();

                    System.out.print("Ingrese el precio unitario: ");
                    double precio = scanner.nextDouble();

                    if (cantidad < 0 || minimo < 0 || precio < 0) {
                        System.out.println("Los valores no pueden ser negativos.");
                    } else {

                        // Ingreso de datos a las listas, siempre y cuando no esten vacías.
                        nombres.add(nombre);
                        stock.add(cantidad);
                        stockMinimo.add(minimo);
                        precios.add(precio);

                        System.out.println("Medicamento registrado correctamente.");
                    }

                    break;

                case 2:

                    // Consulta de stock por debajo del minimo
                    System.out.println("\n--- MEDICAMENTOS CON STOCK BAJO ---");

                    boolean encontrado = false;

                    for (int i = 0; i < nombres.size(); i++) {

                        if (stock.get(i) < stockMinimo.get(i)) {

                            System.out.println("Medicamento: " + nombres.get(i));
                            System.out.println("Stock actual: " + stock.get(i));
                            System.out.println("Stock minimo: " + stockMinimo.get(i));

                            encontrado = true;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("No hay medicamentos con stock bajo.");
                    }

                    break;

                case 3:

                    double total = 0;

                    for (int i = 0; i < nombres.size(); i++) {
                        // Calculo del total del Inventario
                        total += stock.get(i) * precios.get(i);
                    }

                    System.out.println("\nValor total del inventario: $" + total);

                    break;

                case 4:

                    // Ingreso medicamento vendido
                    scanner.nextLine();

                    System.out.print("Ingrese el nombre del medicamento vendido: ");
                    String medicamento = scanner.nextLine();

                    int posicion = -1;

                    for (int i = 0; i < nombres.size(); i++) {

                        // Comparación para el nombre del medicamento vendido
                        if (nombres.get(i).equalsIgnoreCase(medicamento)) {
                            posicion = i;
                            break;
                        }
                    }

                    if (posicion != -1) {

                        System.out.print("Ingrese la cantidad vendida: ");
                        int venta = scanner.nextInt();
                        // Ventas
                        if (venta <= 0) {
                            System.out.println("La cantidad debe ser mayor a cero.");
                        } else if (venta > stock.get(posicion)) {
                            System.out.println("No hay suficiente stock disponible.");
                        } else {

                            stock.set(posicion, stock.get(posicion) - venta);

                            System.out.println("Venta registrada correctamente.");
                            System.out.println("Stock restante: " + stock.get(posicion));
                        }

                    } else {
                        System.out.println("Medicamento no encontrado.");
                    }

                    break;

                case 5:

                    // Reporte general del inventario
                    System.out.println("\n--- REPORTE GENERAL DEL INVENTARIO ---");

                    double valorTotal = 0;

                    if (nombres.size() == 0) {
                        System.out.println("No hay medicamentos registrados.");
                    }

                    for (int i = 0; i < nombres.size(); i++) {

                        double valor = stock.get(i) * precios.get(i);

                        valorTotal += valor;

                        System.out.println("\nMedicamento: " + nombres.get(i));
                        System.out.println("Stock actual: " + stock.get(i));
                        System.out.println("Stock minimo: " + stockMinimo.get(i));
                        System.out.println("Precio unitario: $" + precios.get(i));
                        System.out.println("Valor en inventario: $" + valor);

                        if (stock.get(i) < stockMinimo.get(i)) {
                            System.out.println("Estado: Stock bajo");
                        } else {
                            System.out.println("Estado: Stock suficiente");
                        }
                    }

                    System.out.println("\nValor total del inventario: $" + valorTotal);
                    System.out.println("Total de medicamentos registrados: " + nombres.size());

                    break;

                case 6:

                    System.out.println("Saliendo del programa...");

                    break;

                default:

                    System.out.println("Opcion no valida.");

                    break;
            }

        } while (opcion != 6);

        scanner.close();
    }

}
