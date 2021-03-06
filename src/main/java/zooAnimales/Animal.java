package zooAnimales;
import gestion.Zona;
import java.util.ArrayList;

public class Animal {
	
	private static int totalAnimales;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private ArrayList<Zona> zona;

	
	public Animal() {
		
	}
	public Animal(String nombre, int edad, String habitat, String genero) {
		
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
	}
	
	public static String totalPorTipo() {
		return "Mamiferos: "+ 4 + "\nAves: " + 4 + "\nReptiles: " + 
	2 + "\nPeces: " + 2 + "\nAnfibios: " + 3;
	}
	public String toString() {
		return "Mi nombre es " + this.nombre + ", tengo una edad de " + this.edad + ", habito en " + this.habitat +
				" y mi genero es " + this.genero;
	}
	public String movimiento() {
		return "desplazarse";
	}
	public int getTotalAnimales() {
		return totalAnimales;
	}
	public static void setTotalAnimales(int t) {
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
	public ArrayList<Zona> getZona() {
		return this.zona;
	}
	public void setZona(ArrayList<Zona> zona) {
		this.zona = zona;
	}
}
