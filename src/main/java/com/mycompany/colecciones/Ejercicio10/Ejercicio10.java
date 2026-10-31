/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.colecciones.Ejercicio10;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author and
 */
public class Ejercicio10 {

    public static void mostrarEncabezado() {
        System.out.println("=========================================");
        System.out.println(" SISTEMA DE RESTAURANTE ");
        System.out.println("=========================================");
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Listas para guardar los datos de cada pedido
        ArrayList<String> clientes = new ArrayList<>();
        ArrayList<String> platos = new ArrayList<>();
        ArrayList<Integer> cantidades = new ArrayList<>();
        ArrayList<Double> precios = new ArrayList<>();
        ArrayList<Double> totales = new ArrayList<>();

        int opcion;

        // Variable para guardar el ingreso total del restaurante
        double ingresoTotal = 0;

        // Variable para guardar el pedido de mayor valor
        double mayorValor = 0;
        int pedidoMayor = -1;

        do {

            // Menu principal del programa
            System.out.println("\n===== RESTAURANTE =====");
            System.out.println("1. Registrar pedido");
            System.out.println("2. Mostrar total de cada pedido");
            System.out.println("3. Calcular ingreso total");
            System.out.println("4. Mostrar pedido de mayor valor");
            System.out.println("5. Salir");

            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();

            switch (opcion) {

                case 1:

                    // Registrar pedidos en las listas
                    scanner.nextLine();

                    System.out.print("Nombre del cliente: ");
                    String cliente = scanner.nextLine();

                    System.out.print("Plato solicitado: ");
                    String plato = scanner.nextLine();

                    System.out.print("Cantidad: ");
                    int cantidad = scanner.nextInt();

                    System.out.print("Precio unitario: ");
                    double precio = scanner.nextDouble();

                    // Validar que la cantidad y el precio sean positivos
                    if (cantidad <= 0 || precio <= 0) {

                        System.out.println("La cantidad y el precio deben ser mayores a cero.");

                    } else {

                        // Guardar los datos ingresados
                        clientes.add(cliente);
                        platos.add(plato);
                        cantidades.add(cantidad);
                        precios.add(precio);

                        // Calcular el total del pedido
                        double total = cantidad * precio;

                        // Aplicar descuento del 10% si supera los 50 dolares
                        if (total > 50) {

                            double descuento = total * 0.10;

                            total = total - descuento;

                            System.out.println("Se aplico un descuento del 10%.");
                        }

                        // Guardar el total final del pedido
                        totales.add(total);

                        System.out.println("Pedido registrado correctamente.");
                        System.out.println("Total a pagar: $" + total);
                    }

                    break;

                case 2:

                    // Mostrar el total a pagar por cada pedido
                    System.out.println("\n--- TOTAL POR PEDIDO ---");

                    if (clientes.size() == 0) {

                        System.out.println("No hay pedidos registrados.");

                    } else {

                        for (int i = 0; i < clientes.size(); i++) {

                            System.out.println("\nPedido " + (i + 1));
                            System.out.println("Cliente: " + clientes.get(i));
                            System.out.println("Plato: " + platos.get(i));
                            System.out.println("Total a pagar: $" + totales.get(i));
                        }
                    }

                    break;

                case 3:

                    // Calcular el ingreso total del restaurante
                    ingresoTotal = 0;

                    for (int i = 0; i < totales.size(); i++) {

                        ingresoTotal += totales.get(i);
                    }

                    System.out.println("\nIngreso total del restaurante: $" + ingresoTotal);

                    break;

                case 4:

                    // Buscar el pedido de mayor valor
                    if (totales.size() == 0) {

                        System.out.println("No hay pedidos registrados.");

                    } else {

                        mayorValor = totales.get(0);
                        pedidoMayor = 0;

                        for (int i = 1; i < totales.size(); i++) {

                            if (totales.get(i) > mayorValor) {

                                mayorValor = totales.get(i);
                                pedidoMayor = i;
                            }
                        }

                        System.out.println("\n--- PEDIDO DE MAYOR VALOR ---");
                        System.out.println("Cliente: " + clientes.get(pedidoMayor));
                        System.out.println("Plato: " + platos.get(pedidoMayor));
                        System.out.println("Cantidad: " + cantidades.get(pedidoMayor));
                        System.out.println("Precio unitario: $" + precios.get(pedidoMayor));
                        System.out.println("Total del pedido: $" + mayorValor);
                    }

                    break;

                case 5:

                    System.out.println("Gracias por utilizar el programa.");

                    break;

                default:

                    System.out.println("Opcion no valida.");

                    break;
            }

        } while (opcion != 5);

        scanner.close();
    }

}
