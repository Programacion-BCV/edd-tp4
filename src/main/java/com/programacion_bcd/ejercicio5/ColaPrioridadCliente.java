package com.programacion_bcd.ejercicio5;

public class ColaPrioridadCliente {
    public static void main(String[] args) {
        ColaPrioridad<Integer> colaPrioridad = new ColaPrioridad<>();

        colaPrioridad.insert(8, 2);
        colaPrioridad.insert(6, 2);
        colaPrioridad.insert(8, 3);
        colaPrioridad.insert(2, 6);
        colaPrioridad.insert(4, 123);
        colaPrioridad.insert(10, 34);
        colaPrioridad.insert(0, 2);
        colaPrioridad.insert(0, 0);
        colaPrioridad.insert(0, 4);
        colaPrioridad.insert(0, 80);
        colaPrioridad.insert(1, 4);

        System.out.println("La cantidad de nodos en la cola es de : " +
                           colaPrioridad.size());

        System.out.println("La cola " + (colaPrioridad.isEmpty() ? "esta vacia"
                                                                 : "no esta vacia"));

        System.out.println("El elemento de con la minima prioridad es " +
                           colaPrioridad.min());

        colaPrioridad.removeMin();
        System.out.println("Elemento de menor prioridad eliminado");
        System.out.println(colaPrioridad);

    }
}
