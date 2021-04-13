package zooAnimales;

import gestion.Zona;

public class Animal {
	
	private int totalAnimales;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private Zona[] zona;
	
	public Animal() {
		
	}
	
	public String totalPorTipo() {
		return "Mamiferos: "+ Mamifero.cantidadMamiferos() + "\nAves: " + Ave.cantidadAves() + "\nReptiles: " + 
	Reptil.cantidadReptiles() + "\nPeces: " + Pez.cantidadPeces() + "\nAnfibios: " + Anfibio.cantidadAnfibios();
	}
	public String toString() {
		return "mi nombre es " + this.nombre + ", tengo una edad de " + this.edad + ", habito en " + this.habitat +
				" y mi genero es " + this.genero;
	}
	public String movimiento() {
		return "desplazarse";
	}
	public int getTotalAnimales() {
		return totalAnimales;
	}
	public void setTotalAnimales(int t) {
		totalAnimales += t;
	}
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return this.edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getHabitat() {
		return this.habitat;
	}
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	public String getGenero() {
		return this.genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public Zona[] getZona() {
		return this.zona;
	}
	public void setZona(Zona[] zona) {
		this.zona = zona;
	}
}