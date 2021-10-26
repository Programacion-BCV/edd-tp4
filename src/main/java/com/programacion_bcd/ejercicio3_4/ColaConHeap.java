package com.programacion_bcd.ejercicio3_4;

import ar.edu.uner.fcad.ed.arbolesbinariosyheaps.Heap;
import ar.edu.uner.fcad.ed.edlineales.colas.Cola;

public class ColaConHeap<T extends Comparable<? super T>> implements Cola<T> {

    protected Heap<NodoColaHeap<T>> heap;

    public ColaConHeap() {
        this.heap = new Heap();
    }

    @Override
    public boolean isEmpty() {
        return this.heap == null;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public T getFront() {
        return this.heap.findMin().valor;
    }

    @Override
    public void dequeue() {
        this.heap.removeMin();
    }

    @Override
    public void enqueue(T t) {
        NodoColaHeap<T> nuevoNodo = new NodoColaHeap<>(t);
        if (isEmpty()) {
            this.heap.addElement(nuevoNodo);
        } else {
            this.heap.addElement(nuevoNodo);
        }
    }

    @Override
    public void makeEmpty() {

    }

    @Override
    public String toString() {
        String resultado = "";
        while (!heap.isEmpty()) {
            resultado += "[ " + heap.removeMin().valor + " ] ";
        }
        return resultado;
    }
}
