package gestion;

import zooAnimales.Animal;

public class Zona {
	
	private String nombre;
	private Zoologico zoo;
	private Animal[] animales;
	
	public Zona(String nombre, Zoologico zoo) {
		this.nombre = nombre;
		this.zoo = zoo;
	}
	public Zona() {
		
	}
	public void agregarAnimales(Animal animal) {
		
		Animal[] moreA = new Animal[this.animales.length + 1];
		for (int a = 0; a < this.animales.length; a++) {
			moreA[a] = animales[a];
		}
		moreA[moreA.length-1] = animal;
		this.animales = moreA;
		
	}
	public int cantidadAnimales() {
		int c = 0;
		for (Animal a : this.animales) {
			c += a.getTotalAnimales();
		}
		return c;
	}
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Zoologico getZoo() {
		return this.zoo;
	}
	public void setZoo(Zoologico zoo) {
		this.zoo = zoo;
	}
	public Animal[] getAnimales() {
		return this.animales;
	}
	public void setAnimales(Animal[] animales) {
		this.animales = animales;
	}
}
