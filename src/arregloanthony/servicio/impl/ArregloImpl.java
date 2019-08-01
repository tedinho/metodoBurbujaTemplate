/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arregloanthony.servicio.impl;

import arregloanthony.modelos.Test;
import arregloanthony.servicio.IArreglo;
import java.util.List;

/**
 *
 * @author anthony
 */
public class ArregloImpl implements IArreglo {

    @Override
    public List<Test<Object>> ordenar(List<Test<Object>> arreglo) {
        for (int x = 0; x < arreglo.size(); x++) {
            for (int i = 0; i < arreglo.size() - x - 1; i++) {
                if ((int) arreglo.get(i).getObject() > (int) arreglo.get(i + 1).getObject()) {
                    int tmp = (int) arreglo.get(i + 1).getObject();
                    arreglo.get(i + 1).setObject(arreglo.get(i).getObject());
                    arreglo.get(i).setObject(tmp);
                }
            }
        }
        return arreglo;
    }

}
