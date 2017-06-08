/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

/**
 *
 * @author Alexis
 */
public class AVLcita {
    public int numCita;
    public String paciente;
    public float pago =0 ;
    public String nume;
	
	public AVLcita(int num, String nombre)
	{
		this.numCita = num;
		this.paciente = nombre;

		
		nume = Integer.toString(num);
	}
        public AVLcita(int num, String nombre, float pago)
	{
		this.numCita = num;
		this.paciente = nombre;
                this.pago = pago;
		
		nume = Integer.toString(num);
	}
	public void agregarMonto(float nuevoMonto)
	{
		pago += nuevoMonto;
		
	}
    public void cambiarPaciente(String nuevoPaciente)
    {
        this.paciente = nuevoPaciente;
    }
    public String getInfo(){
        return Integer.toString(numCita)+">"+paciente+">"+Float.toString(pago);
    
    }
    
    
    
    
}
