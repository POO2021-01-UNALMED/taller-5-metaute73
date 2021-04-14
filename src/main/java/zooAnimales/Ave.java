package zooAnimales;
import java.util.ArrayList;

public class Ave extends Animal{
	
	private static ArrayList<Ave> listado = new ArrayList<>();
	public static int halcones;
	public static int aguilas;
	private String colorPlumas;
	
	public Ave() {
	
	}
	public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
		super.setNombre(nombre);
		super.setEdad(edad);
		super.setHabitat(habitat);
		super.setGenero(genero);
		this.colorPlumas = colorPlumas;
	}
	public String movimiento() {
		return "volar";
	}
	public static int cantidadAves() {
		int av = 0;
		for (Ave a: listado) {
			av += 1;
		}
		return av;
	}
	public static Ave crearHalcon(String nombre, int edad, String genero) {
		Ave halcon = new Ave(nombre, edad, "montana", genero, "cafe glorioso");
		listado.add(halcon);
		setTotalAnimales(1);
		halcones++;
		return halcon;
	}
	public static Ave crearAguila(String nombre, int edad, String genero) {
		Ave aguila = new Ave(nombre, edad, "montana", genero, "blanco y amarillo");
		listado.add(aguila);
		setTotalAnimales(1);
		aguilas++;
		return aguila;
	}
	public ArrayList<Ave> getListado() {
		return listado;
	}
	public void setListado(ArrayList<Ave> listado) {
		this.listado = listado;
	}
	public String getColorPlumas() {
		return this.colorPlumas;
	}
	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas = colorPlumas;
	}
}