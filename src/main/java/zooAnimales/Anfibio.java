package zooAnimales;

import gestion.Zona;

public class Anfibio extends Animal {
	
	private static Anfibio[] listado;
	public int ranas;
	public int salamandras;
	private String colorPiel;
	private boolean venenoso;
	
	public Anfibio() {
		
	}
	public static int cantidadAnfibios() {
		int af = 0;
		for (Anfibio an: listado) {
			af += 1;
		}
		return af;
	}
	public void crearRana(String nombre, int edad, String genero, Zona[] zona) {
		Anfibio rana = new Anfibio();
		this.colorPiel = "rojo";
		this.venenoso = true;
		super.setHabitat("selva");
		super.setNombre(nombre);
		super.setEdad(edad);
		super.setGenero(genero);
		super.setZona(zona);
		this.listado = new Anfibio[this.listado.length + 1];
		listado[listado.length-1] = rana;
		setTotalAnimales(1);
		this.ranas++;
	}
	public void crearSalamandra(String nombre, int edad, String genero, Zona[] zona) {
		Anfibio salamandra = new Anfibio();
		this.colorPiel = "negro y amarillo";
		this.venenoso = false;
		super.setHabitat("selva");
		super.setNombre(nombre);
		super.setEdad(edad);
		super.setGenero(genero);
		super.setZona(zona);
		this.listado = new Anfibio[this.listado.length + 1];
		listado[listado.length-1] = salamandra;
		setTotalAnimales(1);
		this.salamandras++;
	}
	public String movimiento() {
		return "saltar";
	}
	public Anfibio[] getListado() {
		return this.listado;
	}
	public void setListado(Anfibio[] listado) {
		this.listado = listado;
	}
	public String getColorPiel() {
		return this.colorPiel;
	}
	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}
	public boolean getVenenoso() {
		return this.venenoso;
	}
	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}
}
