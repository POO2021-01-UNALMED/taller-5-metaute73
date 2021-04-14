package zooAnimales;
import java.util.ArrayList;

public class Mamifero extends Animal{
	
	private static ArrayList<Mamifero> listado = new ArrayList<>();
	public static int caballos;
	public static int leones;
	private boolean pelaje;
	private int patas;
	
	public Mamifero() {
		listado.add(null);
	}
	public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
		super.setNombre(nombre);
		super.setEdad(edad);
		super.setHabitat(habitat);
		super.setGenero(genero);
		this.pelaje = pelaje;
		this.patas = patas;
	}
	
	public static int cantidadMamiferos() {
		int m = 0;
		for (Mamifero ma : listado) {
			m += 1;
		}
		return m;
	}
	public static Mamifero crearCaballo(String nombre, int edad, String genero) {
		Mamifero caballo = new Mamifero(nombre, edad, "pradera", genero, true, 4);
		listado.add(caballo);
		setTotalAnimales(1);
		caballos++;
		return caballo;
	}
	public static Mamifero crearLeon(String nombre, int edad, String genero) {
		Mamifero leon = new Mamifero(nombre, edad, "selva", genero, true, 4);
		listado.add(leon);
		setTotalAnimales(1);
		leones++;
		return leon;
	}
	public ArrayList<Mamifero> getListado() {
		return listado;
	}
	public void setListado(ArrayList<Mamifero> listado) {
		this.listado = listado;
	}
	public boolean isPelaje() {
		return this.pelaje;
	}
	public void isPelaje(boolean pelaje) {
		this.pelaje = pelaje;
	}
	public int getPatas() {
		return this.patas;
	}
	public void setPatas(int patas) {
		this.patas = patas;
	}
}