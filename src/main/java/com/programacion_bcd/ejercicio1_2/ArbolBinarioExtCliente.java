package com.programacion_bcd.ejercicio1_2;

import ar.edu.uner.fcad.ed.arbolesbinariosyheaps.NodoArbolBinario;

public class ArbolBinarioExtCliente {
    public static void main(String[] args) {
        ArbolBinarioExt<Integer> arbol = new ArbolBinarioExt<>();

        NodoArbolBinario<Integer> nodo1 = new NodoArbolBinario<>(1);
        NodoArbolBinario<Integer> nodo2 = new NodoArbolBinario<>(2);
        NodoArbolBinario<Integer> nodo3 = new NodoArbolBinario<>(3);
        NodoArbolBinario<Integer> nodo4 = new NodoArbolBinario<>(4);
        NodoArbolBinario<Integer> nodo5 = new NodoArbolBinario<>(5);
        NodoArbolBinario<Integer> nodo6 = new NodoArbolBinario<>(6);

        arbol.agregarHijoIzquierdo(null, nodo1);

        arbol.agregarHijoIzquierdo(nodo1, nodo2);
        arbol.agregarHijoDerecho(nodo1, nodo3);
        arbol.agregarHijoIzquierdo(nodo3, nodo4);
        arbol.agregarHijoDerecho(nodo3, nodo5);
        arbol.agregarHijoIzquierdo(nodo5, nodo6);
        System.out.println(arbol.hojas());

    }

}
