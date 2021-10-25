
package com.programacion_bcd.ejercicio5;

import ar.edu.uner.fcad.ed.edlineales.ListaEnlazadaOrdenada;


public class ColaPrioridadCliente  {
     public static void main(String[] args) {

ColaPrioridad<Integer> lista = new ColaPrioridad();
            lista.add(5);
            lista.add(4);
            lista.add(3);
            lista.add(2);
            lista.add(1);
            lista.add(6);
            lista.add(6);
            System.out.println("Lista completa: " + lista);
            lista.removeMin();
            System.out.println("removeMin");
            System.out.println(lista);
            
            System.out.println(lista.size());

            
    }
}
