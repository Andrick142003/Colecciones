/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.colecciones.Ejercicio2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author and
 */
public class Ejercicio2 {

    public static void mostrarEncabezado() {
        System.out.println("=========================================");
        System.out.println(" SISTEMA DE VECTORES ");
        System.out.println("=========================================");
    }

    public static void main(String[] args) {

        //Creamos un objeto tipo Random 
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        // Definimos el vector de 20 elementos
        int[] elementos = new int[20];
        int[] elementosPosicionesImpares = new int[10];
        int numPosicion = -1;
        int mayoresV = 0;

        // Enteros aleatorios entre 0 y 21
        for (int i = 0; i < elementos.length; i++) {
            elementos[i] = rand.nextInt(30);
            // Agregamos validar de que no existan duplicados al momento de generar los numeros random
            for (int j = 0; j < i; j++) {
                if (elementos[i] == elementos[j]) {
                    i--;
                    break;
                }
            }
        }

        
        //Inicializamos las posiciones del vector impar
        int j = 0;
        //Crear segundo vector con las posiciones del indice impar 
        for (int i = 0; i < elementos.length; i++) {
            //verificamos residuos de la division para 2
            if (i % 2 != 0) {
                elementosPosicionesImpares[j] = elementos[i];
                j++;
            }

        }

        //Ingresamos el nuemro que deseamos buscar
        System.out.println("Ingrese el numero a buscar:");
        int numBuscar = scanner.nextInt();

        //Empezamos con la busqueda 
        for (int i = 0; i < elementos.length; i++) {
            System.out.println(elementos[i]);
            if (numBuscar == elementos[i]) {
                numPosicion = i;
            }
        }

        if (numPosicion != -1) {
            System.out.println("El numero " + numBuscar + " se encuentra en la posicion: " + numPosicion);
        } else {
            System.out.println("El número no se encuentra en el vector.");
        }

        //Numeros mayores que 20 del segundo vector
        for (int listImpares : elementosPosicionesImpares) {
            System.out.println("\nNumeros en posiciones impares:" + listImpares);
            if (listImpares > 20) {
                mayoresV += 1;

            }
        }
        
        //Numeros mayores que 20
        System.out.println("\nNumero de elementos mayores que 20:"+ mayoresV);

        scanner.close();
    }

}
