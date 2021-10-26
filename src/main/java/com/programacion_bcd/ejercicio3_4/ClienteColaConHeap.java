package com.programacion_bcd.ejercicio3_4;

public class ClienteColaConHeap {
    public static void main(String[] args) {
        ColaConHeap<Integer> cola = new ColaConHeap<>();
        cola.enqueue(1);
        cola.enqueue(13);
        cola.enqueue(4);
        cola.enqueue(5);
        cola.enqueue(7);
        cola.enqueue(8);

        System.out.println("------------------Cola---------------");
        System.out.println(cola);
    }
}
