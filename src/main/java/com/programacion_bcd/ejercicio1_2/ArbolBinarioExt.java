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
            if (nodoActual.tieneHijoDerecho()) {
                cola.enqueue(nodoActual.getHijoDerecho());
            }
            if (nodoActual.tieneHijoIzquierdo()) {
                cola.enqueue(nodoActual.getHijoIzquierdo());
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
            if (nodoActual.tieneHijoDerecho()) {
                cola.enqueue(nodoActual.getHijoDerecho());
            }
            if (nodoActual.tieneHijoIzquierdo()) {
                cola.enqueue(nodoActual.getHijoIzquierdo());
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
            if (nodoActual.tieneHijoDerecho()) {
                cola.enqueue(nodoActual.getHijoDerecho());
            }
            if (nodoActual.tieneHijoIzquierdo()) {
                cola.enqueue(nodoActual.getHijoIzquierdo());
            }
            if (this.noHijos(nodoActual) && this.padre(nodoActual) != null) {
                retorno.addToRear(nodoActual);
            }
            cola.dequeue();
        }
        return retorno;
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

    public boolean noHijos(NodoArbolBinario<T> nodo) {
        return !nodo.tieneHijoIzquierdo() && !nodo.tieneHijoDerecho();
    }

    /*  public ColaPorEnlaces<NodoArbolBinario<T>> arbolEncolado() {

          ColaPorEnlaces<NodoArbolBinario<T>> cola = new ColaPorEnlaces<>();
          cola.enqueue(this.raiz);
          NodoArbolBinario<T> copiaFront = cola.getFront();
          NodoArbolBinario<T> nodoActual;
          while (!cola.isEmpty()) {
              nodoActual = cola.getFront();
              if (nodoActual.tieneHijoDerecho()) {
                  cola.enqueue(nodoActual.getHijoDerecho());
              }
              if (nodoActual.tieneHijoIzquierdo()) {
                  cola.enqueue(nodoActual.getHijoIzquierdo());
              }
              cola.dequeue();
          }
          this.resetRaiz();
      }
  */
    public void resetRaiz(NodoArbolBinario<T> nodo) {
        this.raiz = nodo;
    }

}
