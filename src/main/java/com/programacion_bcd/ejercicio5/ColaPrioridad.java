package com.programacion_bcd.ejercicio5;

import ar.edu.uner.fcad.ed.edlineales.ListaEnlazadaOrdenada;

import ar.edu.uner.fcad.ed.edlineales.colas.ColaPorEnlaces;

public class ColaPrioridad<T extends Comparable<T>> implements ColaPrioridadInterfaz<T> {

    private ListaEnlazadaOrdenada<NodoColaPrioridad<T>> colaPrioridadListaEnlazadaOrdenada;

    public ColaPrioridad() {
        this.colaPrioridadListaEnlazadaOrdenada = new ListaEnlazadaOrdenada<>();
    }

    public ColaPrioridad(
            ListaEnlazadaOrdenada<NodoColaPrioridad<T>> colaPrioridadListaEnlazadaOrdenada) {
        this.colaPrioridadListaEnlazadaOrdenada = colaPrioridadListaEnlazadaOrdenada;
    }

    public ListaEnlazadaOrdenada<NodoColaPrioridad<T>> getColaPrioridadListaEnlazadaOrdenada() {
        return colaPrioridadListaEnlazadaOrdenada;
    }

    public void setColaPrioridadListaEnlazadaOrdenada(
            ListaEnlazadaOrdenada<NodoColaPrioridad<T>> colaPrioridadListaEnlazadaOrdenada) {
        this.colaPrioridadListaEnlazadaOrdenada = colaPrioridadListaEnlazadaOrdenada;
    }

    @Override
    public int size() {
        int tamanio = 0;
        for (int i = 0; i < colaPrioridadListaEnlazadaOrdenada.size(); i++) {
            ColaPorEnlaces<T> aux = new ColaPorEnlaces<>();
            while (!colaPrioridadListaEnlazadaOrdenada.get(
                    i).getCola().isEmpty()) {

                tamanio++;
                aux.enqueue(colaPrioridadListaEnlazadaOrdenada.get(
                        i).getCola().getFront());
                colaPrioridadListaEnlazadaOrdenada.get(i).getCola().dequeue();
            }
            colaPrioridadListaEnlazadaOrdenada.get(i).setCola(aux);
        }
        return tamanio;
    }

    @Override
    public boolean isEmpty() {
        return this.colaPrioridadListaEnlazadaOrdenada.isEmpty();
    }

    @Override
    public T min() {
        return this.colaPrioridadListaEnlazadaOrdenada.first().getCola().getFront();
    }

    @Override
    public void insert(int prioridad, T elemento) {
        int indice = this.colaPrioridadListaEnlazadaOrdenada.indexOf(
                new NodoColaPrioridad<>(prioridad, new ColaPorEnlaces<>()));
        if (indice != -1) {
            this.colaPrioridadListaEnlazadaOrdenada.get(
                    indice).getCola().enqueue(elemento);
        } else {
            ColaPorEnlaces<T> aux = new ColaPorEnlaces<>();
            aux.enqueue(elemento);
            this.colaPrioridadListaEnlazadaOrdenada.add(
                    new NodoColaPrioridad<>(prioridad, aux));

        }

    }

    @Override
    public void removeMin() {
        this.colaPrioridadListaEnlazadaOrdenada.first().getCola().dequeue();
        if (this.colaPrioridadListaEnlazadaOrdenada.first().getCola().isEmpty()) {
            this.colaPrioridadListaEnlazadaOrdenada.removeFirst();
        }
    }

    @Override
    public String toString() {
        String resultado = "\n";

        for (int i = 0; i < colaPrioridadListaEnlazadaOrdenada.size(); i++) {
            ColaPorEnlaces<T> aux = new ColaPorEnlaces<>();
            resultado += "Prioridad: " +
                         colaPrioridadListaEnlazadaOrdenada.get(
                                 i).getPrioridad() +
                         " -> Cola: ";

            while (!colaPrioridadListaEnlazadaOrdenada.get(
                    i).getCola().isEmpty()) {

                resultado += " [ " + colaPrioridadListaEnlazadaOrdenada.get(
                        i).getCola().getFront() + " ]";
                aux.enqueue(colaPrioridadListaEnlazadaOrdenada.get(
                        i).getCola().getFront());
                colaPrioridadListaEnlazadaOrdenada.get(i).getCola().dequeue();
            }
            resultado += "\n";
            colaPrioridadListaEnlazadaOrdenada.get(i).setCola(aux);
        }
        return resultado;
    }
}
