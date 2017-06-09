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
public class ListaDoble <T>
    {
        private int size;
        private NodoDoble<T> First, Last;
        public ListaDoble() {
            First = null;
            Last = null;
            size = 0;
        }

        public boolean Vacio() { return size == 0; }

        public void AddFirst(T data) {
            NodoDoble<T> n = new NodoDoble<T>();
            n.setData(data);
            if (Vacio()) {
                First = n;
                Last = n;
                size++;
            }
            else {
                n.setNext(First);
                First.setBack(n);
                First = n;
                size++;
            }
        }

        public void AddLast(T data) {
            NodoDoble<T> n = new NodoDoble<T>();
            n.setData(data);
            if (Vacio()) {
                First = n;
                Last = n;
                size++;
            }
            else {
                n.setBack(Last);
                Last.setNext(n);
                Last = n;
                size++;
            }
        }
        public void AddAtIndex(T data, int index) {
            if (index <=1) { AddFirst(data); }
            else if (index==size-1) { AddLast(data); }
            else {
                NodoDoble<T> n = new NodoDoble<T>();
                n.setData(data);
                NodoDoble<T> temp = First;
                for (int i = 1; i < index - 1; i++)
                {
                    temp = temp.getNext();
                }

                n.setNext(temp.getNext());
                temp.getNext().setBack(n);
                n.setBack(temp);
                temp.setNext(n);
                size++;
            }
        }
        public void DeleteFirst() {
            First= First.getNext();
            First.setBack(null);
        }

        public void DeleteLast() {
            Last = Last.getBack();
            Last.setNext(null);
        }

        public void DeleteAt(int index) {
            NodoDoble<T> n1 = First;
            for (int i = 1; i < index - 1; i++)
            {
                n1 = n1.getNext();
            }
            n1.setNext(n1.getNext().getNext());
            n1.getNext().setBack(n1);
        }



        public void PrintForwards() {
            NodoDoble<T> n = First;
            while (n != null) {
                System.out.println(n.getData());
                n = n.getNext();
            }
        }
        public void PrintBackwards()
        {
            NodoDoble<T> n = Last;
            while (n != null)
            {
                System.out.println(n.getData());
                n = n.getBack();
            }
        }
    }