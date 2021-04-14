package gestion;
import java.util.ArrayList;

public class Zoologico {
	
	private String nombre;
	private String ubicacion;
	private ArrayList<Zona> zonas = new ArrayList<>();
	
	public Zoologico(String nombre, String ubicacion) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
	}
	public Zoologico() {
		
	}
	
	public void agregarZonas(Zona zona) {
		zonas.add(zona);
	}
	public int cantidadTotalAnimales() {
		int k = 0;
		for (Zona i : zonas) {
			k += i.cantidadAnimales();
		}
		return k;
	}
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getUbicacion() {
		return this.ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public ArrayList<Zona> getZona() {
		return zonas;
	}
	public void setZonas(ArrayList<Zona> zonas) {
		this.zonas = zonas;
	}
}
