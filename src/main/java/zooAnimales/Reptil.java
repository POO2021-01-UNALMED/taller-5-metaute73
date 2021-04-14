package zooAnimales;
import java.util.ArrayList;

public class Reptil extends Animal{
	
	private static ArrayList<Reptil> listado = new ArrayList<>();
	public static int iguanas;
	public static int serpientes;
	private String colorEscamas;
	private int largoCola;
	
	public Reptil() {
		
	}
	public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola) {
		super.setNombre(nombre);
		super.setEdad(edad);
		super.setHabitat(habitat);
		super.setGenero(genero);
		this.colorEscamas = colorEscamas;
		this.largoCola = largoCola;
	}
	public String movimiento() {
		return "reptar";
	}
	public static int cantidadReptiles() {
		int r = 0;
		for (Reptil re: listado) {
			r += 1;
		}
		return r;
	}
	public static Reptil crearIguana(String nombre, int edad, String genero) {
		Reptil iguana = new Reptil(nombre, edad, "humedal", genero, "verde", 3);
		listado.add(iguana);
		setTotalAnimales(1);
		iguanas++;
		return iguana;
	}
	public static Reptil crearSerpiente(String nombre, int edad, String genero) {
		Reptil serpiente = new Reptil(nombre, edad, "jungla", genero, "blanco", 1);
		listado.add(serpiente);
		setTotalAnimales(1);
		serpientes++;
		return serpiente;
	}
	public ArrayList<Reptil> getListado() {
		return listado;
	}
	public void setListado(ArrayList<Reptil> listado) {
		this.listado = listado;
	}
	public String getColorEscamas() {
		return this.colorEscamas;
	}
	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}
	public int getLargoCola() {
		return this.largoCola;
	}
	public void setLargoCola(int largoCola) {
		this.largoCola = largoCola;
	}
}
