package com.programacion_bcd.ejercicio3_4;

import ar.edu.uner.fcad.ed.arbolesbinariosyheaps.Heap;
import ar.edu.uner.fcad.ed.edlineales.colas.Cola;

public class ColaConHeap <T extends Comparable<? super T>> implements Cola<T> {

    protected Heap<NodoColaHeap<T>> heap;
    protected NodoColaHeap<T> ultimoNodo;
    protected int capacidad;

    public ColaConHeap(){
        this.heap = new Heap();
    }

    @Override
    public boolean isEmpty() {
       return this.ultimoNodo == null;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public T getFront() {
        return null;
    }

    @Override
    public void dequeue() {

    }

    @Override
    public void enqueue(T t) {
       NodoColaHeap<T> nuevoNodo = new NodoColaHeap<>(t);
        if (isEmpty()){
            this.heap.addElement(nuevoNodo);
        } else {
            
        }


    }

    @Override
    public void makeEmpty() {

    }

    @Override
    public String toString() {
        return "ColaConHeap{" +
                "heap=" + heap +
                '}';
    }
}
