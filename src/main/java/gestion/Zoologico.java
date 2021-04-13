package gestion;

public class Zoologico {
	
	private String nombre;
	private String ubicacion;
	private Zona[] zonas;
	
	public Zoologico(String nombre, String ubicacion) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
	}
	public Zoologico() {
		
	}
	
	public void agregarZonas(Zona zona) {
		
		Zona[] more = new Zona[this.zonas.length + 1];
		for (int z = 0; z < this.zonas.length; z++) {
			more[z] = zonas[z];
		}
		more[more.length-1] = zona;
		this.zonas = more;
	}
	public int cantidadTotalAnimales() {
		int k = 0;
		for (Zona i : this.zonas) {
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
	public Zona[] getZonas() {
		return this.zonas;
	}
	public void setZonas(Zona[] zonas) {
		this.zonas = zonas;
	}
}
