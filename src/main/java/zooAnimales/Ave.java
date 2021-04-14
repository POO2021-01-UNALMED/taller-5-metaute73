package zooAnimales;


public class Ave extends Animal{
	
	private static Ave[] listado = {};
	public int halcones;
	public int aguilas;
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
	public Ave crearHalcon(String nombre, int edad, String genero) {
		Ave halcon = new Ave();
		this.colorPlumas = "cafe glorioso";
		super.setHabitat("montañas");
		super.setNombre(nombre);
		super.setEdad(edad);
		super.setGenero(genero);
		Ave[] moreAv = new Ave[this.listado.length + 1];
		for (int m = 0; m < this.listado.length; m++) {
			moreAv[m] = listado[m];
		}
		moreAv[moreAv.length-1] = halcon;
		this.listado = moreAv;
		setTotalAnimales(1);
		this.halcones++;
		return halcon;
	}
	public Ave crearAguila(String nombre, int edad, String genero) {
		Ave aguila = new Ave();
		this.colorPlumas = "blanco y amarillo";
		super.setHabitat("montanas");
		super.setNombre(nombre);
		super.setEdad(edad);
		super.setGenero(genero);
		Ave[] moreAv = new Ave[this.listado.length + 1];
		for (int m = 0; m < this.listado.length; m++) {
			moreAv[m] = listado[m];
		}
		moreAv[moreAv.length-1] = aguila;
		this.listado = moreAv;
		setTotalAnimales(1);
		this.aguilas++;
		return aguila;
	}
	public Ave[] getListado() {
		return this.listado;
	}
	public void setListado(Ave[] listado) {
		this.listado = listado;
	}
	public String getColorPlumas() {
		return this.colorPlumas;
	}
	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas = colorPlumas;
	}
}