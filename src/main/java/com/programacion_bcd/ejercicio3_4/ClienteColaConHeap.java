package com.programacion_bcd.ejercicio3_4;

public class ClienteColaConHeap {
    public static void main(String[] args) {
        ColaConHeap<Integer> cola = new ColaConHeap<>();
        cola.enqueue(1);

        System.out.println(cola);
    }
}
