package zooAnimales;

import gestion.Zona;

public class Pez extends Animal {
	
	private static Pez[] listado;
	public int salmones;
	public int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	
	public Pez() {
	
	}
	public Pez(String nombre, int edad, String habitat, String genero) {
		super.setNombre(nombre);
		super.setEdad(edad);
		super.setHabitat(habitat);
		super.setGenero(genero);
	}
	public static int cantidadPeces() {
		int p = 0;
		for (Pez pe: listado) {
			p += 1;
		}
		return p;
	}
	public void crearSalmon(String nombre, int edad, String genero) {
		Pez salmon = new Pez();
		this.colorEscamas = "rojo";
		this.cantidadAletas = 6;
		super.setHabitat("oceano");
		super.setNombre(nombre);
		super.setEdad(edad);
		super.setGenero(genero);
		this.listado = new Pez[this.listado.length + 1];
		listado[listado.length-1] = salmon;
		setTotalAnimales(1);
		this.salmones++;
	}
	public void crearBacalao(String nombre, int edad, String genero) {
		Pez bacalao = new Pez();
		this.colorEscamas = "gris";
		this.cantidadAletas = 6;
		super.setHabitat("oceano");
		super.setNombre(nombre);
		super.setEdad(edad);
		super.setGenero(genero);
		this.listado = new Pez[this.listado.length + 1];
		listado[listado.length-1] = bacalao;
		setTotalAnimales(1);
		this.bacalaos++;
	}
	public String movimiento() {
		return "nadar";
	}
	public Pez[] getListado() {
		return this.listado;
	}
	public void setListado(Pez[] listado) {
		this.listado = listado;
	}
	public String getColorEscamas() {
		return this.colorEscamas;
	}
	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}
	public int getCantidadAletas() {
		return this.cantidadAletas;
	}
	public void setCantidadAletas(int cantidadAletas) {
		this.cantidadAletas = cantidadAletas;
	}

}
