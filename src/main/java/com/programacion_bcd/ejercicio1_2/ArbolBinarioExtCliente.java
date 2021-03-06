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
        NodoArbolBinario<Integer> nodo7 = new NodoArbolBinario<>(7);

        arbol.agregarHijoIzquierdo(null, nodo1);

        arbol.agregarHijoIzquierdo(nodo1, nodo2);
        arbol.agregarHijoDerecho(nodo1, nodo3);
        arbol.agregarHijoDerecho(nodo2, nodo4);
        arbol.agregarHijoIzquierdo(nodo3, nodo5);
        arbol.agregarHijoDerecho(nodo3, nodo6);
        arbol.agregarHijoIzquierdo(nodo5, nodo7);

        System.out.println(
                "Cantidad de elementos en la estructura: " + arbol.size());
        System.out.println("Nodos hoja: " + arbol.hojas());
        System.out.println("Nodos internos: " + arbol.internos());
        System.out.println("La altura del nodo7 es de: " + arbol.altura(nodo7));
        System.out.println(
                "La profundidad del nodo2 es de: " + arbol.profundidad(nodo2));
        System.out.println("La altura del arbol es de: " + arbol.altura());
        System.out.println(
                "La profundidad del arbol es de: " + arbol.profundidad());

    }
}
