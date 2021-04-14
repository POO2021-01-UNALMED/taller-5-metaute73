package zooAnimales;
import java.util.ArrayList;

public class Pez extends Animal {
	
	private static ArrayList<Pez> listado = new ArrayList<>();
	public static int salmones;
	public static int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	
	public Pez() {
		listado.add(null);
	}
	public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas) {
		super.setNombre(nombre);
		super.setEdad(edad);
		super.setHabitat(habitat);
		super.setGenero(genero);
		this.colorEscamas = colorEscamas;
		this.cantidadAletas = cantidadAletas;
	}
	public static int cantidadPeces() {
		int p = 0;
		for (Pez pe: listado) {
			p += 1;
		}
		return p;
	}
	public static Pez crearSalmon(String nombre, int edad, String genero) {
		Pez salmon = new Pez(nombre, edad, "oceano", genero, "rojo", 6);
		listado.add(salmon);
		setTotalAnimales(1);
		salmones++;
		return salmon;
	}
	public static Pez crearBacalao(String nombre, int edad, String genero) {
		Pez bacalao = new Pez(nombre, edad, "oceano", genero, "rojo", 6);
		listado.add(bacalao);
		setTotalAnimales(1);
		bacalaos++;
		return bacalao;
	}
	public String movimiento() {
		return "nadar";
	}
	public ArrayList<Pez> getListado() {
		return listado;
	}
	public void setListado(ArrayList<Pez> listado) {
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
