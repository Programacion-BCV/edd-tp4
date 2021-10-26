package com.programacion_bcd.ejercicio5;

import ar.edu.uner.fcad.ed.edlineales.colas.ColaPorEnlaces;

import java.util.Objects;

public class NodoColaPrioridad<T> implements Comparable<NodoColaPrioridad<T>> {
    protected int prioridad;
    protected ColaPorEnlaces<T> cola;

    public NodoColaPrioridad(int prioridad,
                             ColaPorEnlaces<T> cola) {
        this.prioridad = prioridad;
        this.cola = cola;
    }

    public NodoColaPrioridad() {

    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public ColaPorEnlaces<T> getCola() {
        return cola;
    }

    public void setCola(ColaPorEnlaces<T> cola) {
        this.cola = cola;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NodoColaPrioridad<?> that = (NodoColaPrioridad<?>) o;
        return prioridad == that.prioridad;
    }

    @Override
    public int hashCode() {
        return Objects.hash(prioridad);
    }

    @Override
    public int compareTo(NodoColaPrioridad<T> o) {
        return Integer.compare(this.prioridad, o.prioridad);
    }

    @Override
    public String toString() {
        return "NodoColaPrioridad{" +
               "prioridad=" + prioridad +
               ", cola=" + cola +
               '}';
    }
}
