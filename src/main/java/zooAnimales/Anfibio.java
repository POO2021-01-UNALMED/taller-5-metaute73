package zooAnimales;

import gestion.Zona;

public class Anfibio extends Animal {
	
	private static Anfibio[] listado = {};
	public int ranas;
	public int salamandras;
	private String colorPiel;
	private boolean venenoso;
	
	public Anfibio() {
		
	}
	public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso) {
		super.setNombre(nombre);
		super.setEdad(edad);
		super.setHabitat(habitat);
		super.setGenero(genero);
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
	}
	public static int cantidadAnfibios() {
		int af = 0;
		for (Anfibio an: listado) {
			af += 1;
		}
		return af;
	}
	public Anfibio crearRana(String nombre, int edad, String genero) {
		Anfibio rana = new Anfibio();
		this.colorPiel = "rojo";
		this.venenoso = true;
		super.setHabitat("selva");
		super.setNombre(nombre);
		super.setEdad(edad);
		super.setGenero(genero);
		Anfibio[] moreF = new Anfibio[this.listado.length + 1];
		for (int m = 0; m < this.listado.length; m++) {
			moreF[m] = listado[m];
		}
		moreF[moreF.length-1] = rana;
		this.listado = moreF;
		setTotalAnimales(1);
		this.ranas++;
		return rana;
	}
	public Anfibio crearSalamandra(String nombre, int edad, String genero) {
		Anfibio salamandra = new Anfibio();
		this.colorPiel = "negro y amarillo";
		this.venenoso = false;
		super.setHabitat("selva");
		super.setNombre(nombre);
		super.setEdad(edad);
		super.setGenero(genero);
		Anfibio[] moreF = new Anfibio[this.listado.length + 1];
		for (int m = 0; m < this.listado.length; m++) {
			moreF[m] = listado[m];
		}
		moreF[moreF.length-1] = salamandra;
		this.listado = moreF;
		setTotalAnimales(1);
		this.salamandras++;
		return salamandra;
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
