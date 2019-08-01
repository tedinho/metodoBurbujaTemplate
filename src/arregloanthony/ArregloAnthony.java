/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arregloanthony;

import arregloanthony.modelos.Test;
import arregloanthony.servicio.impl.ArregloImpl;
import arregloanthony.servicio.IArreglo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author anthony
 */
public class ArregloAnthony {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IArreglo service= new ArregloImpl();
        List<Test<Object>> sets = new ArrayList<>();
        sets.add(new Test<>(2));
        sets.add(new Test<>(3));
        sets.add(new Test<>(1));
        sets.add(new Test<>(10));
        sets.add(new Test<>(4));
        service.ordenar(sets);
        System.out.println("Integers");
        for (Test<Object> set : sets) {
            System.out.println(set.getObject());
        }
    }
    
}
