/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

/**
 *
 * @author Gabriel
 */
public class NodoDoble<T> {
    
     private NodoDoble<T> Next, Back;
        private T Data;

        public NodoDoble() {
            this.Next = null;
            this.Back = null;
        }

        public void setData(T value) { Data = value; }
        public void setBack(NodoDoble<T> b) { this.Back = b; }
        public void setNext(NodoDoble<T> n) { this.Next = n; }
        public T getData() { return this.Data; }
        public NodoDoble<T> getBack() { return this.Back; }
        public NodoDoble<T> getNext() { return this.Next; }
    
}
