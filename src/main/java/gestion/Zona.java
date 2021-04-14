package gestion;

import zooAnimales.Animal;
import java.util.ArrayList;

public class Zona {
	
	private String nombre;
	private Zoologico zoo;
	private ArrayList<Animal> animales = new ArrayList<>();
	
	public Zona(String nombre, Zoologico zoo) {
		this.nombre = nombre;
		this.zoo = zoo;
	}
	public Zona() {
		
	}
	public void agregarAnimales(Animal animal) {
		
		animales.add(animal);
		
	}
	public int cantidadAnimales() {
		int c = 0;
		for (Animal a : animales) {
			c += 1;
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
	public ArrayList<Animal> getAnimales() {
		return animales;
	}
	public void setAnimales(ArrayList<Animal> animales) {
		this.animales = animales;
	}
}
