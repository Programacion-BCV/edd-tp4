package com.programacion_bcd.ejercicio1;

import ar.edu.uner.fcad.ed.arbolesbinariosyheaps.ArbolBinario;
import ar.edu.uner.fcad.ed.arbolesbinariosyheaps.NodoArbolBinario;
import ar.edu.uner.fcad.ed.edlineales.ListaEnlazadaNoOrdenada;

public class ArbolBInarioExt<T> extends ArbolBinario<T> implements ArbolBinarioExtInterfaz<T> {
    @Override
    public int size() {
        return 0;
    }

    @Override
    public ListaEnlazadaNoOrdenada<NodoArbolBinario<T>> hojas() {
        return null;
    }

    @Override
    public ListaEnlazadaNoOrdenada<NodoArbolBinario<T>> internos() {
        return null;
    }

    @Override
    public int altura(NodoArbolBinario<T> nodo) {
        return 0;
    }

    @Override
    public int profundidad(NodoArbolBinario<T> nodo) {
        return 0;
    }

    @Override
    public int altura() {
        return 0;
    }

    @Override
    public int profundidad() {
        return 0;
    }
}
