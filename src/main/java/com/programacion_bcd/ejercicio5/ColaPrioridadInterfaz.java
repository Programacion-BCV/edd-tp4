/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.programacion_bcd.ejercicio5;

/**
 *
 * @author Pc-Ramiro
 */
public interface ColaPrioridadInterfaz <T extends Comparable<T>> {
/** Indica la cantidad de elementos en la estructura.*/
public int size();
/** Indica si la estructura está vacía o no. */
public boolean isEmpty();
/** Devuelve el elemento con mínimo valor de prioridad. */
public T min();
/** Inserta un elemento en la estructura. */
public void insert(int prioridad, T elemento);
/** Elimina el elemento con mínimo valor de prioridad. */
public void removeMin();
/** Concatena en un String el estado actual de la estructura. */
@Override
public String toString();
}
