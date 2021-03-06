package Algoritmos.Sorts;
import java.util.ArrayList;
import Estructuras.*;
import basicsOBJs.Item;
public class InsertionSort<E> {

	///Para arrays
	public static <E extends Comparable<E>> void insertionArray(E[] input){
		
	    E temp;
	    for (int i = 1; i < input.length; i++) {
		    temp = input[i];
		    int j = i-1;
		    while(j >= 0 && temp.compareTo(input[j])<0){
		    	input[j+1] = input[j];
		    	j--;
		    }
		    input[j+1]=temp;
	    }
	}
	
	///Para arrays List
	public static <E extends Comparable<E>> void insertionArrayList(ArrayList<E> input){
		
		 E temp;
		    for (int i = 1; i < input.size(); i++) {
			    temp = input.get(i);
			    int j = i-1;
			    while(j >= 0 && temp.compareTo(input.get(j))<0){
			    	input.set(j+1, input.get(j));
			    	j--;
			    }
			    input.set(j+1, temp);
		    }
	}
	
	
	public static <E extends Comparable<E>> void insertionDoubleLinkedList(DoubleLinkedList<E> list){
		Node<E> nodo = list.getHead();
		insertionLinked(nodo);
	}
	
	public static <E extends Comparable<E>> void insertionLinked(Node<E> nodo){
		
		E temp;
		Node<E> head;
		Node<E> puntero;
		head = nodo;
		puntero = head;
        nodo = nodo.getNext();
        
        while(nodo != null){
        	puntero = head;
        	
        	while(puntero.getNext()!= nodo){
        		if(puntero.getData().compareTo(nodo.getData())>0){
        			temp = nodo.getData();
        			nodo.setData(puntero.getData());
        			puntero.setData(temp);
        		}
        		else{
        			puntero = puntero.getNext();
        		}
        	}
        	nodo = nodo.getNext();
        }  
	}
        
        public static  void insertionDoubleLinkedList(ItemsDoubleLinkedList list){
		Node<Item> nodo = list.getHead();
		insertionLinkedForItem(nodo);
	}
	
	public static void insertionLinkedForItem(Node<Item> nodo){
		
		Item temp;
		Node<Item> head;
		Node<Item> puntero;
		head = nodo;
		puntero = head;
        nodo = nodo.getNext();
        
        while(nodo != null){
        	puntero = head;
        	
        	while(puntero.getNext()!= nodo){
        		if(puntero.getData().getNombre().compareTo(nodo.getData().getNombre())>0){
        			temp = nodo.getData();
        			nodo.setData(puntero.getData());
        			puntero.setData(temp);
        		}
        		else{
        			puntero = puntero.getNext();
        		}
        	}
        	nodo = nodo.getNext();
        }  
	}

}
