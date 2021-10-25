package com.programacion_bcd.ejercicio1_2;

import ar.edu.uner.fcad.ed.arbolesbinariosyheaps.ArbolBinario;
import ar.edu.uner.fcad.ed.arbolesbinariosyheaps.NodoArbolBinario;
import ar.edu.uner.fcad.ed.edlineales.ListaEnlazadaNoOrdenada;
import ar.edu.uner.fcad.ed.edlineales.colas.ColaPorEnlaces;

public class ArbolBinarioExt<T> extends ArbolBinario<T> implements ArbolBinarioExtInterfaz<T> {

    public ArbolBinarioExt() {
        super();
    }

    public ArbolBinarioExt(T raiz) {
        super();
        this.raiz = new NodoArbolBinario<T>(raiz);
    }

    @Override
    public int size() {
        int tamanio = 0;
        ColaPorEnlaces<NodoArbolBinario<T>> cola = new ColaPorEnlaces<>();
        cola.enqueue(this.raiz);
        NodoArbolBinario<T> nodoActual;
        while (!cola.isEmpty()) {
            nodoActual = cola.getFront();
            if (nodoActual.tieneHijoIzquierdo()) {
                cola.enqueue(nodoActual.getHijoIzquierdo());
            }
            if (nodoActual.tieneHijoDerecho()) {
                cola.enqueue(nodoActual.getHijoDerecho());
            }

            cola.dequeue();
            tamanio++;
        }
        return tamanio;
    }

    @Override
    public ListaEnlazadaNoOrdenada<NodoArbolBinario<T>> hojas() {
        ListaEnlazadaNoOrdenada<NodoArbolBinario<T>> retorno = new ListaEnlazadaNoOrdenada<>();

        ColaPorEnlaces<NodoArbolBinario<T>> cola = new ColaPorEnlaces<>();
        cola.enqueue(this.raiz);
        NodoArbolBinario<T> nodoActual;
        while (!cola.isEmpty()) {
            nodoActual = cola.getFront();
            if (nodoActual.tieneHijoIzquierdo()) {
                cola.enqueue(nodoActual.getHijoIzquierdo());
            }
            if (nodoActual.tieneHijoDerecho()) {
                cola.enqueue(nodoActual.getHijoDerecho());
            }
            if (this.noHijos(nodoActual)) {
                retorno.addToRear(nodoActual);
            }
            System.out.println(cola.getFront());
            cola.dequeue();
        }
        return retorno;
    }

    @Override
    public ListaEnlazadaNoOrdenada<NodoArbolBinario<T>> internos() {

        ListaEnlazadaNoOrdenada<NodoArbolBinario<T>> retorno = new ListaEnlazadaNoOrdenada<>();

        ColaPorEnlaces<NodoArbolBinario<T>> cola = new ColaPorEnlaces<>();
        cola.enqueue(this.raiz);
        NodoArbolBinario<T> nodoActual;
        while (!cola.isEmpty()) {
            nodoActual = cola.getFront();
            if (nodoActual.tieneHijoIzquierdo()) {
                cola.enqueue(nodoActual.getHijoIzquierdo());
            }
            if (nodoActual.tieneHijoDerecho()) {
                cola.enqueue(nodoActual.getHijoDerecho());
            }
            if (!this.noHijos(nodoActual) && this.padre(nodoActual) != null) {
                retorno.addToRear(nodoActual);
            }
            cola.dequeue();
        }
        return retorno;
    }

    @Override
    public int altura(NodoArbolBinario<T> nodo) {
        int alturaAux = 0;

        int padres, hijos;
        ColaPorEnlaces<NodoArbolBinario<T>> cola = new ColaPorEnlaces<>();
        cola.enqueue(nodo);
        NodoArbolBinario<T> nodoActual;
        padres = 1;
        hijos = 0;
        while (!cola.isEmpty()) {
            for (int i = 0; i < padres; i++) {
                nodoActual = cola.getFront();
                if (nodoActual.tieneHijoIzquierdo()) {
                    cola.enqueue(nodoActual.getHijoIzquierdo());
                    hijos++;
                }
                if (nodoActual.tieneHijoDerecho()) {
                    cola.enqueue(nodoActual.getHijoDerecho());
                    hijos++;
                }
                cola.dequeue();
            }
            if (hijos > 0) {
                alturaAux++;
                padres = hijos;
                hijos = 0;
            }
        }
        return alturaAux;
    }

    @Override
    public int profundidad(NodoArbolBinario<T> nodo) {
        NodoArbolBinario<T> nodoAux;
        nodoAux = this.obtenerNodo(nodo, this.raiz);
        if (nodoAux.equals(this.raiz)) {
            return 0;
        } else {
            int profundidadAux = 0;
            while (this.padre(nodoAux) != null) {
                profundidadAux++;
                nodoAux = this.padre(nodoAux);
            }
            return profundidadAux;
        }
    }

    @Override
    public int altura() {
        return altura(this.raiz);
    }

    @Override
    public int profundidad() {
        int deep = 0;
        ListaEnlazadaNoOrdenada<NodoArbolBinario<T>> hojas = this.hojas();
        while (!hojas.isEmpty()) {
            if (deep < this.profundidad(hojas.first())) {
                deep = this.profundidad(hojas.first());
            }
            System.out.println("Removido: " + hojas.removeFirst());
        }

        return deep;
    }

    public boolean noHijos(NodoArbolBinario<T> nodo) {
        return !nodo.tieneHijoIzquierdo() && !nodo.tieneHijoDerecho();
    }
}
