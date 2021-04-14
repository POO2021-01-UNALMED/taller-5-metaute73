package zooAnimales;
import java.util.ArrayList;

public class Anfibio extends Animal {
	
	private static ArrayList<Anfibio> listado = new ArrayList<>();
	public static int ranas;
	public static int salamandras;
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
	public static Anfibio crearRana(String nombre, int edad, String genero) {
		Anfibio rana = new Anfibio(nombre, edad, "selva", genero, "rojo", true);
		listado.add(rana);
		setTotalAnimales(1);
		ranas++;
		return rana;
	}
	public static Anfibio crearSalamandra(String nombre, int edad, String genero) {
		Anfibio salamandra = new Anfibio(nombre, edad, "selva", genero, "negro y amerillo", false);
		listado.add(salamandra);
		setTotalAnimales(1);
		salamandras++;
		return salamandra;
	}
	public String movimiento() {
		return "saltar";
	}
	public ArrayList<Anfibio> getListado() {
		return this.listado;
	}
	public void setListado(ArrayList<Anfibio> listado) {
		this.listado = listado;
	}
	public String getColorPiel() {
		return this.colorPiel;
	}
	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}
	public boolean isVenenoso() {
		return this.venenoso;
	}
	public void isVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}
}
