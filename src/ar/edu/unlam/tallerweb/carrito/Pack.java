package ar.edu.unlam.tallerweb.carrito;

import java.util.ArrayList;

public class Pack extends Comprable {

	private ArrayList<Articulo> pack;

	public Pack(double precioPack) {
		this.precio = precioPack;
		this.pack = new ArrayList<Articulo>();
	}

	@Override
	public double getPrecio() {
		return this.precio;
	}

	public void addArticulo(Articulo a) throws TipoIncorrectoException {
		if (!esDelTipoCorrecto(a)) {
			throw new TipoIncorrectoException(
					"Error, se intenta agregar articulo de tipo incorrecto");
		}
		this.pack.add(a);
	}

	private boolean esDelTipoCorrecto(Articulo a) {
		// compruebo si la lista esta vacia, sino lo esta, guardo su tipo para
		// compararlo con los articulos nuevos
		String tipo = null;
		if (pack.isEmpty())
			tipo = a.getTipo();
		if (a.getTipo() != tipo)
			return false;
		else
			return true;
	}

}
