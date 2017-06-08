package Estructuras;

public class NodoAVL{
    public AVLcita cita;
    public int Factbalance;
    public NodoAVL Derecho, Izquierdo;
	
	public NodoAVL (AVLcita cit){
		cita = cit;
		Factbalance = 0;
		Derecho=null;
		Izquierdo = null;
	}
        
        public AVLcita getData(){
        return cita;
            }
}