package Estructuras;


public class DoubleLinkedList<T> 
{
    private Node<T> head;
    private int size;
    /////////////////////////////////////////////////////////
    public void doubleLinkedList(){
        this.head = null;
        this.size = 0;
    }
    public Node<T> getHead() 
    {
        return this.head;
    }
    
    public void addFirst( T data )
    {
        if (this.head == null){
            Node<T> nuevo = new Node<T>( data );
            this.head = nuevo;
            this.size++;
        }
        else {
            Node<T> current = new Node<T>( data );
            current.setNext(head);
            head.setPrevious(current);
            head = current;
            this.size++;
        }    }
    
    public void addLast( T data )
    {
        Node<T> ultimo = new Node<T>( data );
        this.size++;
        Node<T> current = this.head;
        if (head == null)
            head = ultimo;
        else
        {
            while (current.getNext() != null)
                current = current.getNext();
            current.setNext( ultimo );
            ultimo.setPrevious(current);
        }
    }
    
    public void addAt( T data, int pos ){
        Node<T> nuevo = new Node<T>(data);
        Node<T> current = head;
        int contador = 0;
        if(current == null){
            current = nuevo;
            size++;
        }
        if(pos == 0){
            addFirst(data);
            size++;
        }
        else{
            while(contador != pos){
            current = current.getNext();
            contador++;
            }
        nuevo.setNext(current);
        nuevo.setPrevious(current.getPrevious());
        current.getPrevious().setNext(nuevo);
        current.setPrevious(nuevo);
        size++;}
    }
    
    public Node<T> getAt(int pos){
        Node<T> current = head;
        int contador = 0;
        while (contador != pos){
            current = current.getNext();
            contador++;
        }
        return current;
    }
    
    public void deleteFirst(){
        Node<T> current = head;
        current = current.getNext();
        head = current;
        head.setPrevious(null);
        size--;
    }
    
    public void deleteLast(){
        Node<T> current = head;
        while( current.getNext() != null ){
            current = current.getNext();
        }
        current.getPrevious().setNext(null);
        size--;
    }
    
    public void deleteAt(int pos){
        Node<T> current = head;
        int contador = 0;
        while (contador != pos){
            current = current.getNext();
            contador++;
        }
        Node<T> aux = current;
        current.getNext().setPrevious(aux.getPrevious());
        current.getPrevious().setNext(aux.getNext());
        this.size++;
    }
    
    public int getSize(){
        return this.size;
    }
    
    public void mostrar()
    
    {
     Node<T> current;
     current = this.head;
     while(current != null)
     {
         System.out.print(current.getData()+",");
         current=current.getNext();
     }   
    }
    public String mostrar1()
    
    {
     Node<T> current;
     String cadena = "";
     current = this.head;
     while(current != null)
     {
         cadena = cadena + current.getData()+",";
         current=current.getNext();
     }   
     return cadena;
    }
    
		
    
}
