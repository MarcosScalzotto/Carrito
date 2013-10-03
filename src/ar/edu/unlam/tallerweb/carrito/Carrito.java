package ar.edu.unlam.tallerweb.carrito;

import java.util.ArrayList;

public class Carrito {
	
	private int total;
	private ArrayList<Comprable> item; 
	
	public Carrito (){
		this.total=0;
		this.item = new ArrayList<Comprable>();
	}
	public void addItem (Comprable item){
		this.item.add(item);
		this.total+= item.getPrecio();
	}
	public int getTotal() {
		return total;
	}
}
