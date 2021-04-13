package zooAnimales;

import gestion.Zona;

public class Ave extends Animal{
	
	private static Ave[] listado;
	public int halcones;
	public int aguilas;
	private String colorPlumas;
	
	public Ave() {
	
	}
	public Ave(String nombre, int edad, String habitat, String genero) {
		super.setNombre(nombre);
		super.setEdad(edad);
		super.setHabitat(habitat);
		super.setGenero(genero);
	}
	public String movimiento() {
		return "volar";
	}
	public static int cantidadAves() {
		int av = 0;
		for (Ave a: listado) {
			av += 1;
		}
		return av;
	}
	public void crearHalcon(String nombre, int edad, String genero) {
		Ave halcon = new Ave();
		this.colorPlumas = "cafe glorioso";
		super.setHabitat("montañas");
		super.setNombre(nombre);
		super.setEdad(edad);
		super.setGenero(genero);
		this.listado = new Ave[this.listado.length + 1];
		listado[listado.length-1] = halcon;
		setTotalAnimales(1);
		this.halcones++;
	}
	public void crearAguila(String nombre, int edad, String genero) {
		Ave aguila = new Ave();
		this.colorPlumas = "blanco y amarillo";
		super.setHabitat("montanas");
		super.setNombre(nombre);
		super.setEdad(edad);
		super.setGenero(genero);
		this.listado = new Ave[this.listado.length + 1];
		listado[listado.length-1] = aguila;
		setTotalAnimales(1);
		this.halcones++;
	}
	public Ave[] getListado() {
		return this.listado;
	}
	public void setListado(Ave[] listado) {
		this.listado = listado;
	}
	public String getColorPlumas() {
		return this.colorPlumas;
	}
	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas = colorPlumas;
	}
}