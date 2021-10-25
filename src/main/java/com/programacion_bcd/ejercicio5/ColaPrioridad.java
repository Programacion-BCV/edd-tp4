package com.programacion_bcd.ejercicio5;

import ar.edu.uner.fcad.ed.edlineales.ListaEnlazadaOrdenada;

public class ColaPrioridad<T> extends ListaEnlazadaOrdenada implements ColaPrioridadInterfaz  {

    protected int prioridad;
    
    
    /** Devuelve el elemento con mínimo valor de prioridad. */
    @Override
    public Comparable min() {
        
        
        return null;
    }
/** Inserta un elemento en la estructura. */
    @Override
    public void insert(int prioridad, Comparable elemento) {
        
    }
/** Elimina el elemento con mínimo valor de prioridad. */
    @Override
    public void removeMin() {
        this.removeLast();
            System.out.println(this);
    }

    // se soluciona usando ListaEnlazaOrdenada, ColaPorEnlaze y un nodo para cada prioridad para obtener una cola por cada uno.
}
