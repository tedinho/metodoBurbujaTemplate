/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arregloanthony.modelos;

/**
 *
 * @author anthony
 */
public class Test<T> {

    T obj;

    public Test(T obj) {
        this.obj = obj;
    }  // constructor 

    public T getObject() {
        return this.obj;
    }

    public void setObject(T a) {
        this.obj = a;
    }

}
