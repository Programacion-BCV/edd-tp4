package com.programacion_bcd.ejercicio5;

public interface ColaPrioridadInterfaz<T extends Comparable<T>> {
    /**
     * Indica la cantidad de elementos en la estructura.
     */
    public int size();

    /**
     * Indica si la estructura está vacía o no.
     */
    public boolean isEmpty();

    /**
     * Devuelve el elemento con mínimo valor de prioridad.
     */
    public T min();

    /**
     * Inserta un elemento en la estructura.
     */
    public void insert(int prioridad, T elemento);

    /**
     * Elimina el elemento con mínimo valor de prioridad.
     */
    public void removeMin();

    /**
     * Concatena en un String el estado actual de la estructura.
     */
    public String toString();
}