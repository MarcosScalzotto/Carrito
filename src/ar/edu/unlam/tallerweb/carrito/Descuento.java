package ar.edu.unlam.tallerweb.carrito;

public class Descuento extends Comprable {
	private Articulo articulo;
	double descuento;

	public Descuento (Articulo articulo,double descuento) {
		this.articulo = articulo;
		this.descuento = descuento;
	}

	@Override
	public double getPrecio() {
		return articulo.getPrecio() * (1 - (descuento / 100));
	}
}
