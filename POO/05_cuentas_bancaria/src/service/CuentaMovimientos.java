package service;

import java.time.LocalDateTime;
import java.util.ArrayList;

import model.Movimientos;

public class CuentaMovimientos extends CuentaLimite{
	/*ADMIN dice:Clase CuentaMovimientos
	Clase que hereda CuentaLimite. Incopora un nuevo método obtenerMovimientos
	que devolverá un ArraList con los movimientos realizados en la cuenta
	Cada movimiento se define por: cantidad, fechaHora, tipo (ingreso o extracción) */
	
	    private ArrayList<Movimientos> movimientos=new ArrayList<Movimientos>();
	    
	    public CuentaMovimientos(double saldo, double limite) {
	    	super(saldo,limite);
	    }

	   
	    public ArrayList<Movimientos> obtenerMovimientos() {
	        //Devuelve la lista de movimientos
	        return movimientos;
	    }
        
	    
		@Override
		public void extraer(double cantidad) {
			//Cuando se crea el objeto de movimiento de una extracción
			Movimientos m=new Movimientos(cantidad,LocalDateTime.now(),"extraccion"); 
			 //Agregamos objeto de movimiento creado a la lista de movimientos
	        movimientos.add(m);
	        //Llamamos al método extraer de la clase padre con el parámetro cantidad
	        super.extraer(cantidad);
		}

		@Override
		public void ingresar(double cantidad) {
			//Cuando se crea el objeto de movimiento de un ingreso
			Movimientos m=new Movimientos(cantidad,LocalDateTime.now(),"ingreso");
			//Agregamos objeto de movimiento creado a la lista de movimientos
			movimientos.add(m);
			//Llamamos al método extraer de la clase padre con el parámetro cantidad
			super.ingresar(cantidad);
		}
		
	    
	}



