/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arregloanthony.servicio;

import arregloanthony.modelos.Test;
import java.util.List;

/**
 *
 * @author anthony
 */
public interface IArreglo {

    List<Test<Object>> ordenar(List<Test<Object>> sets);

}
