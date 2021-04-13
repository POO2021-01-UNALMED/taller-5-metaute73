package zooAnimales;

import gestion.Zona;

public class Mamifero extends Animal{
	
	private static Mamifero[] listado;
	public int caballos;
	public int leones;
	private boolean pelaje;
	private int patas;
	
	public Mamifero() {
		
	}
	
	public static int cantidadMamiferos() {
		int m = 0;
		for (Mamifero ma : listado) {
			m += 1;
		}
		return m;
	}
	public void crearCaballo(String nombre, int edad, String genero, Zona[]zona) {
		Mamifero caballo = new Mamifero();
		this.pelaje = true;
		this.patas = 4;
		super.setHabitat("pradera");
		super.setNombre(nombre);
		super.setEdad(edad);
		super.setGenero(genero);
		super.setZona(zona);
		this.listado = new Mamifero[this.listado.length + 1];
		listado[listado.length-1] = caballo;
		setTotalAnimales(1);
		this.caballos++;
	}
	public void crearLeon(String nombre, int edad, String genero, Zona[]zona) {
		Mamifero leon = new Mamifero();
		this.pelaje = true;
		this.patas = 4;
		super.setHabitat("selva");
		super.setNombre(nombre);
		super.setEdad(edad);
		super.setGenero(genero);
		super.setZona(zona);
		this.listado = new Mamifero[this.listado.length + 1];
		listado[listado.length-1] = leon;
		setTotalAnimales(1);
		this.leones++;
	}
	public Mamifero[] getListado() {
		return this.listado;
	}
	public void setListado(Mamifero[] listado) {
		this.listado = listado;
	}
	public boolean getPelaje() {
		return this.pelaje;
	}
	public void setPelaje(boolean pelaje) {
		this.pelaje = pelaje;
	}
	public int getPatas() {
		return this.patas;
	}
	public void setPatas(int patas) {
		this.patas = patas;
	}
}
