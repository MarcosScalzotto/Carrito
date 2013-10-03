package ar.edu.unlam.tallerweb.carrito;

import org.junit.Assert;
import org.junit.Test;

public class CarritoTest {
	Articulo birome = new Articulo(40, "limpieza");
	Articulo cuaderno = new Articulo(80, "limpieza");
	Carrito carrito1 = new Carrito();
	Descuento productoDesc1 = new Descuento(birome, 5.0);
	Pack paquete1 = new Pack (800);
	
	@Test
	public void mostrarPrecioArticulo() {
		Assert.assertTrue(birome.getPrecio() == 40.0);
	}

	@Test
	public void mostrarTipoArticulo() {
		Assert.assertTrue(birome.getTipo() == "limpieza");
	}
	
	@Test
	public void totalCarritoConSoloArticulos() {
		carrito1.addItem(cuaderno);
		carrito1.addItem(birome);
		Assert.assertTrue(carrito1.getTotal() == 120);
	}
	
	@Test
	public void totalCarritoArticulosyDescuentos() {
		carrito1.addItem(cuaderno);
		carrito1.addItem(birome);
		carrito1.addItem(productoDesc1);
		Assert.assertEquals(158, carrito1.getTotal(), 0.1);
	}
	
	@Test
	public void totalCarritoArticulosPacksDescuentos() {
		carrito1.addItem(cuaderno);
		carrito1.addItem(birome);
		carrito1.addItem(productoDesc1);
		carrito1.addItem(paquete1);
		Assert.assertEquals(958, carrito1.getTotal(), 0.1);
	}

	@Test(expected = TipoIncorrectoException.class) 
	public void probandoExcepcion() throws TipoIncorrectoException {
		paquete1.addArticulo(cuaderno);
		paquete1.addArticulo(birome);
	}

}
