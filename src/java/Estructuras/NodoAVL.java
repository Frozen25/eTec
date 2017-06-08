package Estructuras;

public class NodoAVL{
    public AVLdata cita;
    public int Factbalance;
    public NodoAVL Derecho, Izquierdo;
	
	public NodoAVL (AVLdata cit){
		cita = cit;
		Factbalance = 0;
		Derecho=null;
		Izquierdo = null;
	}
        
        public AVLdata getData(){
        return cita;
            }
}